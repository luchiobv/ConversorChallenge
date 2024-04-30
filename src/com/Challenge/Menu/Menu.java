package com.Challenge.Menu;

import com.Challenge.Connection.Connection;
import com.Challenge.Connection.UrlConnection;
import com.Challenge.Exchange.Exchange;
import com.Challenge.Exchange.ExchangeApi;
import com.Challenge.FileGenerator.FileGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public int option = 0;
    public static String money = "";
    public String menu = (""" 
             ****************
             Seleccione una opcion: 
             1. USD Dolar »» ARS Argentine Peso
             2. ARS Argentine Peso »» USD Dolar
             3. USD Dolar  »»  BRL Brazilian Real
             4. BRL Brazilian Real »» USD Dolar
             5. USD Dolar  »»  COP Colombian peso
             6. COP Colombian peso »» USD Dolar
             7. Exit
            ****************
             """);


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
//to string for my menu
    @Override
    public String toString() {
        return menu.toString();
    }

    FileGenerator generator = new FileGenerator();
    ArrayList <Exchange> exchangeList= generator.callList();



    public void menuSelection() throws IOException, InterruptedException {
        Connection connection = new Connection();
        UrlConnection urlconnection = new UrlConnection();



        while (option != 7) {
            System.out.println(menu);
            var selection = sc.nextLine();
            option = Integer.parseInt(selection);
            switch (option) {
                case 1:
                    option = 1;
                    System.out.println("Please enter the amount you want to convert: ");
                    var amount = sc.nextLine();
                    money = "/USD/ARS/" + amount;
                    Connection connection1 = new Connection();
                    //Create the  connection and send the  information to pair and the amount
                    Exchange exchange = connection1.ConnectionRequest(getMoney());
                    //Create the list for the array
                    generator.callList().add(exchange);
                    //send the data to the file generator
                    generator.saveJson(getExchangeList());
                    //Test to prove the adition for the URL address
                    //System.out.println(Menu.money);
                    //Test to get  the  address on the API
                    // System.out.println(connection1.getAddress());
                    //final print for the money exchange
                    System.out.println(exchange);

                    break;

                case 2:
                    System.out.println("Please enter the amount you want to convert: ");
                    amount = sc.nextLine();
                    money = "/ARS/USD/" +  amount;
                    //Create the  connection and send the  information to pair and the amount
                    Connection connection2 = new Connection();
                    Exchange exchange1 = connection2.ConnectionRequest(getMoney());
                    //Create the list for the array
                    generator.callList().add(exchange1);
                    //send the data to the file generator
                    generator.saveJson(getExchangeList());
                    //Test to prove the adition for the URL address
                    //System.out.println(Menu.money);
                    //Test to get  the  address on the API
                    // System.out.println(connection1.getAddress());
                    //final print for the money exchange
                    System.out.println(exchange1);

                    break;
                case 3:
                    System.out.println("Please enter the amount you want to convert: ");
                    amount = sc.nextLine();
                    money = "/USD/BRL/" + amount;
                    Connection connection3 = new Connection();
                    Exchange exchange2 = connection3.ConnectionRequest(getMoney());
                    //Create the list for the array
                    generator.callList().add(exchange2);
                    //send the data to the file generator
                    generator.saveJson(getExchangeList());
                    //Test to prove the adition for the URL address
                    //System.out.println(Menu.money);
                    //Test to get  the  address on the API
                    // System.out.println(connection1.getAddress());
                    //final print for the money exchange
                    System.out.println(exchange2);

                    break;
                case 4:
                    System.out.println("Please enter the amount you want to convert: ");
                    amount = sc.nextLine();
                    money = "/BRL/USD/" + amount;
                    Connection connection4 = new Connection();
                    Exchange exchange3 = connection4.ConnectionRequest(getMoney());
                    //Create the list for the array
                    generator.callList().add(exchange3);
                    //send the data to the file generator
                    generator.saveJson(getExchangeList());

                    //Test to prove the adition for the URL address
                    //System.out.println(Menu.money);
                    //Test to get  the  address on the API
                    // System.out.println(connection1.getAddress());
                    //final print for the money exchange
                    System.out.println(exchange3);
                    break;
                case 5:
                    System.out.println("Please enter the amount you want to convert: ");
                    amount = sc.nextLine();
                    money = "/USD/COP/" + amount;
                    Connection connection5 = new Connection();
                    Exchange exchange4 = connection5.ConnectionRequest(getMoney());
                    //Create the list for the array
                    generator.callList().add(exchange4);
                    //send the data to the file generator
                    generator.saveJson(getExchangeList());
                    //Test to prove the adition for the URL address
                    //System.out.println(Menu.money);
                    //Test to get  the  address on the API
                    // System.out.println(connection1.getAddress());
                    //final print for the money exchange
                    System.out.println(exchange4);
                    break;
                case 6:
                    System.out.println("Please enter the amount you want to convert: ");
                    amount = sc.nextLine();
                    money = "/COP/USD/" + amount;
                    Connection connection6 = new Connection();
                    Exchange exchange5 = connection6.ConnectionRequest(getMoney());
                    //Create the list for the array
                    generator.callList().add(exchange5);
                    //send the data to the file generator
                    generator.saveJson(getExchangeList());

                    //Test to prove the adition for the URL address
                    //System.out.println(Menu.money);
                    //Test to get  the  address on the API
                    // System.out.println(connection1.getAddress());
                    //final print for the money exchange
                    System.out.println(exchange5);
                    break;
                case 7:
                    System.out.println("Ending the program. Thank you for using our services");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;

            }


        }
    }

    public ArrayList<Exchange> getExchangeList() {
        return exchangeList;
    }
}



