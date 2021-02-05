package com.company;



public class Trip {

    String country;
    Integer duration;
    Integer participants;
    Boolean transport; //by land = true, by flight = false

    public Trip(String co, Integer du, Integer pa, Boolean tr) {
        country = co;
        duration = du;
        participants = pa;
        transport = tr;
    }
}
