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
        // i
        for (int i = tamanho; i > 0; i--) {
            valores[i] = valores[i - 1];
        }
        // insere a nova chave no 1o indice
        valores[0] = chave;
        // incrementa o tamanho
        tamanho++;

        return true;
    }

    public boolean inserirUltimo(int chave) {
        // verificar se está cheio
        if (estahCheia()) {
            System.out.println("\033[0;31mERRO: LISTA está cheia!\033[0m");
            return false;
        }

        // tam = 8
        // [2, 4, 10, 7, 9, 5, 3, 8, 15]
        valores[tamanho] = chave;
        tamanho++;

        return true;
    }

    public boolean estahVazia() {
        return tamanho == 0;
    }

    public int retirarPrimeiro() {
        // verificar se está vazia
        if (estahVazia()) {
            System.out.println("\033[0;31mERRO: LISTA está vazia!\033[0m");
            return VAZIO;
        }

        // tam = 7
        // [4, 10, 7, 9, 5, 3, 8]
        // *
        int chave = valores[0];
        // *
        // remanejar elementos da direita para a esquerda (<-)
        for (int i = 0; i < tamanho; i++) {
            valores[i] = valores[i + 1];
        }
        // atualizar o tamanho
        tamanho--;

        return chave;
    }

    public void inverter() {
        // criar lista temporária
        var temp = new TadListaVetores(this.capacidade);

        // iterar a lista de forma invertida
        // tam = 7
        // [4, 10, 7, 9, 5, 3, 8]
        // *
        // [8, 3, 5, 9, 7, 10, 4]
        for (int i = 0; i < tamanho; i++) {
            int chave = valores[i];
            temp.inserirPrimeiro(chave); // LIFO (Pilha)
        }

        // atualizar o vetor da lista para o vetor invertido
        this.valores = temp.valores;
    }

    public boolean empilhar(int chave) { // PILHA - LIFO
        return inserirPrimeiro(chave);
    }

    public int desempilhar() { // PILHA - LIFO
        return retirarPrimeiro();
    }

    public boolean enfileirar(int chave) { // FILA
        return inserirUltimo(chave);
    }

    public int desenfileirar() { // FILA - FIFO
        // FRENTE [8, 3, 5, 9, 7, 10, 4] TRAS
        //
        return retirarPrimeiro();
    }

    // - inserir em posição específica
    public boolean inserirPosEspecifica(int pos, int chave) {
        return false;
    }

    // - retirar em posição específica
    public boolean retirarPosEspecifica(int pos, int chave) {
        return false;
    }
    // - inserirOrdenado
    public boolean inserirOrdenado(int chave) {
        return false;
    }
    // - atualizar(indice, valor)
    public boolean atualizarPosEspecifica(int pos, int chave){
        // pos: 38
        // valor 15

        // [8, 3, 15, 9, 7, 10, 4]
        //        *
        return false;
    }

    public static void main(String[] args) {
        var lista = new TadListaVetores(20);

        lista.exibir();

        int[] v = { 4, 10, 7, 9, 5, 3, 8 };
        for (int i : v) {
            lista.inserirPrimeiro(i);
            lista.exibir();
        }

        // inverter
        lista.inverter();
        lista.exibir();

        // pilha
        // lista.empilhar(18);
        // lista.exibir();
        // int chave = lista.desempilhar();
        // System.out.println("Retirou a chave: " + chave);
        // lista.exibir();

        // fila
        lista.enfileirar(23);
        lista.exibir();
        int chave = lista.desenfileirar();
        System.out.println("Retirou a chave: " + chave);
        lista.exibir();

        // int chave = 0;
        // // validar se a chave foi removida
        // if ((chave = lista.retirarPrimeiro()) != VAZIO) {
        // System.out.println("Retirou a chave: " + chave);
        // }
        // lista.exibir();

        // while (!lista.estahVazia()) {
        // chave = lista.retirarPrimeiro();
        // System.out.println("Retirou a chave: " + chave);
        // lista.exibir();
        // }

        // // estado final da lista
        // lista.exibir();
    }
}
