package com.chrome.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("u_0_2")).sendKeys("aneeeeee");
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_g']")).click();
		// TODO Auto-generated method stub

	}

}
