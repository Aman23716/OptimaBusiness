package org.OptimaBus.UI.pages.mainPage;

import org.OptimaBus.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employees extends BasePage {
    @FindBy (xpath ="//a[@href='/employees'] ")
     public WebElement employeesBtn;







    public Employees clickEmployeesBtn(){
        elementActions.click(employeesBtn);
        return this;
    }
}

