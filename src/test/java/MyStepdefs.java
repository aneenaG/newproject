import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    public static WebDriver driver;
    @Given("^User is on Home Page$")//precondition
    public void user_is_on_Home_Page() throws Throwable {
        Map<String, Object> prefs = new HashMap<String, Object>();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //Test
    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        driver.get("http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/");
    }
    //Test
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
        Loginpage loginpage = new Loginpage(driver, username, password);
        loginpage.clickLogin();
    }
    //Expected result
    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }
    //Test
    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
        TalentPage talentPage = new TalentPage(driver);
        talentPage.logout();
    }
    //Expected result
    @Then("^Message displayed Logout Successfully$")
    public void message_displayed_Logout_Successfully() throws Throwable{
        driver.close();
    }

}