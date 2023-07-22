package ornek;

import dev.failsafe.internal.util.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;




public class Selenium01 extends TestBase {

    @Test
    public void yanlisUsernameTesti() throws InterruptedException  {

        driver.get("https://www.saucedemo.com/");


        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("sstandard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(1000);

        loginButton = driver.findElement(By.id("login-button"));
        Assert.isTrue(loginButton.isDisplayed(),"HATALI");
        //Assert.isTrue(password.isDisplayed(),"hata");
    }
}
