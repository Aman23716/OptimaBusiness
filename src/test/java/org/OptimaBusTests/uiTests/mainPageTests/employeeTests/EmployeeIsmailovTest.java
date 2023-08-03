package org.OptimaBusTests.uiTests.mainPageTests.employeeTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.OptimaBus.UI.helper.Annotations;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeIsmailovTest extends BaseUiTests {


    @Test(priority = 1)    //description = "Check the texts on Ismailov Page")
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

    @Test(priority = 2, description = "Verify that user can type number on input search field on Ismailov Page")
   // @Annotations.TestCase(id = 1112)
    @Severity(SeverityLevel.NORMAL)
    public void checkTheInputFieldWithValidAccount() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
       //webElementActions.click(employees.employeesBtn);
      //webElementActions.click(employees.ismailovFIOBtn);
        employeeIsmailov.ismailovInputSearchField.sendKeys("109");
        customAssertions.asserText("1090800067210129", employeeIsmailov.ismailovAccountNumber, "norm");
    }

    @Test(priority = 3, description = "Test with letters")
    public void checkTheInputFieldWithLetters() {
        webElementActions.pause(2000);
        webElementActions.refreshPage();
       // webElementActions.click(employees.employeesBtn);
        //employees.staleElementException();
        webElementActions.sendKeys(employeeIsmailov.ismailovInputSearchField,"erg");
        customAssertions.asserText("", employeeIsmailov.ismailovInputSearchField, "norm");

    }

    @Test//(priority = 4, description = "Test with empty fields")
    public void checkTheEmptyInputField() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
       // webElementActions.click(employees.employeesBtn);
       // webElementActions.click(employees.ismailovFIOBtn);
        customAssertions.asserText("", employeeIsmailov.ismailovInputSearchField, "norm");

    }

//    @Test//(priority = 5,description = "Test with more numbers")
//    public void checkTheInputFieldWithMoreNumbers() {
//        webElementActions.pause(1000);
//        String actualErrorMessage = employeeIsmailov.ismailovInputSearchField.getAttribute("data validation message");
//        String expectedErrorMessage = "Size of numbers must be less than 17";
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//        webElementActions.pause(1000);
//        webElementActions.refreshPage();
//    }

    @Test//(priority = 6, description = "Test the account number and number of contract")
    public void checkTheAccountContNum() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
       // webElementActions.click(employees.employeesBtn);
        //webElementActions.click(employees.ismailovFIOBtn);
        customAssertions.asserText("1090800067210129", employeeIsmailov.ismailovAccountNumber, "norm");
        customAssertions.asserText("Договор 002864-18", employeeIsmailov.ismailovNumberOfContract, "norm");


    }

    @Test//
    // (priority = 7, description = "Test the hidden icon")
    public void checkTheHiddenIcon() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
       // webElementActions.click(employees.employeesBtn);
      //  webElementActions.click(employees.ismailovFIOBtn);
        employeeIsmailov.clickTheHiddenIcon();
        Assert.assertTrue(employeeIsmailov.accountsHiddenIcon.isEnabled(), "open accounts");

    }

    @Test//(priority = 8,description = "Test the account with KGS")
    public void clickTheAccountKGS() {
        webElementActions.pause(2000);
        //webElementActions.click(employees.employeesBtn);
        //webElementActions.click(employees.ismailovFIOBtn);
        webElementActions.click(employeeIsmailov.ismailovAccountKGS);
        customAssertions.asserText("1090800067210129", employeeIsmailov.ismailovAccountKGS, "norm");
        Assert.assertTrue(employeeIsmailov.accountNumberOnPageKGS.isDisplayed(),"open KGS");
        employeeIsmailov.backBtn.click();
    }
    @Test//(priority = 9, description = "Test the account with USD")
    public void clickTheAccountUSD() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
       // webElementActions.click(employees.employeesBtn);
        //webElementActions.click(employees.ismailovFIOBtn);
        webElementActions.click(employeeIsmailov.ismailovAccountUSD);
        Assert.assertTrue(employeeIsmailov.ismailovAccountUSD.isEnabled(), "open account");
        employeeIsmailov.backBtn.click();
    }
//    @Test(priority = 10, description = "Test the account with EUR")
//    public void clickTheAccountEUR() {
//        webElementActions.pause(2000);
//        webElementActions.click(employees.employeesBtn);
//        webElementActions.click(employees.ismailovFIOBtn);
//        webElementActions.click(employeeIsmailov.ismailovAccountEUR);
//        Assert.assertTrue(employeeIsmailov.ismailovAccountEUR.isEnabled(), "open account");
//        webElementActions.refreshPage();
//        employeeIsmailov.backBtn.click();
//    }
//    @Test(priority = 11, description = "Test the account with RUB")
//    public void clickTheAccountRUB() {
//        webElementActions.pause(2000);
//        webElementActions.refreshPage();
//        webElementActions.click(employees.employeesBtn);
//        webElementActions.click(employees.ismailovFIOBtn);
//        webElementActions.click(employeeIsmailov.ismailovAccountRUB);
//        Assert.assertTrue(employeeIsmailov.ismailovAccountRUB.isEnabled(), "open account");
//        employeeIsmailov.backBtn.click();
//    }
//    @Test(priority = 12, description = "Test the account with KZT")
//    public void clickTheAccountKZT() {
//        webElementActions.pause(2000);
//        webElementActions.refreshPage();
//        webElementActions.click(employees.employeesBtn);
//        webElementActions.click(employees.ismailovFIOBtn);
//        webElementActions.click(employeeIsmailov.ismailovAccountKZT);
//        Assert.assertTrue(employeeIsmailov.ismailovAccountKZT.isEnabled(), "open account");
//        employeeIsmailov.backBtn.click();
//    }
//    @Test(priority = 13, description = "Test the account with CNY")
//    public void clickTheAccountCNY() {
//        webElementActions.pause(2000);
//        webElementActions.click(employeeIsmailov.ismailovAccountCNY);
//        Assert.assertTrue(employeeIsmailov.ismailovAccountCNY.isEnabled(), "open account");
//        webElementActions.refreshPage();
//        employeeIsmailov.backBtn.click();
//    }
//    @Test(priority = 14, description = "Test the account with JPY")
//    public void clickTheAccountJPY() {
//        webElementActions.pause(2000);
//        webElementActions.click(employeeIsmailov.ismailovAccountJPY);
//        Assert.assertTrue(employeeIsmailov.ismailovAccountJPY.isEnabled(), "open account");
//        webElementActions.refreshPage();
//        employeeIsmailov.backBtn.click();
//    }
//    @Test(priority = 15, description = "Test the account with GBP")
//    public void clickTheAccountGBP() {
//        webElementActions.pause(2000);
//        webElementActions.click(employeeIsmailov.ismailovAccountGBP);
//        Assert.assertTrue(employeeIsmailov.ismailovAccountGBP.isEnabled(), "open account");
//        webElementActions.refreshPage();
//        employeeIsmailov.backBtn.click();
//    }
}