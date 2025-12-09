package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends Pagebase {

    @FindBy(linkText ="Register" )
    WebElement registerbutton ;
    @FindBy(xpath = "/html/body/div[6]/header/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement Loginbutton ;
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement Shoppingcartbutton ;
    @FindBy(id = "customerCurrency")
    private WebElement currencyDropdown;

    @FindBy(id = "customerlanguage")
    private WebElement languageDropdown;
    @FindBy(xpath = "/html/body/div[6]/div/nav/div[2]/div[6]/a")
    private WebElement contactus;

    public void changeCurrency(String currencyName) {
        Select select = new Select(currencyDropdown);
        select.selectByVisibleText(currencyName);
    }

    public void changeLanguage(String languageName) {
        Select select = new Select(languageDropdown);
        select.selectByVisibleText(languageName);
    }
    public Homepage(WebDriver driver) {
        super(driver);
    }

    public void Openregisteration(){

         registerbutton.click();

    }
    public void Openloginpage(){

        Loginbutton.click();

    }
    public void OpenShoppingCartpage(){

        Shoppingcartbutton.click();

    }
    public void openContactUsPage(){

        contactus.click();

    }

}
