package com.Challenge;

import com.Challenge.Exchange.Exchange;
import com.Challenge.Menu.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String money="";

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Welcome to  the  Converison tool");
        System.out.println("**********************************************************************");

        Menu menu = new Menu();
        Menu menu1 = menu;
        menu1.menuSelection();
        Exchange exchange = new Exchange();








    }
}