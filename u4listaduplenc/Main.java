package u4listaduplenc;

class Main {
    public static void main(String[] args) {
        // criando a lista atraves do construtor
        TadListaDuplEnc lista = new TadListaDuplEnc(4);
        lista.exibir();

        int[] v = { 2, 3, 7 };
        for (int i = 0; i < v.length; i++) {
            lista.inserir(v[i]);
            lista.exibir();
        }
        System.out.println("\n\nLista invertida: ");
        lista.exibirInvertido();

        // Efeito
        System.out.print("Pesquisando" + "." + "." + ".");

        // PESQUISAR
        boolean encontr = lista.pesquisar(9);
        if (encontr) {
            System.out.println("Encontrado");
        } else
            System.out.println("Não encontrado");

        // INSERIR ORDENADO
        lista.inserirOrdenado(v[5]);
        lista.exibir();
    }
}