package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBus.UI.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalcTests extends BaseUiTests{


    SoftAssert softAssert = new SoftAssert();


    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseUtes();
    }

    @Test(priority = 1,description = "Verify that user can login with valid credentials")
    public void loginWithValidCredentials() {
        mainPage.chooseKurs();
    }

    @Test(priority = 2,description = "Change the currency  " )
    public void chooseUSD(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/accounts");
        WebElementActions webElementActions1=new WebElementActions();
//        System.out.println(webElementActions1.calk());
        MainPage mainPage1 = mainPage.GetValueSomSum(); /*Потом написать код для сравнения значений из Конвертаций*/
        System.out.println("Hash code as string: " + mainPage1);
        softAssert.assertEquals(mainPage1,114.19);
        mainPage.CreateBTN();
        converting.CheckCalcValue();


    }
}
