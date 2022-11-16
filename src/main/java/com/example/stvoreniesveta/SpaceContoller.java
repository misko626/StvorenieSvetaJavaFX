package com.example.stvoreniesveta;

import com.example.stvoreniesveta.entity.Planet;
import com.example.stvoreniesveta.services.Controller;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SpaceContoller extends Controller  implements Initializable {


    @FXML
    public Label spaceName;
    @FXML
    public TextField planetName;
    @FXML
    public TextField planetWeight;
    @FXML
    public TextField planetDiametry;
    @FXML
    public Button addPlanetButton;
    @FXML
    private ListView planetsView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            this.spaceName.setText(mySpace.getName());
            planetsView.setItems(FXCollections.observableList(mySpace.getSpacePlanets()));
        });
    }

    @FXML
    public void onClickAddPlanet(){
        if(this.planetName.getText()=="" || this.planetWeight.getText() == "" || this.planetDiametry.getText()==""){
            return;
        }
        //pridanie planéty
        mySpace.addPlanet(new Planet(this.planetName.getText(), Double.parseDouble(this.planetWeight.getText()), Double.parseDouble(this.planetDiametry.getText())));
        //aktualizovanie ListView
        planetsView.setItems(FXCollections.observableList(mySpace.getSpacePlanets()));
        //vynulovanie inputov
        this.planetName.setText("");
        this.planetWeight.setText("");
        this.planetDiametry.setText("");
    }

    @FXML
    public void onClickDeletePlanet(){
        Planet planeta = (Planet) planetsView.getSelectionModel().getSelectedItem();
        mySpace.deletePlanet(planeta);
        planetsView.setItems(FXCollections.observableList(mySpace.getSpacePlanets()));
    }
}
