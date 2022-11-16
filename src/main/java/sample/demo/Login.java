package sample.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.demo.entity.Space;
import sample.demo.services.Functions;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    private TextField nameField;
    @FXML
    private PasswordField passField;
    @FXML
    private Button loginButton;


    private String adminMeno = "admin";
    private String adminHeslo = "admin";


    @FXML
    private void onClickLogin(){
        String meno = "";
        meno = nameField.getText();
        String pass = "";
        pass = passField.getText();

        if (meno.equals(adminMeno) && pass.equals(adminHeslo)) {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
