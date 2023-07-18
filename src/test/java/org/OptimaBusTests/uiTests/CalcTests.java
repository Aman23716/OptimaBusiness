package org.OptimaBusTests.uiTests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.OptimaBus.UI.pages.MainPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalcTests extends BaseUiTests {
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1, description = "Verify that user can login with valid credentials")
//    @WorkItemIds("1695")
    public void loginWithValidCredentials() {
        mainPage.chooseKurs();
    }

    @Test(priority = 2, description = "Change the currency  ")
    @Owner("Aman")
    @Description("")
    public void chooseUSD() {
//        softAssert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/accounts1")
//        System.out.println(webElementActions1.calk());
        MainPage mainPage1 = mainPage.GetValueSomSum(); /*Потом написать код для сравнения значений из Конвертаций*/
        mainPage.listOfCurr();
        softAssert.assertEquals(mainPage1, 114.19);
        mainPage.CreateBTN();
        converting.CheckCalcValue();
        converting.CalcResult();
//        Converting converting2 = converting.LOL();
//        Converting converting1 = converting.GetDocumValue();
//        Assert.assertEquals(converting1,converting2);
    }


}
