package uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OperationHisTests extends BaseUiTests{

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();

    }

    @Test(priority = 1,description = "Click to История операции in Main Page")
    public void checkThe2BTN(){
        operationHistory.BTN2();
    }
}
