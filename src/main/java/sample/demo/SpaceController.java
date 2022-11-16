package sample.demo;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;
import sample.demo.entity.Planeta;
import sample.demo.services.Controller;
import sample.demo.services.Functions;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SpaceController extends Controller implements Initializable {


    @FXML
    public Label menoVesmiru;

    @FXML
    public TextField planetName;
    @FXML
    public TextField planetWeight;
    @FXML
    public TextField planetDiametry;
    @FXML
    public Button addPlanetButton;


    @FXML
    private ListView spacesView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            this.menoVesmiru.setText(mySpace.getMeno());
            spacesView.setItems(FXCollections.observableList(mySpace.getPolePlanet()));
        });
    }

    @FXML
    public void onClickAddPlanet(){
        if(this.planetName.getText()=="" || this.planetWeight.getText() == "" || this.planetDiametry.getText()==""){
            return;
        }
        mySpace.addPlanet(new Planeta(this.planetName.getText(), Double.parseDouble(this.planetWeight.getText()), Double.parseDouble(this.planetDiametry.getText())));
        spacesView.setItems(FXCollections.observableList(mySpace.getPolePlanet()));
        this.planetName.setText("");
        this.planetWeight.setText("");
        this.planetDiametry.setText("");
    }

    @FXML
    public void deletePlanet(){
        Planeta planeta = (Planeta) spacesView.getSelectionModel().getSelectedItem();
        mySpace.deletePlaneta(planeta);
        spacesView.setItems(FXCollections.observableList(mySpace.getPolePlanet()));
    }

    @FXML
    public void selectPlanet(){
        Planeta planeta = (Planeta) spacesView.getSelectionModel().getSelectedItem();

        Stage stage = (Stage) spacesView.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("current-panet-view.fxml"));
        try {
            Functions.openNewSceneWithPlanetAndSpace(stage,planeta, mySpace, loader, "Spravca planety");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
