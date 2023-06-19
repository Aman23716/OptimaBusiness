package org.OptimaBus.UI.pages;

import org.OptimaBus.UI.dataProvider.ConfigReader;
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



  public LoginPage fillUpUsernameAndPass(){
      elementActions.sendKeys(usernameInput, ConfigReader.getProperty("userID"))
              .sendKeys(passwordInput,ConfigReader.getProperty("password")).click(submitLogin).sendKeys(inputTOTP,ConfigReader.getProperty("TOTP")).click(enterBTN);
      return this;
  }

}
