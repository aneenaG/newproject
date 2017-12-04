package com.chrome.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class face {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("aneena");
		driver.findElement(By.xpath(".//*[@id='u_0_g']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		sel.selectByIndex(1);
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel1.selectByIndex(4);
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel2.selectByIndex(5);
		driver.findElement(By.id("u_0_h")).click();
		//driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		//driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		//driver.findElement(By.xpath(".//a[text()='Create a Page']")).click();
		//driver.findElement(By.xpath(".//a[@href='/pages/create/?ref_type=registration_form']")).click();
		//driver.navigate().back();
		//driver.close();
		//driver.quit();
	}

}
