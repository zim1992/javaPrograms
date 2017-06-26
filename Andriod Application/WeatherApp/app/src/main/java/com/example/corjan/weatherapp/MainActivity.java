package com.example.corjan.weatherapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * In the main activity the user has the possibility to type a city he wished to search and number of days
 * The window takes the information from the user and filter the data for the forecast using the parameters provided by the user
 */
public class MainActivity extends AppCompatActivity {
    public EditText city;
    private EditText numberOfDays;
    public View progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * The various fields are initialised
         */
        Button searchButton = (Button) findViewById(R.id.searchWeather);
        progressBar =  findViewById(R.id.progressBar);
        city = (EditText) findViewById(R.id.city);
        numberOfDays = (EditText) findViewById(R.id.numberOfDays);

        /**
         * This action is fired when the user clicks the button search
         */
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("City",city.getText().toString()); //test verbose log
                String cityName = city.getText().toString();
                // This to get rid of the spaces which exist before and after the text due to the users input
                cityName = cityName.trim();
                // Passes the city name and the view onto the View
                WeatherData city = new WeatherData(cityName,v);
                //sets the number of days wished to obtain the weather forcast
                city.setDays(numberOfDays.getText().toString());
                //the forcast only available for 35 days so this ensures that the user places 35 or less days into the forcast criteria
                if(Integer.parseInt(city.getDays())<=35){
                    city.execute();
                }else{
                    numberOfDays.setError("The forcast cannot be gathered for days larger than 35. Please type a number lower or equal to 35");
                }

            }
        });
    }

    /**
     * This method creates a new Intent object and attaches the json string to the Intent so the next activity can take the JSON string and display the data
     * @param view - this passes the view
     * @param response - Json string containing the forecast for the searched city.
     */
    protected void displayData(View view,String response){
        Intent intent = new Intent(this,WeatherView.class);
        intent.putExtra("JsonString",response);
        startActivity(intent);
    }

    /**
     * This class is used to gather data from the openweather map site.
     * This is done in the background as gathering data
     * can be quick or extremely quick
     * depending on the data connection with the server
     */
    public class WeatherData extends AsyncTask<Void, Void, String> {
        private Exception exception;
        private String cityName;
        private String days;
        /**
         * The data used to search the values.
         */
        private final String urlT = "http://api.openweathermap.org/data/2.5/forecast?";
        private String apiKey = "598634431e4e04206cae83f03f7dc2c3";
        /**
         * Passes the view onto the background so it can trigger the new screen when the onPostExecute method is triggered.
         */
        private View view;

        /**
         * Constructor
         * @param cityName Name of the city the user wishes to search.
         */
        public WeatherData(String cityName,View view){
            this.cityName = cityName;
            this.view = view;
        }
        public void setDays(String days){
            this.days = days;
        }
        public String getDays(){
            return days;
        }

        /**
         * This method truns on the progress bar and makes it animated
         */
        protected void onPreExecute(){
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
            progressBar.animate();
        }
        /**
         * The method used to gather data from the background         *
         * @return The api response from the openweathermap website
         */
        protected String doInBackground(Void... params){
            try {
                //Opens the Url connection containing the information which should be filtered
                URL url = new URL(urlT+"q="+cityName+"&units=metric&cnt="+days+"&apikey="+apiKey);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                //Sets the url connection to a GET
                urlConnection.setRequestMethod("GET");
                try{
                    //Opens the buffer to read the data coming the from openweathermaps server
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    //appends an end of and charicter to the string
                    while((line=bufferedReader.readLine())!=null){
                        stringBuilder.append(line).append("/n");
                    }
                    //Closes the buffer
                    bufferedReader.close();
                    //returns the result obtained from the server in a form of a string
                    return stringBuilder.toString();
                }finally {
                    //URL connection is closed
                    urlConnection.disconnect();
                }
            }catch (Exception e){
                //if any errors are experienced throughout the messages are logged and a null string is returned
                Log.e("ERROR",e.getMessage(),e);
                return null;
            }
        }

        /**
         * If the response is Null that means the city the user wants to get doesn't exist.
         * @param response - This is the Json string if the user placed a valid name
         */
        protected void onPostExecute(String response){
            progressBar.setVisibility(View.GONE);
            //if an error is encounted during obtaining the data from the server this means that the user typed in an invalid
            if(response==null){
                city.setError("The City/Country is invalid, Please type a valid City Name or Country");
            }else{
                //if there is a json string it starts a new intent for the window to display the data
                displayData(view,response);
            }

        }

    }

}
