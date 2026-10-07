package pokemons;

import strategies.ataque.AtaqueDefensivo;
import strategies.poder.PoderAgua;

public class Corsola extends Pokemon {

    public Corsola() {
        super("Corsola");
        poder = new PoderAgua();
        ataque = new AtaqueDefensivo();
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou a Corsola, o Pokémon coral!");
    }
}
