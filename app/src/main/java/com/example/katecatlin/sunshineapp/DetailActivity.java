package com.example.katecatlin.sunshineapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.TextView;


public class DetailActivity extends Activity {
    public static final String FORECAST_STRING_EXTRA = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new DetailFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            if (id == R.id.action_settings) {
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            }
        }
//        if (id == R.id.action_refresh) {
//            ForecastFragment forecastfrag = (ForecastFragment) getFragmentManager().findFragmentById(R.id.forecast_fragment);
//
//
//            ForecastFragment.FetchWeatherTask weatherTask = new forecastfrag.FetchWeatherTask();
//            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
//            String location = prefs.getString(getString(R.string.pref_location_key),
//                    getString(R.string.pref_location_default));
//            weatherTask.execute(location);
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class DetailFragment extends Fragment {

//        public DetailFragment() {
//        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

            // The detail Activity called via intent.  Inspect the intent for forecast data.
            Intent intent = getActivity().getIntent();
            if (intent != null && intent.hasExtra(FORECAST_STRING_EXTRA)) {
                String forecastStr = intent.getStringExtra(FORECAST_STRING_EXTRA);
                ((TextView) rootView.findViewById(R.id.detail_text))
                        .setText(forecastStr);
            }

            return rootView;
        }
    }
}