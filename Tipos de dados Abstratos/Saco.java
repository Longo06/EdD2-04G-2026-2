public interface Saco<T> extends Iterable<T> {
    void adicionar(T elemento);
    boolean vazio();
    int tamanho();
}