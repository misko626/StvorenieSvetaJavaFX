package sample.demo;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.demo.entity.Space;
import sample.demo.services.Controller;
import sample.demo.services.Functions;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SpaceCreator  {

    @FXML
    private TextField spaceName;

    @FXML
    private Button createButton;



    public void onClickCreateButton(){
        Space mySpace = new Space(this.spaceName.getText());
        String meno = this.spaceName.getText();
        mySpace.setMeno(meno);
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
