package com.chrome.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hw4 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://hrm.seleniumminutes.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHw4() throws Exception {
    driver.get(baseUrl + "/symfony/web/index.php/auth/login");
    driver.findElement(By.cssSelector("span.form-hint")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("admin");
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("admin");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Password");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Password");
    driver.findElement(By.id("btnLogin")).click();
    driver.findElement(By.id("btnLogin")).click();
    driver.findElement(By.id("menu_pim_addEmployee")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | var chars = 'abcdefghijklmnopqrstuvwxyz'.split('');  length = Math.ceil(Math.random() * 2)+5;  var str = '';  for (var i = 0; i < length; i++) {  	str += chars[Math.floor( Math.random() * chars.length)]; if(i==0) { str = str.toUpperCase(); }   }  str; | ]]
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys(firstName);
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | var chars = 'ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz'.split('');  length = Math.ceil(Math.random() * 1)+10;  var str = '';  for (var i = 0; i < length; i++) {  str += chars[Math.floor( Math.random() * chars.length)]; }  str; | ]]
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys(lastName);
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | 10000000 + Math.floor(Math.random() * 90000000) | ]]
    driver.findElement(By.id("employeeId")).clear();
    driver.findElement(By.id("employeeId")).sendKeys(code);
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.cssSelector("b")).click();
    driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("systemUser_employeeName_empName")).clear();
    driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(firstName + " " + lastName);
    driver.findElement(By.id("systemUser_userName")).clear();
    driver.findElement(By.id("systemUser_userName")).sendKeys(firstName + lastName);
    driver.findElement(By.id("systemUser_password")).clear();
    driver.findElement(By.id("systemUser_password")).sendKeys(code);
    driver.findElement(By.id("systemUser_confirmPassword")).clear();
    driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(code);
    driver.findElement(By.id("btnSave")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//form[@id='frmList_ohrmListComponent']/div[2]")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals(driver.findElement(By.xpath("//form[@id='frmList_ohrmListComponent']/div[2]")).getText(), "Successfully Saved Close");
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys(firstName + lastName);
    System.out.println(firstName + lastName);
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys(code);
    driver.findElement(By.id("btnLogin")).click();
    assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome " + firstName);
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.linkText("Logout")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
