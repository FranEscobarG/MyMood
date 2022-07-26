package com.upchiapas.mymood.models;

public class Emocion {
    private String nomEmocion;
    private Motivo motivo;

    public Emocion(String nomEmocion, Motivo motivo) {
        this.nomEmocion = nomEmocion;
        this.motivo = motivo;
    }

    public Emocion() {}

    public String getNomEmocion() {
        return nomEmocion;
    }

    public void setNomEmocion(String nomEmocion) {
        this.nomEmocion = nomEmocion;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
}
