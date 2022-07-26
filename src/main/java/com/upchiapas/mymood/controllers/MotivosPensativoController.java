package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Catalogo;
import com.upchiapas.mymood.models.Motivo;
import com.upchiapas.mymood.models.MyMood;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MotivosPensativoController {
    private MyMood app;
    Motivo motivo;
    private String nomMotivo;
    private ArrayList<String> actividadesRealizadas;

    @FXML
    private Label lblActividadP;

    @FXML
    void btnConflictosOnMouseClicked(MouseEvent event) {
        nomMotivo = "Conflictos o Problemas";
        cargarActividad((byte)13);
    }

    @FXML
    void btnAnsiedadOnMouseClicked(MouseEvent event) {
        nomMotivo = "Ansiedad";
        cargarActividad((byte)14);
    }

    @FXML
    void btnCulpaOnMouseClicked(MouseEvent event) {
        nomMotivo = "Sentimiento de culpabilidad";
        cargarActividad((byte)15);
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

        lblActividadP.setText(actividad);
    }

    @FXML
    void btnCerrarOnMouseClicked(MouseEvent event) {
        HelloApplication.getStage().setUserData(motivo);
        HelloApplication.setFXML("home-view","Inicio - MyMood");
    }

}
