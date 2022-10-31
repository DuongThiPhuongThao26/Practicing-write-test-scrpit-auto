package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private By triggerConfirmationButton = By.xpath("//button[@onclick='jsConfirm()']");
    private By triggerPromButton = By.xpath("//button[@onclick='jsPrompt()']");
    private By result = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmationButton).click();
    }

    public void triggerProm(){
        driver.findElement(triggerPromButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void setAlertInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }




}
