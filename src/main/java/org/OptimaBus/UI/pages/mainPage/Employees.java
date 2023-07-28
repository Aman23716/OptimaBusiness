package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employees extends BasePage {
    @FindBy(xpath = "//a[@href='/employees'] ")
    public WebElement employeesBtn;

    @FindBy(xpath = "//h3[@class='q-ma-none header__title']")
    public WebElement employeeText;

    @FindBy(xpath = "//input[@tabindex='0']")
    public WebElement inputSearchOnEmployees;

    @FindBy(xpath = "//th[contains(text(),'ФИО')]")
    public WebElement fIOText;
    @FindBy(xpath = "//th[contains(text(),'Номер телефона')]")
    public WebElement numberOfPhoneText;
    @FindBy(xpath = "//th[contains(text(),'Роль')]")
    public WebElement roleText;
    @FindBy(xpath = "//th[contains(text(),'Статус')]")
    public WebElement statusText;

    @FindBy(xpath = "(//td[@class='text-left'])[1]")

    public WebElement ismailovFIOBtn;
    @FindBy(xpath = "(//td[@class='text-left'])[2]")
    public WebElement ismailovPhoneBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[1]")
    public WebElement ismailovRoleBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[2]")
    public WebElement ismailovStatusBtn;
    @FindBy(xpath = "(//td[@class='text-left'])[3]")


    public WebElement begmatovaFIOBtn;
    @FindBy(xpath = "(//td[@class='text-left'])[4]")
    public WebElement begmatovaPhoneBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[3]")
    public WebElement begmatovaRoleBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[4]")
    public WebElement begmatovaStatusBtn;
    @FindBy(xpath = "(//td[@class='text-left'])[5]")

    public WebElement sivogrivovaFIOBtn;
    @FindBy(xpath = "(//td[@class='text-left'])[6]")
    public WebElement sivogrivovaPhoneBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[5]")
    public WebElement sivogrivovaRoleBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[6]")
    public WebElement sivogrivovaStatusBtn;




    public Employees clickEmployeesBtn() {
        elementActions.click(employeesBtn);
        return this;
    }

    }


