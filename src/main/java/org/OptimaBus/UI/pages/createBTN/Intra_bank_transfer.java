package org.OptimaBus.UI.pages.createBTN;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Intra_bank_transfer extends BasePage {



    @FindBy(className = "q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow")
    public WebElement createBTN;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[2]")
    public WebElement schetSpisaniyaBTN;
    @FindBy(xpath = "(.//a[@class='p-select-item'])[3]")
    public WebElement vnutriBankBTN;
    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseSomSchet;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement inputSchetZa4isleniya;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[3]")
    public WebElement inputDocumNumber;
    @FindBy(xpath = "(.//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[5]")
    public WebElement inputSummuPlateja;
    @FindBy(xpath = "(.//input[@class='q-field__native q-placeholder'])[4]")
    public WebElement inputKodPlateja;
    @FindBy(xpath = ".//textarea[@class='q-field__native q-placeholder']")
    public WebElement inputNaznachenie;

}
