package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;

public class MBPerevodSomTest extends BaseUiTests {

    @Test(description = "На подпись")
    public void naPodpisBTNcheck() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodSom.CheckNaPodpisBTN1();
        webElementActions.pause(2000);
//        customAssertions.asserText("Платеж отправлен на подпись", intra_bank_transfer.platejOtpravlen, "norm");
        customAssertions.asserText("80,22 KGS", intra_bank_transfer.summaPodpisCheck, "norm");
        customAssertions.asserText("Вам на подпись", intra_bank_transfer.vamNaPodpisCheck, "norm");
        customAssertions.asserText("Гросс", intra_bank_transfer.perevodKudaCheck, "norm");
        customAssertions.asserText("Дордойский филиал", intra_bank_transfer.naimenovanieKudaPerevodCheck,"norm");
        customAssertions.asserText("1092220111430162", intra_bank_transfer.schetPerevodaCheck,"norm" );
    }

    @Test(description = "Тип операции алерт")
    public void tipOperaciiTest(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        mbPerevodSom.CheckGrossAlert();
        customAssertions.asserText("Заполните поле!", mbPerevodSom.allAlerts, "norm");
        webElementActions.pause(3000);
    }

    @Test(description = "Счет списания не казан алерт")
    public void schetSpisaniyaTest(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
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