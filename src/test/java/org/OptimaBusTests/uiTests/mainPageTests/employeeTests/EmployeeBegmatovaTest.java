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
    @Test(priority = 0)
    public void checkCancelBtn(){
        employeeBegmatova.begmatovaViewAccountsKGS.click();
        employeeBegmatova.begmatovaCancelBtnKGS.click();
        webElementActions.pause(2000);
        customAssertions.asserText("Отменить", employeeBegmatova.begmatovaCancelBtnKGS, "norm");
    }
    @Test(priority = 1)
    public void checkSaveTheChanges() {
        employeeBegmatova.saveTheChangesOnSettingsAccount();
        customAssertions.asserText("Вернуться", employeeBegmatova.begmatovagoBackBtnKGS, "norm");
    }
}