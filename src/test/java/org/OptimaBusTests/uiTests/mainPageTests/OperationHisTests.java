package org.OptimaBusTests.uiTests.mainPageTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OperationHisTests extends BaseUiTests {

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();
        operationHistory.BTN2();
    }

//    @Test(description = "Проверка статусов операции"){

//    }


}
