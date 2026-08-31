import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Carro
        Carro carro1 = new Carro("Toyota", "Corolla", "AAA-1234");
        Carro carro2 = new Carro("Honda", "Civic", "BBB-4321");

        carro1.exibirDados();
        carro2.exibirDados();

        //funcionário
        Funcionario funcionario1 = new Funcionario("João", "Silva", 2000);
        Funcionario funcionario2 = new Funcionario("Maria", "Santos", 3000);

        System.out.println("Salário anual de " + funcionario1.nome + ": R$ " + funcionario1.salarioAnual());

        System.out.println("Salário anual de " + funcionario2.nome + ": R$ " + funcionario2.salarioAnual());

        funcionario1.aumentarSalario();
        funcionario2.aumentarSalario();

        System.out.println("\nApós o aumento de 10%:");

        System.out.println("Salário anual de " + funcionario1.nome + ": R$ " + funcionario1.salarioAnual());

        System.out.println("Salário anual de " + funcionario2.nome + ": R$ " + funcionario2.salarioAnual());

        //saco
        System.out.println("=== Testando SacoVetor ===");
        Saco<String> sacoNomes = new SacoVetor<>(2); 
        sacoNomes.adicionar("Ana");
        sacoNomes.adicionar("Carlos");
        sacoNomes.adicionar("Bia");
        
        System.out.println("Tamanho do SacoVetor: " + sacoNomes.tamanho());
        for (String nome : sacoNomes) {
            System.out.println("Nome: " + nome);
        }


        System.out.println("\n=== Testando SacoListaEncadeada ===");
        Saco<Integer> sacoNumeros = new SacoListaEncadeada<>();
        sacoNumeros.adicionar(10);
        sacoNumeros.adicionar(20);
        sacoNumeros.adicionar(30);

        System.out.println("Tamanho do SacoListaEncadeada: " + sacoNumeros.tamanho());
        for (Integer numero : sacoNumeros) {
            System.out.println("Número: " + numero);
        }

        //Aluno
        Aluno aluno1 = new Aluno(1, "João", "2A");
        Aluno aluno2 = new Aluno(2, "Maria", "2A");
        Aluno aluno3 = new Aluno(3, "Pedro", "2B");

        aluno1.inserirNota(8.0);
        aluno1.inserirNota(7.5);
        aluno1.inserirNota(9.0);

        aluno2.inserirNota(6.0);
        aluno2.inserirNota(8.0);
        aluno2.inserirNota(7.0);

        aluno3.inserirNota(10.0);
        aluno3.inserirNota(9.0);
        aluno3.inserirNota(8.0);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome + " - Média: " + aluno.calcularMedia());
        }

        //Produto/Pedido
        Produto cafe = new Produto("Café solúvel", 5.50f, 1);
        Produto arroz = new Produto("Arroz integral", 4.90f, 2);
        Produto feijao = new Produto("Feijão preto", 2.80f, 2);

        Pedido meuPedido = new Pedido();
        meuPedido.adicionarProduto(cafe);
        meuPedido.adicionarProduto(arroz);
        meuPedido.adicionarProduto(feijao);

        System.out.printf("O valor total é: %f \n", meuPedido.calcularValor());

        //Moeda/Cofre
        Moeda moeda1 = new Moeda(0.25f);
        Moeda moeda2 = new Moeda(0.50f);
        Moeda moeda3 = new Moeda(1.00f);

        Cofre cofre = new Cofre();

        cofre.adicionar(moeda1);
        cofre.adicionar(moeda2);
        cofre.adicionar(moeda3);

        System.out.printf("O valor total é: %.2f", cofre.calcularTotal());
    }
}