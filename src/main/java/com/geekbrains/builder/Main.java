package com.geekbrains.builder;

import com.geekbrains.apiHomeWork.*;
import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        // USER connect
        SpoonaccularService spoonaccularService = new SpoonaccularService();
        ApiUserConnectResult rez = spoonaccularService.connect(new ApiUserConnectRequest());
        System.out.println(rez);

        // ADD To Shopping List
        ApiSearchResult added = spoonaccularService.addToShoppingList();
        System.out.println(added);

        // GET To Shopping List
        ApiGetResult getResult = spoonaccularService.getShoppingList();
        System.out.println(getResult);

        //Delete Shopping List
        ApiGetResult del = spoonaccularService.deleteShoppingList();
        System.out.println(del);

    }
}


