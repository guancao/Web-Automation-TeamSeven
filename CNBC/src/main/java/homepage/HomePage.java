package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    //return the menu item information in a list
    public List<String> retrieveMenuTitle(WebDriver driver) throws IOException {
        List<String> menu = new ArrayList<String>();
//        menu = findElemsStringListByXpath(driver, readProperties("menuxpath"));
        menu=getTextLists(driver,"#nav");
        return menu;
    }
    //return the menu item information in a list
    public List<String> retrieveMenuTitle2(WebDriver driver) throws IOException {
        List<String> menu = new ArrayList<String>();
        menu = findElemsStringListByXpath(driver, readProperties("menuxpath"));
 //       menu=getTextLists("#nav");
        return menu;
    }
}
