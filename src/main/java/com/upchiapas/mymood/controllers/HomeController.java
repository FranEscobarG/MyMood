package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.Emocion;
import com.upchiapas.mymood.models.Motivo;
import com.upchiapas.mymood.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HomeController {
    Usuario user;
    Emocion emocion;

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

    // ---------------------------------------------------------------------------------------------
    @FXML
    void btnEnojoOnMouseClicked(MouseEvent event) {
        emocion = new Emocion(); //OBJETO EMOCION
        emocion.setNomEmocion("Enojo");
        //emocion.setMotivo((Motivo) HelloApplication.getStage().getUserData());

        cargarEmocion();
        HelloApplication.setFXML("motivosEnojo-view","Menu de Motivos - MyMood");
    }

    @FXML
    void btnFrustradoOnMouseClicked(MouseEvent event) {
        emocion = new Emocion();
        emocion.setNomEmocion("Frustración");

        cargarEmocion();
        HelloApplication.setFXML("motivosFrustrado-view","Menu de Motivos - MyMood");
    }

    @FXML
    void btnMiedoOnMouseClicked(MouseEvent event) {
        emocion = new Emocion();
        emocion.setNomEmocion("Miedo");

        cargarEmocion();
        HelloApplication.setFXML("motivosMiedo-view","Menu de Motivos - MyMood");
    }

    @FXML
    void btnPensativoOnMouseClicked(MouseEvent event) {
        emocion = new Emocion();
        emocion.setNomEmocion("Pensativo (a)");

        cargarEmocion();
        HelloApplication.setFXML("motivosPensativo-view","Menu de Motivos - MyMood");
    }

    @FXML
    void btnTristeOnMouseClicked(MouseEvent event) {
        emocion = new Emocion();
        emocion.setNomEmocion("Tristeza");

        cargarEmocion();
        HelloApplication.setFXML("motivosTristeza-view","Menu de Motivos - MyMood");
    }

    private void cargarEmocion(){
        user = HelloApplication.getMyMood().encontrarUser(HelloApplication.getUser());
        user.addEmotion(emocion);
    }

}
