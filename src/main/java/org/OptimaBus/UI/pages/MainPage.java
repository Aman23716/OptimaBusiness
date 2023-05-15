package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainPage extends BasePage{

    @FindBy(xpath = "(.//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[3]")
    public WebElement calcBTN;

    @FindBy(xpath = "(.//div[@class=\"q-field__control relative-position row no-wrap\"])[3]")
    public WebElement VidKursov ;

   @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
   public WebElement clickOnKPK;

   @FindBy(xpath = ".//input[@class='q-field__input']")
   public WebElement inputSum;

   @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[4]")
   public WebElement clickBtnToChooseCurrent;

   @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
   public WebElement chooseUSD;

   @FindBy(xpath = ".//button")
   public WebElement BTNToEnter;

   @FindBy(xpath = ".//a[@class='router-link-active router-link-exact-active nav-item active']")
   public WebElement clickMainBTN;




   @FindBy(xpath = "(.//div[@class='account-header p2'])[1]")
   public WebElement HUI;







   public MainPage Znacheniya(){
       HUI.getText();

       return this;
   }


    public MainPage chooseKurs(){
        elementActions.click(calcBTN).click(VidKursov).click(clickOnKPK).sendKeys(inputSum, "10000");

        return this;
    }

    public MainPage ChooseCurrent(){
        elementActions.click(clickBtnToChooseCurrent).click(chooseUSD);
        return this;
    }

    public MainPage BTN(){
        elementActions.click(BTNToEnter);
        return this;
    }

    public MainPage clickMNPage(){
        elementActions.click(clickMainBTN);


        return this;
    }




}
