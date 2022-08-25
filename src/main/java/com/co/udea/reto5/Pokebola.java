/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Pokebola {

    private String tamanio;
    private Pokemon pokemon;

    public Pokebola(String tamanio) {
        if (!"grande".equals(tamanio) && !"mediana".equals(tamanio) && !"pequeña".equals(tamanio)) {
            this.tamanio = null;
        } else {
            this.tamanio = tamanio;
        }
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

}
