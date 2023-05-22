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

   @FindBy(xpath = ".//div[@class='logo-wrap']")
   public WebElement MAINBTN;


   @FindBy(xpath = "(.//div[@class='account-header p2'])[1]")
   public WebElement HUI;

   @FindBy(xpath = ".//a[@class='user-toggle no-caret']")
   public WebElement chooseCompany;

   @FindBy(xpath = ".//button[@class='aside-dropdown-item dropdown-item user-text text-dark'][2]")
   public WebElement chooseUtes;

   @FindBy(xpath = "(.//span[@class='q-ml-auto'])[1]")
   public WebElement KURSSOM;

    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")
    public WebElement CreateBTN;

    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable p-select-header-close q-pa-none']")
    public WebElement ExitBTN;













    public MainPage CreateBTN(){
        elementActions.click(ExitBTN).click(CreateBTN);
        return this;
    }

   public MainPage GetValueSomSum(){
       KURSSOM.getText();
       return this;
   }

   
   

   public MainPage Znacheniya(){
       HUI.getText();
       return this;
   }


    public MainPage chooseKurs(){
        elementActions.click(calcBTN).click(VidKursov).click(clickOnKPK)/*.sendKeysInt(inputSum, mockDataGenerator.generateMockValue());*/.sendKeysInt(inputSum,10000);

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
    public MainPage ChooseUtes(){
       elementActions.click(chooseCompany).click(chooseUtes);

       return this;
    }
    public MainPage MAINBTN1(){
       elementActions.click(MAINBTN);

        return this;
    }




}
