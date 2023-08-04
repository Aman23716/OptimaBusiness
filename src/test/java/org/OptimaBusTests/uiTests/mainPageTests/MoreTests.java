package org.OptimaBusTests.uiTests.mainPageTests;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

/** Zhyldyz123**/
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
        webElementActions.pause(2000);
        more.openHelpBtn();
        more.downloadUsersGuideBtn.click();
//        Assert.assertTrue("");
//    }
//    String downloadFolderPath = "C:\\path\\to\\your\\download\\folder\\";
//
//
//    int timeoutInSeconds = 30;
//    File downloadedFile = waitUntilFileIsDownloaded(downloadFolderPath, timeoutInSeconds);
//
//    // Check if the file was downloaded successfully
//        Assert.assertNotNull(downloadedFile, "PDF file was not downloaded.");
//        Assert.assertTrue(downloadedFile.exists(), "PDF file does not exist in the download folder.");
//        Assert.assertTrue(downloadedFile.isFile(), "Downloaded file is not a valid file.");
    }
}