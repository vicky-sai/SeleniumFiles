package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TlkIo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\geckodriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		WebDriver webD = new FirefoxDriver();
		webD.get("https://tlk.io/shubham");
		webD.manage().window().maximize();
		Thread.sleep(3000);
		webD.findElement(By.xpath("//*[@id=\"participant_nickname\"]")).sendKeys("test2");
		webD.findElement(By.id("participant_nickname")).sendKeys(Keys.ENTER);
		//webD.findElement(By.xpath("//*[@id=\"message_body\"]")).click();		
		for(int i=0;i<10;i++) {
			Thread.sleep(1500);
			webD.findElement(By.className("message-input")).sendKeys("From Shubham "+ i);
			webD.findElement(By.xpath("//*[@id=\"message_body\"]")).sendKeys(Keys.ENTER);
		}
		System.out.println(webD.getCurrentUrl());
		webD.close();

		
	}
}
