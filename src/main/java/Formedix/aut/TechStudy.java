package Formedix.aut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechStudy {
     WebDriver driver;
    //Constructor runs first
     public TechStudy(WebDriver driver){
//local driver initialization
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    //PageFactory
    @FindBy(id="dataAcquisitionName")
     WebElement dataquasation;

     public Data_Aquisation Forms(){

         dataquasation.click();
         Data_Aquisation data_aquisation = new Data_Aquisation(driver);
         return data_aquisation;

     }


}
