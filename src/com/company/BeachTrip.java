package com.company;

import com.company.Trip;

import java.util.ArrayList;

public class BeachTrip extends Trip {
    private Boolean sightSeeing;
    private Boolean sunbed;

    public BeachTrip(String co, Integer du, Integer pa, Boolean tr, Boolean ss, Boolean sb){
        super(co, du, pa, tr);
    sightSeeing = ss;
    sunbed = sb;
    }
}
