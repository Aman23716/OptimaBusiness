package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.driverFactory.Driver;
import org.OptimaBus.UI.helper.CustomAssertions;
import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBus.UI.pages.*;
import org.OptimaBus.UI.pages.createBTN.Converting;
import org.OptimaBus.UI.pages.createBTN.Intra_bank_transfer;
import org.OptimaBus.UI.pages.createBTN.MBPerevodSom;
import org.OptimaBus.UI.pages.createBTN.MBPerevodVal;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTests {

    MBPerevodVal mbPerevodVal;
    MBPerevodSom mbPerevodSom;
    Intra_bank_transfer intra_bank_transfer;
    CustomAssertions customAssertions;
    WebElementActions webElementActions;
    WebDriver driver;
    LoginPage loginPage;

    MainPage mainPage;

    OperationHistory operationHistory;

    Documents documents;

    Imports imports;

    Settings settings;

    More more;

    Staff staff;

    Converting converting;

    @BeforeClass
    public void setUpUiTest(){
//        driver.navigate().to(ConfigReader.getProperty("qa_env"));
//        loginPage.fillUpUsernameAndPass();


        loginPage=new LoginPage();
        webElementActions = new WebElementActions();
        driver= Driver.getDriver();
        mainPage = new MainPage();
        operationHistory= new OperationHistory();
        documents = new Documents();
        imports= new  Imports();
        settings= new Settings();
        more = new More();
        staff = new Staff();
        converting= new Converting();
        customAssertions = new CustomAssertions();
        intra_bank_transfer=new Intra_bank_transfer();
        mbPerevodSom=new MBPerevodSom();
        mbPerevodVal=new MBPerevodVal();
    }
    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
