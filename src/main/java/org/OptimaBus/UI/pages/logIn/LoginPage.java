package org.OptimaBus.UI.pages.logIn;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

// Maksat byl tut
  @FindBy(xpath = "(.//input[@class=\"q-field__native q-placeholder\"])[1]")
    public WebElement usernameInput;

  @FindBy(xpath = "(.//input[@class=\"q-field__native q-placeholder\"])[2]")
  public WebElement passwordInput;

  @FindBy(xpath = "(.//span[@class=\"q-btn__content text-center col items-center q-anchor--skip justify-center row no-wrap text-no-wrap\"])[1]")
  public WebElement submitLogin;

  @FindBy(xpath = ".//input[@class='form-control']")
  public WebElement inputTOTP;

  @FindBy(xpath = "(.//button)[2]")
  public WebElement enterBTN;






    @FindBy(xpath = ".//a[@class='user-toggle no-caret']")
    public WebElement chooseCompany1;
    @FindBy(xpath = ".//button[@class='aside-dropdown-item dropdown-item user-text btn-blue']")
    public WebElement exitBTN;





    /**ERROR MASSAGES**/
    @FindBy(xpath = ".//div[@role='alert']")
    public WebElement alerts;
    @FindBy(xpath = ".//p[@class='text-error']")
    public WebElement errorText;



    /**ВСЕ НАДПИСИ НА ЭТАПЕ ВХОДА**/
    @FindBy(xpath = ".//h3[@class='title']")
    public WebElement vhodWord;
    @FindBy(xpath = "(.//div)[9]")
    public WebElement internetBankSentence;
    @FindBy(xpath = ".//div[@class='q-ma-md text-muted text-center']")
    public WebElement captcha;


    /**ПОМОЩЬ**/
    @FindBy(xpath = ".//div[@class='help flex items-center']")
    public WebElement helpBTN;
    @FindBy(xpath = ".//div[@class='title']")
    public WebElement helpWord;
    @FindBy(xpath = ".//div[@class='user-manual__text']//span")
    public WebElement fileWords;
    @FindBy(xpath = ".//DIV[@CLASS='title-contact']")
    public WebElement contactsWord;
    @FindBy(xpath = "(.//div[@class='contacts-details__title'])[1]")
    public WebElement callCentre;
    @FindBy(xpath = "(.//div[@class='contacts-details__title'])[2]")
    public WebElement chatSupport;
    @FindBy(xpath = "(.//div[@class='contacts-details__number'])[1]")
    public WebElement firstNumber;
    @FindBy(xpath = "(.//div[@class='contacts-details__number'])[2]")
    public WebElement secondNumber;
    @FindBy(xpath = "(.//div[@class='contacts-details__number'])[3]")
    public WebElement thirdNumber;
    @FindBy(xpath = "(.//div[@class='contacts-details__number'])[4]")
    public WebElement foursNumber;




  public LoginPage fillUpUsernameAndPass(){
      elementActions.sendKeys(usernameInput, ConfigReader.getProperty("userID"));

      elementActions.sendKeys(passwordInput,ConfigReader.getProperty("password"));

      elementActions.click(submitLogin).sendKeys(inputTOTP,ConfigReader.getProperty("TOTP")).click(enterBTN);
      return this;
  }
  public void LoginWithInvalidId(){
      elementActions.sendKeys(usernameInput,"Words with spaces").sendKeys(passwordInput,ConfigReader.getProperty("password")).click(submitLogin);
  }
  public void LoginWithInvalidPassword(){
      elementActions.sendKeys(usernameInput, ConfigReader.getProperty("userID")).sendKeys(passwordInput,"Invalidpassword").click(submitLogin);
  }
  public void LoginWithEmptyFields(){
    elementActions.click(submitLogin);
  }
  public void HelpBTN(){
    elementActions.click(chooseCompany1).click(exitBTN).click(helpBTN);
  }

}
