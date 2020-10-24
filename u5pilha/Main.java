package u5pilha;

import java.io.IOException;
import java.util.Scanner;

import utils.SystemUtil;

public class Main {

    public static final int SAIR = 10;

    static void exibirMenu() {
        System.out.println("======================================");
        System.out.println("EdD - TAD Pilha\n");

        System.out.println("1. Criar nova pilha");
        System.out.println("2. Exibir pilha");
        System.out.println("3. Empilhar novo item");
        System.out.println("4. Desempilhar item");
        System.out.println("5. Está cheia?");
        System.out.println("6. Está vazia?");
        System.out.println("7. Opter topo");
        System.out.println("8. Pesquisar por uma chave");
        System.out.println("9. Inverter a pilha");
        System.out.println("10. Sair\n");

        System.out.println("Escolha uma das opções acima (1-9):");
    }

    public static void main(String[] args) throws IOException {
        SystemUtil.clearConsole();

        Scanner sc = new Scanner(System.in);
        TadPilha pilha = null;
        int op = 0, chave = 0;
        boolean resultado;

        while (op != SAIR) {
            exibirMenu();

            op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Digite a capacidade desejada: ");
                    int capacidade = sc.nextInt();

                    pilha = new TadPilha(capacidade);

                    System.out.println("Pilha criada com sucesso!");

                    break;
                case 2:

                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }

                    break;
                case 3:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }
                    System.out.println("Digite a chave a ser empilhada: ");
                    chave = sc.nextInt();

                    resultado = pilha.empilhar(chave);

                    System.out.println("Resultado do empilhamento: " + resultado);

                    break;
                case 4:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }

                    chave = pilha.desempilhar();

                    System.out.println("Desempilhando o valor: " + chave);

                    break;
                case 5:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }

                    System.out.println("Está cheia: " + pilha.estahCheia());
                    break;
                case 6:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }

                    System.out.println("Está vazia: " + pilha.estahVazia());
                    break;
                case 7:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }

                    System.out.println("Topo: " + pilha.peek());
                    break;
                case 8:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }
                    System.out.println("Digite a chave a ser pesquisada: ");
                    chave = sc.nextInt();

                    resultado = pilha.pesquisar(chave);

                    System.out.println("Pesquisando pelo valor: " + resultado);

                    break;
                case 9:
                    if (pilha == null) {
                        System.out.println("A Pilha ainda não foi criada.");
                        break;
                    }

                    pilha.inverter();

                    break;
            }

            if (pilha != null) {
                pilha.exibir();
            }

        }

        sc.close();
    }
}
