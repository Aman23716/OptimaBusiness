package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;

public class MBPerevodSomTest extends BaseUiTests {

    @Test(description = "На подпись")
    public void naPodpisBTNcheck() {
        webElementActions.refreshPage();
        mbPerevodSom.CheckNaPodpisBTN1();
        webElementActions.pause(3500);
        customAssertions.asserText("Платеж отправлен на подпись", intra_bank_transfer.platejOtpravlen, "norm");

    }

    @Test(description = "Тип операции алерт")
    public void tipOperaciiTest(){
        webElementActions.refreshPage();
        mbPerevodSom.CheckGrossAlert();
        customAssertions.asserText("Заполните поле!", mbPerevodSom.allAlerts, "norm");
        webElementActions.pause(3000);

    }
    @Test(description = "Счет списания не казан алерт")
    public void schetSpisaniyaTest(){
        webElementActions.refreshPage();
        mbPerevodSom.CheckSchetSpisaniyaAlert();
        customAssertions.asserText("Заполните поле!",mbPerevodSom.allAlerts, "norm");
        webElementActions.pause(3000);

    }

    @Test(description = "БИК/Наименование банка")
    public void BIKNaimenovanieTes(){
        mbPerevodSom.CheckBIKAlert();
        customAssertions.asserText("Счет получателя: Только цифры, фиксированная длина 16",mbPerevodSom.allAlerts, "norm");;
        webElementActions.pause(3000);

    }

}