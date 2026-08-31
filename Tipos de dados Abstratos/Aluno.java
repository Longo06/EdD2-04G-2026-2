import java.util.ArrayList;
import java.util.List;

public class Aluno {

    int ra;
    String nome;
    String turma;
    List<Double> notas;

    public Aluno(int ra, String nome, String turma) {
        this.ra = ra;
        this.nome = nome;
        this.turma = turma;
        this.notas = new ArrayList<>();
    }

    public void inserirNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }
}