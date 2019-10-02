package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class buyerstep {

     static WebDriver driver;
    {
        System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @Given("^I  navigate to giftrete\\.org/giftshop/$")
    public void iNavigateToGiftreteOrgGiftshop() {

        driver.get("http://www.giftshop.giftrete.com/");

    }

    @When("^I select My Account$")
    public void i_select_My_Account() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();

    }

    @When("^I select register$")
    public void i_select_register() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/ul/li[1]/a")).click();
    }

    @When("^I enter in first name$")
    public void i_enter_in_first_name() throws Throwable {
        driver.findElement(By.name("firstname")).sendKeys("Dayo");
    }

    @When("^I enter in last name$")
    public void i_enter_in_last_name() throws Throwable {
        driver.findElement(By.id("input-lastname")).sendKeys("Oyelade");
    }

    @When("^I enter in email$")

    public void i_enter_in_email() throws Throwable {
        driver.findElement(By.name("email")).sendKeys("remzzy7@gmail.com");
    }

    @When("^i enter telephone$")
    public void i_enter_telephone() throws Throwable {
        driver.findElement(By.id("input-telephone")).sendKeys("07818109697");
    }

    @When("^I enter a password$")
    public void i_enter_a_password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456");
    }

    @When("^I enter password confirmation$")
    public void i_enter_password_confirmation() throws Throwable {
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys("123456");
    }

    @When("^I select yes to subscribe top newsletter$")
    public void i_select_yes_to_subscribe_top_newsletter() throws Throwable {
        driver.findElement(By.name("newsletter")).click();
    }

    @When("^I select no to become a seller$")
    public void i_select_no_to_become_a_seller() throws Throwable {
        driver.findElement(By.id("remove_document")).click();
    }

    @When("^I tick the Privacy policy box$")
    public void i_tick_the_Privacy_policy_box() throws Throwable {
        driver.findElement(By.name("agree")).click();
    }

    @When("^I click continue$")
    public void i_click_continue() throws Throwable {
        driver.findElement(By.cssSelector(" div > input.btn.btn-primary")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText(),("Your Account Has Been Created!"));}


}
