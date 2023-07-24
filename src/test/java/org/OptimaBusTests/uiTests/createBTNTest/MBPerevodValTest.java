package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;



public class MBPerevodValTest extends BaseUiTests {

    @Test(description = "Проверка кнопки На подпись ")
    public void checkNaPodpisBTN() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckFunctionalNaPodpis();

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
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodVal.CheckEmptyDocumNumberField();
        customAssertions.asserText("Номер документа: Цифры, латиница, !?()№%_.,+\\-*/\"' , макс длина 15", mbPerevodVal.allAlert, "norm");
    }

}
