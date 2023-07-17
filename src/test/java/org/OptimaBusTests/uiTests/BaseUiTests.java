package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.driverFactory.ChromeWebDriver;
import org.OptimaBus.UI.driverFactory.Driver;
import org.OptimaBus.UI.helper.CustomAssertions;
import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBus.UI.pages.*;
import org.OptimaBus.UI.pages.createBTN.Converting;
import org.OptimaBus.UI.pages.createBTN.Intra_bank_transfer;
import org.OptimaBus.UI.pages.createBTN.MBPerevodSom;
import org.OptimaBus.UI.pages.createBTN.MBPerevodVal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public abstract class BaseUiTests {

   public MBPerevodVal mbPerevodVal ;
   public MBPerevodSom mbPerevodSom ;
   public Intra_bank_transfer intra_bank_transfer ;
   public CustomAssertions customAssertions;
   public WebElementActions webElementActions ;
   public WebDriver driver ;
   public LoginPage loginPage ;

   public ChromeDriver chromeDriver;
   public MainPage mainPage;

   public OperationHistory operationHistory;

   public Documents documents;
    public Imports imports;

   public Settings settings;

   public More more;

   public Staff staff;

  public Converting converting;


    @BeforeClass
    public void setUpUiTest(){
        driver= Driver.getDriver();
        loginPage=new LoginPage();
        webElementActions = new WebElementActions();
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        converting = new Converting();
        converting.ChooseImaratStroi();



        imports= new  Imports();
        settings= new Settings();
        more = new More();
        staff = new Staff();
        intra_bank_transfer = new Intra_bank_transfer();
        customAssertions = new CustomAssertions();
        operationHistory = new OperationHistory();
        mbPerevodSom = new MBPerevodSom();
        mbPerevodVal = new MBPerevodVal();
//
   }
//    @AfterClass
//    public void tearDown() {
//        Driver.closeDriver();
//    }
}
