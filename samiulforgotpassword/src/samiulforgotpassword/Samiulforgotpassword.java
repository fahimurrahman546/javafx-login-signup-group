package samiulforgotpassword;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Samiulforgotpassword extends Application {

    private final String ANSWER_UNIVERSITY = "BAUST";
    private final String ANSWER_TOWN = "saidpur";
    private final String ANSWER_ID = "28";

    @Override
    public void start(Stage stage) {
        Label title = new Label("Password Recovery");
        
        ComboBox<String> questionDropdown = new ComboBox<>();
        questionDropdown.getItems().addAll(
            "What is the name of your university?",
            "Which town do you live in?",
            "What is your ID number?"
        );
        questionDropdown.getSelectionModel().selectFirst(); 

        TextField answerField = new TextField();
        answerField.setPromptText("Enter your security answer");

        PasswordField newPasswordField = new PasswordField();
        newPasswordField.setPromptText("Enter New Password");

        PasswordField confirmPasswordField = new PasswordField();
        confirmPasswordField.setPromptText("Confirm New Password");

        Button submitButton = new Button("Submit");
        Label messageLabel = new Label();


        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String selectedQuestion = questionDropdown.getValue();
                String userAnswer = answerField.getText().trim();
                String newPass = newPasswordField.getText();
                String confirmPass = confirmPasswordField.getText();


                if (userAnswer.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty()) {
                    messageLabel.setText("Please fill out all fields.");
                    return;
                }

                if (!newPass.equals(confirmPass)) {
                    messageLabel.setText("Passwords do not match!");
                    return;
                }

                boolean isAnswerCorrect = false;


                if (selectedQuestion.equals("What is the name of your university?") && userAnswer.equalsIgnoreCase(ANSWER_UNIVERSITY)) {
                    isAnswerCorrect = true;
                } else if (selectedQuestion.equals("Which town do you live in?") && userAnswer.equalsIgnoreCase(ANSWER_TOWN)) {
                    isAnswerCorrect = true;
                } else if (selectedQuestion.equals("What is your ID number?") && userAnswer.equalsIgnoreCase(ANSWER_ID)) {
                    isAnswerCorrect = true;
                }


                if (isAnswerCorrect) {
                    messageLabel.setText("Success! Password has been reset.");
                } else {
                    messageLabel.setText("Wrong answer try again.");
                }
            }
        });


        VBox root = new VBox(15);
        root.getChildren().addAll(
            title, questionDropdown, answerField, newPasswordField, confirmPasswordField, submitButton, messageLabel
        );
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Forgot Password Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}