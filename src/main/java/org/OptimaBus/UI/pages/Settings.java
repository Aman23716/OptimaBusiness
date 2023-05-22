package org.OptimaBus.UI.pages;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertEquals;

public class Settings extends BasePage{


    @FindBy(xpath = ".//a[@class='nav-item'][4]")
    public WebElement ClickTo5BTN;
    @FindBy(xpath = "(.//div[@class='q-tab__label'])[2]")
    public WebElement accountVisibilityBTN;
    @FindBy(xpath = "(.//div[@class='q-tab__label'])[3]")
    public WebElement changePasswordBTN;
    @FindBy(xpath = "(.//div[@class='q-tab__label'])[4]")
    public WebElement changeNumberBTN;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[1]")
    public WebElement changeVisibility1;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[2]")
    public WebElement changeVisibility2;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[3]")
    public WebElement changeVisibility3;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[4]")
    public WebElement changeVisibility4;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[5]")
    public WebElement changeVisibility5;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[6]")
    public WebElement changeVisibility6;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[7]")
    public WebElement changeVisibility7;
    @FindBy(xpath = "(.//button[@class=\"q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text-red q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense action-btn\"])[8]")
    public WebElement changeVisibility8;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[1]")
    public WebElement currentPassword;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement newPassword;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement newPasswordRepeat;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[4]")
    public WebElement newPassTOTP;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[1]")
    public WebElement text1;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[2]")
    public WebElement text2;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[3]")
    public WebElement text3;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[4]")
    public WebElement text4;



    public Settings BTN6(){
        elementActions.click(ClickTo5BTN);
        return this;
    }

    public Settings accVisBTN() {
        elementActions.click(accountVisibilityBTN);
        return this;
    }
    public Settings cngPassBTN() {
        elementActions.click(changePasswordBTN);
        return this;
    }
    public Settings cngNumBTN() {
        elementActions.click(changeNumberBTN);
        return this;
    }
    public Settings cngVis() {
        elementActions.click(changeVisibility1);
        elementActions.click(changeVisibility2);
        elementActions.click(changeVisibility3);
        elementActions.click(changeVisibility4);
        elementActions.click(changeVisibility5);
        elementActions.click(changeVisibility6);
        elementActions.click(changeVisibility7);
        elementActions.click(changeVisibility8);
        return this;
    }
       public Settings changePass() {
        elementActions.sendKeys(currentPassword, ConfigReader.getProperty("password"))
        .sendKeys(newPassword, ConfigReader.getProperty("password1"))
        .sendKeys(newPasswordRepeat,ConfigReader.getProperty("password1"))
                .sendKeys(newPassTOTP,ConfigReader.getProperty("TOTP"));
        return this;
    }
    public Settings assertTextSettings() {
        assertEquals(text1.getText(),"Текущий пароль");
        assertEquals(text2.getText(),"Новый пароль");
        assertEquals(text3.getText(),"Повторите новый пароль");
        assertEquals(text4.getText(),"TOTP-код");
        return this;
    }


}
