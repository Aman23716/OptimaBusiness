package org.OptimaBus.UI.pages.mainPage.employees;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeIsmailov extends BasePage {
    @FindBy(xpath = ".//p[@class='employee-title']")
    public WebElement ismailovFIOText;

    @FindBy(xpath = "//span[contains(text(),'2-подпись')]")
    public WebElement ismailov2PodpisText;
    @FindBy(xpath = "//span[contains(text(),'Номер телефона')]")
    public WebElement ismailovPhoneTitleText;
    @FindBy(xpath = "//span[contains(text(),'996555780893')]")
    public WebElement ismailovPhoneNumberText;
    @FindBy(xpath = "//span[contains(text(),'E-mail')]")
    public WebElement ismailovEmailTitleText;
    @FindBy(xpath = "//span[contains(text(),'ruslan.ismailov@optimabank.kg')]")
    public WebElement ismailovEmailText;
    @FindBy(xpath = "//span[contains(text(),'Роль')]")
    public WebElement ismailovRoleTitleText;
    @FindBy(xpath = "//span[contains(text(),'Право второй подписи')]")
    public WebElement ismailovRoleText;
    @FindBy(xpath = "//span[contains(text(),'Статус')]")
    public WebElement ismailovStatusTitleText;
    @FindBy(xpath = "//span[contains(text(),'Активен')]")
    public WebElement ismailovStatusText;
    @FindBy(xpath = "//span[contains(text(),'Дата регистрации')]")
    public WebElement ismailovDateOfRegisterTitleText;
    @FindBy(xpath = "//span[contains(text(),'26.04.2023')]")
    public WebElement ismailovDateOfRegisterText;
    @FindBy(xpath = "//p[contains(text(),'1090800067210129')]")
    public WebElement ismailovContractAccountInputSearchField;
    @FindBy(xpath = "//span[contains(text(),'Договор 002864-18')]")
    public WebElement ismailovNumberOfContract;

    @FindBy(xpath = "(//span[@class='q-focus-helper'])[1]")
    public WebElement ismailovAccountKGS;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[2]")
    public WebElement ismailovAccountUSD;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[3]")
    public WebElement ismailovAccountEUR;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[4]")
    public WebElement ismailovAccountRUB;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[5]")
    public WebElement ismailovAccountKZT;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[6]")
    public WebElement ismailovAccountCNY;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[7]")
    public WebElement ismailovAccountJPY;
    @FindBy(xpath = "(//span[@class='q-focus-helper'])[8]")
    public WebElement ismailovAccountGBP;



}
