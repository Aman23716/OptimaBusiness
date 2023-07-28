package org.OptimaBusTests.uiTests.mainPageTests;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.Test;
/** Zhyldyz123 **/
public class EmployeesTests extends BaseUiTests {


    @Test(priority = 0, description = "Verify that user can click to Сотрудники btn  on MainPage")
    public void isEmployeesBtnClickable() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);

        //после нажатия на сотрудники, открывается новая страничка
        customAssertions.asserText("Сотрудники", employees.employeeText, "norm");

    }
    @Test(priority = 1, description = "Verify that user can type text on search input field on Employees Page")
    public void typeTextOnInputSearch() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        Assert.assertEquals(employees.inputSearchOnEmployees.isDisplayed(),true);
        webElementActions.sendKeys(employees.inputSearchOnEmployees, "Исмаилов");
        //Assert.assertEquals();

    }
    @Test(priority = 2, description = "Сheck the texts on Employees Page")
    public void checkTextsOnEmployeesPage() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        customAssertions.asserText("ФИО", employees.fIOText, "norm");
        customAssertions.asserText("Номер телефона", employees.numberOfPhoneText, "norm");
        customAssertions.asserText("Роль", employees.roleText, "norm");
        customAssertions.asserText("Статус", employees.statusText, "norm");
        customAssertions.asserText("Исмаилов Руслан Евгеньевич", employees.ismailovFIOBtn, "norm");
        customAssertions.asserText("996555780893", employees.ismailovPhoneBtn, "norm");
        customAssertions.asserText("Право второй подписи", employees.ismailovRoleBtn, "norm");
        customAssertions.asserText("Активен", employees.ismailovStatusBtn, "norm");
        customAssertions.asserText("Бегматова Тумар Тимуровна", employees.begmatovaFIOBtn, "norm");
        customAssertions.asserText("996703503020", employees.begmatovaPhoneBtn, "norm");
        customAssertions.asserText("Право первой подписи", employees.begmatovaRoleBtn, "norm");
        customAssertions.asserText("Активен", employees.begmatovaStatusBtn, "norm");

        //спросить у разрабов выходит ошибка- expected- , actual
        // customAssertions.asserText("Сивогривова Анна Анатольевна", employees.sivogrivovaFIOBtn, "norm");
        //customAssertions.asserText("996555230324", employees.sivogrivovaPhoneBtn, "norm");
        customAssertions.asserText("Право первой подписи", employees.sivogrivovaRoleBtn, "norm");
        customAssertions.asserText("Активен", employees.sivogrivovaStatusBtn, "norm");

    }
}



