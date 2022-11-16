module com.example.stvoreniesveta {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.stvoreniesveta to javafx.fxml;
    exports com.example.stvoreniesveta;
}