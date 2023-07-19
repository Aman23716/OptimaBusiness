package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Staff extends BasePage {

    @FindBy(xpath = "//a[@class='nav-item'][3]")
    public WebElement ClickTo4BTN;




    public Staff BTN4(){
        elementActions.click(ClickTo4BTN);

        return this;
    }


}
