package PageObjects;

import BrowserControl.WebConnector;


public class Addtocartpageobject extends WebConnector {

    private String addCartXpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]";

    private String cartLinkXpath="//*[@id=\"shopping_cart_container\"]/a/span";

    public void addcart() {
        BasePage.findElementByXpath(10,addCartXpath).click();
    }

    public void linkaddtocart(){
        BasePage.findElementByXpath(10,cartLinkXpath).click();
    }
}