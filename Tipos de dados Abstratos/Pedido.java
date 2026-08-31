import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<Produto> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public float calcularValor() {
        float valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += (produto.preco * produto.quantidade);
        }
        return valorTotal;
    }
}