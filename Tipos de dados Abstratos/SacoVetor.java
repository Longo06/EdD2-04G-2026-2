import java.util.Iterator;
import java.util.NoSuchElementException;

public class SacoVetor<T> implements Saco<T> {
    private T[] elementos;
    private int tamanho;

    public SacoVetor(int capacidadeInicial) {
        elementos = (T[]) new Object[capacidadeInicial];
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho == elementos.length) {
            redimensionar(2 * elementos.length);
        }
        elementos[tamanho++] = elemento;
    }

    private void redimensionar(int novaCapacidade) {
        T[] copia = (T[]) new Object[novaCapacidade];
        for (int i = 0; i < tamanho; i++) {
            copia[i] = elementos[i];
        }
        elementos = copia;
    }

    public boolean vazio() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = 0;

            public boolean hasNext() {
                return i < tamanho;
            }

            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                return elementos[i++];
            }
        };
    }
}