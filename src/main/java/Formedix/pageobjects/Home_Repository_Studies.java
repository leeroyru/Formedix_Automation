package Formedix.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_Repository_Studies extends LandingPage {
     WebDriver driver;
     public Home_Repository_Studies(WebDriver driver){
         super(driver);
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    @FindBy(xpath="//p[@class='fdxicon-regular fdx-repository fdx-main-nav-item-default']")
     WebElement repo;
    @FindBy(xpath="//span[normalize-space()='Studies']")
    WebElement studies;
    @FindBy(id="fdxMdbContainerListItem0MenuToggle")
    WebElement toggle;
    @FindBy(id="fdxMdbContainerListItem0View")
    WebElement view;
     public void repository () {
         repo.click();
     }
    public void studies () {
        studies.click();
    }
    public  void viewtoggle(){
         toggle.click();
         view.click();

     }



}
