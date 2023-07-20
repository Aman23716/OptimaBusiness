package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MBPerevodSom extends BasePage {


    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")
    public WebElement createBTN;
    @FindBy(xpath = "(.//a[@class='p-select-item'])[1]")
    public WebElement mbPerevodSom;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[1]")
    public WebElement tipOperaciiBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement tipOperaciiGross;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[4]")
    public WebElement schetSpisaniyaBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement somSchetSpisaniya;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])[1]")
    public WebElement BIKNaimenovaniya;
    @FindBy(xpath = ".//div[@class='ob-select']")
    public WebElement chooseBIK;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement naimenovaniePoluchatelya;

    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[4]")
    public WebElement schet;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[5]")
    public WebElement documNumber;
    @FindBy(xpath = ".//input[@class='q-field__input']")
    public WebElement somSumma;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])")
    public WebElement kodPlatejaInput;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseKodPlateja;
    @FindBy(xpath = ".//textarea[@class='q-field__native q-placeholder']")
    public WebElement naznachenie;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--unelevated q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase sign-btn transfer-btn']")
    public WebElement naPodpisBTN;







    @FindBy(xpath = "(.//div[@role='alert'])[1]")
    public WebElement allAlerts;



    public void CheckNaPodpisBTN1(){
        elementActions.click(tipOperaciiBTN).click(tipOperaciiGross).pause(1000).click(schetSpisaniyaBTN).click(somSchetSpisaniya).sendKeys(BIKNaimenovaniya,"103001").click(chooseBIK)
                .sendKeys(naimenovaniePoluchatelya,"deeeeee").sendKeys(schet,"1030120000542727").inputDocumentNumber1(documNumber).sendKeysDouble(somSumma,80.22).sendKeysInt(kodPlatejaInput,1)
                .click(chooseKodPlateja).inputNaznachenieField1(naznachenie).click(naPodpisBTN);
    }
    public void CheckGrossAlert(){
        elementActions.click(tipOperaciiBTN).click(tipOperaciiGross).sendKeys(BIKNaimenovaniya,"1").click(chooseBIK)
                .sendKeys(naimenovaniePoluchatelya,"deeeeee").sendKeys(schet,"1030120000542727").inputDocumentNumber1(documNumber).sendKeysDouble(somSumma,80.00).sendKeysInt(kodPlatejaInput,1)
                .click(chooseKodPlateja).inputNaznachenieField1(naznachenie).click(naPodpisBTN);
    }
    public void CheckSchetSpisaniyaAlert(){
        elementActions.click(tipOperaciiBTN).click(tipOperaciiGross).pause(1000).sendKeys(BIKNaimenovaniya,"1").click(chooseBIK)
                .sendKeys(naimenovaniePoluchatelya,"deeeeee").sendKeys(schet,"1030120000542727").inputDocumentNumber1(documNumber).sendKeysDouble(somSumma,80.22).sendKeysInt(kodPlatejaInput,1)
                .click(chooseKodPlateja).inputNaznachenieField1(naznachenie).click(naPodpisBTN);
    }
    public void CheckBIKAlert(){
        elementActions.click(createBTN).click(mbPerevodSom).click(tipOperaciiBTN).click(tipOperaciiGross).pause(1000).click(schetSpisaniyaBTN).click(somSchetSpisaniya)
                .sendKeys(naimenovaniePoluchatelya,"deeeeee").pause(1000).sendKeys(schet,"1030120000542727").inputDocumentNumber1(documNumber).sendKeysDouble(somSumma,80.22).sendKeysInt(kodPlatejaInput,1)
                .click(chooseKodPlateja).inputNaznachenieField1(naznachenie).click(naPodpisBTN);
    }










}
