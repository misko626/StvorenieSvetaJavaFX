package com.example.stvoreniesveta;

import com.example.stvoreniesveta.entity.Space;
import com.example.stvoreniesveta.services.Functions;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SpaceCreatorController {

    @FXML
    private TextField spaceName;

    @FXML
    private Button createButton;

    public void onClickCreateButton(){
        Space mySpace = new Space(this.spaceName.getText());
        String name = this.spaceName.getText();
        mySpace.setName(name);
        System.out.println(this.spaceName.getText());

        Stage stage = (Stage) createButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("space-view.fxml"));
        try {
            Functions.openNewSceneWithSpace(stage,mySpace, loader, "Space Creator");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
