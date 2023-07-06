package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.testng.annotations.Test;

public class MBPerevodValSomTest extends BaseUiTests{
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();

    }
   @Test(description = "Проверка кнопки На подпись ")
    public void checkNaPodpisBTN(){

       webElementActions.refreshPage();
   }



}
