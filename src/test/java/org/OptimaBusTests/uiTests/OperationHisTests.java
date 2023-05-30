package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OperationHisTests extends BaseUiTests{

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseAltynken1();
    }

    @Test(description = "Click to История операции in Main Page")
    public void checkThe2BTN(){
 //       System.out.println( calk(2,1));
        operationHistory.BTN2();
    }
}
