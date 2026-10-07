package strategies.poder;

public class PoderGelo implements Poder {
    @Override
    public void usarPoder() {
        System.out.println("Congelando o alvo com um sopro gelado!");
    }

    @Override
    public String getNome() {
        return "Gelo";
    }
}
