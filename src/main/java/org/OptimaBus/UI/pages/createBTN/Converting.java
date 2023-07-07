package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Converting extends BasePage {

    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")
    public WebElement createBTN;
    @FindBy(xpath = "(.//a[@class='p-select-item'])[4]")
    public WebElement convertingBTN;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[1]")
    public WebElement naimenovanieField;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement documentNumber1;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement documentNumber2;
    @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[3]")
    public WebElement chooseCurrencyBTN1;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseUSDT1;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[5]")
    public WebElement chooseCurrencyBTN2;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseSOM1;
    @FindBy(xpath = "(.//input[@class='q-field__input'])[1]")
    public WebElement inputMockValue;
    @FindBy(xpath = "currency-rates__rate")
    public WebElement currentCurrency ;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--unelevated q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase sign-btn transfer-btn']")
    public WebElement BTNNaPodpis;

    @FindBy(xpath = ".//p[@class='ob-dialog__label']")
    public WebElement documNumber;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase ob-dialog__button ob-dialog__button_filled']")
    public WebElement PeyHistory;



    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement notClickableNaimenovnieField;





    @FindBy(xpath = "(.//div[@role='alert'])[1]")
    public WebElement firstSummaAlert;
    @FindBy(xpath = "(.//div[@role='alert'])[2]")
    public WebElement secondSummaAlert;






    public void CheckNaPodpisBTN(){
        elementActions.pause(2000).inputDocumentNumber1(documentNumber1).click(chooseCurrencyBTN1).click(chooseUSDT1).click(chooseCurrencyBTN2).click(chooseSOM1)
                .sendKeysDouble(inputMockValue,mockDataGenerator.generateMockValue1());
    }
    public void CheckNaPodpisWithoutSumma(){
        elementActions.pause(2000).inputDocumentNumber1(documentNumber1).click(chooseCurrencyBTN1).click(chooseUSDT1).click(chooseCurrencyBTN2)
                .click(chooseSOM1).click(BTNNaPodpis);
    }
    public void CheckCalcValue(){
        elementActions.pause(2000).click(convertingBTN).sendKeysInt(documentNumber2,mockDataGenerator.generateMockValue()).click(chooseCurrencyBTN1).click(chooseUSDT1).click(chooseCurrencyBTN2).click(chooseSOM1)
                .sendKeysDouble(inputMockValue,mockDataGenerator.generateMockValue1());
    }
    public void CheckNotClickableBTN(){
        elementActions.pause(2000).click(createBTN).click(convertingBTN).inputDocumentNumber1(documentNumber1);
    }


    public Converting CalcResult(){
//          inputMockValue.getText();
//          currentCurrency.getText();
        return this;
    }
//public Settings chooseSettings() {
//    for (WebElement list1 : navigationList) {
//        if (list1.getText().equals("Настройки")){
//            System.out.println(list1.getText());
//            list1.click();
//        }
//    }
//    return this;
//}

//    public Converting LOL(){
//        for (WebElement list2 : documentNumber1){
//            if (list2.getText().equals("Номер документа")){
//                list2.getText();
//                System.out.println(list2);
//            }
//        }return this;
//    }



    public Converting GetDocumValue(){
//          documentNumber1.getText();
//          BTNNaPodpis.getText();
        BTNNaPodpis.click();
        documNumber.getText();
//          PeyHistory.click();

        System.out.println(documNumber);

        return this;
    }

}