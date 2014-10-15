package com.example.katecatlin.sunshineapp;

/**
 * Created by katecatlin on 10/9/14.
 */
public class Forecast {
    private String todaysString;


    public Forecast(String forecast) {
        this.todaysString = forecast;
    }

    public String getDay() {
        return todaysString;
    }

    public String getTodaysString() { return todaysString;}

}
