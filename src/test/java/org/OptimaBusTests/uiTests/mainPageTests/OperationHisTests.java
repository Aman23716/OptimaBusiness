package org.OptimaBusTests.uiTests.mainPageTests;


import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;


public class OperationHisTests extends BaseUiTests {



    @Test(priority = 1, description = "Click to История операции in Main Page")
    public void checkThe2BTN() {
        //       System.out.println( calk(2,1));
        operationHistory.BTN2();
    }
//    @Test(priority = 1,description = "Click to (All) BTN")
//    public void AllBTN(){
//        operationHistory.AllBTN();
//   }


    @Test(priority = 2,description = "Click to (На Подпись) BTN")
    public void NaPodpis(){
        operationHistory.NaPodpis();
    }

    @Test(priority = 4,description = "Click to (На редактирование) BTN")
    public void NaRedact(){
        operationHistory.NaRedactirov();
    }
    @Test(priority = 5,description = "Click to (Исполненные) BTN")
    public void Ispolnennye(){
        operationHistory.Ispolnennye();
    }
    @Test(priority = 6,description = "Click to (Отклоненные) BTN")
    public void Otklonennye(){
        operationHistory.Otklonennye();
    }
    @Test(priority = 7,description = "Click to (Отказано Банком) BTN")
    public void OtkazanoBankom(){
        operationHistory.OtkazanoBankom();
    }
    @Test(priority = 8,description = "Click to (Мои черновики) BTN")
    public void MoiChernoviki(){
        operationHistory.MoiChernoviki();
    }

    @Test(priority = 9)
    public void tipOperaciiConvert(){
        webElementActions.refreshPage();
        operationHistory.TipPlatejaFilterConverting();
        customAssertions.asserText("Конвертация", operationHistory.assertions, "norm");
        customAssertions.asserText("Конвертация", operationHistory.assertions2, "norm");
    }
    @Test(priority = 10)
    public void tipOperaciiGross(){
        webElementActions.refreshPage();
        operationHistory.TipPlatejaFilterGross();
        customAssertions.asserText("Гросс", operationHistory.assertions, "norm");
        customAssertions.asserText("Гросс", operationHistory.assertions2, "norm");
    }@Test(priority = 11)
    public void tipOperaciiClearing(){
        webElementActions.refreshPage();
        operationHistory.TipPlatejaFilterClearing();
        customAssertions.asserText("Клиринг", operationHistory.assertions, "norm");
        customAssertions.asserText("Клиринг", operationHistory.assertions2, "norm");
    }@Test(priority = 12)
    public void tipOperaciiSwift(){
        webElementActions.refreshPage();
        operationHistory.TipPlatejaFilterSWIFT();
        customAssertions.asserText("SWIFT", operationHistory.assertions, "norm");
        customAssertions.asserText("SWIFT", operationHistory.assertions2, "norm");
    }@Test(priority = 13)
    public void tipOperaciiMejduSchetami(){
        webElementActions.refreshPage();
        operationHistory.TipPlatejaFilterPerevodMejdu();
        customAssertions.asserText("c 03.08.2023", operationHistory.assertions, "norm");
//        customAssertions.asserText("c 03.08.2023", operationHistory.assertions2, "norm");
    }@Test(priority = 14)
    public void poNaimenovaniu(){
        webElementActions.refreshPage();
        operationHistory.PoNaimenovaniu();
        customAssertions.asserText("ОсОО \"АЛТЫНКЕН\"", operationHistory.companiya, "norm");
    }@Test(priority = 15)
    public void poNumberDocum(){
        webElementActions.refreshPage();
        operationHistory.PoNumberDocument();
        customAssertions.asserText("№ Test value", operationHistory.assertions, "norm");
        customAssertions.asserText("№ Test value", operationHistory.documentNumberAsseert, "norm");
    }@Test(priority = 16)
    public void volutaTest(){
        webElementActions.refreshPage();
        operationHistory.PoValute();
        customAssertions.asserText("Валюта KGS", operationHistory.assertions, "norm");
        customAssertions.asserText("100 KGS", operationHistory.summaAssertion, "norm");
    }@Test(priority = 18)
    public void poDateTest(){
        webElementActions.refreshPage();
        operationHistory.Data();
        customAssertions.asserText("c 06.07.2023 - до 07.07.2023", operationHistory.assertions, "norm");
        customAssertions.asserText("06.07.2023", operationHistory.dataAssertion, "norm");
    }@Test(priority = 17)
    public void poSummeTest(){
        webElementActions.refreshPage();
        operationHistory.Summa();
        customAssertions.asserText("c 1 000  - до 10 000 ", operationHistory.assertions, "norm");
    }


}
