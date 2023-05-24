package org.OptimaBus.UI.pages;

import org.OptimaBus.UI.helper.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Converting extends BasePage{

    @FindBy(xpath = "(.//a[@class='p-select-item ng-star-inserted'])[4]")
    public WebElement convertingBTN;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[1]")
    public WebElement documentNumber;
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










      public Converting CheckCalcValue(){
        elementActions.click(convertingBTN).sendKeysInt(documentNumber,mockDataGenerator.generateMockValue()).click(chooseCurrencyBTN1).click(chooseUSDT1).click(chooseCurrencyBTN2).click(chooseSOM1)
                .sendKeysInt(inputMockValue,mockDataGenerator.generateMockValue());
        return this;
      }


      public Converting CalcResult(){
          inputMockValue.getText();
          currentCurrency.getText();

          return this;
      }

}
