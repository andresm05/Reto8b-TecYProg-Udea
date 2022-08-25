package com.co.udea.reto5;
/**
 *
 * @Jaime Muñoz
 * @Juan Vásquez
 */
public class Principal {

    public static void main(String[] args) {

        //Creacion de pokebolas y pokemones
        Pokebola poke1, poke2, poke3;
        Pokemon p1 = null, p2 = null, p3 = null;
        poke1 = new Pokebola("pequeña");
        poke2 = new Pokebola("mediana");
        poke3 = new Pokebola("grande");

        try {
            //Crear un Pokemon de tipo Charmander
            p1 = new Charmander("Pepe", (byte) 7, 15);
            System.out.println(p1.gritar());
            try {
                //Evolucionar el Charmander a Charmeleon
                p1 = p1.evolucionar();
                System.out.println(p1.gritar());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                //Evolucionar el Charmeleon a Charizard
                p1 = p1.evolucionar();
                System.out.println(p1.gritar());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                //Evolucionar Charizard y capturar el error
                p1 = p1.evolucionar();
                //Atrapar el Charizard en la pokebola.
                poke1.setPokemon(p1);
                //Nombre del Pokemon en la pokebola 1
                System.out.println("Nombre del Pokemon en la Pokebola 1:");
                System.out.println(poke1.getPokemon().getNombre());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (SaludNegativaException | NivelNegativoException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            //Crear un Pokemon de tipo Pikachu
            p2 = new Pikachu("Juan", (byte) 12, 20);
            System.out.println(p2.gritar());
            try {
                //Evolucionar Pikachu a Raichu
                p2 = p2.evolucionar();
                System.out.println(p2.gritar());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                //Evolucionar Raichu y capturar la excepción
                p2 = p2.evolucionar();
                //Atrapar el Raichu en la pokebola.
                poke2.setPokemon(p2);
                //Nombre del Pokemon en la Pokebola 2
                System.out.println("Nombre del Pokemon en la Pokebola 2:");
                System.out.println(poke2.getPokemon().getNombre());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (SaludNegativaException | NivelNegativoException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            //Crear un Pokemon de tipo Squirtle
            p3 = new Squirtle("Toyo", (byte) 20, 40);
            System.out.println(p3.gritar());
            try {
                //Evolucionar Squirtle a Wartortle
                p3 = p3.evolucionar();
                System.out.println(p3.gritar());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                //Evolucionar Wartortle a Blastoise
                p3 = p3.evolucionar();
                System.out.println(p3.gritar());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                //Evolucionar Blastoise y capturar la excepción
                p3 = p3.evolucionar();
                //Atrapar el Blastoise en la pokebola
                poke3.setPokemon(p3);
                //Nombre del Pokemon en la Pokebola 3
                System.out.println("Nombre del Pokemon en la Pokebola 3:");
                System.out.println(poke3.getPokemon().getNombre());
            } catch (NoEvolucionaException | SaludNegativaException | NivelNegativoException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SaludNegativaException | NivelNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        Pokedex enciclopedia = new PokedexGoogle();

        System.out.println("Pokemon tipo: " + enciclopedia.getTipo(p3) + " y edad: " + enciclopedia.getAnios(p3));
        System.out.println("*************************************");
        System.out.println("Información del pokemon: " + p1.getNombre() + "\n"
                + enciclopedia.consultar(p1));
        System.out.println("*************************************");

    }
}
