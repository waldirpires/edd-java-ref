package u5pilha.vetores;

public class TadPilhaVetores {
    int[] valores;
    int fim;
    int tamanho;
    int capacidade;

    public TadPilhaVetores(int capacidade) {
        this.valores = new int[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean estahVazia() {
        return tamanho == 0;
    }

    public void exibir() {
        System.out.println("\nTAD Pilha usando Vetores");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
        System.out.print("TOPO: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(String.format(" [%d]->", valores[i]));
        }
        System.out.println(" FUNDO\n");
    }

    public void empilhar(int chave) {
        if (tamanho == capacidade) {
            return;
        }

        valores[tamanho] = chave;
        tamanho++;
    }

    public int desempilhar() {
        if (tamanho == 0) {
            return -1;
        }

        tamanho--;
        int chave = valores[tamanho];

        return chave;
    }

    public int obterTopo() {
        if (tamanho == 0) {
            return -1;
        }

        return valores[tamanho - 1];
    }

    public int obterFundo() {
        if (tamanho == 0) {
            return -1;
        }

        return valores[0];
    }

    public boolean pesquisar(int chave) {
        return false;
    }

    public boolean inverter() {
        return false;
    }

    public boolean afundarTopo() {
        return false;
    }

    public boolean subirFundo() {
        return false;
    }

    public static void main(String[] args) {
        TadPilhaVetores pilha = new TadPilhaVetores(5);

        pilha.exibir();

        int[] valores = { 5, 2, 8, 7, 1, 9 };
        for (int i : valores) {
            pilha.empilhar(i);
            pilha.exibir();
        }

        while (pilha.tamanho != 0) {
            pilha.desempilhar();
            pilha.exibir();
        }
    }

}
