package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginstep {

    WebDriver driver;
        public loginstep ()
        {
            driver = buyerstep.driver;
        }

    @And("^i select login$")
    public void iSelectLogin() {
            driver.findElement(By.linkText("Login")).click();
    }
    @When("^I click on login$")
    public void i_click_on_login() throws Throwable {
       driver.findElement(By.cssSelector("#content > div > div:nth-child(2) form > input")).click();
    }

    @Then("^user is logged in$")
    public void user_is_logged_in() throws Throwable {
       System.out.println(driver.getTitle());
    }

}
