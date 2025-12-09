package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class Testsbase {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // User-Agent طبيعي حتى لا يميزك Cloudflare كـ Bot

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://localhost:5000/");



    }


}
