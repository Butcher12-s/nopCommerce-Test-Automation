package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Pagebase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".fullname")
    private WebElement fullname;

    @FindBy(css = ".email")
    private WebElement email;

    @FindBy(className = "enquiry")
    private WebElement enquiry;
@FindBy(name = "send-email")
private WebElement sendEmail;
    @FindBy(xpath = "//*[@id=\"main\"]/div/section/div/div[2]/div[2]")
    private WebElement message;
    @FindBy(id = "Email-error")
    private WebElement emailError;
    public void Set_data_to_contact(String nameText, String emailText, String enquiryText) {
        fullname.sendKeys(nameText);
        email.sendKeys(emailText);
        enquiry.sendKeys(enquiryText);
        sendEmail.click();
    }
    public String getmassege(){
         return message.getText();
    }
    public String getmassegeerroremail(){
        return emailError.getText();
    }
}