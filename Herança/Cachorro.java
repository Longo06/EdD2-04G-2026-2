public class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, String cor, int numeroPatas, String raca) {
        super(nome, cor, numeroPatas); // Chama o construtor da classe mãe (Animal)
        this.raca = raca;
    }

    public void exibirDados() {
        super.exibirDados(); // Exibe nome, cor e patas reaproveitando o código da classe mãe
        System.out.println("Raça: " + this.raca);
    }
}