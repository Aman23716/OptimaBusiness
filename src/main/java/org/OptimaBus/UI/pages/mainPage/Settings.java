package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**  Zhyldyz123    **/
public class Settings extends BasePage {
    @FindBy(xpath = "//a[@href='/settings/information']")
    public WebElement settingsBtn;


   public Settings clickSettingsBtn(){
       elementActions.click(settingsBtn);
       return this;
   }
}
