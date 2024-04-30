package com.Challenge.FileGenerator;

import com.Challenge.Exchange.Exchange;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileGenerator {
    List <Exchange> exchangeList=new ArrayList<Exchange>();
     public ArrayList <Exchange> callList(){
        return (ArrayList<Exchange>) exchangeList;
     }


    public void saveJson (ArrayList<Exchange> exchangeList) throws IOException {


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter write = new FileWriter("exlist.json");
        write.write(gson.toJson(this.exchangeList));
        write.close();
    }
}
