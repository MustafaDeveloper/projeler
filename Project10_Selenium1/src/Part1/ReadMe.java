package Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
import static org.junit.Assert.*;

public class ReadMe extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

    // 1) Bu siteye gidin. ->  http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box"); // siteyi açtım

    // 2) Full Name kısmına "Automation" girin.
        WebElement name=driver.findElement(By.id("userName"));
        name.sendKeys("Automation");
        Thread.sleep(1000);

    // 3) Email kısmına "Testing" girin.
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");
        Thread.sleep(1000);

     //   4) Current Address kısmına "Testing Current Address" girin.
        WebElement address=driver.findElement(By.id("currentAddress"));
        address.sendKeys("Testing Current Address");
        Thread.sleep(1000);

        // 5) Permanent Address kısmına "Testing Permanent Address" girin.
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");
        Thread.sleep(1000);


        //6) Submit butonuna tıklayınız.
        WebElement submit=driver.findElement(By.id("submit"));
        submit.click();
        Thread.sleep(1000);

       // 7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
       String fullName=driver.findElement(By.cssSelector("[id=name][class=mb-1]")).getText();
        System.out.println("fullName = " + fullName);
       Assert.assertEquals( "Name:Automation",fullName);

       //  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        String eMail=driver.findElement(By.cssSelector("[id=email][class=mb-1]")).getText();
        System.out.println("eMail = " + eMail);
        Assert.assertEquals( "Email:Testing@gmail.com",eMail);
        Thread.sleep(3000);
        driver.quit();
    }

}
