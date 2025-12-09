package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Pagebase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "Email")
private WebElement Email;
@FindBy(id = "Password")
private WebElement Password;
    @FindBy(xpath = "//*[@id='main']/div/section/div/div[2]/div[1]/div[2]/form/div[2]/button")
private WebElement button;
public void loginconfirm( String email, String password) {


        Email.sendKeys(email);
        Password.sendKeys(password);
        button.click();
    }

}
