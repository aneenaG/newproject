package com.chrome.tests1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver51");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		// TODO Auto-generated method stub

	}

}
