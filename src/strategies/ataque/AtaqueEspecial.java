package strategies.ataque;

public class AtaqueEspecial implements Ataque {
    @Override
    public void atacar() {
        System.out.println("Executando um ataque especial à distância!");
    }

    @Override
    public String getNome() {
        return "Especial";
    }
}
