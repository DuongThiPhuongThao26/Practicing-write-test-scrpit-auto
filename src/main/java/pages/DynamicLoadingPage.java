package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By linkExample1 = By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExamplePage clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExamplePage(driver);
    }
}
