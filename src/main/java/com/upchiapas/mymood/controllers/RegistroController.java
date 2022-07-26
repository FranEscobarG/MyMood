package com.upchiapas.mymood.controllers;

import com.upchiapas.mymood.HelloApplication;
import com.upchiapas.mymood.models.MyMood;
import com.upchiapas.mymood.models.Usuario;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RegistroController implements Initializable {
    @FXML
    private Button btnRegresarR, btnSignUp;

    @FXML
    private TextField  txtNombreRegistro,txtUsuarioRegistro, txtEdadRegistro;
    @FXML
    private TextField txtPassword, txtConfirmarPassword;

    static ArrayList <Usuario> listaUsuarios = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtUsuarioRegistro.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCharacter().equals(" ")){
                    keyEvent.consume();
                }
            }
        });
        txtPassword.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCharacter().equals(" ")){
                    keyEvent.consume();
                }
            }
        });
    }

    @FXML
    void btnSignUpOnMouseClicked(MouseEvent event) {
        Usuario objUsuario;
        if (!txtNombreRegistro.getText().equals("") && !txtUsuarioRegistro.getText().equals("") && !txtPassword.getText().equals("") && !txtEdadRegistro.getText().equals("")){
            if (txtPassword.getText().equals(txtConfirmarPassword.getText())){
                objUsuario = new Usuario(txtNombreRegistro.getText(), txtUsuarioRegistro.getText(), txtPassword.getText(), Byte.parseByte(txtEdadRegistro.getText()));
                listaUsuarios.add(objUsuario);
                HelloApplication.getMyMood().addUser(objUsuario);
                if(!listaUsuarios.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Registro - Info");
                    alert.setContentText("Registro de usuario Exitoso ;)");
                    alert.showAndWait();
                }
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Registro - Error");
                alert.setContentText("Error en la contraseña");
                alert.showAndWait();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Registro - Error");
            alert.setContentText("Registro Incompleto");
            alert.showAndWait();
        }
    }

    @FXML
    void btnRegresarROnMouseClicked(MouseEvent event) {
        HelloApplication.getStage().setUserData(listaUsuarios);
        HelloApplication.setFXML("principal-view","Inicio - MyMood");
    }

}
