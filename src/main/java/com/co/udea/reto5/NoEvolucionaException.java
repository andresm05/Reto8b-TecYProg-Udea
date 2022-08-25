/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto5;

/**
 *
 * @author HOME
 */
public class NoEvolucionaException extends Exception {

    public NoEvolucionaException() {
        super("Este Pokemón no puede evolucionar más!");
    }
    
}
