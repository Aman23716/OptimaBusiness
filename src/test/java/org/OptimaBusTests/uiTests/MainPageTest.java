package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MainPageTest extends BaseUiTests{

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();

    }

    @Test(priority = 1, description = "check navigation bar" )
    public void checkTheMPBar(){
        MainPage mainPage1 = mainPage.clickMNPage();
        Assert.assertEquals(mainPage1.clickMainBTN.getText(),"Главная");
        Assert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/accounts");
        mainPage.ChooseUtes();
        OperationHistory operationHistory1 = operationHistory.BTN2();
        Documents documents1  = documents.BTN3();
        Staff staff1 = staff.BTN4();
        Imports imports1 = imports.BTN5();
        Settings settings1 = settings.BTN6();
//        MoreCallCenter moreCallCenter1 = moreCallCenter.BTN7();
//        Assert.assertEquals(imports1.ClickTo4BTN.getText(),"Импортированные");
//        Assert.assertEquals(operationHistory1.ClickTo2BTN.getText(),"История операций");
//        Assert.assertEquals(settings1.ClickTo5BTN.getText(),"Настройки");
//        Assert.assertEquals(staff1.ClickTo4BTN.getText(),"Сотрудники");
//        Assert.assertEquals(documents1.ClickTo3BTN.getText(),"Документы");
//        Assert.assertEquals(moreCallCenter1.ClickTo7BTN.getText(),"Еще\n" +
//                "Карта отделений/ПТ/АТМ, call center, Помощь");

    }
    @Test(priority = 2, description = "Check other buttons")
    public void checkOtherBTNS(){
        mainPage.MAINBTN1();
        Assert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/");
    }







}
