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
public class PokedexGoogle implements Pokedex {

    private final BaseDatos libreto;

    public PokedexGoogle() {
        this.libreto = new BaseDatos();
    }

    @Override
    public String consultar(Pokemon p) {
        return "Descripcion: "+getDescripcion(p)+"\n"+
                "nivel: " + getNivel(p)+"\n"+
                "Origen: "+getOrigen(p)+"\n"+
                "Años: "+getAnios(p)+"\n"+
                "Salud: "+getSalud(p)+"\n"+
                "Color: "+getColor(p)+"\n"+
                "Tipo: "+getTipo(p);
    }

    @Override
    public byte getNivel(Pokemon p) {
        return p.getNivel();
    }

    @Override
    public String getDescripcion(Pokemon p) {
        String descripcion = libreto.getDescripcion(p.getClass().getSimpleName());
        return descripcion;
    }

    @Override
    public String getOrigen(Pokemon p) {
        String origen = libreto.getOrigen(p.getClass().getSimpleName());
        return origen;

    }

    @Override
    public int getAnios(Pokemon p) {
        int anios = libreto.getAnios(p.getClass().getSimpleName());
        return anios;
    }

    @Override
    public int getSalud(Pokemon p) {
        return p.getPuntajeSalud();
    }

    @Override
    public String getColor(Pokemon p) {
        String color = libreto.getColor(p.getClass().getSimpleName());
        return color;
    }

    @Override
    public String getTipo(Pokemon p) {
       String tipo = libreto.getTipo(p.getClass().getSimpleName());
       return tipo;
    }

}
