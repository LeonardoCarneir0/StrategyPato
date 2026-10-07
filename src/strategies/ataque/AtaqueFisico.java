package strategies.ataque;

public class AtaqueFisico implements Ataque {
    @Override
    public void atacar() {
        System.out.println("Atacando com um golpe físico!");
    }

    @Override
    public String getNome() {
        return "Físico";
    }
}
