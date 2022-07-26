package com.upchiapas.mymood.models;

import java.util.ArrayList;

public class MyMood {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private Catalogo cataloActividades;

    public MyMood(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public MyMood() { }

    public boolean addUser(Usuario usuario){ return listaUsuarios.add(usuario);}

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Catalogo getCataloActividades() {
        return cataloActividades;
    }

    public void setCataloActividades(Catalogo cataloActividades) {
        this.cataloActividades = cataloActividades;
    }

    public boolean autenticarUser(String username, String contrasena){
        boolean status=false;
        Usuario user = encontrarUser(username);
        if(user!=null && user.getContrasena().equals(contrasena))
            status=true;
        return status;
    }

    public Usuario encontrarUser (String username){
        Usuario user = null;
        boolean status=false;
        int index=0;
        while (!status && index<listaUsuarios.size()){
            if (listaUsuarios.get(index).getUsername().equals(username)){
                user = listaUsuarios.get(index);
                status=true;
            }
            index++;
        }
        return user;
    }

}
