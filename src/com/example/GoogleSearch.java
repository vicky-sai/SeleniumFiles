package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\geckodriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		WebDriver webD = new FirefoxDriver();
		webD.get("https://www.google.co.in");
		webD.manage().window().maximize();
		
		webD.findElement(By.name("q")).sendKeys("testing");
		webD.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		
		System.out.println(webD.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div/div[1]/input")).getAttribute("value")+"===========");
		String s = webD.findElement(By.id("resultStats")).getText();
		webD.close();
		String s1[] = s.split(" ");
		System.out.println("Total results = "+s1[1]);
		
	}
}
