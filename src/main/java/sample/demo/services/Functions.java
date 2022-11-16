package sample.demo.services;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.demo.entity.Planeta;
import sample.demo.entity.Space;

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

    public static void openNewSceneWithPlanetAndSpace(Stage oldStage, Planeta planet, Space space, FXMLLoader loader, String title) throws IOException {
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Controller controller = (Controller) loader.getController();
        controller.setCurrentPlaneta(planet);
        controller.setMySpace(space);
        oldStage.setTitle(title);
        oldStage.setScene(scene);
        oldStage.show();
    }


}
