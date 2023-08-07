package org.OptimaBus.UI.pages.mainPage.employees;


import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.imageio.stream.ImageInputStream;

public class EmployeeBegmatova extends BasePage {
    Employees employees = new Employees();

    @FindBy(xpath = "(//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase currency-btn'])[1]")
    public WebElement begmatovaKGSBtn;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[1]")
    public WebElement begmatovaIntraBankKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[2]")
    public WebElement begmatovaBetweenOwnAccountsKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[3]")
    public WebElement begmatovaConvertingKGS;
    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[4]")
    public WebElement begmatovaCliringKGS;
    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[5]")
    public WebElement begmatovaGrossKGS;
    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[6]")
    public WebElement begmatovaViewAccountsKGS;
    @FindBy(xpath = "(//span[@class='block'])[2]")
    public WebElement begmatovaSaveChangesKGS;
    @FindBy(xpath = "(//span[@class='block'])[1]")
    public WebElement begmatovaCancelBtnKGS;
    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase ob-dialog__button ob-dialog__button_filled']")
    public WebElement begmatovagoBackBtnKGS;

    @FindBy(xpath = "//div[@class='account__title']")
    public WebElement begmatovaAccountKGS;

    public EmployeeBegmatova checkBegmatovaKGSBtn() {
        elementActions.refreshPage();
        elementActions.pause(2000);
        elementActions.click(employees.employeesBtn);
        elementActions.click(employees.begmatovaFIOBtn);
        elementActions.click(begmatovaKGSBtn);
        return this;
    }
    public EmployeeBegmatova
    saveTheChangesOnSettingsAccount() {

        begmatovaIntraBankKGS.click();
        elementActions.pause(1000);
        begmatovaBetweenOwnAccountsKGS.click();
        elementActions.pause(1000);
        begmatovaConvertingKGS.click();
        elementActions.pause(1000);
        begmatovaCliringKGS.click();
        elementActions.pause(1000);
        begmatovaGrossKGS.click();
        elementActions.pause(1000);
        begmatovaViewAccountsKGS.click();
        elementActions.pause(1000);

        begmatovaSaveChangesKGS.click();
        return this;
    }

}
