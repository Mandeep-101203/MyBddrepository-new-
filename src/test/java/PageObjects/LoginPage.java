package PageObjects;

import BrowserControl.WebConnector;

public class LoginPage extends WebConnector {

    /**********************LOCATORS*******************/
    private String usernameXpath = "//input[@id='user-name']";


    private String PasswordXpath = "//input[@id='password']";

    private String LoginButtonXpath = "//input[@id='login-button']";

    private String AddtocartXpath = "//*[@id=\"remove-sauce-labs-backpack\"]";

    /***************************GETTER&SETTER*****************************/

    public void setUsernameXpath(String Username) {
        BasePage.findElementByXpath(10, usernameXpath).sendKeys(Username);

    }

    public void setPasswordXpath(String password) {
        BasePage.findElementByXpath(10, PasswordXpath).sendKeys(password);
    }

    public void LoginXpath() {
        BasePage.findElementByXpath(10, LoginButtonXpath).click();
    }


}


