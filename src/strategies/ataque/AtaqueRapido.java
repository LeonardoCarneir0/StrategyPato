package strategies.ataque;

public class AtaqueRapido implements Ataque {
    @Override
    public void atacar() {
        System.out.println("Atacando em alta velocidade!");
    }

    @Override
    public String getNome() {
        return "Rápido";
    }
}
