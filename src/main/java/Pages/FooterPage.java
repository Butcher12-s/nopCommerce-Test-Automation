package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends Pagebase {

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    // --- Newsletter Elements ---
    @FindBy(id = "newsletter-email")
    private WebElement newsletterInput;

    @FindBy(id = "newsletter-subscribe-button")
    private WebElement subscribeButton;

    @FindBy(id = "newsletter-result-block")
    private WebElement newsletterResult;

    // --- Footer Links Elements ---
    @FindBy(linkText = "Sitemap")
    private WebElement sitemapLink;

    @FindBy(linkText = "Shipping & returns")
    private WebElement shippingLink;

    @FindBy(linkText = "Privacy notice")
    private WebElement privacyLink;

    @FindBy(linkText = "Conditions of Use")
    private WebElement conditionsLink;

    @FindBy(linkText = "About us")
    private WebElement aboutUsLink;



    // 1. Newsletter Subscription Action
    public void subscribeToNewsletter(String email) {
        newsletterInput.sendKeys(email);
        subscribeButton.click();
    }

    public String getNewsletterMessage() {
        return newsletterResult.getText();
    }

    // open any footer link by name
    public void openFooterLink(String linkName) {
        switch (linkName) {
            case "Sitemap":
                sitemapLink.click();
                break;
            case "Shipping & returns":
                shippingLink.click();
                break;
            case "Privacy notice":
                privacyLink.click();
                break;
            case "Conditions of Use":
                conditionsLink.click();
                break;
            case "About us":
                aboutUsLink.click();
                break;
            default:
                System.out.println("Link not defined in Page Class: " + linkName);
        }
    }
}