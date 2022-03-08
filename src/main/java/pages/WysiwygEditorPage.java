package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By descreaseIndentButton = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]/span/svg/path");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    /*
    public void descreaseIndention(){
        driver.findElement(descreaseIndentButton).click();
    }
    */

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeID);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
