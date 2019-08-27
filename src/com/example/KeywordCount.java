package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordCount {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		String s1[] = {"Apple XS","Samsung Note 10", "Redmi note 7 Pro", "Redmi K20", "Pixel 3"};
		//String clasName = "gNO89b";
		String xpath = "/html/body/div/div[4]/form/div[2]/div/div[3]/center/input[1]";
		for(String s: s1) {
			driver.findElement(By.name("q")).clear();
			driver.findElement(By.name("q")).sendKeys(s);
			//Thread.sleep(3000);
			driver.findElement(By.xpath(xpath)).click();
			String result = driver.findElement(By.id("resultStats")).getText();
			
			String resultArr[] = result.split(" ");
			System.out.println("Total results for "+s+" = "+resultArr[1]);
			xpath = "/html/body/div[3]/form/div[2]/div/div[2]/div/div[1]/input";
		}
		driver.close();
	}
}
