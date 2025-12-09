package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Registerpage extends Pagebase {

    public Registerpage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "FirstName")
    private WebElement FirstName;

    @FindBy(id = "LastName")
    private WebElement LastName;

    @FindBy(id = "Email")
    private WebElement Email;

    @FindBy(id = "Company")
    private WebElement Company;

    @FindBy(id = "Password")
    private WebElement Password;

    @FindBy(id = "ConfirmPassword")
    private WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    private WebElement registerbutton;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/div[2]/form/div/ul/li")
    public WebElement registerErrorMsg;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/div[2]/div[1]")
    public WebElement registerSuccessMsg;

    public void Registerationconfirm(String firstName, String lastName, String email, String password, String confirmPassword) {

        FirstName.sendKeys(firstName);
        LastName.sendKeys(lastName);
        Email.sendKeys(email);
        Password.sendKeys(password);
        ConfirmPassword.sendKeys(confirmPassword);
        registerbutton.click();

    }
    public String getStatusMessage() {

        try {

            if (registerErrorMsg.isDisplayed()) {
                return registerErrorMsg.getText();
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {

        }

        try {

            if (registerSuccessMsg.isDisplayed()) {
                return registerSuccessMsg.getText();
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {

        }

        return "";
    }

}





