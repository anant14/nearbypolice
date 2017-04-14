package com.c1.nearbypolice.Model;

/**
 * Created by anant bansal on 4/13/2017.
 */

public class Police {

    private String name;
    private String vicinity;
    private String place_id;

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Police(String name,String vicinity,String place_id)
    {
        this.name=name;
        this.place_id=place_id;
        this.vicinity=vicinity;
    }
}
