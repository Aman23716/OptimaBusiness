package org.OptimaBus.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase calc-btn lite-shadow q-my-md']")
    public WebElement calcBTN;

    @FindBy(xpath = "(.//div[@class=\"q-field__control relative-position row no-wrap\"])[3]")
    public WebElement VidKursov ;


    @FindBy(xpath = "(.//div[@class='ob-select'])[2]")
    public WebElement clickOnKPK;

    @FindBy(xpath = ".//input[@class='q-field__input']")
    public WebElement inputSum;

    @FindBy(xpath = "(.//div[@class='q-field__control relative-position row no-wrap'])[4]")
    public WebElement clickBtnToChooseCurrent;

    @FindBy(xpath = "(.//div[@class='ob-select'])[1]")
    public WebElement chooseUSD;

    @FindBy(xpath = ".//button")
    public WebElement BTNToEnter;

    @FindBy(xpath = ".//a[@class='router-link-active']")
    public WebElement clickMainBTN;

    @FindBy(xpath = ".//div[@class='logo-wrap']")
    public WebElement MAINBTN;


    @FindBy(xpath = "(.//div[@class='account-header'])[1]")
    public WebElement HUI;

    @FindBy(xpath = ".//a[@class='user-toggle no-caret']")
    public WebElement chooseCompany;

    @FindBy(xpath = ".//button[@class='aside-dropdown-item dropdown-item user-text text-dark'][2]")
    public WebElement chooseUtes;

    @FindBy(xpath = ".//span[@class='company-name']")
    public List<WebElement> chooseAltynken;
    @FindBy(xpath = "(.//span[@class='q-ml-auto'])[1]")
    public WebElement KURSSOM;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--standard q-btn--rectangle bg-primary text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase payment__btn lite-shadow']")

    public WebElement CreateBTN;
    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--actionable q-focusable q-hoverable p-select-header-close q-pa-none']")
    public WebElement ExitBTN;
    @FindBy(xpath = ".//div[@class='rates-calculator__content']")
    public List<WebElement> listOfcurency;

    @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--round q-btn--actionable q-focusable q-hoverable q-btn--dense icon-notification lite-shadow payment__btn']")
    public WebElement BellBtn;
    @FindBy(className = "offline-form-title offline-form-desktop-close")
    public WebElement CloseChatBTN;











    public void checkBellBtn(){
//        if (elementActions.isClickAble(BellBtn)){
        BellBtn.click();

//        }
    }

    public void ChooseDentTrade(){
        elementActions.click(chooseCompany);
        for (WebElement list1 : chooseAltynken){
            System.out.println(list1);
            if (list1.getText().equals("ОсОО \"DentTrade\" (\"ДентТрейд\")")){
                list1.click();
//                if (list1.getText().equals(ConfigReader.getProperty("CompName"))){
//                    list1.click();
//
            }
        }
    }
    public void ChooseImaratStroi(){
        elementActions.click(chooseCompany);
        for (WebElement list1 : chooseAltynken){
            System.out.println(list1);
            if (list1.getText().equals("ОсОО \"Имарат Строй\"")){
                list1.click();
//                if (list1.getText().equals(ConfigReader.getProperty("CompName"))){
//                    list1.click();
//
            }
        }
    }





    public void listOfCurr() {
        for (WebElement list : listOfcurency) {
            System.out.println(list.getText());
            if(list.getText().equals("RUB")) {
                Assert.assertEquals(list.getText(), "RUB");
            }
        }
    }
    public void CreateBTN(){
        elementActions.click(ExitBTN).click(CreateBTN);
    }
    public MainPage GetValueSomSum(){
        KURSSOM.getText();
        return this;
    }
    public MainPage Znacheniya(){
        HUI.getText();
        return this;
    }
    public void chooseKurs(){
        elementActions.click(calcBTN).click(VidKursov).click(clickOnKPK).sendKeysInt(inputSum, mockDataGenerator.generateMockValue());/*.sendKeysInt(inputSum,10000);*/

    }

    public MainPage ChooseCurrent(){
        elementActions.click(clickBtnToChooseCurrent).click(chooseUSD);
        return this;
    }

    public MainPage BTN(){
        elementActions.click(BTNToEnter);
        BTNToEnter.sendKeys("C:\\Users\\Asus\\Pictures\\2023-04-17");

        return this;
    }

    public MainPage clickMNPage(){
        elementActions.click(clickMainBTN);

        return this;
    }
    public MainPage ChooseUtes(){
        elementActions.click(chooseCompany).click(chooseUtes);

        return this;
    }

    public void MAINBTN1(){
        elementActions.click(MAINBTN);

    }




}
