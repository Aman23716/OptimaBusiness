package org.OptimaBusTests.uiTests.createBTNTest;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IntraBankTest extends BaseUiTests {

    @BeforeClass
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
        mainPage.ChooseImaratStroi();
//        webElementActions.click(intra_bank_transfer.createBTN).click(intra_bank_transfer.vnutriBankBTN);

    }
    @Test(priority = 0,description = "Check 'На подпись' button ")
    public void naPodpisBTNCheck(){
        intra_bank_transfer.CheckNaPodpisBTN();
        customAssertions.asserText("Внутрибанковский перевод", intra_bank_transfer.vnutribankPerevodW, "norm");
        customAssertions.asserText("Доступен до 23:30", intra_bank_transfer.dostupenDoW, "norm");
        customAssertions.asserText("Наименование ЮЛ", intra_bank_transfer.naimenovanieW, "norm");
        customAssertions.asserText("Списать", intra_bank_transfer.spisatW, "norm");
        customAssertions.asserText("Зачислить", intra_bank_transfer.za4islitW, "norm");
        customAssertions.asserText("Номер документа", intra_bank_transfer.nomerDocumentaW, "norm");
        customAssertions.asserText("Сумма платежа", intra_bank_transfer.summaPlatejaW, "norm");
            webElementActions.refreshPage();
    }
    @Test(priority = 1,description = "Check the wrong schet")
    public void wrongSchetZachisleniyaError(){
        intra_bank_transfer.TestTheWrongSchet();
    customAssertions.asserText("Счет не найден!", intra_bank_transfer.schetPoluchatelyaError, "alert");
        webElementActions.refreshPage();
    }
    @Test(priority = 2,description = "Check the wrong schet spisaniya")
    public void wrongSchetSpisaniyaError(){
        intra_bank_transfer.TestTheWrongSchetSpisaniya();
        customAssertions.asserText("Заполните поле!",intra_bank_transfer.zapolnitePoleError,"alert");
        webElementActions.refreshPage();
    }
    @Test(priority = 3,description = "Check to transfer more money then in the accaunt")
    public void moreThenHaveError(){
        intra_bank_transfer.TestMoreMoneyThenHave();
        customAssertions.asserText("Сумма платежа превышает доступный баланс счета",intra_bank_transfer.summaError,"alert");
        webElementActions.refreshPage();
    }
    @Test(priority =4, description = "Check to input MIN value in 'Назначение'")
    public void minValueInNAznachenie(){
        intra_bank_transfer.TestNaznachenieMinValue();
        customAssertions.asserText("Назначение: Цифры, латиница, кириллица, !?()№%_.,+\\-*/\"' , мин 4 - макс 140",intra_bank_transfer.naznachenieError,"alert");
        webElementActions.refreshPage();
    }
}
