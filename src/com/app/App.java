package com.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage)   {

        // First scene
        VBox firstBox = new VBox(10);
        firstBox.setStyle("-fx-alignment: center;");

        Text firstQues = new Text("What is your name?");
        TextField firstAns = new TextField();
        firstAns.setPromptText("answer the first question");
        Button submit = new Button("SUBMIT");

        firstBox.getChildren().addAll(firstQues, firstAns, submit);
        Scene firstScene = new Scene(firstBox, 400, 300);

        // Second scene
        VBox secondBox = new VBox(10);
        secondBox.setStyle("-fx-alignment: center;");

        Text secondQues = new Text("What is your id?");
        TextField secondAns = new TextField();
        secondAns.setPromptText("answer the second question");
        Button submitButton2 = new Button("SUBMIT");
        Button back = new Button("BACK");

        secondBox.getChildren().addAll(secondQues, secondAns, submitButton2, back);
        Scene secondScene = new Scene(secondBox, 400, 300);

        // Third scene
        VBox thirdBox = new VBox(10);
        thirdBox.setStyle("-fx-alignment: center;");

        Text thirdQues = new Text("What is your department?");
        TextField thirdAns = new TextField();
        thirdAns.setPromptText("answer the third question");
        Button submitButton3 = new Button("SUBMIT");
        Button back3 = new Button("BACK");

        thirdBox.getChildren().addAll(thirdQues, thirdAns, submitButton3, back3);
        Scene thirdScene = new Scene(thirdBox, 400, 300);

        // Final scene
        VBox finalBox = new VBox(10);
        finalBox.setStyle("-fx-alignment: center;");

        Text congrats = new Text("Congrats!");
        Button retry = new Button("RETRY");

        finalBox.getChildren().addAll(congrats, retry);
        Scene finalScene = new Scene(finalBox, 400, 300);

        // Stage setup
        stage.setScene(firstScene);
        stage.setTitle("Stage");
        stage.show();

        // Actions
        submit.setOnAction(e -> {
            if (firstAns.getText().equalsIgnoreCase("udoy")) {
                stage.setScene(secondScene);
            } else {
                System.out.println("Wrong name");
            }
        });

        submitButton2.setOnAction(e -> {
            if (secondAns.getText().equals("20")) {
                stage.setScene(thirdScene);
            } else {
                System.out.println("Wrong id");
            }
        });

        submitButton3.setOnAction(e -> {
            if (thirdAns.getText().equalsIgnoreCase("cse")) {
                stage.setScene(finalScene);
            } else {
                System.out.println("Wrong dept");
            }
        });

        back.setOnAction(e -> {
            stage.setScene(firstScene);
            firstAns.clear();
        });

        back3.setOnAction(e -> {
            stage.setScene(secondScene);
            thirdAns.clear();
        });

        retry.setOnAction(e -> {
            stage.setScene(firstScene);
            firstAns.clear();
            secondAns.clear();
            thirdAns.clear();
        });
    }

    public static void main(String[] args) {
        launch();
    }
}