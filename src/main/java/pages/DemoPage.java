package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DemoPage {
    WebDriver driver;
    int timeout = 20;

    @FindBy(id = "hs-eu-confirmation-button")
    WebElement cookieBannerAccept;
    @FindBy(xpath = "//a[text()='WATCH VIDEOS']")
    WebElement watchVideosButton;
    @FindBy(xpath = "//a[text()='Schedule Now']")
    WebElement scheduleMettingButton;
    @FindBy(xpath = "//label[text()='Email must be formatted correctly.']")
    WebElement EmailFormatErrorMessage;
    @FindBy(className = "hs-input")
    List<WebElement> inputsList;
    @FindBy(className = "actions")
    List<WebElement> actionButtonsList;
    @FindBy(xpath = "//a[text()='Close']")
    WebElement closePopupButton;

    public void checkIfPopupIsGone(){
        assert(!actionButtonsList.get(2).isDisplayed());
    }
    public void closePopup() {
        closePopupButton.click();
    }
    public void checkIfCurrentUrlIsDemoPage() {
        assert(driver.getCurrentUrl().equals("https://www.xeneta.com/demo"));
    }
    public void checkIfEmailErrorIsDisplayed() {
        assert(EmailFormatErrorMessage.isDisplayed());
    }
    public void clickOnWatchVideosButtonOnPopup() {
        actionButtonsList.get(2).click();
    }
    public void clickOnTheCheckBoxAgreePrivacy() {
        inputsList.get(30).click();
    }
    public void clickOnTheCheckBoxSubscribe() {
        inputsList.get(29).click();
    }
    public void fillInBusinessEmail(String email) {
        inputsList.get(26).sendKeys(email);
    }
    public void fillInCompanyName(String companyName) {
        inputsList.get(25).sendKeys(companyName);
    }
    public void fillInLastName(String lastNme) {
        inputsList.get(24).sendKeys(lastNme);
    }
    public void fillInName(String name) {
        inputsList.get(23).sendKeys(name);
    }

    public void clickScheduleNowAndWaitForPopup() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(scheduleMettingButton));
        scheduleMettingButton.click();
        wait.until(ExpectedConditions.visibilityOf(inputsList.get(23)));
    }

    public void clickOnWatchVideosButton() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(watchVideosButton));
        watchVideosButton.click();
    }

    public void chceckIfRedirectedToWatchDemos() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.urlContains("watchdemos"));
    }

    public void acceptCookieBanner() {
        cookieBannerAccept.click();
    }


    public DemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
