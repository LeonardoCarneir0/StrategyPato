package pokemons;

import strategies.ataque.AtaqueEspecial;
import strategies.poder.PoderPlanta;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        super("Bulbasaur");
        poder = new PoderPlanta();
        ataque = new AtaqueEspecial();
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou o Bulbasaur, o Pokémon semente!");
    }
}
