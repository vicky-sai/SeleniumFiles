package com.example;

import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomepageLinks {

	public static void main(String[] args) throws InterruptedException {
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.args", "--disable-logging");
	    System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver1 = new ChromeDriver( new ChromeOptions().addArguments("headless"));
		driver1.get("https://www.google.co.in");	
		List<WebElement> links = driver1.findElements(By.tagName("a"));
		//Thread.sleep(3000);
		
		for (WebElement link: links) 	{
			if(!link.getText().isEmpty() && link.getText().matches("[a-zA-Z]+")) {
				System.out.println(link.getText()+" - "+link.getAttribute("href"));
				WebDriver driver = new ChromeDriver( new ChromeOptions().addArguments("headless"));
				driver.get(link.getAttribute("href"));	
				List<WebElement> innerLinks = driver.findElements(By.tagName("a"));
				for (WebElement innerLink: innerLinks) 	
					if(innerLink.getText()!=null && innerLink.getText().matches("[a-zA-Z]+")) 
						System.out.println(" |--"+innerLink.getText()+" - "+innerLink.getAttribute("href"));
				driver.close();
			}
		}
				
		//Thread.sleep(1000);
		driver1.close();
	}

}
