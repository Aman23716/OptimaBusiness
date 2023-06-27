package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IntraBankTest extends BaseUiTests{



    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();
    }

//    @Test(description = "")




}
