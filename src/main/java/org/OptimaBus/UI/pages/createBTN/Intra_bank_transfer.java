package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intra_bank_transfer extends BasePage {


    /**
     * ВАЖНЫЕ ПОЛЯ
     **/
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
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase ob-dialog__button ob-dialog__button_filled']")
    public WebElement vIstoriuOperaciiBTN;


    /**
     * НАДПИСИ
     **/
    @FindBy(xpath = ".//p[@class='ob-dialog__label']")
    public WebElement platejOtpravlen;
    @FindBy(xpath = "(.//div[@class='text-muted flex items-center q-gutter-x-xs q-mb-md'])//span[2]")
    public WebElement naimenovanieIP;


    /**
     * История операций
     **/
    @FindBy(xpath = "(.//div[@class='p3 transaction__status status-info']//span)[1]")
    public WebElement vamNaPodpisCheck;
    @FindBy(xpath = "(.//div[@class='p3 transaction__status status-warning']//span)[1]")
    public WebElement naPodpisanii;
    @FindBy(xpath = "(.//div[@class='transaction__amount text-weight-medium p1'])[1]")
    public WebElement summaPodpisCheck;
    @FindBy(xpath = "(.//div[@class='transaction__additional-info']//div)[1]")
    public WebElement perevodKudaCheck;
    @FindBy(xpath = "(.//div[@class='transaction__title p1 d-none'])[1]")
    public WebElement naimenovanieKudaPerevodCheck;
    @FindBy(xpath = "(.//div[@class='text-muted text-small d-none'])[1]")
    public WebElement schetPerevodaCheck;

    /**
     * ДЛЯ ТЕСТА ПОДРОБНОЙ ИНФЫ ОПЕРАЦИИ (ДИНАМИЧНЫЕ ЗНАЧЕНИЯ)
     **/
    @FindBy(xpath = "(.//div[@class='transaction transaction--statement'])[1]")
    public WebElement podrobnayaInfaOperacii;
    @FindBy(xpath = "(.//div[@class='text-dark details-desc-child'])[6]")
    public WebElement schetPoluchatelya;
    @FindBy(xpath = "(.//div[@class='text-dark details-desc-child'])[7]")
    public WebElement BIKPoluchatelya;
    @FindBy(xpath = "(.//div[@class='text-dark details-desc-child'])[9]")
    public WebElement firstPodpis;
    @FindBy(xpath = "(.//div[@class='text-dark details-desc-child'])[10]")
    public WebElement secondPodpis;


    /**ДЛЯ ТЕСТА ПОДРОБНОЙ ИНФЫ ОПЕРАЦИИ (СТАТИЧНЫЕ ЗНАЧЕНИЯ)**/
    @FindBy(xpath = "(.//div[@class='text-h5 q-mr-auto details__expansion-header'])[1]")
    public WebElement detaliPlateja;
    @FindBy(xpath = "(.//div[@class='text-h5 q-mr-auto details__expansion-header'])[2]")
    public WebElement poluchatelWord;
    @FindBy(xpath = "(.//div[@class='text-h5 q-mr-auto details__expansion-header'])[3]")
    public WebElement podpisanty;

    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[1]")
    public WebElement dataValutirovaniya;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[2]")
    public WebElement numberDocumenta;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[3]")
    public WebElement KBK;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[4]")
    public WebElement sozdano;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[5]")
    public WebElement naimenovanie;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[6]")
    public WebElement schetWord;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[7]")
    public WebElement BIKWord;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[8]")
    public WebElement bankWord;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[9]")
    public WebElement pervayaPodpis;
    @FindBy(xpath = "(.//div[@class='text-muted details-desc-child'])[10]")
    public WebElement vtorayaPodpis;




    /**
     * ERRORS
     **/
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


    public void CheckNaPodpisBTN() {
        elementActions.click(createBTN).click(vnutriBankBTN).click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya, "1091808755280112").sendKeys(inputDocumNumber, "")
                .sendKeysInt(inputSummuPlateja, 100).sendKeys(inputKodPlateja, "1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).pause(2000).click(naPodpisBTN).pause(5000)
        ;
    }

    public void TestTheWrongSchet() {
        elementActions.click(createBTN).click(vnutriBankBTN).click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya, "2091808755280112").sendKeys(inputDocumNumber, "")
                .sendKeysInt(inputSummuPlateja, 200).sendKeys(inputKodPlateja, "1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).pause(2000).click(naPodpisBTN);
    }

    public void TestTheWrongSchetSpisaniya() {
        elementActions.sendKeys(inputSchetZa4isleniya, "1091808755280112").sendKeys(inputDocumNumber, "")
                .sendKeysInt(inputSummuPlateja, 300).sendKeys(inputKodPlateja, "1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).pause(2000).click(naPodpisBTN);
    }

    public void TestMoreMoneyThenHave() {
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya, "1091808755280112").sendKeys(inputDocumNumber, "")
                .sendKeysInt(inputSummuPlateja, 999999999).sendKeys(inputKodPlateja, "1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).pause(2000).click(naPodpisBTN);
    }

    public void TestNaznachenieMinValue() {
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya, "1091800100721052").sendKeys(inputDocumNumber, "")
                .sendKeysInt(inputSummuPlateja, 400).sendKeys(inputKodPlateja, "1").click(chooseNalog).inputNaznachenieField2(inputNaznachenie).pause(2000).click(naPodpisBTN);

    }

    public void CheckNaPodpisBTNTranzit() {
        elementActions.click(schetSpisaniyaBTN).click(chooseSomSchet).sendKeys(inputSchetZa4isleniya, "1091822000180171").sendKeys(inputDocumNumber, "")
                .sendKeysInt(inputSummuPlateja, 500).sendKeys(inputKodPlateja, "1").click(chooseNalog).inputNaznachenieField1(inputNaznachenie).pause(2000).click(naPodpisBTN).pause(4000)
        ;


    }


}
