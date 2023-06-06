package com.application.weatherapp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import com.google.gson.Gson;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherController {
    private static final String API_KEY = "YOUR_API_KEY";
    private WeatherModel model;
    private WeatherView view;

    public WeatherController(WeatherModel model, WeatherView view) {
        this.model = model;
        this.view = view;

        setupHandlers();
    }

    private double[] getLatandLon(String city) throws Exception {
        String urlString = "http://api.openweathermap.org/geo/1.0/direct?q="+city+"&limit=1&appid="+API_KEY;

        URL url;
        url = new URL(urlString);
        HttpURLConnection conn;
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        String output;
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        double[] latandlong = new double[2];
        while (true) {
            if ((output = reader.readLine()) == null) break;
            System.out.println(output);
            Gson gson = new Gson();
            Location[] locations = gson.fromJson(output, Location[].class);
            System.out.println(Arrays.toString(locations));
            for (Location location : locations) {
                latandlong[0] = location.getLat();
                latandlong[1] = location.getLon();
            }
        }
        return latandlong;
    }

    private WeatherData getWeatherData(double lat, double lon) throws Exception{
        String urlString = "https://api.openweathermap.org/data/3.0/onecall?lat="+lat+"&lon="+lon+"&units=metric&exclude=minutely,hourly,daily&appid="+API_KEY;

        URL url;
        url = new URL(urlString);
        HttpURLConnection conn = null;
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        String output;
        BufferedReader reader;
        WeatherData weather = new WeatherData();
        reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while (true) {
            if ((output = reader.readLine()) == null) break;
            System.out.println(output);
            Gson gson = new Gson();
            WeatherData data = gson.fromJson(output, WeatherData.class);
            weather.setCurrent(data.getCurrent());
        }
        return weather;
    }

    private ImageView getIcon(WeatherData weatherData){
        Image image = new Image("https://openweathermap.org/img/wn/"+weatherData.getCurrent().getWeather().get(0).getIcon()+"@2x.png");
        return  new ImageView(image);
    }
    private void setupHandlers() {
        view.getGetWeatherButton().setOnAction(e -> {
            String city = view.getCityField().getText();
            WeatherData weather;
            // Here you'd make the API request and update the model with the data
            // For the example, we'll just set the temperature to a fixed value

            try {
                double[] latandlong = getLatandLon(city);
                weather= getWeatherData(latandlong[0],latandlong[1]);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            view.getWeatherLabel().setGraphic(getIcon(weather));
            model.setWeather(weather.getCurrent().getWeather().get(0).getDescription() + "\n" + Math.round(weather.getCurrent().getTemp()) + "°C" + '\n' + Math.round(weather.getCurrent().getWindSpeed()*3.6) + "km/h");
        });

        model.weatherProperty().addListener((obs, oldTemperature, newTemperature) ->
                view.getWeatherLabel().setText(newTemperature)
        );

    }
}
