package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationHistory extends BasePage{


    @FindBy(xpath = ".//a[@class='nav-item'][1]")
    public WebElement ClickTo2BTN;









    public OperationHistory BTN2(){
        elementActions.click(ClickTo2BTN);

        return this;
    }
}
