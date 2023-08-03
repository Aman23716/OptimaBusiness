package org.OptimaBusTests.uiTests.mainPageTests.employeeTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.OptimaBus.UI.helper.Annotations;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeIsmailovTest extends BaseUiTests {
    @BeforeClass
    public void changeTheCompany(){
        employees.ChooseImaratStroi1();
    }

    @Test(priority = 0)    //description = "Check the texts on Ismailov Page")
   // @Annotations.TestCase(id = 1111)
    @Severity(SeverityLevel.MINOR)
    public void checkTheTexts() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        employees.staleElementException();
        customAssertions.asserText("Вторая подпись", employeeIsmailov.ismailov2PodpisText, "norm");
        customAssertions.asserText("Номер телефона", employeeIsmailov.ismailovPhoneTitleText, "norm");
        customAssertions.asserText("E-mail", employeeIsmailov.ismailovEmailTitleText, "norm");
        customAssertions.asserText("ruslan.ismailov@optimabank.kg", employeeIsmailov.ismailovEmailText, "norm");
        customAssertions.asserText("Роль", employeeIsmailov.ismailovRoleTitleText, "norm");
        customAssertions.asserText("Право второй подписи", employeeIsmailov.ismailovRoleText, "norm");
        customAssertions.asserText("Статус", employeeIsmailov.ismailovStatusTitleText, "norm");
        customAssertions.asserText("Активен", employeeIsmailov.ismailovStatusText, "norm");
        customAssertions.asserText("Дата регистрации", employeeIsmailov.ismailovDateOfRegisterTitleText, "norm");
        customAssertions.asserText("26.04.2023", employeeIsmailov.ismailovDateOfRegisterText, "norm");
    }

    @Test(priority = 1, description = "Verify that user can type number on input search field on Ismailov Page")
   // @Annotations.TestCase(id = 1112)
    @Severity(SeverityLevel.NORMAL)
    public void checkTheInputFieldWithValidAccount() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        employeeIsmailov.ismailovInputSearchField.sendKeys("109");
        customAssertions.asserText("1090800067210129", employeeIsmailov.ismailovAccountNumber, "norm");
    }

    @Test(priority = 2, description = "Test with letters")
    public void checkTheInputFieldWithLetters() {
        webElementActions.pause(2000);
        webElementActions.refreshPage();
        webElementActions.sendKeys(employeeIsmailov.ismailovInputSearchField,"erg");
        customAssertions.asserText("", employeeIsmailov.ismailovInputSearchField, "norm");

    }

    @Test(priority = 3, description = "Test with empty fields")
    public void checkTheEmptyInputField() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        customAssertions.asserText("", employeeIsmailov.ismailovInputSearchField, "norm");

    }



    @Test(priority = 4, description = "Test the account number and number of contract")
    public void checkTheAccountContNum() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        customAssertions.asserText("1090800067210129", employeeIsmailov.ismailovAccountNumber, "norm");
        customAssertions.asserText("Договор 002864-18", employeeIsmailov.ismailovNumberOfContract, "norm");


    }

    @Test(priority = 5, description = "Test the hidden icon")
    public void checkTheHiddenIcon() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        employeeIsmailov.clickTheHiddenIcon();
        Assert.assertTrue(employeeIsmailov.accountsHiddenIcon.isEnabled(), "open accounts");

    }

    @Test(priority = 6,description = "Test the account with KGS")
    public void clickTheAccountKGS() {
        webElementActions.pause(2000);
        webElementActions.click(employeeIsmailov.ismailovAccountKGS);
        customAssertions.asserText("KGS", employeeIsmailov.ismailovAccountKGS, "norm");
        Assert.assertTrue(employeeIsmailov.accountNumberOnPageKGS.isDisplayed(),"open KGS");
        employeeIsmailov.backBtn.click();
    }
    @Test(priority = 7, description = "Test the account with USD")
    public void clickTheAccountUSD() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employeeIsmailov.ismailovAccountUSD);
        Assert.assertTrue(employeeIsmailov.ismailovAccountUSD.isEnabled(), "open account");

    }

    @Test(priority = 8)
    public void checkTheCancelBtn() {
        clickTheAccountUSD();
        webElementActions.click(employeeIsmailov.sWIFTBtn);
        webElementActions.click(employeeIsmailov.cancelBtnOnPageUSD);
        Assert.assertTrue(employeeIsmailov.ismailovAccountUSD.isEnabled(), "open account");
        webElementActions.refreshPage();

    }

    @Test(priority = 9)
    public void checkTheSaveBtn() {
        clickTheAccountUSD();
        webElementActions.click(employeeIsmailov.sWIFTBtn);
        webElementActions.click(employeeIsmailov.saveBtnOnPageKGS);
        Assert.assertTrue(employeeIsmailov.ismailovAccountUSD.isEnabled(), "open account");
        employeeIsmailov.backBtn.click();
    }

}