package uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.pages.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalcTests extends BaseUiTests{

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
    }

    @Test(priority = 1,description = "Verify that user can login with valid credentials")
    public void loginWithValidCredentials() {
        mainPage.chooseKurs();
    }

    @Test(priority = 2,description = "Change the currency  " )
    public void chooseUSD(){
        mainPage.ChooseCurrent();
    }

}
