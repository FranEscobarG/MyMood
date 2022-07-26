module com.upchiapas.mymood {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.mymood to javafx.fxml;
    exports com.upchiapas.mymood;
    exports com.upchiapas.mymood.controllers;
    opens com.upchiapas.mymood.controllers to javafx.fxml;
}