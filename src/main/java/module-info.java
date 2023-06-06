module com.application.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.application.weatherapp to javafx.fxml, com.google.gson;
    exports com.application.weatherapp;
}