package com.application.weatherapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        WeatherModel model = new WeatherModel();
        WeatherView view = new WeatherView();
        new WeatherController(model, view);
        Scene scene = new Scene(view.getView(), 300, 200);
        scene.getStylesheets().add((Objects.requireNonNull(getClass().getResource("/styles.css"))).toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}