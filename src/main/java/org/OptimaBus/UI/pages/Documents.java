package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Documents extends BasePage{


    @FindBy(xpath = ".//a[@class='nav-item'][2]")
    public WebElement ClickTo3BTN;







    public Documents BTN3(){
        elementActions.click(ClickTo3BTN);

        return this;
    }
}
