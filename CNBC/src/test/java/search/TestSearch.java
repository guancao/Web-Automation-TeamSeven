package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends SearchPage {

    @Test
    public void test() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItems();
    }

    @Test
    public void search(){
        typeOnCss("//input[contains(@placeholder,'Search Quotes, News & Video')]","trade war");
        clickOnCss("//i[@class='fa fa-search fa-2']");
    }
}
