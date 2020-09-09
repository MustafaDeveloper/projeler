package Part3;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        // 1)        1) Bu siteye gidin. -> https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");
        Thread.sleep(3000);

        //    2) "teddy bear" aratın ve  Search butonuna tıklayın.
        WebElement name=driver.findElement(By.name("keyword"));
        name.sendKeys("teddy bear");
        Thread.sleep(3000);

        WebElement log=driver.findElement(By.className("searchTextSpan"));
        log.click();
        Thread.sleep(1000);



       // 3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        //We've got 1502 results for 'teddy bear'
        WebElement teddy=driver.findElement(By.className("nnn"));
        String str=teddy.getText();
        Assert.assertEquals("We've got 1502 results for 'teddy bear'",str);

        //4) Snepdeal logosuna tıklayınız.
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[1]/a[1]/img"));
        logo.click();


        //5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)
        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/",url);

        Thread.sleep(2000);
        driver.quit();
    }
    /*



     */
}
