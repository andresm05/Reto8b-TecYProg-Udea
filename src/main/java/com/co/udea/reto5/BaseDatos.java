/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 *
 * @author jaime.munozq
 */
public class BaseDatos {

    public String getOrigen(String p) {
        String origen;
        switch (p) {
            case "Charizard":
            case "Charmeleon":
            case "Charmander":
                origen = "El pokemon es nativo de Pueblo Paleta";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":

                origen = "El pokemon es nativo de Pueblo Fungi";
                break;
            case "Pikachu":
            case "Raichu":
                origen = "El pokemon es nativo de Pueblo kanto";
                break;
            default:
                origen = "El pokemon no se encuentra en la base de datos";
                break;
        }
        return origen;
    }

    public String getColor(String p) {
        String color;
        switch (p) {
            case "Charizard":
            case "Charmeleon":
            case "Charmander":
                color = "Rojo";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                color = "Azul";
                break;
            case "Pikachu":
            case "Raichu":
                color = "Amarillo";
                break;
            default:
                color = "El pokemon no se encuentra en la base de datos";
                break;
        }
        return color;
    }

    public String getTipo(String p) {
        String tipo;
        switch (p) {
            case "Charizard":
            case "Charmeleon":
            case "Charmander":
                tipo = "Fuego";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                tipo = "Agua";
                break;
            case "Pikachu":
            case "Raichu":
                tipo = "Eléctrico";
                break;
            default:
                tipo = "El pokemon no se encuentra en la base de datos";
                break;
        }
        return tipo;
    }

    public int getAnios(String p) {
        int anios;
        switch (p) {
            case "Charizard":
            case "Charmeleon":
            case "Charmander":
                anios = 8;
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":
                anios = 10;
                break;
            case "Pikachu":
            case "Raichu":
                anios = 12;
                break;
            default:
                anios = 0;
                break;
        }
        return anios;
    }

    public String getDescripcion(String p) {
        String descripcion;

        switch (p) {
            case "Charizard":
            case "Charmeleon":
            case "Charmander":
                descripcion = "Pokemon que vive en la lava";
                break;
            case "Squirtle":
            case "Wartortle":
            case "Blastoise":

                descripcion = "Le encanta el agua";
                break;
            case "Pikachu":
            case "Raichu":
                descripcion = "Le gustan los truenos";
                break;
            default:
                descripcion = "El pokemon no se encuentra en la base de datos";
                break;
        };
        return descripcion;
    }
}
