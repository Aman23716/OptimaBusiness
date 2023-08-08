package org.OptimaBus.UI.pages.mainPage.employees;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.OptimaBus.UI.driverFactory.Driver.driver;

public class EmployeeIsmailov extends BasePage {
    @FindBy(xpath = ".//p[@class='employee-title']")
    public WebElement ismailovFIOText;

    @FindBy(xpath = "//div/div/div/div/div/div/div[2]/div[1]/div[1]/span")   //span[contains(text(),'2-подпись')
    public WebElement ismailov2PodpisText;
    @FindBy(xpath = "//span[contains(text(),'Номер телефона')]")
    public WebElement ismailovPhoneTitleText;
    @FindBy(xpath = "//span[contains(text(),'996555780893')]")
    public WebElement ismailovPhoneNumberText;
    @FindBy(xpath = "//span[contains(text(),'E-mail')]")
    public WebElement ismailovEmailTitleText;
    @FindBy(xpath = "//span[contains(text(),'ruslan.ismailov@optimabank.kg')]")
    public WebElement ismailovEmailText;
    @FindBy(xpath = "//span[contains(text(),'Роль')]")
    public WebElement ismailovRoleTitleText;
    @FindBy(xpath = "//span[contains(text(),'Право второй подписи')]")
    public WebElement ismailovRoleText;
    @FindBy(xpath = "//span[contains(text(),'Статус')]")
    public WebElement ismailovStatusTitleText;
    @FindBy(xpath = "//span[contains(text(),'Активен')]")
    public WebElement ismailovStatusText;
    @FindBy(xpath = "//span[contains(text(),'Дата регистрации')]")
    public WebElement ismailovDateOfRegisterTitleText;
    @FindBy(xpath = "//span[contains(text(),'26.04.2023')]")
    public WebElement ismailovDateOfRegisterText;
    @FindBy(xpath = "//p[contains(text(),'1090800067210129')]")
    public WebElement ismailovAccountNumber;
    @FindBy(xpath = "//input[@placeholder='Номер счета']")
    public WebElement ismailovInputSearchField;
    @FindBy(xpath = "//span[contains(text(),'Договор 002864-18')]")
    public WebElement ismailovNumberOfContract;
    @FindBy(xpath = "//img")
    public WebElement accountsHiddenIcon;

    //

    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[1]")
    public WebElement ismailovAccountKGS;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[2]")
    public WebElement ismailovAccountUSD;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[3]")
    public WebElement ismailovAccountEUR;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[4]")
    public WebElement ismailovAccountRUB;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[5]")
    public WebElement ismailovAccountKZT;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[6]")
    public WebElement ismailovAccountCNY;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[7]")
    public WebElement ismailovAccountJPY;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[8]")
    public WebElement ismailovAccountGBP;

    @FindBy(xpath = "//div[@class='account__title']")
    public WebElement accountNumberOnPageKGS;

    @FindBy(xpath = "//span[@class='text-muted']")
    public WebElement contractNumberOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[1]")
    public WebElement intraBankTransferOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[2]")
    public WebElement betweenOwnAccountsOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[3]")
    public WebElement convertingOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[4]")
    public WebElement clearingOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[5]")
    public WebElement grossOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle__label q-anchor--skip'])[6]")
    public WebElement accountViewOnPageKGS;

    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[10]")
    public WebElement cancelBtnOnPageKGS;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[10]")
    public WebElement cancelBtnOnPageUSD;

    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[11]")
    public WebElement saveBtnOnPageKGS;

    @FindBy(xpath = "(//div[@class='q-toggle cursor-pointer no-outline row inline no-wrap items-center q-toggle--dense ob-toggle full-width q-mb-md'])[4]")
    public WebElement sWIFTBtn;

    @FindBy(xpath = "//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle text- q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase ob-dialog__button ob-dialog__button_filled']")
    public WebElement goBackBtnIsmailovPage;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[9]")
    public WebElement goBackIconToIsmailovPage;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement backToEmployeesPage;

    public  void clickTheHiddenIcon(){
      if (!accountsHiddenIcon.isDisplayed()) {
          accountsHiddenIcon.click();
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[1]")));
      } else {
          System.out.println("The icon is already open (visible), do not click");

      }
  }

}



