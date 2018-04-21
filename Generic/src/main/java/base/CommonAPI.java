package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public List<WebElement> getWebElementList(String locator){
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list;
    }
    public List<String> getTextLists(String locator){
        List<WebElement> elementList = new ArrayList<WebElement>();
        List<String> textList = new ArrayList<String>();
        elementList = driver.findElements(By.cssSelector(locator));
        for(WebElement element:elementList){
            textList.add(element.getText());
        }
        return textList;
    }

}
