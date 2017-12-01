package com.chrome.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class face3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/roshan/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("aneenageorgek@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jesusgod1234");
		driver.findElement(By.id("u_0_r")).click();
		driver.findElement(By.linkText("Account Settings")).click();
		driver.findElement(By.linkText("Create Page")).click();
		//driver.findElement(By.linkText("Log Out")).click();
		//driver.findElement(By.xpath("//*[@id='u_0_2']/div/div/div/div[1]/div[1]/h1/a/span")).click();
		//driver.findElement(By.name("q")).sendKeys("paul george");
		//driver.findElement(By.tagName("button")).click();
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.close();
		// TODO Auto-generated method stub

	}

}
