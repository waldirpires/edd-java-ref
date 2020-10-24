package u6fila;

public class TadCelula {
    int valor;
    TadCelula prox;

    // construtor
    public TadCelula() {
    }

    // construtor
    public TadCelula(int chave) {
        this.valor = chave;
    }

    public String toString() {
        return "[ " + valor + " ] -> ";
    }
}
