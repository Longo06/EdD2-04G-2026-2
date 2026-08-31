public class Main {
    public static void main(String[] args) {

        //Ex 1 - hierarquia
        Pessoa pessoa1 = new Pessoa(1, "Nome da Pessoa");
        PessoaJuridica p_juridica = new PessoaJuridica(2, "Nome da Pessoa Juridica", "111111111");
        PessoaFisica p_fisica = new PessoaFisica(3, "Nome da Pessoa Fisica", "22222222", "333333333");

        System.out.printf("Id: %d\n", pessoa1.identificador);
        System.out.println("Nome: " + pessoa1.nome);

        System.out.printf("Id: %d\n", p_juridica.identificador);
        System.out.println("Nome: " + p_juridica.nome);
        System.out.println("CNPJ: " + p_juridica.cnpj);

        System.out.printf("Id: %d\n", p_fisica.identificador);
        System.out.println("Nome: " + p_fisica.nome);
        System.out.println("RG: " + p_fisica.rg);
        System.out.println("CPF: " + p_fisica.cpf);

        //Ex 2 - cachorro
        Animal animal = new Animal("Passarinho", "Azul", 2);
        animal.exibirDados();
        
        System.out.println("---------------------");

        Cachorro dog = new Cachorro("Rex", "Marrom", 4, "Vira lata");
        dog.exibirDados();

        //Ex 3 - imóvel
        Imovel imovel = new Imovel("Rua Silva, 123", 300000.0);
        ImovelNovo imovel_novo = new ImovelNovo("Rua Joaquim, 999", 250000.0, 20000.0);
        ImovelVelho imovel_velho = new ImovelVelho("Av. Brasil, 777", 500000.0, 35000.0);

        System.out.println(imovel.endereco);
        System.out.printf("Preço: %f\n", imovel.preco);

        System.out.println(imovel_novo.endereco);
        System.out.printf("Preço: %f\n", imovel_novo.preco);
        System.out.printf("Preço atual: %f\n", imovel_novo.calcularPreco());

        System.out.println(imovel_velho.endereco);
        System.out.printf("Preço: %f\n", imovel_velho.preco);
        System.out.printf("Preço atual: %f\n", imovel_velho.calcularPreco());
    }
}