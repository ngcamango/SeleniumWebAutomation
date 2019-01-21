package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps {

    WebDriver driver;

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        String url = "http://executeautomation.com/demosite/Login.html";
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {

        driver.findElement(By.name("UserName")).sendKeys(username);
        System.out.println("Successfully entered username");

        driver.findElement(By.name("Password")).sendKeys(password);
        System.out.println("Successfully entered password");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        driver.findElement(By.name("Login")).submit();
        System.out.println("Successfully clicked login button");
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        String title = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Execute Automation Selenium Test Site", title);
        System.out.println("Successfully validated home page");
    }

}
