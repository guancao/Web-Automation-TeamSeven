package home.menu;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomeMenuPage extends CommonAPI {
    @FindBy(how=How.ID, using="nav")
    List<WebElement> menuItemList;

}
