import java.util.Iterator;
import java.util.NoSuchElementException;

public class SacoListaEncadeada<T> implements Saco<T> {
    private class No {
        T item;
        No proximo;
    }

    private No primeiro;
    private int tamanho;

    public SacoListaEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        No antigoPrimeiro = primeiro;
        primeiro = new No();
        primeiro.item = elemento;
        primeiro.proximo = antigoPrimeiro;
        tamanho++;
    }

    public boolean vazio() {
        return primeiro == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private No atual = primeiro;

        public boolean hasNext() {
            return atual != null;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T item = atual.item;
            atual = atual.proximo;
            return item;
        }
    }
}