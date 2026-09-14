import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    //Ex 1 - contador de nós
    public int contarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.esquerda) + contarNos(no.direita);
    }

    // Ex 2 - Contador de folhas
    public int contarFolhas(No no) {
        if (no == null) {
            return 0;
        }
        if (no.esquerda == null && no.direita == null) {
            return 1;
        }
        return contarFolhas(no.esquerda) + contarFolhas(no.direita);
    }

    // Ex 3 - Contador de nós internos | filhos > 1
    public int contarNosInternos(No no) {
        if (no == null || (no.esquerda == null && no.direita == null)) {
            return 0;
        }
        return 1 + contarNosInternos(no.esquerda) + contarNosInternos(no.direita);
    }

    // Ex 4 - percurso pré-ordem
    public void preOrdemIterativo(No raiz) {
        if (raiz == null) return;

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.valor + " ");

            // Empilha primeiro o direito para processar o esquerdo antes
            if (atual.direita != null) {
                pilha.push(atual.direita);
            }
            if (atual.esquerda != null) {
                pilha.push(atual.esquerda);
            }
        }
        System.out.println();
    }

    // Ex 5 - percorrer a árvore por nível
    public void percursoPorNivel(No raiz) {
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");

            if (atual.esquerda != null) {
                fila.add(atual.esquerda);
            }
            if (atual.direita != null) {
                fila.add(atual.direita);
            }
        }
        System.out.println();
    }

    // Ex 6 - busca e inserção
    public No inserir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        }
        return no;
    }

    public boolean buscar(No no, int valor) {
        if (no == null) {
            return false;
        }
        if (no.valor == valor) {
            return true;
        }
        if (valor < no.valor) {
            return buscar(no.esquerda, valor);
        } else {
            return buscar(no.direita, valor);
        }
    }

    // Ex 7 - calcular altura
    public int calcularAltura(No no) {
        if (no == null) {
            return -1; // Considera altura da árvore vazia como -1 (ou 0 dependendo da convenção)
        }
        int alturaEsquerda = calcularAltura(no.esquerda);
        int alturaDireita = calcularAltura(no.direita);

        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }
}