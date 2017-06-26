package com.example.corjan.weatherapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.text.format.Time;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherView extends AppCompatActivity {
    String cityName;
    String name;
    EditText textId;
    String jsonString;
    JSONObject jsonObject;
    JSONArray jsonArray;
    final String jsonList = "list";
    final String jsonTempData = "main";
    final String jsonTemperature = "temp";
    final String jsonMax = "temp_max";
    final String jsonMin = "temp_min";
    public  List<String> weekForcast;
    public ListView listView;
    public ArrayAdapter forcastAdapter;
    public TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_view);
        /**
         * Extracts the Json string obtained in the main activity
         */
        Intent intent = getIntent();
        jsonString = intent.getStringExtra("JsonString");

        /**
         * Initialises all the various views
         */
        listView = (ListView) findViewById(R.id.listview);
        textName = (TextView) findViewById(R.id.name);
        weekForcast = new ArrayList<String>();
        WeatherExtract extract = new WeatherExtract();
        extract.execute();
        forcastAdapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item,
                weekForcast
        );

    }

    /**
     * This method is used to sort the data obtained from the user.
     * The data is sorted off the main thread as sorting large data sets
     * could potentially clutter the main thread.
     */
    public class WeatherExtract extends AsyncTask<Void, Void, Void>{
        protected Void doInBackground(Void... params){
            try {
                //Converts the json String obtained from the Weather app and converts it to a Json String
                jsonObject = new JSONObject(jsonString);
                name=(jsonObject.getJSONObject("city").getString("name")) ;
                jsonArray = jsonObject.getJSONArray(jsonList);

                Time dayTime = new Time();

                //get the current time and converts that time into julian time of the device because the first object in the json array is the current day and each object is one day after that.
                dayTime.setToNow();
                int julianStartDay = Time.getJulianDay(System.currentTimeMillis(), dayTime.gmtoff);
                dayTime = new Time();

                //Clears the List array containing the data for the current weather, so new information can be populated into the listarray.
                weekForcast.clear();
                for(int i=0;i<jsonArray.length();i++){
                    // Temporary variables used to compute the data
                    String day;
                    String resultString;
                    double min;
                    double max;
                    long dayTimeCurrentLong;

                    //Gets the Json object containing the weather for that day.
                    JSONObject dayForcast = jsonArray.getJSONObject(i);

                    //Determines the current date and day of the week each object is affiliated with
                    dayTimeCurrentLong = dayTime.setJulianDay(julianStartDay+i);
                    day = timeFormater(dayTimeCurrentLong);

                    //This is used to extract the data regarding the temperature
                    JSONObject tempertureData =dayForcast.getJSONObject(jsonTempData);
                    min = tempertureData.getDouble(jsonMin);
                    max = tempertureData.getDouble(jsonMax);

                    //Formats and add the data into the weekForcast array. So it can be displayed on the screen.
                    resultString = day+"\nMax: "+max+"°C\nMin: "+min+"°C";
                    weekForcast.add(resultString);
                }

            } catch (JSONException e) {
                //log any error messages with regards to reading the JSON file
                Log.e("json", e.getMessage(), e);
            }
            return null;
        }

        /**
         * This sets the text and adapter after the json string data has been filtered and formated
         */
        protected void onPostExecute(Void response) {
            textName.setText(name);
            listView.setAdapter(forcastAdapter);

        }
        /**
         * Takes varial of time generated by the dayTime object and formates the date in week day, month and day of the month
         * @param time
         * @return
         */
        private String timeFormater(long time){
            SimpleDateFormat formatedDate = new SimpleDateFormat("EEE MMM dd");
            return formatedDate.format(time);
        }
    }





}
