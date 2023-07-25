package org.OptimaBusTests.uiTests;


import org.testng.annotations.Test;


public class OperationHisTests extends BaseUiTests {



    @Test(priority = 1,description = "Click to (На Подпись) BTN")
    public void NaPodpis(){
        operationHistory.NaPodpis();
    }

    @Test(priority = 2,description = "Click to (Ожидает подписи) BTN")
    public void OjidaetOtpr(){
        operationHistory.OjidaetOtpravki();
    }
    @Test(priority = 3,description = "Click to (На редактирование) BTN")
    public void NaRedact(){
        operationHistory.NaRedactirov();
    }
    @Test(priority = 4,description = "Click to (Исполненные) BTN")
    public void Ispolnennye(){
        operationHistory.Ispolnennye();
    }
    @Test(priority = 5,description = "Click to (Отклоненные) BTN")
    public void Otklonennye(){
        operationHistory.Otklonennye();
    }
    @Test(priority = 6,description = "Click to (Отказано Банком) BTN")
    public void OtkazanoBankom(){
        operationHistory.OtkazanoBankom();
    }
    @Test(priority = 7,description = "Click to (Мои черновики) BTN")
    public void MoiChernoviki(){
        operationHistory.MoiChernoviki();
    }

}
