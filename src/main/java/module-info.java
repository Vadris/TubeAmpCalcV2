module com.example.tubeampcalcv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tubeampcalcv2 to javafx.fxml;
    exports com.example.tubeampcalcv2;
}