package org.OptimaBusTests.uiTests;

import org.OptimaBus.UI.dataProvider.ConfigReader;
//import org.OptimaBus.UI.driverFactory.Driver;
import org.OptimaBus.UI.driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseUiTests {
//    @BeforeClass
//    public void openLoginPage() {
//        driver.navigate().to(ConfigReader.getProperty("qa_env"));
//
//    }

    @Test(description = "Verify that user can login with valid credentials")
    public void loginWithValidCredentials() {
//       WebDriver driver = new ChromeDriver();
//        driver.navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPass();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://test-ob.optimabank.kg/auth/login");
}
}
