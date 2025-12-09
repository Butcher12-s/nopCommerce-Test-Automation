package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Pagebase {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='main']/div/section/div/div[2]/div/div")
    private WebElement message;

    public String getMessageText() {
        return message.getText();
    }
}