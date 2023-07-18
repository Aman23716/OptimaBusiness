package org.OptimaBusTests.uiTests.mainPageTests;


import org.OptimaBusTests.uiTests.BaseUiTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
public class SettingsTests extends BaseUiTests {


    @Test(priority = 1, description = "check settings (information)")
    public void CheckSettings() {
//        Settings settings1 = settings.BTN6();
//        assertEquals(settings1.ClickTo5BTN.getText(),"Настройки");
        settings.chooseSettings();
    }

    @Test(priority = 2, description = "check PayControl")
    public void PayControl() {
        settings.payControlBTN();
    }

    @Test(priority = 3, description = "check account visibility")
    public void AccountVisibility() {
        settings.accVisBTN();
        settings.cngVis();
        settings.cngVis();

    }

    @Test(priority = 4, description = "check change password")
    public void ChangePassword() {
        settings.cngPassBTN();
//        settings.assertTextSettings();
        settings.changePass();

    }

    @Test(priority = 5, description = "check change telephone number")
    public void ChangeNumber() {
        settings.cngNumBTN();
    }


}
