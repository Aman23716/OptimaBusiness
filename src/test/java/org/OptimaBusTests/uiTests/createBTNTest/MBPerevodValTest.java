package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.xml.crypto.Data;


public class MBPerevodValTest extends BaseUiTests {

    @Test(description = "Проверка кнопки На подпись ")
    public void checkNaPodpisBTN() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckFunctionalNaPodpis();

    }

    @Test(description = "Проверка на некорректном счете списания")
    public void checkWithInvalidSChetSpisanuyaTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckWithoutSchetSpisaniya();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");

    }

    @Test(description = "Поверка на некорректный счет для оплаты комиссии")
    public void checkWithInvalidSchetComissiiTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckWithoutSchetComissii();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");

    }

    @Test(description = "Проверка на пустую строку 'Страна'")
    public void checkWithEmptyCountryFieldTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckWithEmptyCountryField();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");

    }

    @Test(description = "Проверка на пустое поле БИК/СВИФТ")
    public void checkEmptyBIkTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckEmptyBIKField();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");
    }

    @Test(description = "Проверка на пустое поле Наименование")
    public void checkEmptyNAimenovanieTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckEmptyNaimenovanieField();
        customAssertions.asserText("Имя получателя: Цифры, латиница, кириллица, !?()№%_.,+\\-*/\"' , мин 2 - макс 140", mbPerevodVal.allAlert, "norm");

    }

    @Test(description = "Проверка на пустое поле счет/IBAN")
    public void checkEmptyIBANTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckEmptyIBAN();
        customAssertions.asserText("Счет получателя: Только цифры, латиница, макс длина 34", mbPerevodVal.allAlert, "norm");

    }

    @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkDocumentNumberTest() {
        webElementActions.refreshPage();
        mbPerevodVal.CheckEmptyDocumNumberField();
        customAssertions.asserText("Номер документа: Цифры, латиница, !?()№%_.,+\\-*/\"' , макс длина 15", mbPerevodVal.allAlert, "norm");
    }

}
