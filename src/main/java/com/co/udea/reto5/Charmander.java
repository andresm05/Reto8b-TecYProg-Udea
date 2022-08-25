
package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Charmander extends Pokemon {

    public Charmander(String nombre, byte nivel, int puntajeSalud) throws SaludNegativaException, NivelNegativoException {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() throws SaludNegativaException, NivelNegativoException {
        Pokemon p = new Charmeleon(nombre, nivel, puntajeSalud);
        return p;
    }

    @Override
    public String gritar() {
        return "Charmander!";
    }

}
