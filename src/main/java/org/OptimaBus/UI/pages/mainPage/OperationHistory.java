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
    public WebElement naRedactirov;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[3]")
    public WebElement ispolnennye;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[4]")
    public WebElement otklonennye;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[5]")
    public WebElement otkazanoBankom;
    @FindBy(xpath = "(.//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase filter-btn'])[6]")
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
    @FindBy(xpath = ".//input[@class='q-field__input q-placeholder col']")
    public WebElement volutaField;
    @FindBy(xpath = ".//div[@class='ob-select']")
    public WebElement KGSChoose;


    /**ASSERTIONS**/
    @FindBy(xpath = ".//div[@class='ellipsis']")
    public WebElement assertions;
    @FindBy(xpath = "(.//div[@class='p1'])[1]")
    public WebElement assertions2;
    @FindBy(xpath = "(.//div[@class='transaction__title p1 d-none'])[1]")
    public WebElement companiya;
    @FindBy(xpath = "(.//div[@class='transaction__amount text-weight-medium p1'])[1]")
    public WebElement summaAssertion;
    @FindBy(xpath = "(.//span[@class='text-disabled'])[1]")
    public WebElement documentNumberAsseert;
    @FindBy(xpath = ".//div[@class='transaction-group__title text-h5']")
    public WebElement dataAssertion;

    public void PoNaimenovaniu(){
        elementActions.click(filterBTN).sendKeys(naimenovanieField,"ОсОО \"АЛТЫНКЕН\"").click(primenitBTN);
    }
    public void PoNumberDocument(){
        elementActions.click(filterBTN).sendKeys(numberDocumentField,"Test value").click(primenitBTN);
    }
    public void PoValute(){
        elementActions.click(filterBTN).sendKeys(volutaField,"KGS").click(KGSChoose).click(primenitBTN);
    }
    public void Data(){
        elementActions.sendKeys(dataOT,"06072023").sendKeys(dataDO,"07072023").click(primenitBTN);
    }
    public void Summa(){
        elementActions.sendKeys(summaOt,"1000").sendKeys(summaDO,"10000").click(primenitBTN);
    }




    public void TipPlatejaFilterConverting(){
        elementActions.click(filterBTN).click(tipPlateja).click(convertaciyaTip).click(primenitBTN);
    }
    public void TipPlatejaFilterGross(){
        elementActions.click(filterBTN).click(tipPlateja).click(grossTip).click(primenitBTN);
    }
    public void TipPlatejaFilterClearing(){
        elementActions.click(filterBTN).click(tipPlateja).click(clearingTip).click(primenitBTN);
    }
    public void TipPlatejaFilterSWIFT(){
        elementActions.click(filterBTN).click(tipPlateja).click(swiftTip).click(primenitBTN);
    }
    public void TipPlatejaFilterPErevodNADrugie(){
        elementActions.click(filterBTN).click(tipPlateja).click(perevodNADrugieClientskieTip).click(primenitBTN);
    }
    public void TipPlatejaFilterPerevodMejdu(){
        elementActions.click(filterBTN).click(tipPlateja).click(perevodMejduSvoimiTip).click(primenitBTN);
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
        elementActions.click(moiChernoviki).click(allBTN);
        return this;
    }

}
