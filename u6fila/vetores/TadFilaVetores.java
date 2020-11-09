package u6fila.vetores;

public class TadFilaVetores {
    private static final int MAX = 100;

    int[] valores;
    int fim;
    int tamanho;
    int capacidade;

    public TadFilaVetores(int capacidade) {
        this.valores = new int[MAX];
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
        System.out.println("\nTAD Fila usando Vetores");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
        System.out.print("FRENTE: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(String.format(" [%d]->", valores[i]));
        }
        System.out.println(" TRÁS\n");
    }

    public void enfileirar(int chave) {
        if (tamanho == capacidade) {
            return;
        }

        valores[tamanho] = chave;
        tamanho++;
    }

    public void furarFila(int chave) {
        if (tamanho == capacidade) {
            return;
        }

        for (int i = tamanho; i > 0; i--) {
            valores[i] = valores[i - 1];
        }

        valores[0] = chave;
        tamanho++;
    }

    public int desenfileirar() {
        if (tamanho == 0) {
            return -1;
        }

        int chave = valores[0];

        for (int i = 0; i <= tamanho; i++) {
            valores[i] = valores[i + 1];
        }

        tamanho--;

        return chave;
    }

    public boolean pesquisar(int chave) {
        return false;
    }

    public boolean inverter() {
        return false;
    }

    public static void main(String[] args) {
        TadFilaVetores lista = new TadFilaVetores(20);

        lista.exibir();

        lista.enfileirar(2);
        lista.exibir();
        lista.enfileirar(3); // 3->2
        lista.exibir();
        lista.furarFila(6); // 3->2->6
        lista.exibir();

        lista.desenfileirar();// 2->6
        lista.exibir();
        lista.desenfileirar(); // 2
        lista.exibir();
        lista.desenfileirar();
        lista.exibir();
    }

}
