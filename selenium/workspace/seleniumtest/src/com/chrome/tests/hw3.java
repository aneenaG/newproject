package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hw3 {
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
  public void testHw3() throws Exception {
    driver.get(baseUrl + "/symfony/web/index.php/auth/login");
    assertEquals(driver.getTitle(), "OrangeHRM");
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
    driver.findElement(By.id("menu_leave_assignLeave")).click();
    driver.findElement(By.id("menu_leave_assignLeave")).click();
    driver.findElement(By.id("assignleave_txtEmployee_empName")).clear();
    driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("");
    driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("a");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("div.ac_results")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertTrue(driver.findElement(By.xpath("//div[6]/ul/li")).getText().matches("^regexpi:\\.[\\s\\S]*a\\.[\\s\\S]*$"));
    String name = driver.findElement(By.xpath("//div[6]/ul/li")).getText();
    driver.findElement(By.xpath("//div[6]/ul/li")).click();
    assertEquals(driver.findElement(By.id("assignleave_txtEmployee_empName")).getAttribute("value"), name);
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
