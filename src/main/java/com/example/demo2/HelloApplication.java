package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
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
//     Java arrays
        int[] numbers = new int[5];
        numbers[0]= 1;
        numbers[2] = 2;

        int[] newNumbers = {1,2,3,4,5};
        System.out.println(newNumbers.length);
        System.out.println(newNumbers);
        System.out.println(Arrays.toString(numbers));
    }
}