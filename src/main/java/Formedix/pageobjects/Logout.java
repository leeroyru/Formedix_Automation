package Formedix.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Logout {
    WebDriver driver;
    public Logout(WebDriver driver){
        super();
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="menuUser")
    WebElement menuover;
    @FindBy(id="menuUserLogout")
    WebElement logout;
    public void signOut() throws InterruptedException {
        Thread.sleep(6000);
        menuover.click();
        logout.click();
        Thread.sleep(6000);
        driver.quit();

    }
}
