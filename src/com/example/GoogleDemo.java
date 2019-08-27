package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String myBrowser = "Firefox";
		switch (myBrowser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\chromedriver.exe");
			WebDriver webD = new ChromeDriver();
			webD.get("https://www.google.co.in");
			webD.manage().window().maximize();
			webD.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Vicky");
			Thread.sleep(5000);
			webD.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")).click();
			Thread.sleep(3000);
			System.out.println("Title is "+webD.getTitle());
			webD.close();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\geckodriver.exe");
			WebDriver webD1 = new FirefoxDriver();
			webD1.get("https://login.yahoo.com/h");
			webD1.manage().window().maximize();	
			webD1.findElement(By.linkText("Create account")).click();
			Thread.sleep(6000);
			
			//ele.sendKeys("Vicky");
			webD1.findElement(By.xpath("//*[@class='ureg-fname ']")).sendKeys("rfgseg");
			webD1.findElement(By.id("usernamereg-lastName")).sendKeys("Iyrfgseer");
			
			if(webD1.findElement(By.id("usernamereg-yid"))!=null) {
				webD1.findElement(By.id("usernamereg-yid")).sendKeys("mvfgwfwrf2");
			}
			
			webD1.findElement(By.tagName("body")).click();
			//webdriver.ActionChains(driver).send_keys(Keys.ESCAPE).perform()
			
			webD1.findElement(By.id("usernamereg-password")).sendKeys("9585256985");
			webD1.findElement(By.name("phone")).sendKeys("7010648955");
			webD1.findElement(By.xpath("//*[@id=\"usernamereg-month\"]/option[11]")).click();
			webD1.findElement(By.name("dd")).sendKeys("12");
			webD1.findElement(By.xpath("//input[@id='usernamereg-year' and @name='yyyy']")).sendKeys("1997");
			
			webD1.findElement(By.id("reg-submit-button")).click();
			Thread.sleep(4000);
//			if(webD1.findElement(By.className("recaptcha-checkbox-border"))!=null)	{
//				webD1.findElement(By.className("recaptcha-checkbox-border")).click();
//			}
			webD1.findElement(By.name("sendCode")).click();
			Thread.sleep(31000);
			webD1.findElement(By.className("pure-button puree-button-link resend-btn")).sendKeys(Keys.ENTER);
			System.out.println("Title is "+webD1.getTitle());
			//webD1.close();
			break;
		case "Explorer":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\IEDriverServer.exe");
			WebDriver webD2 = new InternetExplorerDriver();			
			webD2.get("https://www.google.co.in");
			System.out.println("Title is "+webD2.getTitle());
			webD2.close();
			break;
		default:
			break;
		}	
	}
}
