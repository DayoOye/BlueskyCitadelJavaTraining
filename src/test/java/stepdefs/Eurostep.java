package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Eurostep {

    WebDriver driver;
    public Eurostep ()
    {
        driver = buyerstep.driver;
    }

    @When("^I click on currency$")
    public void i_click_on_currency() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
    }

    @When("^I select Euro$")
    public void i_select_Euro() throws Throwable {
        driver.findElement(By.name("EUR")).click();
    }

    @Then("^prices displays in Euro$")
    public void prices_displays_in_Euro() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/p[2]")).getAttribute("€");

       driver.close();
    }


}
