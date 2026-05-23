package com.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label dobLabel = new Label("Date of Birth:");
        DatePicker dobPicker = new DatePicker();

        Label genderLabel = new Label("Gender:");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group); ///md g

        Label locationLabel = new Label("Location:");
        ComboBox<String> locationBox = new ComboBox<>();
        locationBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet");

        Button submit = new Button("Submit");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(dobLabel, 0, 1);
        grid.add(dobPicker, 1, 1);

        grid.add(genderLabel, 0, 2);
        grid.add(male, 1, 2);
        grid.add(female, 2, 2);

        grid.add(locationLabel, 0, 3);
        grid.add(locationBox, 1, 3);

        grid.add(submit, 1, 4);

        Scene scene = new Scene(grid, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Registration Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}