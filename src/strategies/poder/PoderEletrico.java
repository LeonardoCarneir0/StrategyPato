package strategies.poder;

public class PoderEletrico implements Poder {
    @Override
    public void usarPoder() {
        System.out.println("Descarregando um raio elétrico!");
    }

    @Override
    public String getNome() {
        return "Elétrico";
    }
}
