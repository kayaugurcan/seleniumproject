package ornek;

import dev.failsafe.internal.util.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Selenium02 extends TestBase {


    @Test
    public void genelTest() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,300)");

        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Sema");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Merin");

        WebElement gender = driver.findElement(By.id("sex-0"));
        gender.click();

        WebElement exp = driver.findElement(By.id("exp-0"));
        exp.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("11.05.2001");

        WebElement profession  = driver.findElement(By.id("profession-1"));
        profession.click();

        WebElement tools = driver.findElement(By.id("tool-2"));
        tools.click();

        WebElement dropdownContinents = driver.findElement(By.id("continents"));
        dropdownContinents.findElement(By.xpath("//option[. = 'Antartica']")).click();

        WebElement dropdownCommand = driver.findElement(By.id("selenium_commands"));
        dropdownCommand.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

        WebElement uploadFile = driver.findElement(By.id("photo"));
        uploadFile.sendKeys("D:/Projects/seleniumproject/src/images/rigby.png");

        //WebElement submitButton = driver.findElement(By.name("Button"));
        //submitButton.click();

        //Assert.isTrue(submitButton.isDisplayed(),"HATALI");



        Thread.sleep(2000);



    }


}
