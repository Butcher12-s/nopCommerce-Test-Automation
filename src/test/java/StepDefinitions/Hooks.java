package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
     public static WebDriver driver;
    @Before
    public void setup() {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();



        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://localhost:5000/");



    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
