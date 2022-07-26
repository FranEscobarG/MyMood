package com.upchiapas.mymood.models;

public class Catalogo {
    String[] listaActividades = new String[3];

    public void obtenerActivdades(byte motivo){
        switch (motivo){
            case 1://enojo
                listaActividades = new String[]{"Escuchar Música Pop", "Meditar","Salir al caminar"};
                break;
            case 2:
                listaActividades = new String[]{"Jugar Futbol", "Pasar tiempo en familia","Escuchar audios motivacionales"};
                break;
            case 3:
                listaActividades = new String[]{"Practica un nuevo deporte", "Leer un libro de fantacia","Descansar"};
                break;
            case 4: //Frustrado
                listaActividades = new String[]{"Salir al aire libre", "Ir de compras","Ver peliculas de comedia"};
                break;
            case 5:
                listaActividades = new String[]{"Cocinar", "Hacer un hobie nuevo","Dibujar"};
                break;
            case 6:
                listaActividades = new String[]{"Meditar", "Tocar un Instrumento","Nadar"};
                break;
            case 7://Miedo
                listaActividades = new String[]{"Jugar Juegos de Mesa", "Leer libros motivacionales","Sembrar una planta"};
                break;
            case 8:
                listaActividades = new String[]{"Ir al teatro", "Experimenta nuevas emociones","Ir al parque"};
                break;
            case 9:
                listaActividades = new String[]{"Escuchar Musica", "Valorarte","Salir con amigos"};
                break;
            case 10:// Tristeza
                listaActividades = new String[]{"Recordar buenas experiencias", "Salir a correr","Reunion familiar"};
                break;
            case 11:
                listaActividades = new String[]{"Cantar", "Ir al gym","Escribir"};
                break;
            case 12:
                listaActividades = new String[]{"Comer tu Postre favorito", "Ver una pelicula romantica","Jugar con tu mascota"};
                break;
            case 13: // Pensativo
                listaActividades = new String[]{"Andar en bicicleta", "Ver comedia","Reunirte con amigos"};
                break;
            case 14:
                listaActividades = new String[]{"Dormir", "Comer frutar","Meditar"};
                break;
            case 15:
                listaActividades = new String[]{"Platicar con alguien", "Realiza una buena accion","Pintar"};
                break;
        }
    }

    public String enviarActividad(){
        String actividad;
        int i = (int)(Math.random()*3);
        actividad = listaActividades[i];
        return actividad;
    }

}
