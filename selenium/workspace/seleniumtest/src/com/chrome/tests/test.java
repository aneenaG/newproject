package com.chrome.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/roshan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		//driver.findElement(By.xpath("//*[@id='appbar-nav']/ul/li[2]/a/span")).click();
		driver.findElement(By.linkText("Trending")).click();
driver.findElement(By.id("masthead-search-term")).sendKeys("songs");
driver.findElement(By.id("search-btn")).click();
driver.findElement(By.xpath("//*[@id='appbar-guide-button']/span/span")).click();
//driver.findElement(By.linkText("Home")).click();
//WebDriverWait w=new WebDriverWait(driver,10);
//w.until
driver.findElement(By.linkText("Get YouTube Red")).click();

	}

}
