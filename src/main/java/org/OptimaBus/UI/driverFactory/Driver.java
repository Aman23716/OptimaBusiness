package org.OptimaBus.UI.driverFactory;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class Driver {

    /**
     * @author Aman Omorbekov
     */

    private static Logger logger = LogManager.getLogger(Driver.class);

    private Driver(){

    }


    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    logger.warn("Starting Chromedriver");
                    driver= ChromeWebDriver.loadChromeDriver();
                    logger.info("Chrome driver started successfully");
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver();
                    break;
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }

        return driver;

    }
    public static void closeDriver(){
        try{
            if (driver!=null){
               driver.close();
               driver.quit();
               driver=null;
            }
        }catch (Exception e){
            logger.error("Error while closing driver");
            e.printStackTrace();
        }

    }




}
