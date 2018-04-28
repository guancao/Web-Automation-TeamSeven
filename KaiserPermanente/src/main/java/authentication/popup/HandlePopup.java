package authentication.popup;

import authentication.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlePopup extends SignInPage{

        @FindBy(css= ".modal-body.trapstart")
        public WebElement whatsNewPopUpWindowWebElement;
        @FindBy( css = "#GotIt")
        public WebElement closeButtonWebElement;

        public WebElement getWhatsNewPopUpWindowWebElement() {
            return whatsNewPopUpWindowWebElement;
        }

        public void setWhatsNewPopUpWindowWebElement(WebElement whatsNewPopUpWindowWebElement) {
            this.whatsNewPopUpWindowWebElement = whatsNewPopUpWindowWebElement;
        }

        public WebElement getCloseButtonWebElement() {
            return closeButtonWebElement;
        }

        public void setCloseButtonWebElement(WebElement closeButtonWebElement) {
            this.closeButtonWebElement = closeButtonWebElement;
        }

        public boolean iswhatsNewPopUpWindowDisplayed(WebDriver driver, String locator){
            boolean value = CommonAPI.isPopUpWindowDisplayed(driver, locator);
            return value;
        }

        public void closePopUpWindow(WebDriver driver)throws InterruptedException{
            //CommonAPI.sleepFor(2);
            if(iswhatsNewPopUpWindowDisplayed(driver,".modal-body.trapstart")) {
                driver.findElement(By.cssSelector("#GotIt")).click();
                //CommonAPI.sleepFor(2);
            }
        }

    }



