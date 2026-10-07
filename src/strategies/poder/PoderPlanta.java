package strategies.poder;

public class PoderPlanta implements Poder {
    @Override
    public void usarPoder() {
        System.out.println("Lançando folhas afiadas e chicotes de vinha!");
    }

    @Override
    public String getNome() {
        return "Planta";
    }
}
