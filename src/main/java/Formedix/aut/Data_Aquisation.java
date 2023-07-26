package Formedix.aut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Data_Aquisation {
     WebDriver driver;
   //Constructor runs first
     public Data_Aquisation(WebDriver driver){
//local driver initialization
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    //PageFactory
    @FindBy(id="FORMTypeView")
     WebElement formty;

     public Forms Assets(){
         formty.click();
         Forms forms = new Forms(driver);
         return forms;
     }


}
