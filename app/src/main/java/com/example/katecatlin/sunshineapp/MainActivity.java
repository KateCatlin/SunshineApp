package com.example.katecatlin.sunshineapp;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends Activity {
    private static Forecast forecast1 = new Forecast("Today", "Partly Cloudy", 59, 39);
    private static Forecast forecast2 = new Forecast("Tomorrow", "Partly Cloudy", 57, 37);
    private static Forecast forecast3 = new Forecast("Sunday", "Cloudy", 57, 52);
    private static Forecast forecast4 = new Forecast("Monday", "Chance of Storm", 61, 52);
    private static Forecast forecast5 = new Forecast("Tuesday", "Chance of Rain", 64, 45);
    private static Forecast forecast6 = new Forecast("Wednesday", "Cloudy", 52, 37);
    private static Forecast forecast7 = new Forecast("Thursday", "Clear", 59, 45);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            ForecastArrayList weekForecast = new ForecastArrayList();
            weekForecast.addForecastToList(MainActivity.forecast1);
            weekForecast.addForecastToList(forecast2);
            weekForecast.addForecastToList(forecast3);
            weekForecast.addForecastToList(forecast4);
            weekForecast.addForecastToList(forecast5);
            weekForecast.addForecastToList(forecast6);
            weekForecast.addForecastToList(forecast7);

            return rootView;
        }
    }

}
