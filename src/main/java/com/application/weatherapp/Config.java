package com.application.weatherapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private Properties properties;

    public Config() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Désolé, impossible de trouver le fichier de configuration");
                return;
            }

            // charger les properties depuis le fichier de configuration
            properties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
