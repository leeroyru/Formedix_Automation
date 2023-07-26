package Formedix.aut;

import Formedix.Abstructs.AbtructClassess;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbtructClassess {
    WebDriver driver;

    //Constructor runs first
    public LandingPage(WebDriver driver) {
        super(driver);
//local driver initialization
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    @FindBy(xpath = "//input[@id='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passWord;
    @FindBy(xpath = "//div[@class='form-group sign-in']")
    WebElement login;

    //Actions
    public Home_Repository_Studies loginApplication(String Username, String Password) {
        userName.sendKeys(Username);
        passWord.sendKeys(Password);
        login.click();
        Home_Repository_Studies home_repository_studies = new Home_Repository_Studies(driver);
        return home_repository_studies;
    }

    public void goTo() {
        driver.get("https://ryze-staging.formedix.com/sign-in ");
    }

}
