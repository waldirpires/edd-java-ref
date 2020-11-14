package u7arvore.eddsex;

import java.util.Scanner;

public class Main {

    static void exibirMenu() {
        System.out.println("TAD Árvore:\n");
        System.out.println("1: criar a árvore (raiz)");
        System.out.println("2: visitar um nó filho");
        System.out.println("3: criar um novo nó filho");
        System.out.println("4: exibir o nó corrente");
        System.out.println("5: exibir a árvore");
        System.out.println("6: sair");
    }

    public static void main(String[] args) {
        TadArvore arvore = null;
        NodoArvore nodoCorrente = null;

        var scanner = new Scanner(System.in);
        int op = 0;

        while (op != 6) {
            exibirMenu();

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o valor do nó raiz: ");
                    int raiz = scanner.nextInt();

                    arvore = new TadArvore(raiz);
                    nodoCorrente = arvore.raiz;

                    break;
                case 2:
                    if (nodoCorrente == null || nodoCorrente.filhos.isEmpty()) {
                        System.out.println("Não existe nós para visitar.");
                    } else {
                        System.out.println("Digite o valor desejado: ");
                        int chave = scanner.nextInt();

                        var novoNodo = nodoCorrente.obterFilho(chave);
                        if (novoNodo == null) {
                            System.out.println("Filho solicitado não existe.\n");
                        } else {
                            nodoCorrente = novoNodo;
                        }
                    }
                    break;
                case 3:
                    if (nodoCorrente == null) {
                        System.out.println("ERRO: Árvore ainda não criada.\n");
                    } else {
                        System.out.println("Digite o valor desejado para o filho: ");
                        int chave = scanner.nextInt();

                        var novoNodo = nodoCorrente.obterFilho(chave);
                        if (novoNodo != null) {
                            System.out.println("Filho solicitado já existe.\n");
                        } else {
                            var novo = new NodoArvore(chave);
                            nodoCorrente.filhos.add(novo);

                            System.out.println("Filho adicionado com sucesso.\n");
                        }

                    }
                    break;
                case 4:
                    if (nodoCorrente == null) {
                        System.out.println("ERRO: Árvore ainda não criada.\n");
                    } else {
                        System.out.println("Exibindo o nó corrente: \n");
                        System.out.println(nodoCorrente);
                    }

                    break;
                case 5:
                    if (nodoCorrente == null) {
                        System.out.println("ERRO: Árvore ainda não criada.\n");
                    } else {
                        arvore.exibir();
                    }

                    break;
            }

            if (nodoCorrente != null) {
                System.out.println(String.format("\nNó corrente:\n%s\n\n", nodoCorrente));
            }
        }

        scanner.close();

    }

}
