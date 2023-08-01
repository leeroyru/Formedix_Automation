package Formedix.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Data_Aquisition {
    WebDriver driver;
    public Data_Aquisition(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "FORMTypeView")
    WebElement formtype;
    public void assetsFormsLists() {
        formtype.click();
    }
}