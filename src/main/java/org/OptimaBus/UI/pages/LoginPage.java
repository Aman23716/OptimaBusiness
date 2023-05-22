package org.OptimaBus.UI.pages;

import org.OptimaBus.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


  @FindBy(xpath = "(.//input[@class=\"q-field__native q-placeholder\"])[1]")
    public WebElement usernameInput;

  @FindBy(xpath = "(.//input[@class=\"q-field__native q-placeholder\"])[2]")
  public WebElement passwordInput;

  @FindBy(xpath = "(.//span[@class=\"q-btn__content text-center col items-center q-anchor--skip justify-center row no-wrap text-no-wrap\"])[1]")
public WebElement submitLogin;

  @FindBy(xpath = ".//input[@class='form-control']")
  public WebElement inputTOTP;

  @FindBy(xpath = ".//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--unelevated q-btn--rectangle bg-red-9 text-white q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase']")
  public WebElement enterBTN;



  public LoginPage fillUpUsernameAndPass(){
      elementActions.sendKeys(usernameInput, ConfigReader.getProperty("userID"))
              .sendKeys(passwordInput,ConfigReader.getProperty("password")).click(submitLogin)
              .sendKeys(inputTOTP,ConfigReader.getProperty("TOTP")).click(enterBTN);
      return this;
  }

}
