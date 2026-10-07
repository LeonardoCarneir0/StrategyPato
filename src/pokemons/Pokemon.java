package pokemons;

import strategies.ataque.Ataque;
import strategies.poder.Poder;

public abstract class Pokemon {
    protected String nome;
    protected Poder poder;
    protected Ataque ataque;

    public Pokemon(String nome) {
        this.nome = nome;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public void realizarPoder() {
        System.out.print(nome + " (" + poder.getNome() + "): ");
        poder.usarPoder();
    }

    public void realizarAtaque() {
        System.out.print(nome + " (" + ataque.getNome() + "): ");
        ataque.atacar();
    }

    public void status() {
        System.out.println("Pokémon: " + nome
                + " | Poder: " + poder.getNome()
                + " | Ataque: " + ataque.getNome());
    }

    public abstract void exibir();
}
