package Formedix.aut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forms {
     WebDriver driver;
   //Constructor runs first
     public Forms(WebDriver driver){
//local driver initialization
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    //PageFactory
    //Medical History
    @FindBy(xpath="//div[@class='fdx-ellipsis'] //span[contains(text(),'Medical History')]")
     WebElement medhistory;
     //Edit Form
    @FindBy(id="switchEditMode")
    WebElement editforms;
    //Add Description
    @FindBy(id="editPropsAddEntrydescription")
    WebElement adddescription;
    //Text Description
    @FindBy(id="assetLocaleEditTextTextareadescription")
    WebElement text;
    //locale
    @FindBy(id="localeInputdescription")
    WebElement localll;
    //Update
    @FindBy(id="saveAsset")
    WebElement UpdateForm;

    //Actions
     public void MedicalHistory(String Description, String Local){
         medhistory.click();
                 editforms.click();
         adddescription.click();
         text.sendKeys(Description);
         localll.sendKeys(Local);
         UpdateForm.click();


     }



}
