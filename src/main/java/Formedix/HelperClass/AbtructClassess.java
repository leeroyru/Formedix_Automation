package Formedix.HelperClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class AbtructClassess {
     WebDriver driver;
    public AbtructClassess(WebDriver driver){
         this.driver =driver;
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
    public void waitForElementToAppear(By findBy){

    }
}
