package com.application.weatherapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        WeatherModel model = new WeatherModel();
        WeatherView view = new WeatherView();
        new WeatherController(model, view);

        primaryStage.setScene(new Scene(view.getView(), 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}