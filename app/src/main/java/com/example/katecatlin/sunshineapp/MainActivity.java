package com.example.katecatlin.sunshineapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

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

            ArrayList<Forecast> weekForecast = new ArrayList<Forecast>();

            weekForecast.add(new Forecast("Today", "Partly Cloudy", 59, 39));
            weekForecast.add(new Forecast("Tomorrow", "Partly Cloudy", 57, 37));
            weekForecast.add(new Forecast("Sunday", "Cloudy", 57, 52));
            weekForecast.add(new Forecast("Monday", "Chance of Storm", 61, 52));
            weekForecast.add(new Forecast("Tuesday", "Chance of Rain", 64, 45));
            weekForecast.add(new Forecast("Wednesday", "Cloudy", 52, 37));
            weekForecast.add(new Forecast("Thursday", "Clear", 59, 45));

            ArrayAdapter<Forecast> forecastAdapter =
                    new ArrayAdapter<Forecast>(
                            getActivity(), // The current context (this activity)
                            R.layout.list_item_forecast, // The name of the layout ID.
                            R.id.list_item_forecast_textview, // The ID of the textview to populate.
                            weekForecast);
            //Inside ArrayAdapter there's a method called GetView - create a new class and call it ForecastAdapter

            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(forecastAdapter);

            return rootView;
        }
    }

}
