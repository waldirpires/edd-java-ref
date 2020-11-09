package u6fila;

import common.TadCelula;

public class TadFila {

    public static final int VAZIO = -1;

    TadCelula frente;
    TadCelula tras;
    int tamanho;
    int capacidade;

    // construtor
    public TadFila(int capacidade) {
        TadCelula cabeca = new TadCelula();
        this.frente = cabeca;
        this.tras = cabeca;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void exibir() {
        System.out.println("\n\nTAD Fila: ");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));
        TadCelula aux = frente.prox;
        System.out.print("FRENTE: ");
        while (aux != null) {
            System.out.print(aux);
            aux = aux.prox;
        }

        System.out.println(" TRÁS\n");
    }

    public boolean estahVazia() {
        return frente == tras;
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean enfileirar(int chave) {
        // 1. verficar se está cheia.
        if (estahCheia()) {
            System.out.println("A Fila está CHEIA!");
            return false;
        }

        // 2. criar a nova TadCelula
        var nova = new TadCelula(chave);
        // 3. atribuir a chave na nova celula
        // 4. colocar a nova celula atrás da Fila
        this.tras.prox = nova;
        // 5. atualizar a tras da fila
        this.tras = nova;
        // 6. atualizar o tamanho da fila
        this.tamanho++;

        return true;
    }

    public int desenfileirar() {
        // 1. verificar se não está vazia
        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return VAZIO;
        }

        // 2. atribuir a célula a ser removida
        var aux = this.frente.prox;
        // 3. atualizar a frente
        this.frente = frente.prox;
        // 4. atualizar o tamanho
        this.tamanho--;

        return aux.valor;
    }

    public boolean pesquisar(int chave) {
        return false;
    }

    public int obterFrente() {
        // 1. verificar se não está VAZIA
        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return VAZIO;
        }
        // 2. retornar o valor na frente da fila
        return this.frente.prox.valor;
    }

    public int obterTras() {
        // 1. verificar se não está VAZIA
        if (estahVazia()) {
            System.out.println("A Fila está VAZIA!");
            return VAZIO;
        }
        // 2. retornar o valor na frente da fila
        return this.tras.valor;
    }

    /**
     * Permite inverter a fila.
     */
    public void inverter() {

    }

    /**
     * Altera um valor existente na fila (de original para o novo).
     *
     * ex: fila.alterar(3, 7); altera do 3 para o 7.
     *
     * @return true se a alteração for bem sucedida, false o contrário
     */
    public boolean alterarValor(int original, int novo) {
        return false;
    }

    /**
     * Permite desenfileirar quem está na frente e colocá-lo atrás da fila.
     *
     * @return true se a troca for bem sucedida, false o contrário
     */
    public boolean jogarFrenteParaTras() {
        return false;
    }

    /**
     * Permite colocar quem está atrás na fila na sua frente.
     *
     * @return true se a troca for bem sucedida, false o contrário
     */
    public boolean jogarTrasParaFrente() {
        return false;
    }

    public boolean furarFila(int chave) {

        if (estahCheia()) {
            System.out.println("Fila está cheia!");
            return false;
        }

        TadCelula aux = frente.prox;
        TadCelula nova = new TadCelula(chave);
        frente.prox = nova;
        nova.prox = aux;
        tamanho++;

        return true;
    }
}