package uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.helper.WebElementActions;
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

    @Test(priority = 1, description = "check the main page" )
    public void checkTheMP(){
        MainPage mainPage1 = mainPage.clickMNPage();
        Assert.assertEquals(mainPage1.clickMainBTN.getText(),"Главная");
        assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/accounts");
        OperationHistory operationHistory1 = operationHistory.BTN2();
        assertEquals(operationHistory1.ClickTo2BTN.getText(),"История операций");
        Documents documents1  = documents.BTN3();
        assertEquals(documents1.ClickTo3BTN.getText(),"Документы");
        Imports imports1 = imports.BTN4();
        assertEquals(imports1.ClickTo4BTN.getText(),"Импорти4рованные");
        Settings settings1 = settings.BTN5();
        assertEquals(settings1.ClickTo5BTN.getText(),"Настройки");
        MoreCallCenter moreCallCenter1 = moreCallCenter.BTN6();
        assertEquals(moreCallCenter1.ClickTo6BTN.getText(),"Еще\n" +
                "Карта отделений/ПТ/АТМ, call center, Помощь");

    }







}
