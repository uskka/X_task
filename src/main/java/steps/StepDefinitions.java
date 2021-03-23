package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CareersPage;
import pages.DemoPage;
import utilities.DriverFactory;

public class StepDefinitions {
    WebDriver driver;
    CareersPage careersPage;
    DemoPage demoPage;

    @Given("^user opens careers page$")
    public void user_opens_careers_page() {
        this.driver = DriverFactory.driverSetup("firefox");
        this.careersPage = new CareersPage(driver);
        driver.get("https://www.xeneta.com/careers");
        driver.manage().window().maximize();
        careersPage.acceptCookieBanner();
    }

    @When("^user clicks on Xeneta is one$")
    public void user_clicks_on_Xeneta_is_one() {
        careersPage.clickOnXenetaIsOne();
    }

    @Then("^user can see Xeneta is One value$")
    public void user_can_see_Xeneta_is_One_value() {
        careersPage.checkIfXenetaIsOneValueIsDisplayed();
    }

    @When("^user clicks on Modernization through data$")
    public void user_clicks_on_Modernization_through_data() {
        careersPage.clickOnModernizationThroughData();
    }

    @Then("^user can see Modernization through data value$")
    public void user_can_see_Modernization_through_data_value() {
        careersPage.checkIfModernizationThroughDataIsDisplayed();
    }

    @When("^user clicks on Variety and Fairness$")
    public void user_clicks_on_Variety_and_Fairness() {
        careersPage.clickOnVarietyAndFairness();
    }

    @Then("^user can see Variety and Fairness value$")
    public void user_can_see_Variety_and_Fairness_value() {
        careersPage.checkIfVarietyAndFairnessIsDisplayed();
    }

    @When("^user clicks on Transparency builds Trust$")
    public void user_clicks_on_Transparency_builds_Trust() {
        careersPage.clickOnTransparencyBuildsTrust();
    }

    @Then("^user can see Transparency builds Trust value$")
    public void user_can_see_Transparency_builds_Trust_value() {
        careersPage.checkIfTransparencyBuildsTrustIsDisplayed();
    }

    @Given("^user goes to demo page$")
    public void user_goes_to_demo_page(){
        this.driver = DriverFactory.driverSetup("firefox");
        this.demoPage = new DemoPage(driver);
        driver.get("https://www.xeneta.com/demo");
        driver.manage().window().maximize();
        demoPage.acceptCookieBanner();
    }
    @When("^user clicks on \"watch videos\" button$")
    public void user_clicks_on_watch_videos_button$() {
        demoPage.clickOnWatchVideosButton();
    }

    @When("^user clicks on schedule now button$")
    public void user_clicks_on_schedule_now_button$() {
        demoPage.clickScheduleNowAndWaitForPopup();
    }

    @Then("^user has been redirected to watchdemos page$")
    public void user_has_been_redirected_to_watchdemos_page() {
        demoPage.chceckIfRedirectedToWatchDemos();
    }

    @And("^user fills in first name field with (.*)$")
    public void user_fills_in_first_name_field_with(String name) {
        demoPage.fillInName(name);
    }
    @And("^user fills in last name field with (.*)$")
    public void user_fills_in_last_name_field_with(String lastName) {
        demoPage.fillInLastName(lastName);
    }
    @And("^user fills in Company name field with (.*)$")
    public void user_fills_in_company_name_field_with(String companyName) {
        demoPage.fillInCompanyName(companyName);
    }
    @And("^user fills in Business Email field with (.*)$")
    public void user_fills_in_business_email_field_with(String businessEmail) {
        demoPage.fillInBusinessEmail(businessEmail);
    }
    @And("^user clicks on a check box \"Subscribe to Xeneta Industry Blog\" (.*)$")
    public void user_clicks_on_a_check_box_subscribe(String yesNo) {
        if(yesNo.equals("yes")){
            demoPage.clickOnTheCheckBoxSubscribe();
        }
    }
    @And("^user clicks on a check box \"I agree to Privacy Policy from Xeneta.\" (.*)$")
    public void user_clicks_on_a_check_box_agree_privacy(String yesNo) {
        if(yesNo.equals("yes")){
            demoPage.clickOnTheCheckBoxAgreePrivacy();
        }
    }
    @And("^user clicks on \"watch videos\" button on the popup$")
    public void user_clicks_on_a_watch_videoes_on_popup() {
            demoPage.clickOnWatchVideosButtonOnPopup();
    }
    @Then("^error message \"Email must be formatted correctly.\" has appeared and user has not been redirected$")
    public void email_error_is_displayed_and_url_is_demo() {
        demoPage.checkIfEmailErrorIsDisplayed();
        demoPage.checkIfCurrentUrlIsDemoPage();
    }
    @And("^user clicks on X button top right corner$")
    public void user_clicks_on_X_button_top_right_corner() {
        demoPage.closePopup();
    }
    @Then("^popup has been closed$")
    public void popup_has_been_closed() {
        demoPage.checkIfPopupIsGone();
    }

    @After
    public void CloseDriver(){
       driver.quit();
    }


}
