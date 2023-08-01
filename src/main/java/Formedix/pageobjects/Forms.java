package Formedix.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Forms {
     WebDriver driver;
     public Forms(WebDriver driver){
         super();
         this.driver= driver;
         PageFactory.initElements(driver,this);
     }
    @FindBy(xpath="//div[@class='fdx-ellipsis'] //span[contains(text(),'Medical History')]")
     WebElement medhistory;
    @FindBy(id="switchEditMode")
    WebElement editforms;
    @FindBy(id="editPropsAddEntrydescription")
    WebElement adddescription;
    @FindBy(id="assetLocaleEditTextTextareadescription")
    WebElement text;
    @FindBy(id="localeInputdescription")
    WebElement localll;
    @FindBy(id="saveAsset")
    WebElement UpdateForm;
    @FindBy (id = "formDescription")
    WebElement heading;
     public void medicalHistory () {
         medhistory.click();
     }
     public void editForms(){
         editforms.click();
     }
     public void addDescription() {
         adddescription.click();
     }
    public void descriptionText(String Description) {
        text.sendKeys(Description);
    }
    public void localText(String Local) {
        localll.sendKeys(Local);
    }
    public void formUpdate() throws InterruptedException {
        Thread.sleep(2000);
        UpdateForm.click();
    }
    public boolean textDescription() throws InterruptedException {
         Thread.sleep(5000);
         return heading.getText().toString().contains("Welcome To Formedix Medical Center");
    }
}




