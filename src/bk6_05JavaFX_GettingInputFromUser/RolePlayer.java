package com.example.javafx_GettingInputFromUser;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RolePlayer extends Application {
    TextField txtCharacter;
    TextField txtActor;
    TextField txtActorAge;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
// Create the Character →
        Label lblCharacter = new Label("Character's Name:");
        lblCharacter.setMinWidth(100);
        lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Character text field →25
        txtCharacter = new TextField();
        txtCharacter.setMinWidth(200);
        txtCharacter.setMaxWidth(200);
        txtCharacter.setPromptText(
                "Enter the name of the character here.");
// Create the Actor label →32
        Label lblActor = new Label("Actor's Name:");
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Actor text field →37
        txtActor = new TextField();
        txtActor.setMinWidth(200);
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor here.");
// Create the Actor Age label
        Label lblActorAge = new Label("Actor's Age:");
        lblActorAge.setMinWidth(100);
        lblActorAge.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Actor text field
        txtActorAge = new TextField();
        txtActorAge.setMinWidth(200);
        txtActorAge.setMaxWidth(200);
        txtActorAge.setPromptText("Enter age here");
// Create the OK button →43
        Button btnOK = new Button("OK");
        btnOK.setMinWidth(75);
        btnOK.setOnAction(e -> btnOK_Click());
// Create the Character pane →48
        HBox paneCharacter = new HBox(20, lblCharacter, txtCharacter);
        paneCharacter.setPadding(new Insets(10));
// Create the Actor pane →52
        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));
// Create the ActorAge pane →52
        HBox paneActorAge = new HBox(20, lblActorAge, txtActorAge);
        paneActorAge.setPadding(new Insets(10));
// Create the Button pane →56
        HBox paneButton = new HBox(20, btnOK);
        paneButton.setPadding(new Insets(10));
        paneButton.setAlignment(Pos.BOTTOM_RIGHT);
// Add the Character, Actor, and Button panes to a VBox →61
        VBox pane = new VBox(10, paneCharacter, paneActor, paneActorAge, paneButton);
// Set the stage →64
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void btnOK_Click() {
        String errorMessage = "";
        if (txtCharacter.getText().length() == 0) {
            errorMessage += "\nCharacter is a required field.";
        }
        if (txtActor.getText().length() == 0) {
            errorMessage += "\nActor is a required field.";
        }
        if (txtActorAge.getText().length() == 0) {
            errorMessage += "\nActor is a required field.";
        }else{
            errorMessage = validateInteger(txtActorAge);
        }
        if (errorMessage.length() == 0) {
            String message = "The role of "
                    + txtCharacter.getText()
                    + " will be played by "
                    + txtActor.getText()
                    + ".";
            Alert a = new Alert(Alert.AlertType.INFORMATION, message);
            a.setTitle("Cast");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING, errorMessage);
            a.setTitle("Missing Data");
            a.showAndWait();
        }
    }
    //Call This Method when validating Integer required  text field
    public String validateInteger(TextField textCount) {
        String msg = "You must enter an integer.";
        if (isInt(textCount, msg)) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You entered " + Integer.parseInt(textCount.getText())  + "Your Number");
            a.showAndWait();
        }
        return msg;
    }
    private boolean isInt(TextField f, String msg) {
        try {
            Integer.parseInt(f.getText());
            return true;
        } catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.WARNING, msg);
            a.setTitle("Invalid Data");
            a.showAndWait();
            return false;
        }
    }
}