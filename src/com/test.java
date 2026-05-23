package com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class test extends Application {

    @Override
    public void start(Stage stage) {

        Button btn = new Button("Hello JavaFX");

        Scene scene = new Scene(btn, 400, 300);

        stage.setTitle("JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}