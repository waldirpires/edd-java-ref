package u5pilha;

import utils.Color;

public class TadCelula {
    int valor;
    TadCelula prox;

    public String toString() {
        return Color.GREEN + String.format("[ %d ] -> ", valor) + Color.RESET;
    }
}