package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;




public class MBPerevodValTest extends BaseUiTests {

    @Test(description = "Проверка кнопки На подпись ")
    public void checkNaPodpisBTN() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckFunctionalNaPodpis();
        webElementActions.pause(2000);
        customAssertions.asserText("Платеж отправлен на подпись", mbPerevodVal.platejOtpravlenSentence, "norm");
        mbPerevodVal.VIstoriuOperaciiBTN();
        webElementActions.pause(2000);

    }
    @Test(description = "Проверка на некорректном счете списания")
    public void checkWithInvalidSChetSpisanuyaTest() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckWithoutSchetSpisaniya();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");

    }
    @Test(description = "Поверка на некорректный счет для оплаты комиссии")
    public void checkWithInvalidSchetComissiiTest() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckWithoutSchetComissii();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");

    }
    @Test(description = "Проверка на пустую строку 'Страна'")
    public void checkWithEmptyCountryFieldTest() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckWithEmptyCountryField();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");

    }
    @Test(description = "Проверка на пустое поле БИК/СВИФТ")
    public void checkEmptyBIkTest() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyBIKField();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");
    }
    @Test(description = "Проверка на пустое поле Наименование")
    public void checkEmptyNAimenovanieTest() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyNaimenovanieField();
        customAssertions.asserText("Имя получателя: Цифры, латиница, кириллица, !?()№%_.,+\\-*/\"' , мин 2 - макс 140", mbPerevodVal.allAlert, "norm");

    }
    @Test(description = "Проверка на пустое поле счет/IBAN")
    public void checkEmptyIBANTest() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyIBAN();
        customAssertions.asserText("Счет получателя: Только цифры, латиница, макс длина 34", mbPerevodVal.allAlert, "norm");

    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkDocumentNumberTest() {
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyDocumNumberField();
        customAssertions.asserText("Номер документа: Цифры, латиница, !?()№%_.,+\\-*/\"' , макс длина 15", mbPerevodVal.allAlert, "norm");
    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkEmptySummaPlateja() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckSummaPlatejaEmptyField();
        customAssertions.asserText("Сумма: Только цифры, сумма мин=1, макс длина целой части 12, остатка 2", mbPerevodVal.allAlert, "alert");
    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkMoreSummaPlateja() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckSummaMoreSummaField();
        customAssertions.asserText("Сумма платежа превышает доступный баланс счета", mbPerevodVal.allAlert, "alert");
    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkEmptyCodeOplaty() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyCodeOplatyField();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "alert");
    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkEmptyFieldNAzna4enie() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyNaznachenieField();
        customAssertions.asserText("Назначение: Цифры, латиница, допустимые символы кроме обратный слэш '\\', мин 4 - макс 140", mbPerevodVal.allAlert, "alert");
    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkTheFunctionalWithKZ() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckFunctionalWithKZ();
    }
    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkTheFunctionalWithRU() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckFunctionalWithRU();
    }


}
