package com.application.weatherapp;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class WeatherView {
    private TextField cityField = new TextField();
    private Label weatherLabel = new Label();
    private Button getWeatherButton = new Button("Get Weather");
    public Parent getView() {
        VBox vBox = new VBox(cityField, getWeatherButton, weatherLabel);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        return vBox;
    }

    public TextField getCityField() {
        return cityField;
    }

    public void setCityField(TextField cityField) {
        this.cityField = cityField;
    }

    public Label getWeatherLabel() {
        return weatherLabel;
    }

    public void setWeatherLabel(Label weatherLabel) {
        this.weatherLabel = weatherLabel;
    }

    public Button getGetWeatherButton() {
        return getWeatherButton;
    }

    public void setGetWeatherButton(Button getWeatherButton) {
        this.getWeatherButton = getWeatherButton;
    }
}
