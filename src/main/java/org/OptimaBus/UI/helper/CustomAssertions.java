package org.OptimaBus.UI.helper;

import lombok.experimental.Helper;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class CustomAssertions {


    ScreenShotMethods screenShotMethods = new ScreenShotMethods();




    public void asserText(String expectedText, WebElement actualElement, String asMassage){
        WebElementActions.waitForElementVisibilityOf(actualElement);
        Assert.assertEquals(expectedText,WebElementActions.getTextValue(actualElement), "Comparing" + asMassage);
        if (!WebElementActions.getTextValue(actualElement).equals(expectedText)){
            try {
                screenShotMethods.takeScreenShot();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


}
