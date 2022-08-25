package com.co.udea.reto5;

/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public abstract class Pokemon {

    protected String nombre;
    protected byte nivel;
    protected int puntajeSalud;

    public Pokemon(String nombre, byte nivel, int puntajeSalud) throws SaludNegativaException, NivelNegativoException {
        if (puntajeSalud <= 0) {
            throw new SaludNegativaException();
        } else {
            this.puntajeSalud = puntajeSalud;
        }
        if (nivel <= 0) {
            throw new NivelNegativoException();
        } else {
            this.nivel = nivel;
        }
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) throws NivelNegativoException {
        if (nivel <= 0) {
            throw new NivelNegativoException();
        } else {
            this.nivel = nivel;
        }

    }

    public int getPuntajeSalud() {
        return puntajeSalud;
    }

    public void setPuntajeSalud(int puntajeSalud) throws SaludNegativaException {
        if (puntajeSalud <= 0) {
            throw new SaludNegativaException();
        } else {
            this.puntajeSalud = puntajeSalud;
        }
    }

    public abstract Pokemon evolucionar() throws NoEvolucionaException, SaludNegativaException, NivelNegativoException;

    public abstract String gritar();
}
