package com.chrome.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("aneena");
		driver.findElement(By.xpath(".//input[@id='u_0_3']")).sendKeys("george");
		driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("555");
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		s.selectByIndex(5);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		driver.findElement(By.xpath(".//a[@href='/pages/create/?ref_type=registration_form']")).click();
		driver.navigate().back();
		
	}

}
