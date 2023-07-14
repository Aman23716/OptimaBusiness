package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intra_bank_transfer extends BasePage {


    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")
    public WebElement createBTN;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[2]")
    public WebElement schetSpisaniyaBTN;
    @FindBy(xpath = "(.//a[@class='p-select-item'])[3]")
    public WebElement vnutriBankBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseSomSchet;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement inputSchetZa4isleniya;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement inputDocumNumber;
    @FindBy(xpath = ".//input[@class='q-field__input']")
    public WebElement inputSummuPlateja;
    @FindBy(xpath = ".//input[@class='q-field__input q-placeholder col']")
    public WebElement inputKodPlateja;
    @FindBy(xpath = "(.//div[@class='ob-select'])[15]")
    public WebElement chooseNalog;
    @FindBy(xpath = ".//textarea[@class='q-field__native q-placeholder']")
    public WebElement inputNaznachenie;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--unelevated q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase sign-btn transfer-btn']")
    public WebElement naPodpisBTN;


   /**  ERRORS  **/
    @FindBy(xpath = "(.//div[@role='alert'])[1]")
    public WebElement zapolnitePoleError;
    @FindBy(xpath = ".//div[@class='text-not-found']")
    public WebElement schetPoluchatelyaError;
    @FindBy(xpath = "(.//div[@role='alert'])[3]")
    public WebElement documentNumberError;
    @FindBy(xpath = ".//div[@role='alert']")
    public WebElement summaError;
    @FindBy(xpath = ".//div[@role='alert']")
    public WebElement naznachenieError;


    /** Надписи **/
    @FindBy(xpath = ".//h1[@class='header-title']")
    public WebElement vnutribankPerevodW;
    @FindBy(xpath = ".//span[@class='text-muted col-grow time-limit-label']")
    public WebElement dostupenDoW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[1]")
    public WebElement naimenovanieW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[2]")
    public WebElement spisatW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[3]")
    public WebElement za4islitW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[4]")
    public WebElement nomerDocumentaW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[5]")
    public WebElement summaPlatejaW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[6]")
    public WebElement kodPlatejaW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[7]")
    public WebElement dataValutirovaniyaW;
    @FindBy(xpath = "(.//div[@class='q-field__label no-pointer-events absolute ellipsis'])[8]")
    public WebElement nazna4enieW;







    public void CheckNaPodpisBTN(){
        elementActions.click(createBTN).pause(500).click(vnutriBankBTN).click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091808755280112").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN);
    }
    public void TestTheWrongSchet(){
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091808755280113").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN);
    }
    public void TestTheWrongSchetSpisaniya(){
        elementActions.sendKeys(inputSchetZa4isleniya,"1091808755280113").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN);
    }
    public void TestMoreMoneyThenHave(){
        elementActions.click(createBTN).pause(500).click(vnutriBankBTN).click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091808755280113").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,999999999).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN);
    }
    public void TestNaznachenieMinValue(){
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091800100721052").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField2(inputNaznachenie).click(naPodpisBTN);

    }





}
