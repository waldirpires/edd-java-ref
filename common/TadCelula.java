package common;

// Célula do encadeamento
public class TadCelula {
    // valor armazenado na célula
    public int valor;
    // referência para a próxima célula no encadeamento
    public TadCelula prox;

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
