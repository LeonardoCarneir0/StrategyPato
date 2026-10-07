package strategies.poder;

public class PoderAgua implements Poder {
    @Override
    public void usarPoder() {
        System.out.println("Disparando um jato de água!");
    }

    @Override
    public String getNome() {
        return "Água";
    }
}
