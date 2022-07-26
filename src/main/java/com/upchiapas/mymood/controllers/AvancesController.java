package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class AvancesController {
    Usuario user;
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
    private Label txtEdad;

    @FXML
    private Label txtNombre;
    @FXML
    private Label txtActividades;

    @FXML
    private Label txtEmociones;

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
        HelloApplication.setFXML("avances-view","Mis Avances - MyMood");
    }

    @FXML
    void btnServiciosPOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("serviciosP-view","Servicios y Profecionales - MyMood");
    }

    @FXML
    void btnCerrarSesionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("principal-view","Inicio - MyMood");
    }

    @FXML
    void initialize(){

        user = HelloApplication.getMyMood().encontrarUser(HelloApplication.getUser());
        txtNombre.setText(user.getNombre());
        txtEdad.setText(String.valueOf(user.getEdad()));
        for (int i=0; i<user.getListaEmociones().size(); i++){
            txtEmociones.setText(txtEmociones.getText()+"\n"+user.getListaEmociones().get(i).getNomEmocion());
        }
    }

}
