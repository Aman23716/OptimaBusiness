package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class More extends BasePage {
    @FindBy(xpath = "//a[@href='/more']")
    public WebElement moreBtn;

    public More clickMoreBtn(){
        elementActions.click(moreBtn);
        return this;
    }
}
