package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Catalogo;
import com.upchiapas.mymood.models.Motivo;
import com.upchiapas.mymood.models.MyMood;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MotivosMiedoController {
    private MyMood app;
    Motivo motivo;
    private String nomMotivo;
    private ArrayList<String> actividadesRealizadas;

    @FXML
    private Label lblactividadM;

    @FXML
    void btnFracasoOnMouseClicked(MouseEvent event) {
        nomMotivo = "Miedo al Fracaso";
        cargarActividad((byte)7);
    }

    @FXML
    void btnFobiaOnMouseClicked(MouseEvent event) {
        nomMotivo = "Fobia";
        cargarActividad((byte)8);
    }

    @FXML
    void btnRechazoOnMouseClicked(MouseEvent event) {
        nomMotivo = "Rechazo";
        cargarActividad((byte)9);
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

        lblactividadM.setText(actividad);
    }

    @FXML
    void btnCerrarOnMouseClicked(MouseEvent event) {
        HelloApplication.getStage().setUserData(motivo);
        HelloApplication.setFXML("home-view","Inicio - MyMood");
    }
}
