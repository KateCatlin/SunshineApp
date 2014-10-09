package com.example.katecatlin.sunshineapp;

/**
 * Created by katecatlin on 10/9/14.
 */
public class Forecast {
    private String day;
    private String weather;
    private int highTemp;
    private int lowTemp;

    public Forecast(String day, String weather, int highTemp, int lowTemp) {
        this.day = day;
        this.weather = weather;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }
}
