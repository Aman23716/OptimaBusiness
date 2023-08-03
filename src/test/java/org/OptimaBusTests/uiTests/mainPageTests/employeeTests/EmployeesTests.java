package org.OptimaBusTests.uiTests.mainPageTests.employeeTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.OptimaBus.UI.helper.Annotations;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Zhyldyz123
 **/
public class EmployeesTests extends BaseUiTests {


    @Test//(priority = 0, description = "Verify that user can click to Сотрудники btn  on MainPage")
    @Annotations.TestCase(id=1708)
    public void isEmployeesBtnClickable() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        customAssertions.asserText("Сотрудники", employees.employeeText, "norm");

    }
    @Test//(priority = 1, description = "Сheck the required  texts on Employees Page")
    @Annotations.TestCase(id = 1709)
    public void checkRequiredTextsOnEmployeesPage() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        customAssertions.asserText("ФИО", employees.fIOText, "norm");
        customAssertions.asserText("Номер телефона", employees.numberOfPhoneText, "norm");
        customAssertions.asserText("Роль", employees.roleText, "norm");
        customAssertions.asserText("Статус", employees.statusText, "norm");
    }




    @Test//(priority = 3, description = "Сheck the data of registered users  on Employees Page")
    @Annotations.TestCase(id = 1710)
    public void checkDataOfRegisteredOnEmployeesPage() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        customAssertions.asserText("Исмаилов Руслан Евгеньевич", employees.ismailovFIOBtn, "norm");
        customAssertions.asserText("996555780893", employees.ismailovPhoneBtn, "norm");
        customAssertions.asserText("Право второй подписи", employees.ismailovRoleBtn, "norm");
        customAssertions.asserText("Активен", employees.ismailovStatusBtn, "norm");
        customAssertions.asserText("Бегматова Тумар Тимуровна", employees.begmatovaFIOBtn, "norm");
        customAssertions.asserText("996703503020", employees.begmatovaPhoneBtn, "norm");
        customAssertions.asserText("Право первой подписи", employees.begmatovaRoleBtn, "norm");
        customAssertions.asserText("Активен", employees.begmatovaStatusBtn, "norm");
        customAssertions.asserText("Сивогривова Анна Анатольевна", employees.sivogrivovaFIOBtn, "norm");
        customAssertions.asserText("996555230324", employees.sivogrivovaPhoneBtn, "norm");
        customAssertions.asserText("Право первой подписи", employees.sivogrivovaRoleBtn, "norm");
        customAssertions.asserText("Активен", employees.sivogrivovaStatusBtn, "norm");
    }





    @Test//(priority = 5, description = "Verify that user can type text on search input field on Employees Page")
    @Annotations.TestCase(id = 1708)
    @Severity(SeverityLevel.NORMAL)
    public void typeTextOnInputSearch() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        Assert.assertEquals(employees.inputSearchOnEmployees.isDisplayed(), true);
        webElementActions.sendKeys(employees.inputSearchOnEmployees, "Исмаилов").click(employees.ismailovFIOBtn);
        customAssertions.asserText("Исмаилов Руслан Евгеньевич", employeeIsmailov.ismailovFIOText, "norm");
        Assert.assertEquals(employees.ismailovCloseBtn.isDisplayed(),true);
        employees.ismailovCloseBtn.click();

    }

    @Test//(priority = 6, description = "Verify that user can type numbers on search input field on Employees Page")
    @Annotations.TestCase(id = 1711)
    @Severity(SeverityLevel.NORMAL)
    public void typeNumberOnInputSearch() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        webElementActions.sendKeysLong(employees.inputSearchOnEmployees, 8L).click(employees.ismailovFIOBtn);
        customAssertions.asserText("Исмаилов Руслан Евгеньевич", employeeIsmailov.ismailovFIOText, "norm");
    }

//        @Test//(priority = 7, description = "Check the texts on Ismailov Page")
//        @Annotations.TestCase(id = 1111)
//        @Severity(SeverityLevel.MINOR)
//        public void checkTheTexts() {
//            webElementActions.refreshPage();
//            webElementActions.pause(2000);
//            webElementActions.click(employees.employeesBtn);
//            webElementActions.click(employees.ismailovFIOBtn);
//            customAssertions.asserText("2-подпись", employeeIsmailov.ismailov2PodpisText, "norm");
//            customAssertions.asserText("Номер телефона",employeeIsmailov.ismailovPhoneTitleText, "norm");
//            customAssertions.asserText("E-mail",employeeIsmailov.ismailovEmailTitleText, "norm");
//            customAssertions.asserText("ruslan.ismailov@optimabank.kg",employeeIsmailov.ismailovEmailText, "norm");
//            customAssertions.asserText("Роль",employeeIsmailov.ismailovRoleTitleText, "norm");
//            customAssertions.asserText("Право второй подписи",employeeIsmailov.ismailovRoleText, "norm");
//            customAssertions.asserText("Статус",employeeIsmailov.ismailovStatusTitleText, "norm");
//            customAssertions.asserText("Активен",employeeIsmailov.ismailovStatusText, "norm");
//            customAssertions.asserText("Дата регистрации",employeeIsmailov.ismailovDateOfRegisterTitleText, "norm");
//            customAssertions.asserText("26.04.2023",employeeIsmailov.ismailovDateOfRegisterText, "norm");
//        }
}



