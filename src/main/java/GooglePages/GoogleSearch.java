package GooglePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.openqa.selenium.Keys.ENTER;

public class GoogleSearch {
    WebDriver driver;

    //locators
    By TextArea_GoogleSearch=By.id("APjFqb");



    //actions
    public GoogleSearch(WebDriver driver){
        this.driver=driver;
    }


    public void searchGoogle(String searchData) {
        driver.findElement(TextArea_GoogleSearch).sendKeys(searchData, ENTER);

    }

    public void navigateToGoogleUrl() {
        driver.navigate().to("https://www.google.com/");
        ;
    }


}
