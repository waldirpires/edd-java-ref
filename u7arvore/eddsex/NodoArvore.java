package u7arvore.eddsex;

import java.util.ArrayList;
import java.util.List;

public class NodoArvore {

    int valor;

    List<NodoArvore> filhos;

    public NodoArvore(int valor) {
        this.valor = valor;
        filhos = new ArrayList<NodoArvore>();
    }

    @Override
    public String toString() {

        var buffer = new StringBuffer();

        for (NodoArvore filho : filhos) {
            buffer.append(filho.valor).append(' ');
        }

        return String.format("Nó: [%d] -> [ %s ]", valor, buffer.toString().trim());
    }

    public NodoArvore obterFilho(int chave) {
        if (filhos.isEmpty()) {
            return null;
        }

        for (NodoArvore filho : filhos) {
            if (filho.valor == chave) {
                return filho;
            }
        }

        return null;
    }

    public boolean removerFilho(int chave) {
        return false;
    }

}
