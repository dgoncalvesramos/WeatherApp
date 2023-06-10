package com.application.weatherapp;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class WeatherData {
    private double lat;
    private double lon;
    private String timezone;
    @SerializedName("timezone_offset")
    private int timezoneOffset;
    private Current current;
    private List<Alert> alerts;

    // getters et setters...

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    public static class Current {
        private long dt;
        private long sunrise;
        private long sunset;
        private double temp;
        @SerializedName("feels_like")
        private double feelsLike;
        private int pressure;
        private int humidity;
        @SerializedName("dew_point")
        private double dewPoint;
        private double uvi;
        private int clouds;
        private int visibility;
        @SerializedName("wind_speed")
        private double windSpeed;
        @SerializedName("wind_deg")
        private int windDeg;
        @SerializedName("wind_gust")
        private double windGust;
        private List<Weather> weather;

        // getters et setters...

        public long getDt() {
            return dt;
        }

        public void setDt(long dt) {
            this.dt = dt;
        }

        public long getSunrise() {
            return sunrise;
        }

        public void setSunrise(long sunrise) {
            this.sunrise = sunrise;
        }

        public long getSunset() {
            return sunset;
        }

        public void setSunset(long sunset) {
            this.sunset = sunset;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(double feelsLike) {
            this.feelsLike = feelsLike;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public double getUvi() {
            return uvi;
        }

        public void setUvi(double uvi) {
            this.uvi = uvi;
        }

        public int getClouds() {
            return clouds;
        }

        public void setClouds(int clouds) {
            this.clouds = clouds;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public int getWindDeg() {
            return windDeg;
        }

        public void setWindDeg(int windDeg) {
            this.windDeg = windDeg;
        }

        public double getWindGust() {
            return windGust;
        }

        public void setWindGust(double windGust) {
            this.windGust = windGust;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }
    }

    public static class Weather {
        private int id;
        private String main;
        private String description;
        private String icon;
        // getters et setters...

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class Alert {
        private String sender_name;
        private String event;
        private long start;
        private long end;
        private String description;
        private List<String> tags;

        public String getSender_name() {
            return sender_name;
        }

        public void setSender_name(String sender_name) {
            this.sender_name = sender_name;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public long getStart() {
            return start;
        }

        public void setStart(long start) {
            this.start = start;
        }

        public long getEnd() {
            return end;
        }

        public void setEnd(long end) {
            this.end = end;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
    }
}