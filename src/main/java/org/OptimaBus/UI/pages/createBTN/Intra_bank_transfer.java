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



    public void CheckNaPodpisBTN(){
        elementActions.click(createBTN).click(vnutriBankBTN).click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091808755280112").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN).pause(2000).refreshPage();

    }
    public void TestTheWrongSchet(){
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091808755280113").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN).pause(2000).refreshPage();
    }
    public void TestTheWrongSchetSpisaniya(){
        elementActions.sendKeys(inputSchetZa4isleniya,"1091808755280113").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN).pause(2000).refreshPage();
    }
    public void TestMoreMoneyThenHave(){
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091808755280113").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,999999999).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).click(naPodpisBTN).pause(2000).refreshPage();
    }
    public void TestNaznachenieMinValue(){
        elementActions.click(createBTN).click(vnutriBankBTN).click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya,"1091800100721052").inputDocumentNumber1(inputDocumNumber)
                .sendKeysInt(inputSummuPlateja,100).sendKeys(inputKodPlateja,"1").click(chooseNalog).inputNaznachenieField2(inputNaznachenie).click(naPodpisBTN).pause(2000).refreshPage();

    }





}
