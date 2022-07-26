package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.MyMood;
import com.upchiapas.mymood.models.Usuario;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class InicioSesionController implements Initializable {
    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnRegresar;
    @FXML
    private CheckBox checkVerPassSing;
    @FXML
    private VBox panelInicioSesion;

    @FXML
    private PasswordField txtPasswordInicioSesion;
    @FXML
    private TextField txtPasswordInicioSesionMask;
    @FXML
    private TextField txtUserInicioSesion;

    @FXML
    void btnIngresarOnMouseClicked(MouseEvent event) {
        MyMood user = HelloApplication.getMyMood();

        if (user.autenticarUser(txtUserInicioSesion.getText().trim(),txtPasswordInicioSesion.getText().trim())){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login - Info");
            alert.setContentText("Bienvenido al sistema");
            alert.showAndWait();
            HelloApplication.setUser(txtUserInicioSesion.getText());

            HelloApplication.setFXML("home-view","Home - MyMood");
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maskPassword(txtPasswordInicioSesion,txtPasswordInicioSesionMask,checkVerPassSing);

        txtUserInicioSesion.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCharacter().equals(" ")){
                    keyEvent.consume();
                }
            }
        });
        txtPasswordInicioSesion.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCharacter().equals(" ")){
                    keyEvent.consume();
                }
            }
        });
    }

    public void maskPassword(PasswordField pass,TextField text,CheckBox check){
        text.setVisible(false);
        text.setManaged(false);

        text.managedProperty().bind(check.selectedProperty());
        text.visibleProperty().bind(check.selectedProperty());

        text.textProperty().bindBidirectional(pass.textProperty());
    }

    @FXML
    void btnRegresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("principal-view","Inicio - MyMood");
    }

}