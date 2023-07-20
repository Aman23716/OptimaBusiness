package org.OptimaBusTests.uiTests;

import org.testng.annotations.Test;

public class LoginTests extends BaseUiTests {


    @Test(description = "Test with invalid ID")
    public void loginWithInvalidID() {
        loginPage.LoginWithInvalidId();
        webElementActions.pause(1000);
        customAssertions.asserText("Вход", loginPage.vhodWord,"norm");
        customAssertions.asserText("в интернет-банкинг для бизнеса", loginPage.internetBankSentence, "norm");
        customAssertions.asserText("Введите ID клиента", loginPage.alerts, "norm");
        System.err.println(webElementActions.getText(loginPage.captcha));
        webElementActions.refreshPage();

    }
    @Test(description = "Test with invalid ID")
    public void loginWithInvalidPassword() {
        loginPage.LoginWithInvalidPassword();
        webElementActions.pause(1000);
        customAssertions.asserText("Неверный ID клиента или пароль", loginPage.errorText, "norm");
        webElementActions.pause(1000);
        webElementActions.refreshPage();
    }
    @Test(description = "Test with empty fields")
    public void loginWithEmptyFields(){
        loginPage.LoginWithEmptyFields();
        webElementActions.refreshPage();
    }

}