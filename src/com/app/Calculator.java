package com.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Calculator extends Application {

    String operator = "";
    double num1 = 0;

    @Override
    public void start(Stage stage) {

        TextField display = new TextField();
        display.setEditable(false);

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");

        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button equal = new Button("=");
        Button clear = new Button("C");

        b1.setOnAction(e -> display.appendText("1"));
        b2.setOnAction(e -> display.appendText("2"));
        b3.setOnAction(e -> display.appendText("3"));
        b4.setOnAction(e -> display.appendText("4"));
        b5.setOnAction(e -> display.appendText("5"));
        b6.setOnAction(e -> display.appendText("6"));
        b7.setOnAction(e -> display.appendText("7"));
        b8.setOnAction(e -> display.appendText("8"));
        b9.setOnAction(e -> display.appendText("9"));
        b0.setOnAction(e -> display.appendText("0"));

        add.setOnAction(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "+";
            display.clear();
        });

        sub.setOnAction(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "-";
            display.clear();
        });

        mul.setOnAction(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "*";
            display.clear();
        });

        div.setOnAction(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "/";
            display.clear();
        });

        equal.setOnAction(e -> {
            double num2 = Double.parseDouble(display.getText());
            double result = 0;

            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    display.setText("Error");
                    return;
                }
            }

            display.setText(String.valueOf(result));
        });

        clear.setOnAction(e -> display.clear());

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);


        grid.setStyle("-fx-background-color: skyblue;");

        grid.add(display, 0, 0, 4, 1);

        grid.add(b1, 0, 1);
        grid.add(b2, 1, 1);
        grid.add(b3, 2, 1);
        grid.add(add, 3, 1);

        grid.add(b4, 0, 2);
        grid.add(b5, 1, 2);
        grid.add(b6, 2, 2);
        grid.add(sub, 3, 2);

        grid.add(b7, 0, 3);
        grid.add(b8, 1, 3);
        grid.add(b9, 2, 3);
        grid.add(mul, 3, 3);

        grid.add(clear, 0, 4);
        grid.add(b0, 1, 4);
        grid.add(equal, 2, 4);
        grid.add(div, 3, 4);

        Scene scene = new Scene(grid, 300, 300);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}