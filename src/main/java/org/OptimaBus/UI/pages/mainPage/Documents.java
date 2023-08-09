package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Documents extends BasePage {
    @FindBy(xpath = ".//a[@class='router-link-active router-link-exact-active nav-item active']")
    public WebElement documentsBtnOnMain;
    @FindBy(xpath = "//h3[contains(text(), 'Документы')]")
    public WebElement documentsTextOnDocPAge;
    @FindBy(xpath = "//div[contains(text(), 'Выписки')]")
    public WebElement statementsBtnOnDocPAge;
    @FindBy(xpath = "//a[@class='q-tab relative-position self-stretch flex flex-center text-center q-tab--inactive q-tab--no-caps q-focusable q-hoverable cursor-pointer']")
    public WebElement requisitesBtnOnDocPAge;
    @FindBy(xpath = "//div[contains(text(),'Реквизиты ')]")
    public WebElement requisitesText;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[1]")
    public WebElement formStatementsBtnOnDocPage;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[1]")
    public WebElement bellNotifBtnOnDocPage;
    @FindBy(xpath = "(//th[@class='text-left'])[1]")
    public WebElement numberOfAccountText;
    @FindBy(xpath = "(//th[@class='text-left'])[2]")
    public WebElement periodOfStatementText;
    @FindBy(xpath = "(//th[@class='text-left'])[3]")
    public WebElement statusOfStatementText;
    @FindBy(xpath = "(//th[@class='text-left'])[4]")
    public WebElement dateOfApplicationText;


    @FindBy(xpath = "(//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[1]")
    public WebElement accountInputField;
    @FindBy(xpath = "(//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[2]")
    public WebElement dateFromInputField;
    @FindBy(xpath = "(//div[@class='q-field__append q-field__marginal row no-wrap items-center'])[1]")
    public WebElement checkAccountIcon;
    @FindBy(xpath = "(//div[@class='q-field__append q-field__marginal row no-wrap items-center q-anchor--skip'])[1]")
    public WebElement goBackAccountIcon;
    @FindBy(xpath = "(//div[@class='q-field__control-container col relative-position row no-wrap q-anchor--skip'])[2]")
    public WebElement currencyInputField;
    @FindBy(xpath = "(//div[@class='q-field__append q-field__marginal row no-wrap items-center'])[2]")
    public WebElement checkCurrencyIcon;
    @FindBy(xpath = "(//button[@class='q-icon notranslate material-icons q-field__focusable-action'])[2]")
    public WebElement goBackCurrencyIcon;
    @FindBy(xpath = "(//div[@class='flex justify-center items-center cursor-pointer q-ml-xs'])[1]")
    public WebElement dateFromCalendarIcon;
    @FindBy(xpath = "(//div[@class='flex justify-center items-center cursor-pointer q-ml-xs'])[2]")
    public WebElement dateUpToCalendarIcon;
    @FindBy(xpath = "(//input[@class='q-field__native q-placeholder'])[2]")
    public WebElement dateUpToInputField;
    @FindBy(xpath = "//span[contains(text(),'Сегодня')]")
    public WebElement todayBtn;
    @FindBy(xpath = "//span[contains(text(),'Вчера')]")
    public WebElement yesterdayBtn;
    @FindBy(xpath = "//span[contains(text(),'Неделя')]")
    public WebElement weekBtn;
    @FindBy(xpath = "//span[contains(text(),'Месяц')]")
    public WebElement monthBtn;
    @FindBy(xpath = "(//span[contains(text(),'Сформировать выписку')])[2]")
    public WebElement formStatements2Btn;
    @FindBy(xpath = "//p[contains(text(),'Запрос на формирование выписки принят в обработку')]")
    public WebElement requestToFormStatementText;
    @FindBy(xpath = "//p[contains(text(),'Запрос на формирование выписки принят в обработку')]")
    public WebElement closeToFormStatementBtn;
    @FindBy(xpath = "(//span[contains(text(),'Выписка сформирована')])[1]")
    public WebElement formedStatementText;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[2]")
    public WebElement formedStatementPdfFile;
    @FindBy(xpath = "(//span[@class='q-btn__content text-center col items-center q-anchor--skip justify-center row'])[3]")
    public WebElement formedStatementXlsFile;
    @FindBy(xpath = "(//span[@class='status-table status-muted'])[1]")
    public WebElement noStatementsForThePeriodText;
    @FindBy(xpath = "//a[@id='DOWNLOAD']")
    public WebElement downloadPdfFileRequisites;
    @FindBy(xpath = "//a[@id='OPEN']")
    public WebElement openPdfFileRequisites;
    @FindBy(xpath = "//div[@class='q-menu q-position-engine scroll']")
    public List<WebElement> chooseCurrency;


    public Documents openDocumentsPage() {
        elementActions.click(documentsBtnOnMain);
        return this;
    }
//    public void () {
//        elementActions.click(chooseCompany);
//        for (WebElement list1 : chosenAutoKurier) {
//            System.out.println(list1);
//            if (list1.getText().equals("Общество с ограниченной ответственностью \"АВТОКУРЬЕР\"")) {
//                list1.click();
////                if (list1.getText().equals(ConfigReader.getProperty("CompName"))){
////                    list1.click();
////
//            }
//        }
//    }
    public Documents formStatement() {
        openDocumentsPage();
        elementActions.click(formStatementsBtnOnDocPage);
        elementActions.click(checkAccountIcon);
        elementActions.click(checkCurrencyIcon);
        javaScriptExecutor.jsScrollToEnd();

return this;


    }


}
