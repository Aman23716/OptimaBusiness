package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Settings extends BasePage{


    @FindBy(xpath = ".//a[@class='nav-item'][4]")
    public WebElement ClickTo5BTN;





    public Settings BTN5(){
        elementActions.click(ClickTo5BTN);

        return this;
    }

}
