package u7arvore.eddsex;

import java.util.Scanner;

public class TadArvore {

    NodoArvore raiz;

    public TadArvore(int valor) {
        raiz = new NodoArvore(valor);
    }

    public void exibir() {
        System.out.println("\nTAD Árvore:");
        exibirNo(raiz);

    }

    public void exibirNo(NodoArvore no) {
        System.out.println(no);

        for (NodoArvore filho : no.filhos) {
            exibirNo(filho);
        }
    }
}
