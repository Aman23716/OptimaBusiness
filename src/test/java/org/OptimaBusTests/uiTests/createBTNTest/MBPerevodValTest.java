package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import javax.swing.*;
import javax.xml.crypto.Data;

public class MBPerevodValTest extends BaseUiTests {
    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();

    }
   @Test(description = "Проверка кнопки На подпись ")
    public void checkNaPodpisBTN(){
       mbPerevodVal.CheckFunctionalNaPodpis();
       webElementActions.refreshPage();
   }
   @Test(description = "Проверка на некорректном счете списания")
    public void checkWithInvalidSChetSpisanuyaTest(){
        mbPerevodVal.CheckWithoutSchetSpisaniya();
        customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }
   @Test(description = "Поверка на некорректный счет для оплаты комиссии")
    public void checkWithInvalidSchetComissiiTest(){
        mbPerevodVal.CheckWithoutSchetComissii();
       customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }
   @Test(description = "Проверка на пустую строку 'Страна'")
    public void checkWithEmptyCountryFieldTest(){
      mbPerevodVal.CheckWithEmptyCountryField();
       customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }
   @Test(description = "Проверка на пустое поле БИК/СВИФТ")
    public void checkEmptyBIkTest(){
        mbPerevodVal.CheckEmptyBIKField();
       customAssertions.asserText("Заполните поле!", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }
   @Test(description = "Проверка на пустое поле Наименование")
    public void checkEmptyNAimenovanieTest(){
        mbPerevodVal.CheckEmptyNaimenovanieField();
       customAssertions.asserText("Имя получателя: Цифры, латиница, кириллица, !?()№%_.,+\\-*/\"' , мин 2 - макс 140", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }
   @Test(description = "Проверка на пустое поле счет/IBAN")
    public void checkEmptyIBANTest(){
        mbPerevodVal.CheckEmptyIBAN();
       customAssertions.asserText("Счет получателя: Только цифры, латиница, макс длина 34", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }
   @Test(description = "Проверка на невалидные значения в поле Номер документа")
    public void checkDocumentNumberTest(){
        mbPerevodVal.CheckEmptyDocumNumberField();
       customAssertions.asserText("Номер документа: Цифры, латиница, !?()№%_.,+\\-*/\"' , макс длина 15", mbPerevodVal.allAlert, "norm");
       webElementActions.refreshPage();
   }



}
