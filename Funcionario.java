public class Funcionario {

    String nome;
    String sobrenome;
    double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0;
        }
    }

    public void aumentarSalario() {
        salarioMensal = salarioMensal * 1.10;
    }

    public double salarioAnual() {
        return salarioMensal * 12;
    }
}