public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.raiz = arvore.inserir(arvore.raiz, 25);
        arvore.inserir(arvore.raiz, 10);
        arvore.inserir(arvore.raiz, 5);
        arvore.inserir(arvore.raiz, 2);
        arvore.inserir(arvore.raiz, 20);
        arvore.inserir(arvore.raiz, 30);
        arvore.inserir(arvore.raiz, 27);
        arvore.inserir(arvore.raiz, 29);
        arvore.inserir(arvore.raiz, 50);

        System.out.println("1. Total de nós: " + arvore.contarNos(arvore.raiz));
        System.out.println("2. Total de folhas: " + arvore.contarFolhas(arvore.raiz));
        System.out.println("3. Total de nós internos: " + arvore.contarNosInternos(arvore.raiz));
        
        System.out.print("4. Pré-ordem iterativo: ");
        arvore.preOrdemIterativo(arvore.raiz);

        System.out.print("5. Por nível: ");
        arvore.percursoPorNivel(arvore.raiz);

        System.out.println("6. Busca pelo valor 27: " + arvore.buscar(arvore.raiz, 27));
        System.out.println("6. Busca pelo valor 99: " + arvore.buscar(arvore.raiz, 99));

        System.out.println("7. Altura da árvore: " + arvore.calcularAltura(arvore.raiz));
    }
}