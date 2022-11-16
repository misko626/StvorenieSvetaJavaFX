package sample.demo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.demo.entity.Planeta;
import sample.demo.services.Controller;
import sample.demo.services.Functions;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CurrentPlanetController extends Controller implements Initializable {

    @FXML
    private TextField planetName;

    @FXML
    private TextField planetDiametry;

    @FXML
    private TextField planetWeight;

    @FXML
    private Button updateButton;

    @FXML
    private Button backButton;

    @FXML
    private Label planetInfoLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            System.out.println(currentPlaneta);
            this.planetName.setText(currentPlaneta.getMeno());
            this.planetWeight.setText(String.valueOf(currentPlaneta.getVaha()) );
            this.planetDiametry.setText(String.valueOf(currentPlaneta.getPriemer()) );
            this.setPlanetInfoLabel();
        });
    }


    @FXML
    private void onClickUpdate(){
        currentPlaneta.setMeno(this.planetName.getText());
        currentPlaneta.setVaha( Double.parseDouble(this.planetWeight.getText()));
        currentPlaneta.setPriemer( Double.parseDouble(this.planetDiametry.getText()));
        this.setPlanetInfoLabel();
    }

    private void setPlanetInfoLabel(){
        this.planetInfoLabel.setText("Meno tvojej planety je:" +currentPlaneta.getMeno()+ "\n"+
                "Jej vaha je: "+currentPlaneta.getVaha()+ "kg\n" +
                "a jej priemer je: " +currentPlaneta.getPriemer()+"km");
    }

    @FXML
    private void onClickBack(){
        Stage stage = (Stage) backButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("space-view.fxml"));
        try {
            Functions.openNewSceneWithSpace(stage,mySpace, loader, "Spravca vesmiru");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
