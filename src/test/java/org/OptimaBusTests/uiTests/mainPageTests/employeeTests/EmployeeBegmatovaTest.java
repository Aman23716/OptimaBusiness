package org.OptimaBusTests.uiTests.mainPageTests.employeeTests;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeBegmatovaTest extends BaseUiTests {
    @BeforeClass
    public void changeCompany() {
        employees.ChooseImaratStroi1();
    }

    @Test
    public void checkBegmatovaBtn() {
        employeeBegmatova.checkBegmatovaKGSBtn();
        Assert.assertEquals("1090800067210129","1090800067210129" );


    }

    @Test
    public void checkSaveTheChanges() {
        employeeBegmatova.saveTheChangesOnSettingsAccount();
        customAssertions.asserText("Вернуться", employeeBegmatova.begmatovaGoBAckBtnKGS, "norm");
    }
}