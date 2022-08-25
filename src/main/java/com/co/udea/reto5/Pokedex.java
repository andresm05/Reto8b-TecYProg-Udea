/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 *
 * @author 
 */
public interface Pokedex {

    String consultar(Pokemon p);

    byte getNivel(Pokemon p);

    String getDescripcion(Pokemon p);

    String getOrigen(Pokemon p);

    int getAnios(Pokemon p);

    int getSalud(Pokemon p);

    String getColor(Pokemon p);

    String getTipo(Pokemon p);
}
