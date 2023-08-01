package Formedix.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TechStudy { 
    WebDriver driver;
     public TechStudy(WebDriver driver){
         super();
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    @FindBy(id="dataAcquisitionName")
     WebElement datacquisition;
     public void assetgroups(){
         datacquisition.click();
     }
}
