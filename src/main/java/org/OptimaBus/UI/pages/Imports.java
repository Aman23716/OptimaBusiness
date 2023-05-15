package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Imports extends BasePage{

    @FindBy(xpath = ".//a[@class='nav-item'][3]")
    public WebElement ClickTo4BTN;




    public Imports BTN4(){
        elementActions.click(ClickTo4BTN);

        return this;
    }


}
