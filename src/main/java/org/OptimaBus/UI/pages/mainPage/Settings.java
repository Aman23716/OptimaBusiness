package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**  Zhyldyz123    **/
public class Settings extends BasePage {

    /**INFORMATION**/
    @FindBy(xpath = "//a[@href='/settings/information']")
    public WebElement settingsBtn;

    /**PAYCONTROL**/
    @FindBy(xpath = "(.//div[@class='q-tab__content self-stretch flex-center relative-position q-anchor--skip non-selectable column tabs-link'])[2]")
    public WebElement payControlBTN;

    /**VISIBILITY**/
    @FindBy(xpath = "(.//div[@class='q-tab__content self-stretch flex-center relative-position q-anchor--skip non-selectable column tabs-link'])[3]")
    public WebElement visibilityOfSchetBTN;
    /**PASSCHANGE**/

    @FindBy(xpath = "(.//div[@class='q-tab__content self-stretch flex-center relative-position q-anchor--skip non-selectable column tabs-link'])[4]")
    public WebElement changePassBTN;
    /**NUMBERCHANGE**/

    @FindBy(xpath = "(.//div[@class='q-tab__content self-stretch flex-center relative-position q-anchor--skip non-selectable column tabs-link'])[5]")
    public WebElement changeNumberBTN;














    public Settings clickSettingsBtn(){
       elementActions.click(settingsBtn);
       return this;
   }

}
