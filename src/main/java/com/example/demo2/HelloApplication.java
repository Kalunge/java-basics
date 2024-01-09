package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        primitive
        int age = 30;
//        age = 35;
//        int temperature = 28;
//        double price = 10.99;
//        float secondPrice = 23.44F;
//        char letter = 'A';
//        boolean isHome = true;

//        reference type
        Date today = new Date();

        System.out.println("Heloooo world " + today);
    }
}