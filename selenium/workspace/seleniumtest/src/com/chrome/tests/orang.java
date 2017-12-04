package com.chrome.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class orang {
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
  public void testOrang() throws Exception {
    driver.get(baseUrl + "/symfony/web/index.php/auth/login");
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("admin");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("Password");
    driver.findElement(By.id("btnLogin")).click();
    assertEquals(driver.findElement(By.cssSelector("img[alt=\"OrangeHRM\"]")).getText(), "");
    driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
    assertEquals(driver.findElement(By.linkText(">")).getText(), ">");
    driver.findElement(By.id("searchBtn")).click();
    driver.findElement(By.id("empsearch_employee_name_empName")).clear();
    driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("a");
    driver.findElement(By.id("empsearch_id")).clear();
    driver.findElement(By.id("empsearch_id")).sendKeys("555");
    new Select(driver.findElement(By.id("empsearch_employee_status"))).selectByVisibleText("Full-time");
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
