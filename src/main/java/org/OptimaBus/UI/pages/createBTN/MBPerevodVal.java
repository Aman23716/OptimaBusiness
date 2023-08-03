package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MBPerevodVal extends BasePage {
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")
    public WebElement createBTN;
    @FindBy(xpath = "(.//a[@class='p-select-item'])[2]")
    public WebElement MBPerevodVal;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[2]")
    public WebElement schetSpisaniyaBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseDollarSchet;
    @FindBy(xpath = "(.//div[@class='ob-select'])[3]")
    public WebElement chooseKZSchet;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[3]")
    public WebElement schetOplatyKomissiiBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseSomForKomissiya;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[4]")
    public WebElement countryBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement chooseAustriyaCountry;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])[1]")
    public WebElement BIKField;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])[2]")
    public WebElement BIKField2;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement chooseFirstBIK;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement naimenovaniyaField;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement IBANSchet;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[4]")
    public WebElement numberOfDocument;
    @FindBy(xpath = ".//input[@class='q-field__input']")
    public WebElement summaPlatejaField;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])[2]")
    public WebElement codeOplaty;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])[3]")
    public WebElement codeOplaty2;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement chooseNalog;
    @FindBy(xpath = ".//textarea[@class='q-field__native q-placeholder']")
    public WebElement naznachenieField;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--unelevated q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase sign-btn transfer-btn']")
    public WebElement naPodpisBTN;
    @FindBy(xpath = ".//p[@class='ob-dialog__label']")
    public WebElement platejOtpravlenSentence;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase ob-dialog__button ob-dialog__button_filled']")
    public WebElement vIstoriuOperaciiBTN;
    @FindBy(xpath = ".//a[@class='user-toggle no-caret']")
    public WebElement chooseCompany;
    @FindBy(xpath = ".//span[@class='company-name']")
    public List<WebElement> chooseDanteTrade;
    @FindBy(xpath = ".//button[@class='close']")
    public WebElement closeBTN;



    /**ПОЛЯ ДЛЯ ПЕРЕВОДА КЗ**/
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[5]")
    public WebElement binFieldKZ;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[6]")
    public WebElement KPPFieldKZ;


    /**ПОЛЯ ДЛЯ ПЕРЕВОДА РУ**/
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[5]")
    public WebElement codeValutnoyOperaciiRU;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[6]")
    public WebElement INNFieldRU;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[7]")
    public WebElement KPPFieldRU;

    /**ALERTS**/
    @FindBy(xpath = ".//div[@role='alert']")
    public WebElement allAlert;




    public void CheckFunctionalNaPodpis(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckWithoutSchetSpisaniya(){
        elementActions.click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckWithoutSchetComissii(){
        elementActions.click(schetSpisaniyaBTN).click(chooseDollarSchet)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    } public void CheckWithEmptyCountryField(){
        elementActions.pause(2000).click(createBTN).click(MBPerevodVal).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .sendKeys(BIKField2,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty2,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckEmptyBIKField(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).pause(1000).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty2,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckEmptyNaimenovanieField(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK)
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckEmptyIBAN(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckEmptyDocumNumberField(){ elementActions.click(createBTN).click(MBPerevodVal).pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
            .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
            .sendKeys(IBANSchet,"2222222222222222222222222222222222").sendKeys(numberOfDocument,",more then 15 symbols 121333322").sendKeysInt(summaPlatejaField,22)
            .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckSummaPlatejaEmptyField(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN);
    }
    public void CheckSummaMoreSummaField(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").sendKeysLong(summaPlatejaField,9999999999L)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN);
    }
    public void CheckEmptyCodeOplatyField(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .inputNaznachenieField1(naznachenieField).click(naPodpisBTN);
    }
    public void CheckEmptyNaznachenieField(){
        elementActions.pause(2000).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).click(naPodpisBTN);
    }
    public void CheckFunctionalWithRU(){
        elementActions.pause(2000).click(createBTN).click(MBPerevodVal).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").sendKeysInt(codeValutnoyOperaciiRU,11111).sendKeysLong(INNFieldRU,1111111111L).sendKeysLong(KPPFieldRU,111111111L).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }
    public void CheckFunctionalWithKZ(){
        elementActions.pause(2000).click(createBTN).click(MBPerevodVal).click(schetSpisaniyaBTN).click(chooseKZSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").pause(1000).click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").sendKeysLong(binFieldKZ,321111111233L).sendKeysInt(KPPFieldKZ, 4321423).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN).pause(3000);
    }


    public void VIstoriuOperaciiBTN(){
        elementActions.click(vIstoriuOperaciiBTN);
    }



    public void ChooseDanteTrade(){
        elementActions.click(chooseCompany);
        for (WebElement list1 : chooseDanteTrade){
            System.out.println(list1);
            if (list1.getText().equals("ОсОО \"DentTrade\" (\"ДентТрейд\")")){
                list1.click();
//                if (list1.getText().equals(ConfigReader.getProperty("CompName"))){
//                    list1.click();
//
            }
        }
    }
    public void ChooseAvtoCur(){
//        elementActions.click(closeBTN);
        elementActions.click(chooseCompany);
        for (WebElement list1 : chooseDanteTrade){
            System.out.println(list1);
            if (list1.getText().equals("Общество с ограниченной ответственностью \"АВТОКУРЬЕР\"")){
                list1.click();
//                if (list1.getText().equals(ConfigReader.getProperty("CompName"))){
//                    list1.click();
//
            }
        }
    }



}
