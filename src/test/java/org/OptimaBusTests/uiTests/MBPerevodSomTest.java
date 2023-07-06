package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
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
    public void naPodisBTNcheck() {
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
    public void bikNaimenovanieTest(){
        mbPerevodSom.CheckBIKAlert();
        customAssertions.asserText("Заполните поле!",mbPerevodSom.allAlerts, "norm");
    }

}