package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBus.UI.helper.WebElementActions;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;

public class ConvertingTest extends BaseUiTests {

    @Test(description = "Проверка функионала создании операции по конвертации с валидными данными")
    public void createNaPodpisFunctionalSom(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        converting.CheckNaPodpisBTN();
        webElementActions.pause(4000);
        customAssertions.asserText("Платеж Test value отправлен на подпись", converting.platejOtpravlen, "norm");

    }
    @Test(description = "Проверка функционала без ввода суммы конвертации")
    public void withoutSummaPlatejaTest(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        converting.CheckNaPodpisWithoutSumma();
        customAssertions.asserText("Сумма списания: Только цифры, сумма мин=1, макс длина целой части 12, остатка 2", converting.firstSummaAlert, "norm");
        customAssertions.asserText("Сумма зачисления: Только цифры, сумма мин=1, макс длина целой части 12, остатка 2", converting.secondSummaAlert, "norm");

    }
    @Test(description = "Проверка кликабельности кнопки На подпись")
    public void clickableNaPodpisBTN() {
        converting.CheckNotClickableBTN();
        webElementActions.cantBeChanged(mbPerevodVal.naimenovaniyaField);
        WebElementActions.waitForElementToBeNotClickable(mbPerevodVal.naPodpisBTN);
        customAssertions.asserText("Доступен до 23:00", converting.dostupenDOPole, "norm");

    }
    @Test(description = "Проверка превышения суммы конвертации")
    public void moreThenWeHave(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        converting.CheckToConvertMoreThenInValue();
        customAssertions.asserText("Сумма конвертации превышает доступный баланс счета", converting.secondSummaAlert, "norm");
        customAssertions.asserText("Конвертация", converting.convertWord, "norm");
        webElementActions.refreshPage();
        customAssertions.asserText("Наименование ЮЛ", converting.naimenovanieWord, "norm");
        customAssertions.asserText("Номер документа",converting.numberDocumWord,"norm");
        customAssertions.asserText("Счет списания",converting.schetSpisaniyaWord,"norm");
        customAssertions.asserText("Сумма",converting.summaWord,"norm");
        customAssertions.asserText("Счет зачисления",converting.schetZa4isleniyaWord,"norm");
        customAssertions.asserText("Сумма",converting.summaZa4Word,"norm");
    }
    @Test(description = "Проверка функионала создании операции по конвертации с валидными данными c доллара на евро")
    public void createNaPodpisFunctionalDollar(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        converting.CheckNaPodpisBTNDollar();
        webElementActions.pause(4000);
        customAssertions.asserText("Платеж отправлен на подпись", converting.platejOtpravlen, "norm");
    }
    @Test(description = "Проверка функионала создании операции по конвертации с валидными данными c доллара на сом")
    public void createNaPodpisFunctionalInvalute(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        converting.CheckNaPodpisBTNInvalute();
        webElementActions.pause(4000);
        customAssertions.asserText("Платеж отправлен на подпись", converting.platejOtpravlen, "norm");
    }
    @Test(description = "Проверка функионала создании операции по конвертации с изменением курса валют в ручную")
    public void createNewCourseFunctionalCheck() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        converting.CheckToWriteNewCourse();
        webElementActions.pause(4000);
        customAssertions.asserText("100 KGS", intra_bank_transfer.summaPodpisCheck, "norm");
        customAssertions.asserText("Вам на подпись", intra_bank_transfer.vamNaPodpisCheck, "norm");
        customAssertions.asserText("Конвертация", intra_bank_transfer.perevodKudaCheck, "norm");
        customAssertions.asserText("ОсОО \"АЛТЫНКЕН\"", intra_bank_transfer.naimenovanieKudaPerevodCheck,"norm");
        customAssertions.asserText("1092220111430162", intra_bank_transfer.schetPerevodaCheck,"norm" );

    }


}
