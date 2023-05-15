package org.OptimaBus.UI.driverFactory;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    /**
     * @author Aman Omorbekov
     */

    private Driver(){

    }


    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver= ChromeWebDriver.loadChromeDriver();
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
            System.out.println("Error while closing driver");
        }

    }




}
