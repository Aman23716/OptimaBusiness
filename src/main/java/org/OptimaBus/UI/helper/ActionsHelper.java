package org.OptimaBus.UI.helper;

import org.OptimaBus.UI.driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
    private WebDriver driver;
    Actions actions = new Actions(driver);

    public ActionsHelper(WebDriver driver){
        this.driver = driver;
    }

    public Actions doubleClick(){
        actions.doubleClick().perform();
        return null;
    }
    public Actions moveToElement(WebElement element){
        actions.moveToElement(element).perform();
        return null;
    }



}
