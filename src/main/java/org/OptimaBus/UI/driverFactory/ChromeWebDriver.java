package org.OptimaBus.UI.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver (){
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\.m2\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions ");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        if (Boolean.parseBoolean(ConfigReader.getProperty("headless"))){
            options.addArguments("--headless");
        }
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\.m2\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
}
