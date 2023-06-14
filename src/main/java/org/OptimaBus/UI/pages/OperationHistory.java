package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationHistory extends BasePage{


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
