package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ServicioPController {

    @FXML
    private Button btnAsistente;

    @FXML
    private Button btnAvances;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnConsejos;

    @FXML
    private Button btnServiciosP;

    @FXML
    void btnAsistenteOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("home-view","Home - MyMood");
    }

    @FXML
    void btnConsejosOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("consejos-view","Cosejos - MyMood");
    }

    @FXML
    void btnAvancesOnMouseClicked(MouseEvent event) {
        //HelloApplication.getStage().setUserData(listaEmociones); //Se usara

        HelloApplication.setFXML("avances-view","Mis Avances - MyMood");
    }

    @FXML
    void btnServiciosPOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("serviciosP-view","Servicios y Profecionales - MyMood");
    }

    @FXML
    void btnCerrarSesionOnMouseClicked(MouseEvent event) {
        //HelloApplication.getStage().setUserData(listaEmociones); //Lo deja a disposicion de otros stages

        HelloApplication.setFXML("principal-view","Inicio - MyMood");
    }

}
