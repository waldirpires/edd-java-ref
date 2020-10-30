package atividades.u6lista;

public class TadListaVetores {
    public static final int VAZIO = -1;
    public static final int MAX = 100;

    int[] valores;
    int tamanho;
    int capacidade;

    public TadListaVetores(int capacidade) {
        this.valores = new int[MAX];
        this.tamanho = 0;
        this.capacidade = capacidade;

        this.inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = VAZIO;
        }
    }

    public void exibir() {
        System.out.println("\nTAD Lista Encadeada usando Vetores");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
        System.out.print("PRIMEIRO: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(String.format(" [%d]->", valores[i]));
        }
        System.out.println(" ULTIMO\n");
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean inserirPrimeiro(int chave) {
        if (estahCheia()) {
            System.out.println("\033[0;31mERRO: LISTA está cheia!\033[0m");
            return false;
        }

        // remanejar todos para a direita em 1 posição
        // tam = 7
        // [2, 4, 10, 7, 9, 5, 3, 8]
        //     i
        for (int i = tamanho; i > 0; i--) {
            valores[i] = valores[i-1];
        }
        // insere a nova chave no 1o indice
        valores[0] = chave;
        // incrementa o tamanho
        tamanho++;

        return true;
    }


    public static void main(String[] args) {
        var lista = new TadListaVetores(4);

        lista.exibir();

        int [] v = {4, 10, 7, 9, 5, 3, 8};
        for (int i : v) {
            lista.inserirPrimeiro(i);
            lista.exibir();
        }
    }
}
