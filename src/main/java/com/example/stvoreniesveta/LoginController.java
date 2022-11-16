package com.example.stvoreniesveta;

import com.example.stvoreniesveta.services.Functions;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField nameInput;
    @FXML
    private TextField passInput;
    @FXML
    private Button loginButton;


    private String adminName = "admin";
    private String adminPass = "password";


    @FXML
    private void onClickLogin(){

        String name=this.nameInput.getText();
        String pass=this.passInput.getText();

        if (name.equals(adminName) && pass.equals(adminPass)) {
            //to co sa vykona ak sa rovnaju
            Stage stage = (Stage) loginButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("space-creator-view.fxml"));
            try {
                Functions.openNewScene(stage,loader, "Space Creator");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("Zle prihlasovacie udaje");
        }

    }

}