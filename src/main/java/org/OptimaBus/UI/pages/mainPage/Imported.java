package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Imported extends BasePage {
    @FindBy(xpath = "//a[@href='/imported']")
    public WebElement importedBtn;


    public Imported clickImportedBtn(){
        elementActions.click(importedBtn);
        return this;
    }
}
