package u4listaduplenc.vetores;

public class TadListaVetores {

    private static final int MAX = 100;
    private static final int VAZIO = -1;

    int[] valores;
    int fim;
    int tamanho;
    int capacidade;

    public TadListaVetores(int capacidade) {
        this.valores = new int[MAX];
        this.tamanho = 0;
        this.capacidade = capacidade;

        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = VAZIO;
        }
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean estahVazia() {
        return tamanho == 0;
    }

    public void exibir() {
        System.out.println("\nTAD Lista usando Vetores");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d", tamanho, capacidade));
        System.out.print("PRIMEIRO: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(String.format(" [%d]->", valores[i]));
        }
        System.out.println(" ULTIMO\n");
    }

    public int obterPrimeiro() {
        if (estahVazia()) {
            return VAZIO;
        }

        return valores[0];
    }

    public int obterUltimo() {
        if (estahVazia()) {
            return VAZIO;
        }

        return valores[tamanho - 1];
    }

    public void inserirUltimo(int chave) {
        if (tamanho == capacidade) {
            return;
        }

        valores[tamanho] = chave;
        tamanho++;
    }

    public void inserirPrimeiro(int chave) {
        if (tamanho == capacidade) {
            return;
        }

        for (int i = 1; i <= tamanho; i++) {
            valores[i] = valores[i - 1];
        }

        valores[0] = chave;
        tamanho++;
    }

    public int retirarUltimo() {
        if (tamanho == 0) {
            return -1;
        }

        tamanho--;
        int chave = valores[tamanho];

        return chave;
    }

    public int retirarPrimeiro() {
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

    public boolean retirar(int chave) {
        if (estahVazia()) {
            return false;
        }

        int indice = pesquisar(chave);

        if (chave == VAZIO) {
            return false;
        }

        for (int i = indice; i <= tamanho; i++) {
            valores[i] = valores[i + 1];
        }
        tamanho--;

        return true;
    }

    public int contar(int chave) {
        if (estahVazia()) {
            return -1;
        }

        int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == chave) {
                cont++;
            }
        }

        return cont;
    }

    public int pesquisar(int chave) {
        if (estahVazia()) {
            return -1;
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == chave) {
                return i;
            }
        }

        return -1;
    }

    public boolean inverter() {
        return false;
    }

    public boolean inserirOrdenado(int chave) {
        return false;
    }

    public void inserirVarios(int[] chaves) {

    }

    public static void main(String[] args) {
        TadListaVetores lista = new TadListaVetores(20);

        lista.exibir();

        lista.inserirPrimeiro(2);
        lista.exibir();
        lista.inserirPrimeiro(3); // 3->2
        lista.exibir();
        lista.inserirUltimo(6); // 3->2->6
        lista.exibir();

        lista.retirarPrimeiro();// 2->6
        lista.exibir();
        lista.retirarUltimo(); // 2
        lista.exibir();
        lista.retirarPrimeiro();
        lista.exibir();

        int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        for (int i : valores) {
            lista.inserirUltimo(i);
        }
        lista.exibir();

        System.out.println("Primeiro: " + lista.obterPrimeiro());
        System.out.println("Ultimo: " + lista.obterUltimo());

        lista.retirar(5);
        lista.exibir();
    }

}
