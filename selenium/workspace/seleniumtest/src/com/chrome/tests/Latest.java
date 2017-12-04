package com.chrome.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Latest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html");
		 driver.findElement(By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/a")).click();
		driver.findElement(By.id("login")).click();

		driver.findElement(By.xpath("html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[1]/input")).sendKeys("aneenageorgek@gmail.com");
        driver.findElement(By.xpath("html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[2]/input")).sendKeys("aneena123");
		
		
		
		driver.close();
	
	}

}
