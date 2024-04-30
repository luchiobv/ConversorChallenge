package com.Challenge.Connection;

import com.Challenge.Menu.Menu;
import com.Challenge.Menu.Menu.*;


public class UrlConnection extends com.Challenge.Menu.Menu {

    //static com.Challenge.Menu.Menu miMenu = new Menu();

    public static String urlChange = Menu.money;


    String address="https://v6.exchangerate-api.com/v6/8142735e21e6df86291da7b5/pair"+Menu.money;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlChange() {
        return urlChange;
    }

    public void setUrlChange(String urlChange) {
        this.urlChange = urlChange;
    }
}