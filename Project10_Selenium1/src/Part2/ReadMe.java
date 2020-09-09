package Part2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        // 1) Bu siteye gidin. -> https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");
        //    2) Username kısmına "ttechno@gmail.com" girin.
        WebElement name=driver.findElement(By.id("username"));
        name.sendKeys("ttechno@gmail.com");

            // 3) Password kısmına "techno123." girin.
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("techno123");

        //  4) "Sign in" buttonunan tıklayınız.

        WebElement log=driver.findElement(By.id("log-in"));
        log.click();
        Thread.sleep(1000);

        // 5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )
        WebElement yourNearest=driver.findElement(By.id("time"));
        String str=yourNearest.getText();
        Assert.assertEquals("Your nearest branch closes in: 30m 5s",str);

        // 6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
        String url=driver.getCurrentUrl();
         Assert.assertEquals("https://demo.applitools.com/app.html",url);

        Thread.sleep(2000);
        driver.quit();
    }

    /*


     */
}
