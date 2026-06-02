package com.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Login extends Application {

    @Override
    public void start(Stage stage) {
        Label title=new Label("Login System");
        title.setFont(new Font("Comic Sans MS", 22));
        TextField username = new TextField();
username.setPromptText("Enter Username");
username.setMaxWidth(250);
        
       PasswordField password = new PasswordField();
password.setPromptText("Enter Password");
password.setMaxWidth(250);
Button loginBtn = new Button("Login");
loginBtn.setStyle(
    "-fx-background-color: #007BFF;" +
    "-fx-text-fill: white;" +
    "-fx-background-radius: 8px;"
);
VBox root = new VBox(15);
root.getChildren().addAll(
    title,username,password,loginBtn
);
root.setAlignment(Pos.CENTER);
Scene scene =new Scene(root,400,300);
stage.setTitle("Login System");
stage.setScene(scene);
stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}