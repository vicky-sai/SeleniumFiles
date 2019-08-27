package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		String xpath = "//input[@value='Butter']";
		driver.findElement(By.xpath(xpath)).click();
		
		List<WebElement> vRadio = driver.findElements(By.xpath("//input[@type='radio']"));
		//Thread.sleep(3000);
		
		for (int i=0;i<vRadio.size();i++ ) {			
			if(vRadio.get(i).getAttribute("value").equals("Cheese")) {				
				vRadio.get(i).click();
			}
		}
		Thread.sleep(4000);
		driver.close();
	}
}
