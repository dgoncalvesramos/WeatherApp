package com.application.weatherapp;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WeatherModel {
    private StringProperty city = new SimpleStringProperty();
    private StringProperty weather = new SimpleStringProperty();

    // Getters, setters, and properties methods...

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getWeather() {
        return weather.get();
    }

    public StringProperty weatherProperty() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather.set(weather);
    }
}
