package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainPageTest extends BaseUiTests{

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseDentTrade();
    }
    @Test( description = "check navigation bar" )
    public void checkTheMPBar(){
        MainPage mainPage1 = mainPage.clickMNPage();
        Assert.assertEquals(mainPage1.clickMainBTN.getText(),"Главная");
        Assert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/accounts");
        OperationHistory operationHistory1 = operationHistory.BTN2();
        Documents documents1  = documents.BTN3();
        Staff staff1 = staff.BTN4();
        Imports imports1 = imports.BTN5();
        Settings settings1 = settings.BTN6();
        More more1 = more.BTN7();
        Assert.assertEquals(imports1.ClickTo4BTN.getText(),"Сотрудники");
        Assert.assertEquals(operationHistory1.ClickTo2BTN.getText(),"Главная");
        Assert.assertEquals(settings1.ClickTo5BTN.getText(),"Импортированные");
        Assert.assertEquals(staff1.ClickTo4BTN.getText(),"Документы");
        Assert.assertEquals(documents1.ClickTo3BTN.getText(),"История операций");
        Assert.assertEquals(more1.ClickTo7BTN.getText(),"Настройки");

    }

    @Test(priority = 2)
    public void visibilityBellBtn(){
        mainPage.checkBellBtn();
    }


    @Test(priority = 3, description = "Check other buttons")
    public void checkOtherBTNS(){
        mainPage.MAINBTN1();
        Assert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/");
    }
    @Test(priority = 4, description = "Check the importBTN")
    public void importCheckBTN(){

    }






}

