package com.upchiapas.mymood.models;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String username;
    private String contrasena;
    private byte edad;
    private ArrayList<Emocion> listaEmociones= new ArrayList<>();

    public Usuario(String nombre, String username, String contrasena, byte edad) {
        this.nombre = nombre;
        this.username = username;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public ArrayList<Emocion> getListaEmociones() {
        return listaEmociones;
    }

    public void addEmotion(Emocion emotion) {
        this.listaEmociones.add(emotion);
    }
}
