package Formedix.stepdefinitions;
import Formedix.pageobjects.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class MedicalHistoryStepDefinition {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver = new ChromeDriver(chromeOptions);
    LandingPage lp = new LandingPage(driver);
    Home_Repository_Studies Hm = new Home_Repository_Studies(driver);
    TechStudy Tech = new TechStudy(driver);
    Data_Aquisition Dataaque = new Data_Aquisition(driver);
    Forms Fm = new Forms(driver);
    Logout Lg = new Logout(driver);
    @Given("User launch Chrome Browser and land on Formedix home page")
    public void user_launch_chrome_browser_and_land_on_formedix_home_page() {
        lp.openLandingPage();
    }
    @Given("User logs into Formedix Medical History Page {string} and {string}")
    public void user_logs_into_formedix_medical_history_page_and(String Username, String Password) {
        lp.loginApplication(Username, Password);
    }
    @Given("Click on Login")
    public void click_on_login() {
        lp.Clicklogin();
    }
    @Then("User Lands on Homepage Navigates to Repository->Studies->toggles than clicks View")
    public void user_lands_on_homepage_navigates_to_repository_studies_toggles_than_clicks_view() {
        Hm.repository();
        Hm.studies();
        Hm.viewtoggle();
    }
    @Given("User Enters the tech test study view and Clicks on ‘Data acquisition’ asset group view.")
    public void user_enters_the_tech_test_study_view_and_clicks_on_data_acquisition_asset_group_view()  {
        Tech.assetgroups();
    }
    @Then("On Data acquisition Page User Click ‘Forms’under Asserts list")
    public void On_Data_acquisition_Page_User_Click_Forms_under_Asserts_list() {
        Dataaque.assetsFormsLists();
    }
    @Then("Select to view the ‘Medical History’ form.")
    public void select_to_view_the_medical_history_form() {
        Fm.medicalHistory();
    }
    @Then("Select to edit the form by adding a {string} and {string}property to the form.")
    public void select_To_Edit_The_Form_By_Adding_And_Property_To_The_Form(String Description, String Local) {
        Fm.editForms();
        Fm.addDescription();
        Fm.descriptionText(Description);
        Fm.localText(Local);
    }
    @And("Save the change and Confirm Updated Description {string} is Displayed on the panel and main form")
    public void save_The_Change_And_Confirm_Updated_Description_Is_Displayed_On_The_Pane_lAnd_Main_Form(String string) throws InterruptedException {
        {
            try {
                Fm.formUpdate();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Fm.textDescription();
        }
        Fm.textDescription();
    }
    @Then("User Signs out by expanding the menu when the mouse is over the user icon on the bottom left hand side of the menu bar.")
    public void user_signs_out_by_expanding_the_menu_when_the_mouse_is_over_the_user_icon_on_the_bottom_left_hand_side_of_the_menu_bar() throws InterruptedException {
        Lg.signOut();
    }

}

