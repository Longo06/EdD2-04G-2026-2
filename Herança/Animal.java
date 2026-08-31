public class Animal {
    public String nome;
    public String cor;
    public int numeroPatas;


    public Animal(String nome, String cor, int numeroPatas) {
        this.nome = nome;
        this.cor = cor;
        this.numeroPatas = numeroPatas;
    }


    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Número de patas: " + this.numeroPatas);
    }
}