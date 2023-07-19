package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Imports extends BasePage {

    @FindBy(xpath = ".//a[@class='nav-item'][4]")
    public WebElement ClickTo4BTN;




    public Imports BTN5(){
        elementActions.click(ClickTo4BTN);

        return this;
    }


}
