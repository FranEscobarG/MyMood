package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Catalogo;
import com.upchiapas.mymood.models.Motivo;
import com.upchiapas.mymood.models.MyMood;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MotivosEnojoController {
    private MyMood app;
    Motivo motivo;
    private String nomMotivo;
    private ArrayList<String> actividadesRealizadas;

    @FXML
    private Label lblActvidad;

    @FXML
    void btnProblemFamOnMouseClicked(MouseEvent event) {
        nomMotivo = "Problema Familiar";
        cargarActividad((byte)1);
    }

    @FXML
    void btnDecepcionOnMouseClicked(MouseEvent event) {
        nomMotivo = "Decepción";
        cargarActividad((byte)2);
    }

    @FXML
    void btnImpotenciaOnMouseClicked(MouseEvent event) {
        nomMotivo = "Impotencia";
        cargarActividad((byte) 3);
    }

    public void cargarActividad(byte opc){
        Catalogo catalogo = new Catalogo();
        catalogo.obtenerActivdades(opc);
        String actividad = catalogo.enviarActividad();

        actividadesRealizadas.add(actividad);
        motivo = new Motivo(nomMotivo,actividadesRealizadas);

        lblActvidad.setText(actividad);
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
}
