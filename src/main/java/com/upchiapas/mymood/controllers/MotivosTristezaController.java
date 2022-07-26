package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Catalogo;
import com.upchiapas.mymood.models.Motivo;
import com.upchiapas.mymood.models.MyMood;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MotivosTristezaController {
    private MyMood app;
    Motivo motivo;
    private String nomMotivo;
    private ArrayList<String> actividadesRealizadas;

    @FXML
    private Label lblActividadT;


    @FXML
    void btnDecesoOnMouseClicked(MouseEvent event) {
        nomMotivo = "Deceso";
        cargarActividad((byte)10);
    }

    @FXML
    void btnPSentimentalesOnMouseClicked(MouseEvent event) {
        nomMotivo = "Problemas Sentimentales";
        cargarActividad((byte)11);
    }

    @FXML
    void btnPFamiliaresOnMouseClicked(MouseEvent event) {
        nomMotivo = "Problemas Familiares";
        cargarActividad((byte)12);
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

        lblActividadT.setText(actividad);
    }

    @FXML
    void btnCerrarOnMouseClicked(MouseEvent event) {
        HelloApplication.getStage().setUserData(motivo);
        HelloApplication.setFXML("home-view","Inicio - MyMood");
    }
}
