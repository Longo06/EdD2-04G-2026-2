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
    }
}