package org.OptimaBus.UI.helper;

import org.OptimaBus.UI.driverFactory.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import static org.OptimaBus.UI.driverFactory.Driver.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.testng.Assert.assertEquals;

public class WebElementActions {

    private static Logger logger = LogManager.getLogger(WebElementActions.class);

    public  static void  waitElementToBeDisplayed(WebElement element){


        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOf(element));

    }
    public static void waitForElementVisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForElementToBeClickable(WebElement element) {
        logger.info("Waiting for element to be clickable");
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(4))
                .until(elementToBeClickable(element));
        logger.info("Element is clickable");
    }
    public static void waitForElementToBeNotClickable(WebElement element)  {
        logger.info("Waiting for element to be not clickable");
       try{ new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(2))
               .until(ExpectedConditions.elementToBeClickable(element));
        logger.info("Element is clickable");}
       catch (Exception e){
           System.out.println("Oh");
       }
    }
    public WebElementActions cantBeChanged(WebElement element){

        if (element.isEnabled()) {
            System.err.println("Element is enabled");
        } else {
            System.err.println("Element is disabled");
        }

        return this;
    }






    public WebElementActions click (WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        waitForElementVisibilityOf(element);
        element.click();
        pause(1000);
        return this;
    }
    public boolean isClickAble(WebElement element){
        element.isSelected();
        return true;
    }
    public WebElementActions sendKeysDouble(WebElement element, Double f){
        waitElementToBeDisplayed(element);
        element.sendKeys(Double.toString(f));
        return this;
    }




    public WebElementActions sendKeysInt(WebElement element, Integer f){
        waitElementToBeDisplayed(element);
        element.sendKeys(Integer.toString(f));
        return this;
    }
    public WebElementActions sendKeysLong(WebElement element, Long f){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(Long.toString(f));
        return this;
    }
    public WebElementActions sendKeys(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions getText(WebElement element){
        waitElementToBeDisplayed(element);
        element.getText();
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

    public static String getTextValue(WebElement element){
        logger.info("Trying to get text value");
        waitElementToBeDisplayed(element);
        String text = element.getText();
        return text;
    }






    public WebElementActions inputDocumentNumber1(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementVisibilityOf(element);
        element.sendKeys("Test value");
        return this;
    }
    public WebElementActions inputNaznachenieField1(WebElement element){
        waitForElementVisibilityOf(element);
        waitElementToBeDisplayed(element);
        element.sendKeys("Test value for 'Naznachenie' field 1234567");
        return this;
    }
    public WebElementActions inputDocumentNumber2(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementVisibilityOf(element);
        element.sendKeys("Test wrong value не должно пройти");
        return this;
    }
    public WebElementActions inputNaznachenieField2(WebElement element){
        waitForElementVisibilityOf(element);
        waitElementToBeDisplayed(element);
        element.sendKeys("dfs");
    return this;
    }

}