package GooglePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FindFirstResult {
    WebDriver driver;
    //locator
    By Header_firstResult=By.xpath("(//h3)[1]");
//constructor
    public FindFirstResult(WebDriver driver){
        this.driver=driver;
    }
//actions return object mn class 3shan a2adr 2st5dm method on fluent design en method teb2at7t b3d
    public FindFirstResult getFirstElementAndValidateIt(String FirstResult) {
        String FirstHeader=driver.findElement(Header_firstResult).getText();
        Assert.assertEquals(FirstHeader,FirstResult);
        return this;
    }
    public FindFirstResult click(){
        driver.findElement(Header_firstResult).click();
        return this;
    }

}
