package com.c1.nearbypolice.Rest;

import com.c1.nearbypolice.Model.PoliceList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by anant bansal on 4/13/2017.
 */

public interface policeInterface {

//    @GET("location={lati},{longi}&radius=2000&type=police&key=AIzaSyA5QLmj31E4iiIr3DMBnngyFZ7t1jygDJs")
//    Call<PoliceList> getList(@Path("lati") float lati,@Path("longi") float longi);

    @GET("json?location=28.6305287,77.3721671&radius=2000&type=police&key=AIzaSyA5QLmj31E4iiIr3DMBnngyFZ7t1jygDJs")
    Call<PoliceList> getList();
}
