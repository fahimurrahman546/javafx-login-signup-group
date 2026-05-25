package com.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage stage) {
        Label title=new Label("Login Page");
        TextField username=new TextField();
        username.setPromptText("Enter Username");
        
        PasswordField password= new PasswordField();
        password.setPromptText("Enter Password");
Button loginBtn = new Button("Login");
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