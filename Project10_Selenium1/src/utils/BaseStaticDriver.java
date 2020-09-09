package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BaseStaticDriver {
    public static WebDriver driver;

    static{

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","C:/Users/Mustafa/IdeaProjects/Project9/src/drivers/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        driver = new ChromeDriver();
    }
}
