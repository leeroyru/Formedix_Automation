package Formedix.aut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Repository_Studies {
     WebDriver driver;
   //Constructor runs first
     public Home_Repository_Studies(WebDriver driver){
//local driver initialization
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    //PageFactory
    @FindBy(xpath="//p[@class='fdxicon-regular fdx-repository fdx-main-nav-item-default']")
     WebElement repo;
    @FindBy(xpath="//span[normalize-space()='Studies']")
    WebElement studies;
    @FindBy(id="fdxMdbContainerListItem0MenuToggle")
    WebElement toggle;
    @FindBy(id="fdxMdbContainerListItem0View")
    WebElement view;
    //Actions
     public TechStudy homepage(){
         repo.click();
                 studies.click();
         toggle.click();
         view.click();
         TechStudy techStudy = new TechStudy(driver);
         return techStudy;

     }



}
