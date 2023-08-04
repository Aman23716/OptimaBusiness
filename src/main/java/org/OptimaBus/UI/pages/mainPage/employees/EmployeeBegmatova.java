package org.OptimaBus.UI.pages.mainPage.employees;


import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeBegmatova extends BasePage {
    Employees employees = new Employees();

    @FindBy(xpath = "(//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase currency-btn'])[1]")
    public WebElement begmatovaKGSBtn;

    @FindBy(xpath = "(//div[@class= 'q-toggle__track'])[1]")
    public WebElement begmatovaIntraBankKGS;

    @FindBy(xpath = "(//div[@class= 'q-toggle__track'])[2]")
    public WebElement begmatovaBetweenOwnAccountsKGS;

    @FindBy(xpath = "(//div[@class= 'q-toggle__track'])[3]")
    public WebElement begmatovaConvertingKGS;
    @FindBy(xpath = "(//div[@class= 'q-toggle__track'])[4]")
    public WebElement begmatovaCliringKGS;
    @FindBy(xpath = "(//div[@class= 'q-toggle__track'])[5]")
    public WebElement begmatovaGrossKGS;
    @FindBy(xpath = "(//div[@class= 'q-toggle__track'])[6]")
    public WebElement begmatovaViewAccountsKGS;
    @FindBy(xpath = "//button[@class= 'q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-btn--dense account__save-btn']")
    public WebElement begmatovaSaveChangesKGS;
    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase ob-dialog__button ob-dialog__button_filled']")
    public WebElement begmatovaGoBAckBtnKGS;
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

    public EmployeeBegmatova saveTheChangesOnSettingsAccount() {
//        elementActions.pause(2000);
//        elementActions.refreshPage();
        checkBegmatovaKGSBtn();
//        begmatovaKGSBtn.click();
//        begmatovaCliringKGS.click();
//        begmatovaIntraBankKGS.click();
//        begmatovaGrossKGS.click();
//        begmatovaConvertingKGS.click();
//        begmatovaBetweenOwnAccountsKGS.click();
        begmatovaViewAccountsKGS.click();
        begmatovaSaveChangesKGS.click();
        return this;
    }

}
