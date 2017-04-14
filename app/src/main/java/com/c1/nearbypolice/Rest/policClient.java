package com.c1.nearbypolice.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by anant bansal on 4/13/2017.
 */

public class policClient {

    public policeInterface getClient() {
        String BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(policeInterface.class);
    }

//    public policeInterface2 getClient1()
//    {
//        String BASE_URL1="https://maps.googleapis.com/maps/api/place/details/json?";
//
//        Retrofit retrofit1 = new Retrofit.Builder()
//                .baseUrl(BASE_URL1)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        return retrofit1.create(policeInterface2.class);
//
//
//    }
}
