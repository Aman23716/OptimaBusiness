package org.OptimaBusTests.uiTests.mainPageTests;

import org.OptimaBus.UI.pages.mainPage.More;
import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

/**
 * Zhyldyz123
 **/
public class MoreTests extends BaseUiTests {

    @Test
    public void checkHelpBtn() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        more.openHelpBtn();
        customAssertions.asserText("Руководство пользователя", more.usersGuideText, "norm");
    }
    @Test
    public void checkdownloadFileBtn() {
        webElementActions.refreshPage();
        more.openHelpBtn();
        more.downloadUsersGuideBtn.click();
        String downloadFolderPath = "C:\\Users\\user\\Downloads\\";
        int timeoutInSeconds = 15;
        File downloadedFile = more.waitUntilFileIsDownloaded(downloadFolderPath, timeoutInSeconds);
        SoftAssert asert = new SoftAssert();
        asert.assertEquals(downloadedFile, "PDF file was downloaded.");
        asert.assertTrue(downloadedFile.exists(), "PDF file does not exist in the download folder.");
        asert.assertTrue(downloadedFile.isFile(), "Downloaded file is  a valid file.");
    }
    @Test
    public void supportServiceWhatsApp() {
        webElementActions.refreshPage();
        more.openServiceOfSupportBtn();
        more.whatsAppLinkBtn.click();
        webElementActions.pause(3000);
    }
    @Test
    public void supportServiceEmail() {
        webElementActions.refreshPage();
        more.openServiceOfSupportBtn();
        more.emailLinkBtn.click();
        Assert.assertTrue(more.emailLinkBtn.isDisplayed(), "Email link button is not displayed on the page.");
        webElementActions.pause(1000);
    }

    @Test
    public void checkThePhoneNumbersTexts() {
        webElementActions.refreshPage();
        more.openServiceOfSupportBtn();
        customAssertions.asserText("+996 (312) 670 779\n" +
                "+996 (312) 670 983\n" +
                "+996 (312) 663 633", more.phoneNumbersText, "norm");
        webElementActions.pause(1000);
    }
}
