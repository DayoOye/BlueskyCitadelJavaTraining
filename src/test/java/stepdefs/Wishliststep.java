package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Wishliststep {

    WebDriver driver;
    public Wishliststep ()
    {
        driver = buyerstep.driver;
    }

    @When("^I click on Giftshop on the homepage$")
    public void i_click_on_Giftshop_on_the_homepage() throws Throwable {
       driver.findElement(By.cssSelector("#logo > h1 > a")).click();
    }

    @When("^I click on add to wish list on Macbook product$")
    public void i_click_on_add_to_wish_list_on_Macbook_product() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1500)");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[7]/div/div[2]/div[2]/button[2]")).click();
    }

    @When("^I click add to wish list on iphone$")
    public void i_click_add_to_wish_list_on_iphone() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")).click();
    }

    @When("^I click on wishlist$")
    public void i_click_on_wishlist() throws Throwable {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.id("wishlist-total")).click();
    }

    @When("^I remove iphone$")
    public void i_remove_iphone() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a")).click();
    }

    @And("^I clicked on continue$")
    public void iClickedOnContinue() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/a")).click();
    }

    @Then("^My account homepage displays$")
    public void my_account_homepage_displays() throws Throwable {
       System.out.println(driver.getTitle());
    }

    @And("^I click on desktop$")
    public void iClickOnDesktop() {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click();

    }

    @And("^I select all desktop$")
    public void iSelectAllDesktop() {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")).click();
    }
}
