package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class MBPerevodValTest extends BaseUiTests{
    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();

    }
   @Test(description = "Проверка кнопки На подпись ")
    public void checkNaPodpisBTN(){
       mbPerevodVal.CheckFunctionalNaPodpis();
       webElementActions.refreshPage();
   }



}
