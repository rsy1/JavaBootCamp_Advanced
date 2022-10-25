package com.example.javafx_ChoosingfromList;

import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Astronaut {
    Stage stage;
    private String firstName;
    private String lastName;

    public Astronaut(String FirstName, String LastName) {
        firstName = FirstName;
        lastName = LastName;
    }
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        stage = primaryStage;

        ChoiceBox<Astronaut> apollo13 = new ChoiceBox<>();
        apollo13.getItems().add(new Astronaut("Jim", "Lovell"));
        apollo13.getItems().add(new Astronaut("John", "Swigert"));
        apollo13.getItems().add(new Astronaut("Fred", "Haise"));

    }

    //Getting the selected item on a choice box / combo box
   /* public void btnOK_Click()
    {
        String message = "You chose ";
        message += cbo.getValue();
        if (!cbo.getItems().contains(cbo.getValue()))
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION,
                    "You chose outside the box");
            a.setTitle("Good Thinking!");
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION, message);
        a.setTitle("Your Favorite Astronaut");
        a.showAndWait();
    }*/

    public String toString(){
        return null;
    }
}