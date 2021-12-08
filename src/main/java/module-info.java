module com.vadris.gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vadris.gui to javafx.fxml;
    exports com.vadris.gui;
}