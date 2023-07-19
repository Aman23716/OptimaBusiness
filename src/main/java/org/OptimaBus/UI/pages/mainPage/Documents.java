package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Documents extends BasePage {


    @FindBy(xpath = ".//a[@class='nav-item'][2]")
    public WebElement ClickTo3BTN;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase order-btn lite-shadow']")
    public WebElement ZakazatVypiskuBTN;
    @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[1]")
    public WebElement NomerS4etaBTN;
    @FindBy(xpath = ".//div[@class='ob-select active']")
    public WebElement NujnyiSchet;
    @FindBy(xpath = ".//div[@class='flex justify-around range-date text-muted']")
    public WebElement IntervalDney;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[1]")
    public WebElement DataInput;
//    @FindBy(xpath = "")










    public Documents BTN3(){
        elementActions.click(ClickTo3BTN);

        return this;
    }
}
