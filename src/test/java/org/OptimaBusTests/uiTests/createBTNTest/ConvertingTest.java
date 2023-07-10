package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertingTest extends BaseUiTests {



    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();
    }
    @Test(description = "Проверка функионала создании операции по конвертации с валидными данными")
    public void createNaPodpisFunctional(){
        converting.CheckNaPodpisBTN();
        webElementActions.pause(3000);
        customAssertions.asserText("Платеж  отправлен на подпись", converting.platejOtpravlen, "norm");
        webElementActions.refreshPage();
    }
    @Test(description = "Проверка функционала без ввода суммы конвертации")
    public void withoutSummaPlatejaTest(){
        converting.CheckNaPodpisWithoutSumma();
        customAssertions.asserText("Сумма списания: Только цифры, сумма мин=1, макс длина целой части 12, остатка 2", converting.firstSummaAlert, "norm");
        customAssertions.asserText("Сумма зачисления: Только цифры, сумма мин=1, макс длина целой части 12, остатка 2", converting.secondSummaAlert, "norm");
        webElementActions.refreshPage();
    }
    @Test(description = "Проверка кликабельности кнопки На подпись")
    public void clickableNaPodpisBTN() {
        converting.CheckNotClickableBTN();
        webElementActions.cantBeChanged(mbPerevodVal.naimenovaniyaField);
        WebElementActions.waitForElementToBeNotClickable(mbPerevodVal.naPodpisBTN);
        customAssertions.asserText("Доступен до 23:00", converting.dostupenDOPole, "norm");
        webElementActions.refreshPage();
    }
    @Test(description = "Проверка превышения суммы конвертации")
    public void moreThenWeHave(){
        converting.CheckToConvertMoreThenInValue();
        customAssertions.asserText("Сумма конвертации превышает доступный баланс счета", converting.secondSummaAlert, "norm");
        customAssertions.asserText("Конвертация", converting.ConvertWord, "norm");
        webElementActions.refreshPage();
        customAssertions.asserText("Наименование ЮЛ", converting.naimenovanieWord, "norm");
        customAssertions.asserText("Номер документа",converting.numberDocumWord,"norm");
        customAssertions.asserText("Счет списания",converting.schetSpisaniyaWord,"norm");
        customAssertions.asserText("Сумма",converting.summaWord,"norm");
        customAssertions.asserText("Счет зачисления",converting.schetZa4isleniyaWord,"norm");
        customAssertions.asserText("Сумма",converting.summaZa4Word,"norm");
    }
}
