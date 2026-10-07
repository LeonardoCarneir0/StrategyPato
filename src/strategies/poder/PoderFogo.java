package strategies.poder;

public class PoderFogo implements Poder {
    @Override
    public void usarPoder() {
        System.out.println("Lançando uma rajada de chamas!");
    }

    @Override
    public String getNome() {
        return "Fogo";
    }
}
