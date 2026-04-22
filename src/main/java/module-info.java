module com.example.spaceinvadersclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spaceinvadersclass to javafx.fxml;
    exports com.example.spaceinvadersclass;
}