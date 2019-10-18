package com.example.motorbike.webservice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WedService {
    private static WedService instance;
    private Retrofit retrofit;
    private ListUserService listUserService;

    private WedService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static WedService getInstance() {
        if (instance == null) {
            instance = new WedService();


        }
        return instance;

    }

    public ListUserService getListUserService() {
        if (listUserService == null) {
           listUserService = retrofit.create(ListUserService.class);
        }
        return listUserService;

    }
}
