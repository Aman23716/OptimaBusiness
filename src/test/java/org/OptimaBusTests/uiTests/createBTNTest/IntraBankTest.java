package org.OptimaBusTests.uiTests.createBTNTest;


import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;

public class IntraBankTest extends BaseUiTests {

    @Test(priority = 0,description = "Check 'На подпись' button ")
    public void naPodpisBTNCheck(){
        webElementActions.pause(2000);
        intra_bank_transfer.CheckNaPodpisBTN();
        customAssertions.asserText("Платеж отправлен на подпись", intra_bank_transfer.platejOtpravlen, "norm");
        webElementActions.click(intra_bank_transfer.vIstoriuOperaciiBTN);
        webElementActions.pause(3000);
        customAssertions.asserText("100 KGS", intra_bank_transfer.summaPodpisCheck, "norm");
        customAssertions.asserText("Вам на подпись", intra_bank_transfer.vamNaPodpisCheck, "norm");
        customAssertions.asserText("Перевод на другие клиентские счета", intra_bank_transfer.perevodKudaCheck, "norm");
        customAssertions.asserText("ИП Бегматова Тумар Тимуровна", intra_bank_transfer.naimenovanieKudaPerevodCheck,"norm");
        customAssertions.asserText("1092220111430162", intra_bank_transfer.schetPerevodaCheck,"norm" );
        webElementActions.click(intra_bank_transfer.podrobnayaInfaOperacii);
        customAssertions.asserText("Детали платежа", intra_bank_transfer.detaliPlateja, "norm");
        customAssertions.asserText("Получатель", intra_bank_transfer.poluchatelWord, "norm");
        customAssertions.asserText("Подписанты", intra_bank_transfer.podpisanty, "norm");

        customAssertions.asserText("Дата валютир.:", intra_bank_transfer.dataValutirovaniya, "norm");
        customAssertions.asserText("Наименование:", intra_bank_transfer.naimenovanie, "norm");
        customAssertions.asserText("№ документа:", intra_bank_transfer.numberDocumenta, "norm");
        customAssertions.asserText("КБК:", intra_bank_transfer.KBK, "norm");
        customAssertions.asserText("Создано:", intra_bank_transfer.sozdano, "norm");
        customAssertions.asserText("Счет:", intra_bank_transfer.schetWord, "norm");
        customAssertions.asserText("БИК:", intra_bank_transfer.BIKWord, "norm");
        customAssertions.asserText("Банк:", intra_bank_transfer.bankWord, "norm");
        customAssertions.asserText("Первая подпись", intra_bank_transfer.pervayaPodpis, "norm");
        customAssertions.asserText("Вторая подпись", intra_bank_transfer.vtorayaPodpis, "norm");
        customAssertions.asserText("В ожидании подписи", intra_bank_transfer.firstPodpis, "norm");
        customAssertions.asserText("В ожидании подписи", intra_bank_transfer.secondPodpis, "norm");
        customAssertions.asserText("1091808755280112", intra_bank_transfer.schetPoluchatelya, "norm");
        customAssertions.asserText("109018", intra_bank_transfer.BIKPoluchatelya, "norm");

    }
    @Test(priority = 1,description = "Check the wrong schet")
    public void wrongSchetZachisleniyaError(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        intra_bank_transfer.TestTheWrongSchet();
        customAssertions.asserText("Счет не найден!", intra_bank_transfer.schetPoluchatelyaError, "alert");

    }
    @Test(priority = 2,description = "Check the wrong schet spisaniya")
    public void wrongSchetSpisaniyaError(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        intra_bank_transfer.TestTheWrongSchetSpisaniya();
        customAssertions.asserText("Заполните поле!",intra_bank_transfer.zapolnitePoleError,"alert");

    }
    @Test(priority = 3,description = "Check to transfer more money then in the accaunt")
    public void moreThenHaveError(){
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        intra_bank_transfer.TestMoreMoneyThenHave();
        customAssertions.asserText("ИП Бегматова Тумар Тимуровна", intra_bank_transfer.naimenovanieIP, "norm");
        customAssertions.asserText("Сумма платежа превышает доступный баланс счета",intra_bank_transfer.summaError,"alert");
    }
    @Test(priority =4, description = "Check to input MIN value in 'Назначение'")
    public void minValueInNAznachenie(){
        webElementActions.refreshPage();
        webElementActions.pause(3000);
        intra_bank_transfer.TestNaznachenieMinValue();
        webElementActions.pause(1000);
        customAssertions.asserText("Назначение: Цифры, латиница, кириллица, !?()№%_.,+\\-*/\"' , мин 4 - макс 140",intra_bank_transfer.naznachenieError,"alert");
    }
    @Test(priority = 5,description = "Check tranzit schet intro_bank")
    public void tranzitSchetCheck(){
        webElementActions.refreshPage();
        webElementActions.pause(3000);
        intra_bank_transfer.CheckNaPodpisBTNTranzit();
        customAssertions.asserText("Бишкекский центральный филиал ОАО \"Оптима Банк\"", intra_bank_transfer.naimenovanieIP, "norm");
        customAssertions.asserText("Платеж отправлен на подпись", intra_bank_transfer.platejOtpravlen, "norm");
        webElementActions.pause(2000);
        webElementActions.click(intra_bank_transfer.vIstoriuOperaciiBTN);
        customAssertions.asserText("500 KGS", intra_bank_transfer.summaPodpisCheck, "norm");
        customAssertions.asserText("Вам на подпись", intra_bank_transfer.vamNaPodpisCheck, "norm");
        customAssertions.asserText("Перевод на другие клиентские счета", intra_bank_transfer.perevodKudaCheck, "norm");
        customAssertions.asserText("Бишкекский центральный филиал ОАО \"Оптима Банк\"", intra_bank_transfer.naimenovanieKudaPerevodCheck,"norm");
        customAssertions.asserText("1092220111430162", intra_bank_transfer.schetPerevodaCheck,"norm" );
    }


}
