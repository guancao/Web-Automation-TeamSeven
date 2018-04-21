package menu.page;

import base.CommonAPI;

import java.util.List;

public class MenuPage extends CommonAPI{

    public void readMenuText(){
        List<String> menu =  getTextLists(".nav-search-dropdown.searchSelect option");
        for(String text:menu) {
            System.out.println(text);
        }
    }


}
