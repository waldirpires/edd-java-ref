package u6fila;

public class TadCelula {
    int valor;
    TadCelula prox;

    // construtor - celula cabeca
    public TadCelula() {

    }

    // construtor com valor
    public TadCelula(int valor) {
        this.valor = valor;
    }

    public String toString() {
        return "[ " + valor + " ] -> ";
    }
}
