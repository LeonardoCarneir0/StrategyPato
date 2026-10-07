package strategies.ataque;

public class AtaqueDefensivo implements Ataque {
    @Override
    public void atacar() {
        System.out.println("Fechando a guarda e contra-atacando com defesa!");
    }

    @Override
    public String getNome() {
        return "Defensivo";
    }
}
