package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Catalogo;
import com.upchiapas.mymood.models.Motivo;
import com.upchiapas.mymood.models.MyMood;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MotivosFrustacionController {
    private MyMood app;
    Motivo motivo;
    private String nomMotivo;
    private ArrayList<String> actividadesRealizadas;

    @FXML
    private Label lblActividadF;

    @FXML
    void btnAhFalladoOnMouseClicked(MouseEvent event) {
        nomMotivo = "Sientes que has Fallado";
        cargarActividad((byte)4);
    }

    @FXML
    void btnIncompetenciaOnMouseClicked(MouseEvent event) {
        nomMotivo = "Sientes incompetencia";
        cargarActividad((byte)5);
    }

    @FXML
    void btnDeficitOnMouseClicked(MouseEvent event) {
        nomMotivo = "Deficit de Autocontrol";
        cargarActividad((byte)6);
    }
    @FXML
    void btnCerrarOnMouseClicked(MouseEvent event) {
        HelloApplication.getStage().setUserData(motivo);
        HelloApplication.setFXML("home-view","Inicio - MyMood");
    }

    @FXML
    void initialize(){
        app = HelloApplication.getMyMood();
        actividadesRealizadas = new ArrayList<>();
    }
    public void cargarActividad(byte opc){
        Catalogo catalogo = new Catalogo();
        catalogo.obtenerActivdades(opc);
        String actividad = catalogo.enviarActividad();

        actividadesRealizadas.add(actividad);
        motivo = new Motivo(nomMotivo,actividadesRealizadas);

        lblActividadF.setText(actividad);
    }
}
