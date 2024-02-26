package PageObjects;
import BrowserControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class DropDownpage extends WebConnector{


        private String dropdownXpath ="//select[@class='product_sort_container']";


      public void clickondropdown(){
          BasePage.findElementByXpath(10,dropdownXpath).click();
      }



        public void setDropdownoptionselectedXpath(String option){
            WebElement dropdown= BasePage.findElementByXpath(10,dropdownXpath);
            Select select=new Select(dropdown);
            select.selectByVisibleText(option);
        }

    }

