package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MBPerevodSomTest extends BaseUiTests {
    @BeforeClass()
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();

    }

    @Test(description = "На подпись")
    public void naPodpisBTNcheck() {
        mbPerevodSom.CheckNaPodpisBTN1();
        webElementActions.refreshPage();
        webElementActions.pause(3000);
    }

    @Test(description = "Тип операции алерт")
    public void tipOperaciiTest(){
        mbPerevodSom.CheckGrossAlert();
        customAssertions.asserText("Заполните поле!", mbPerevodSom.allAlerts, "norm");
        webElementActions.refreshPage();
        webElementActions.pause(3000);
    }
    @Test(description = "Счет списания не казан алерт")
    public void schetSpisaniyaTest(){
        mbPerevodSom.CheckSchetSpisaniyaAlert();
        customAssertions.asserText("Заполните поле!",mbPerevodSom.allAlerts, "norm");
        webElementActions.refreshPage();
        webElementActions.pause(3000);
    }

    @Test(description = "БИК/Наименование банка")
    public void BIKNaimenovanieTes(){
        mbPerevodSom.CheckBIKAlert();
        customAssertions.asserText("Счет получателя: Только цифры, фиксированная длина 16",mbPerevodSom.allAlerts, "norm");
        webElementActions.refreshPage();
        webElementActions.pause(3000);

    }

}