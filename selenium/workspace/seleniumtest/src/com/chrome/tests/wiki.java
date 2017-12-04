package com.chrome.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiki {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.wikipedia.org");
		//WebElement link;
		 driver.findElement(By.id("js-link-box-en")).click();
		//link.click();
		Thread.sleep(5000);
		WebElement search;
		search = driver.findElement(By.id("searchInput"));
		search.sendKeys("software");
		search.submit();
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		driver.quit();
		//driver.close();
	}
}
