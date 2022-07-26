package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    void actionEvent(ActionEvent event) {

    }

    @FXML
    void btnIniciarSesionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("inicioSesion-view","Inicio de Sesion - MyMood");
    }

    @FXML
    void btnRegistrarseOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("registro-view","Inicio de Sesion - MyMood");
    }

}
