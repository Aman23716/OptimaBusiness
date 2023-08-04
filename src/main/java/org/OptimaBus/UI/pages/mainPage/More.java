package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

/**    Zhyldyz123  **/
public class More extends BasePage {
    @FindBy(xpath = "//a[@href='/more']")
    public WebElement moreBtnOnMainPage;

    @FindBy(xpath = "//h3[@class='q-ma-none header__title']")
    public WebElement moreText;
    @FindBy(xpath = "(//span[@class='more_card_item'])[1]")
    public  WebElement helpBtn;
    @FindBy(xpath = "(//span[@class='more_card_item'])[2]")
    public  WebElement serviceOfSupportBtn;
    @FindBy(xpath = "//span[@class='user-manual__content']")
    public WebElement usersGuideText;
    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--outline q-btn--rectangle text-primary q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase q-ml-md download lite-shadow']")
    public  WebElement downloadUsersGuideBtn;
    @FindBy(xpath = "//a[@href='https://api.whatsapp.com/send?phone=+996 (701) 504 404']")
    public  WebElement whatsAppLinkBtn;
    @FindBy(xpath = "//a[@href='mailto:csonline@optimabank.kg']")
    public  WebElement emailLinkBtn;
    @FindBy(xpath = "(//div[@class='text-dark contacts'])[2]")
    public  WebElement phoneNumbersText;




    public More openHelpBtn(){
        elementActions.click(moreBtnOnMainPage);
        elementActions.click(helpBtn);
        return this;
    }
    public File waitUntilFileIsDownloaded(String downloadFolderPath, int timeoutInSeconds) {
        File[] files = null;
        File downloadedFile = null;
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < timeoutInSeconds * 1000) {
            // Get the list of files in the download folder
            files = new File(downloadFolderPath).listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".pdf")) {
                        downloadedFile = file;
                        break;
                    }
                }
            }

            // If a file is found, exit the loop
            if (downloadedFile != null) {
                break;
            }

            // Wait for a short interval before checking again
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return downloadedFile;
    }
}


