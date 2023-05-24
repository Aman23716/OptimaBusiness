package org.OptimaBus.UI.helper;

import org.OptimaBus.UI.driverFactory.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class WebElementActions {



    public WebElementActions waitElementToBeDisplayed(WebElement element){

        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return this;
    }


    public WebElementActions click (WebElement element){
        waitElementToBeDisplayed(element);
        element.click();
        pause(2000);

        return this;
    }
    public WebElementActions sendKeysInt(WebElement element, Integer f){
        waitElementToBeDisplayed(element);
        element.sendKeys(Integer.toString(f));
        return this;
    }

    public WebElementActions sendKeys(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions assertUrlPage(String object){
        assertEquals(Driver.getDriver().getCurrentUrl(),object);
        return this;
    }

    public WebElementActions pause(Integer milliSeconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliSeconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;}
    public WebElementActions sendKeysWithClear(WebElement element,String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions refreshPage(){
        Driver.getDriver().navigate().refresh();
        pause(3000);
        return this;
    }

    public static int calk(int a, int b){

        return a * b;
    }



}
