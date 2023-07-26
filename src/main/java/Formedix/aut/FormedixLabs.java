package Formedix.aut;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf. usermodel. XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


public class FormedixLabs {

    DataFormatter formatter = new DataFormatter();
    @Test(dataProvider = "driveTest")
    public void testCaseData(String Username,String Password,String Description,String Local) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\T600019626\\Downloads\\chromedriver_win32.zip.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

        //object for landing page
        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
        Home_Repository_Studies home_repository_studies = landingPage.loginApplication(Username,Password);
        Thread.sleep(6000);
        TechStudy techStudy = home_repository_studies.homepage();
        Data_Aquisation data_aquisation= techStudy.Forms();
        Forms forms =data_aquisation.Assets();
        forms.MedicalHistory(Description,Local);

        System.out.println(driver.getPageSource().contains("Formedix Medical History"));


        //Thread.sleep(6000);
        //driver.findElement(By.xpath(("/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/a[1]/div[2]"))).click();
        System.out.println(Username+Password+Description+Local);
    }
    @DataProvider( name = "driveTest")
    public Object[][] getData() throws IOException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\Public\\Documents\\Datadriven.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int colCount = row.getLastCellNum();
        Object[][] data = new Object[rowCount-1][colCount];
        for (int i = 0; i < rowCount-1; i++)
        {
            row= sheet.getRow(i+1);
            for (int j = 0; j < colCount; j++)
            {
                XSSFCell cell = row.getCell(j);
                data[i][j] = formatter.formatCellValue(cell);
            }
        }
        return data;
    }

}
