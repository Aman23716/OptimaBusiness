package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class More extends BasePage {



    @FindBy(xpath = ".//a[@class='nav-item'][6]")
     public WebElement ClickTo7BTN;









    public More BTN7(){
        elementActions.click(ClickTo7BTN);

        return this;
    }






}
