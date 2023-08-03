package org.OptimaBus.UI.pages.mainPage.employees;

import org.OptimaBus.UI.pages.BasePage;
import org.OptimaBus.UI.pages.Converting;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.OptimaBus.UI.driverFactory.Driver.driver;

/**
 * Zhyldyz123
 **/
public class Employees extends BasePage {

    @FindBy(xpath = "//a[@href='/employees'] ")
    public WebElement employeesBtn;

    @FindBy(xpath = "//h3[@class='q-ma-none header__title']")
    public WebElement employeeText;

    @FindBy(xpath = "//input[@tabindex='0']")
    public WebElement inputSearchOnEmployees;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement bellBtnOnEmployeesPage;

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
    @FindBy(xpath = "//button[@class='close']")
    public WebElement ismailovCloseBtn;

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
    // @FindBy(xpath = "(//td[@class='text-left'])[6]")
    @FindBy(xpath = "//td[contains(text(), '996555230324')]")
    public WebElement sivogrivovaPhoneBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[5]")
    public WebElement sivogrivovaRoleBtn;
    @FindBy(xpath = "(//td[@class='q-td '])[6]")
    public WebElement sivogrivovaStatusBtn;
    @FindBy(xpath = "(//tr[@class='cursor-pointer'])[3]")
    public WebElement sivogrivovaBtn;


////////////***************************************************************
@FindBy(xpath = ".//a[@class='user-toggle no-caret']")
public WebElement chooseCompany;
    @FindBy(xpath = "//span[contains(text(),'Общество с ограниченной ответственностью \"АВТОКУРЬЕР\"')]")
    public List<WebElement> chosenAutoKurier;

    public Employees clickEmployeesBtn() {
        elementActions.click(employeesBtn);
        return this;
    }

    public Employees staleElementException() {
        try {
            WebElement element = driver.findElement(By.xpath("(//td[@class='text-left'])[1]"));
            ismailovFIOBtn.click();

        } catch (StaleElementReferenceException e) {
            WebElement element = driver.findElement(By.xpath("(//td[@class='text-left'])[1]"));
            ismailovFIOBtn.click();

        }
        return this;


    }public void ChooseImaratStroi1() {

        elementActions.click(chooseCompany);
        for (WebElement list1 :chosenAutoKurier) {
            System.out.println(list1);
            if (list1.getText().equals("Общество с ограниченной ответственностью \"АВТОКУРЬЕР\"")) {
                list1.click();
//                if (list1.getText().equals(ConfigReader.getProperty("CompName"))){
//                    list1.click();
//
            }
        }
    }

}

