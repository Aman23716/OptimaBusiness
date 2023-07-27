package org.OptimaBusTests.uiTests.mainPageTests;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeesTests extends BaseUiTests {

    @Test(priority = 0, description = "Click to Сотрудники btn  on MainPage")
    public void isEmployeesBtnClickable() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        webElementActions.click(employees.employeesBtn);
        customAssertions.asserText("Сотрудники", employees.employeeText, "norm");





    }
}



