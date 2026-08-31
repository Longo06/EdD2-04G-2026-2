import java.util.ArrayList;
import java.util.List;

public class Cofre {
    List<Moeda> moedas;
    public Cofre() {
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.valor;
        }
        return total;
    }
}