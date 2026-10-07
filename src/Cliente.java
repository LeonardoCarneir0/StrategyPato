import pokemons.Bulbasaur;
import pokemons.Corsola;
import pokemons.Pokemon;
import strategies.ataque.AtaqueRapido;
import strategies.poder.PoderFogo;
import strategies.poder.PoderGelo;
import strategies.ataque.AtaqueFisico;

public class Cliente {
    public static void main(String[] args) {
        Pokemon bulbasaur = new Bulbasaur();
        Pokemon corsola = new Corsola();

        System.out.println("===== Comportamento inicial =====");
        bulbasaur.exibir();
        bulbasaur.status();
        bulbasaur.realizarPoder();
        bulbasaur.realizarAtaque();

        System.out.println();
        corsola.exibir();
        corsola.status();
        corsola.realizarPoder();
        corsola.realizarAtaque();

        System.out.println("\n===== Trocando estratégias em tempo de execução =====");
        bulbasaur.setPoder(new PoderFogo());
        bulbasaur.setAtaque(new AtaqueRapido());
        bulbasaur.status();
        bulbasaur.realizarPoder();
        bulbasaur.realizarAtaque();

        System.out.println();
        corsola.setPoder(new PoderGelo());
        corsola.setAtaque(new AtaqueFisico());
        corsola.status();
        corsola.realizarPoder();
        corsola.realizarAtaque();
    }
}
