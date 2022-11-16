module sample.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens sample.demo to javafx.fxml;
    exports sample.demo;
}