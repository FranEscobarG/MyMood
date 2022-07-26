package com.upchiapas.mymood;

import com.upchiapas.mymood.models.MyMood;
import com.upchiapas.mymood.models.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    private static MyMood myMood;
    private static String user;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        myMood = new MyMood();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("principal-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio - My Mood");
        stage.setScene(scene);
        stage.setUserData(new ArrayList<Usuario>());
        stage.show();
    }

    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nameView, String title){
        scene.setRoot(loadFXML(nameView));
        stage.setResizable(true);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);
    }

    public static void main(String[] args) {
        launch();
    }

    public static MyMood getMyMood() {return myMood;}

    public static Stage getStage() { return stage;}
    public static String getUser() {return  user;}
    public static void setUser(String users) {user=users;}
}