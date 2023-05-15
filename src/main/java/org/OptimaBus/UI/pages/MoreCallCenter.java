package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreCallCenter extends BasePage {



    @FindBy(xpath = ".//a[@class='nav-item'][5]")
     public WebElement ClickTo6BTN;









    public MoreCallCenter BTN6(){
        elementActions.click(ClickTo6BTN);

        return this;
    }






}
