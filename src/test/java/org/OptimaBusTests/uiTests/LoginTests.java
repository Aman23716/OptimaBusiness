package org.OptimaBusTests.uiTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {





    @Test(description = "we")
    public void setUpUiTest() {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver1.get("https://optimabusiness.kg/auth/login");
    }
}
