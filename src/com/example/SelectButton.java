package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\Downloads\\Selenium drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

	    Select select = new Select(driver.findElement(By.id("country")));

	    select.selectByIndex(3);
	    Thread.sleep(2000);

	    select.selectByValue("99");
	    Thread.sleep(2000);

	    select.selectByVisibleText("Canada");
	    Thread.sleep(2000);

	    System.out.println(select.isMultiple());

	    //driver.close();

	}
}
