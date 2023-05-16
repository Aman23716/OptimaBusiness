package uiTests;

import org.OptimaBus.UI.driverFactory.Driver;
import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBus.UI.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTests {





    WebElementActions webElementActions;
    WebDriver driver;
    LoginPage loginPage;

    MainPage mainPage;

    OperationHistory operationHistory;

    Documents documents;

    Imports imports;

    Settings settings;

    MoreCallCenter moreCallCenter;

    Staff staff;

    @BeforeClass
    public void setUpUiTest(){
        loginPage=new LoginPage();
        webElementActions = new WebElementActions();
        driver= Driver.getDriver();
        mainPage = new MainPage();
        operationHistory= new OperationHistory();
        documents = new Documents();
        imports= new  Imports();
        settings= new Settings();
        moreCallCenter= new MoreCallCenter();
        staff = new Staff();

    }
}
