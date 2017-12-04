package com.chrome.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testid {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		String expect="Facebook - Log In or Sign Up";
		driver.get("http://www.facebook.com");
		String actual=driver.getTitle();
		if(actual.contentEquals(expect))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
			driver.quit();
		}
		driver.findElement(By.name("firstname")).sendKeys("aneena");
		Thread.sleep(5000); 
		driver.findElement(By.id("u_0_3")).sendKeys("george");
		driver.findElement(By.id("u_0_6")).sendKeys("aneenageorge@gmail.com");
		driver.findElement(By.id("u_0_d")).sendKeys("aneena123");
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByIndex(4);
		Select s2=new Select(driver.findElement(By.id("day")));
		s2.selectByIndex(2);
		Select s3=new Select(driver.findElement(By.id("year")));
		s3.selectByIndex(3);
		driver.findElement(By.id("u_0_g")).click();
		driver.findElement(By.id("u_0_l")).click();
		
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back();
	}

}
