package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationHistory extends BasePage {


    @FindBy(xpath = ".//a[@class='nav-item'][1]")
    public WebElement ClickTo2BTN;

    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[1]")
    public WebElement naPodpis;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[1]")
    public WebElement allBTN;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[2]")
    public WebElement ojidaetOtpravki;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[3]")
    public WebElement naRedactirov;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[4]")
    public WebElement ispolnennye;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[5]")
    public WebElement otklonennye;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[6]")
    public WebElement otkazanoBankom;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[7]")
    public WebElement moiChernoviki;

    /**FILTERFIELD**/
    @FindBy(xpath = ".//span[@class='filter-title']")
    public WebElement filterBTN;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[1]")
    public WebElement naimenovanieField;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement numberDocumentField;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement dataOT;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[4]")
    public WebElement dataDO;
    @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[4]")
    public WebElement tipPlateja;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement convertaciyaTip;
    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement grossTip;
    @FindBy(xpath = "(.//div[@class='ob-select'])[3]")
    public WebElement clearingTip;
    @FindBy(xpath = "(.//div[@class='ob-select'])[4]")
    public WebElement swiftTip;
    @FindBy(xpath = "(.//div[@class='ob-select'])[5]")
    public WebElement perevodNADrugieClientskieTip;
    @FindBy(xpath = "(.//div[@class='ob-select'])[6]")
    public WebElement perevodMejduSvoimiTip;

    @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[5]")
    public WebElement proishojdenieBTN;
    @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[6]")
    public WebElement valutaChoose;
    @FindBy(xpath = "(.//input[@class='q-field__input'])[1]")
    public WebElement summaOt;
    @FindBy(xpath = "(.//input[@class='q-field__input'])[2]")
    public WebElement summaDO;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment btn lite-shadow']")
    public WebElement primenitBTN;
    /**ASSERTIONS**/
    @FindBy(xpath = ".//div[@class='ellipsis']")
    public WebElement assertions;
    @FindBy(xpath = "(.//div[@class='p1'])[1]")
    public WebElement assertions2;








    public void TipPlatejaFilter(){
        elementActions.click(ClickTo2BTN).click(filterBTN).click(tipPlateja).click(convertaciyaTip).click(primenitBTN);
    }

    public OperationHistory BTN2(){
        elementActions.click(ClickTo2BTN);

        return this;
    }

    //    public OperationHistory AllBTN(){
//        elementActions.click(allBTN);
//        return this;
//    }
    public OperationHistory NaPodpis(){
        elementActions.click(naPodpis);
        return this;
    }
    public OperationHistory OjidaetOtpravki(){
        elementActions.click(ojidaetOtpravki);
        return this;
    }
    public OperationHistory NaRedactirov(){
        elementActions.click(naRedactirov);
        return this;
    }
    public OperationHistory Ispolnennye(){
        elementActions.click(ispolnennye);
        return this;
    }
    public OperationHistory Otklonennye(){
        elementActions.click(otklonennye);
        return this;
    }
    public OperationHistory OtkazanoBankom(){
        elementActions.click(otkazanoBankom);
        return this;
    }
    public OperationHistory MoiChernoviki(){
        elementActions.click(moiChernoviki);
        return this;
    }

}
