import Framework.Engine.DriverFactory;
import Framework.Engine.PropertiesReader;
import GooglePages.FindFirstResult;
import GooglePages.GoogleSearch;
import Framework.Engine.JsonFileManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    WebDriver driver;
    JsonFileManager testdata;
    //dah lw hstgdm pom mn 3'er fluent design
    //GoogleSearch googlesearch;
 //   FindFirstResult results;


    //Business steps
    @Test
    public void searchGoogle(){
        new GoogleSearch(driver)

                .searchGoogle(testdata.getTestData("searchData1"));

        new FindFirstResult(driver)
                . getFirstElementAndValidateIt(testdata.getTestData("searchData1"))
                .click();
    }
    @Test
    public void searchGoogle2(){
        new GoogleSearch(driver)

                .searchGoogle(testdata.getTestData("searchData2"));
       new FindFirstResult(driver)
               . getFirstElementAndValidateIt("WebDriver")
                .click();


    }

@BeforeClass
public void beforeClass(){
    PropertiesReader.loadProperties();
    testdata=new JsonFileManager("src/test/resources/Test Data/Test Data.json");

    }


    @BeforeMethod
    public void beforeMethod(){
      //  driver=new ChromeDriver();
      //  driver.manage().window().maximize();
      //  googlesearch=new GoogleSearch(driver);
     //   results=new FindFirstResult(driver);
        driver=driver = DriverFactory.initDriver();
       new GoogleSearch(driver). navigateToGoogleUrl();
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
