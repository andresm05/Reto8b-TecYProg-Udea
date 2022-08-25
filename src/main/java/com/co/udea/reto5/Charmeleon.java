
package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Charmeleon extends Pokemon {

    public Charmeleon(String nombre, byte nivel, int puntajeSalud) throws SaludNegativaException, NivelNegativoException {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() throws SaludNegativaException, NivelNegativoException {
        Pokemon p = new Charizard(nombre, nivel, puntajeSalud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmeleon!";
    }

}
