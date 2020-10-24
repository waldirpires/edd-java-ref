package u3listaenc;

public class Main {

    static void exibirMenu() {
      System.out.println("TAD Lista Encadeada:\n");
      System.out.println("Opções:\n");
      System.out.println("1. Criar uma nova lista encadeada");
      System.out.println("2. Inserir uma nova chave");
      System.out.println("3. Listar as chaves da lista");
      System.out.println("4. Pesquisar por uma chave");
      System.out.println("5. Remover uma chave");
      System.out.println("6. Sair do programa\n\n");

      System.out.println("Digite a opção desejada: ");

    }
    public static void main(String[] args) {
    // criar a lista vazia
    TadListaEncadeada lista = new TadListaEncadeada(10);

    System.out.println("\nPrimeiro:" + lista.primeiro);
    System.out.println("\nUltimo:" + lista.ultimo);

    // lista está vazia
    // equals compara se dois objetos são iguais
    if (lista.estahVazia()) {
      System.out.println("Lista vazia!\n");
    }

    // insercao
    int [] v = {3,8,5,1,9,4,6};
    for (int i = 0; i < v.length; i++) {
      System.out.println("Inserindo " + (v[i]));
      lista.inserir(v[i]);
      lista.exibir();
    }

    }
}
