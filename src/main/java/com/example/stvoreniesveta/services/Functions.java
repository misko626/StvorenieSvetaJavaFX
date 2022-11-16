package com.example.stvoreniesveta.services;

import com.example.stvoreniesveta.entity.Planet;
import com.example.stvoreniesveta.entity.Space;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Functions {

    public static void openNewScene(Stage oldStage, FXMLLoader loader, String title) throws IOException {
        Parent root = loader.load();
        Scene scene = new Scene(root);
        oldStage.setTitle(title);
        oldStage.setScene(scene);
        oldStage.show();
    }

    public static void openNewSceneWithSpace(Stage oldStage, Space space, FXMLLoader loader, String title) throws IOException {
        Parent root = loader.load();
        Scene scene = new Scene(root);
//        Controller controller = loader.getController();
        Controller controller = (Controller) loader.getController();
        controller.setMySpace(space);
        oldStage.setTitle(title);
        oldStage.setScene(scene);
        oldStage.show();
    }

    public static void openNewSceneWithPlanetAndSpace(Stage oldStage, Planet planet, Space space, FXMLLoader loader, String title) throws IOException {
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Controller controller = (Controller) loader.getController();
        controller.setCurrentPlanet(planet);
        controller.setMySpace(space);
        oldStage.setTitle(title);
        oldStage.setScene(scene);
        oldStage.show();
    }
}
