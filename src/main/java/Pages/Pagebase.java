package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {

    protected WebDriver driver;

    public Pagebase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
