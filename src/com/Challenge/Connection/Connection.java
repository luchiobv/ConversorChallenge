package com.Challenge.Connection;

import com.Challenge.Exchange.Exchange;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection extends UrlConnection {
private static String json;
public String response1;

    public String getResponse() {
        return response1;
    }

    public void setResponse(String response) {
        this.response1 = response;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Exchange ConnectionRequest(String money) throws IOException, InterruptedException {





        try {
            URI address = URI.create("https://v6.exchangerate-api.com/v6/8142735e21e6df86291da7b5/pair"+ money);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.valueOf(address)))
                    .build();
            HttpResponse<String> response;

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
            response1=response.body();
            //test to get the json information
            //System.out.println(json);


            return new Gson().fromJson(response.body(),Exchange.class);


        } catch (NullPointerException e) {
            System.err.println("An error occurred NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred IOException: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("An error occurred InterruptedException: " + e.getMessage());
        }

        return new Gson().fromJson(json, Exchange.class);

    }








    }
