    public static int contarNosIterativo(No raiz) {
        if (raiz == null) {
            return 0;
        }

        int contador = 0;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll(); 
            contador++;

            if (atual.esquerda != null) {
                fila.add(atual.esquerda);
            }
            if (atual.direita != null) {
                fila.add(atual.direita);
            }
        }

        return contador;
    }