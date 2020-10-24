package u5pilha;

import utils.Color;

public class TadPilha {

    public static final int VAZIO = -1;

    TadCelula topo;
    TadCelula fundo;
    int tamanho;
    int capacidade;

    public TadPilha(int capacidade) {
        TadCelula cabeca = new TadCelula();
        this.topo = cabeca;
        this.fundo = cabeca;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void exibir() {
        System.out.println("\n\nTAD Pilha: ");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));

        TadCelula aux = this.topo.prox;
        System.out.print(Color.YELLOW + "TOPO: " + Color.RESET);
        while (aux != null) {
            System.out.print(aux);
            aux = aux.prox;
        }
        System.out.println(Color.YELLOW + " FUNDO\n\n" + Color.RESET);
    }

    public boolean pesquisar(int chave) {
        if (estahVazia()) {
            System.out.println("Pilha está vazia!");
            return false;
        }

        TadCelula aux = this.topo.prox;
        while (aux != null && aux.valor != chave) {
            aux = aux.prox;
        }

        return aux != null;
    }

    public boolean estahVazia() {
        return topo == fundo;
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean empilhar(int chave) {
        if (estahCheia()) {
            System.out.println("Pilha está cheia!");
            return false;
        }

        TadCelula nova = new TadCelula();

        topo.valor = chave;
        nova.prox = topo;
        topo = nova;
        tamanho++;

        return true;
    }

    public int desempilhar() {
        if (estahVazia()) {
            System.out.println("Pilha está vazia!");
            return VAZIO;
        }

        TadCelula aux = topo.prox;

        if (topo.prox == null) {
            fundo = topo;
            topo.prox = null;
        } else {
            topo.prox = aux.prox;
        }

        tamanho--;

        return aux.valor;
    }

    public int peek() {
        if (estahVazia()) {
            System.out.println("Pilha está vazia!");
            return VAZIO;
        }

        return topo.prox.valor;
    }

    public void inverter() {

        TadCelula prev, cur, succ;
        cur = prev = this.topo.prox;
        cur = cur.prox;
        prev.prox = null;
        while (cur != null) {

            succ = cur.prox;
            cur.prox = prev;
            prev = cur;
            cur = succ;
        }
        this.topo.prox = prev;

    }
}
