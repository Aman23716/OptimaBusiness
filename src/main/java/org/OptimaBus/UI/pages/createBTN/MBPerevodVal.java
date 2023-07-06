package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MBPerevodVal extends BasePage {
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")
    public WebElement createBTN;
    @FindBy(xpath = "(.//a[@class='p-select-item'])[2]")
    public WebElement MBPerevodVal;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[2]")
    public WebElement schetSpisaniyaBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseDollarSchet;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[3]")
    public WebElement schetOplatyKomissiiBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseSomForKomissiya;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[4]")
    public WebElement countryBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement chooseAustriyaCountry;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[5]")
    public WebElement BIKField;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement chooseFirstBIK;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement naimenovaniyaField;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement IBANSchet;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[4]")
    public WebElement numberOfDocument;
    @FindBy(xpath = ".//input[@class='q-field__input']")
    public WebElement summaPlatejaField;
    @FindBy(xpath = "(.//input[@class='q-field__input q-placeholder col'])[2]")
    public WebElement codeOplaty;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement chooseNalog;
    @FindBy(xpath = ".//textarea[@class='q-field__native q-placeholder']")
    public WebElement naznachenieField;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--unelevated q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase sign-btn transfer-btn']")
    public WebElement naPodpisBTN;




    @FindBy(xpath = "(.//div[@role='alert'])[1]")
    public WebElement allAlert;




    public void CheckFunctionalNaPodpis(){
        elementActions.click(createBTN).click(MBPerevodVal).click(schetSpisaniyaBTN).click(chooseDollarSchet).click(schetOplatyKomissiiBTN).click(chooseSomForKomissiya)
                .click(countryBTN).click(chooseAustriyaCountry).sendKeys(BIKField,"1").click(chooseFirstBIK).sendKeys(naimenovaniyaField,"Naimenovanie")
                .sendKeys(IBANSchet,"2222222222222222222222222222222222").inputDocumentNumber1(numberOfDocument).sendKeysInt(summaPlatejaField,22)
                .sendKeys(codeOplaty,"1").click(chooseNalog).inputNaznachenieField1(naznachenieField).click(naPodpisBTN);
    }








}
