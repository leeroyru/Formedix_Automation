package Formedix.pageobjects;
import Formedix.HelperClass.AbtructClassess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
public class LandingPage extends AbtructClassess {
    WebDriver driver;
    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @Override
    public void waitForElementToAppear(By findBy) {
        super.waitForElementToAppear(findBy);
    }

    @FindBy(xpath = "//*[@id='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passWord;
    @FindBy(xpath = "//div[@class='form-group sign-in']")
    WebElement login;
    public Home_Repository_Studies loginApplication(String Username, String Password) {
        userName.sendKeys(Username);
        passWord.sendKeys(Password);
        Home_Repository_Studies home_repository_studies = new Home_Repository_Studies(driver);
        return home_repository_studies;
    }
    public void Clicklogin() {
        login.click();
    }

    public void openLandingPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
        driver.get("https://ryze-staging.formedix.com/sign-in ");
    }
}
