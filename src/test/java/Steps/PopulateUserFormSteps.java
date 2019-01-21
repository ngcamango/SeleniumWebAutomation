package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopulateUserFormSteps {

    WebDriver driver;

    @Given("^I have succesfully logged in with ([^\"]*) and ([^\"]*)$")
    public void i_have_succesfully_logged_in_with_username_and_password(String username, String password) throws Throwable {

        String url = "http://executeautomation.com/demosite/Login.html";
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.name("UserName")).sendKeys(username);
        System.out.println("Successfully entered username");

        driver.findElement(By.name("Password")).sendKeys(password);
        System.out.println("Successfully entered password");

        driver.findElement(By.name("Login")).submit();
        System.out.println("Successfully clicked login button");
    }

    @When("^I select the ([^\"]*)$")
    public void i_select_the_title(String title) throws Throwable {

        driver.findElement(By.tagName("select")).click();

        driver.findElement(By.xpath("//option[text()='Mr.']")).click();
        System.out.println("Successfully selected title");
    }

    @And("^enter the ([^\"]*) and ([^\"]*) as well as ([^\"]*)$")
    public void enter_the_initial_and_firstname_as_well_as_middlename(String initial, String firstname, String middlename) throws Throwable {

        driver.findElement(By.name("Initial")).sendKeys(initial);
        System.out.println("Successfully entered initial");

        driver.findElement(By.name("FirstName")).sendKeys(firstname);
        System.out.println("Successfully entered firstname");

        driver.findElement(By.name("MiddleName")).sendKeys(middlename);
        System.out.println("Successfully entered middlename");
    }

    @Then("^I should be able to ([^\"]*) and ([^\"]*) and save the details entered$")
    public void i_should_be_able_to_gender_and_language_and_save_the_details_entered(String gender, String language) throws Throwable {
        driver.findElement(By.name(gender)).click();
        System.out.println("Successfully entered gender");

        driver.findElement(By.name(language)).click();
        System.out.println("Successfully entered language");

        driver.findElement(By.name("Save")).submit();
        System.out.println("Successfully clicked Save button");
    }
}
