package com.company;

import com.company.Trip;

import java.security.PrivateKey;
import java.util.ArrayList;

public class SkiTrip extends Trip {
    private Boolean skiRent;
    private String hotelname;

    public SkiTrip(String co, Integer du, Integer pa, Boolean tr, Boolean sk, String ho){
        super(co, du, pa, tr);
        skiRent = sk;
        hotelname = ho;
    }
}
