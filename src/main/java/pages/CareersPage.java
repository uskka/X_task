package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class CareersPage {
    WebDriver driver;
    int timeout = 10;

    @FindBy(xpath = "//li[text()='Xeneta is one']")
    WebElement xenetaIsOneLinkText;

    @FindBy(id = "hs-eu-confirmation-button")
    WebElement cookieBannerAccept;

    @FindBy(className = "right-col")
    List<WebElement> ourValuesContentList;

    @FindBy(className = "tab-link")
    List<WebElement> ourValuesTitlesList;

    public void clickOnXenetaIsOne() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        xenetaIsOneLinkText.click();
        wait.until(ExpectedConditions.visibilityOf(ourValuesContentList.get(1)));
    }

    public void clickOnModernizationThroughData() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(ourValuesTitlesList.get(1)));
        ourValuesTitlesList.get(1).click();
        wait.until(ExpectedConditions.visibilityOf(ourValuesContentList.get(2)));
    }

    public void clickOnVarietyAndFairness() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(ourValuesTitlesList.get(2)));
        ourValuesTitlesList.get(2).click();
        wait.until(ExpectedConditions.visibilityOf(ourValuesContentList.get(3)));
    }

    public void clickOnTransparencyBuildsTrust() {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(ourValuesTitlesList.get(3)));
        ourValuesTitlesList.get(3).click();
        wait.until(ExpectedConditions.visibilityOf(ourValuesContentList.get(4)));
    }

    public void checkIfXenetaIsOneValueIsDisplayed() {
        assert (ourValuesContentList.get(1).isDisplayed());
    }

    public void checkIfModernizationThroughDataIsDisplayed() {
        assert (ourValuesContentList.get(2).isDisplayed());
    }

    public void checkIfVarietyAndFairnessIsDisplayed() {
        assert (ourValuesContentList.get(3).isDisplayed());
    }

    public void checkIfTransparencyBuildsTrustIsDisplayed() {
        assert (ourValuesContentList.get(4).isDisplayed());
    }

    public void acceptCookieBanner() {
        cookieBannerAccept.click();
    }

    public CareersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
