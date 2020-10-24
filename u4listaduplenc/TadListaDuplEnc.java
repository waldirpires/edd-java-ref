package u4listaduplenc;

class TadListaDuplEnc {
    TadCelulaDuplEnc primeiro;
    TadCelulaDuplEnc ultimo;
    int tamanho;
    int capacidade;

    // construtor
    public TadListaDuplEnc(int capacidade) {
        TadCelulaDuplEnc cabeca = new TadCelulaDuplEnc();
        this.primeiro = cabeca;
        this.ultimo = cabeca;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    // true se for igual, false o contrário
    public boolean estahCheia() {
        return (tamanho == capacidade);
    }

    public boolean estahVazia() {
        return this.tamanho == 0;
    }

    public boolean inserir(int chave) {
        if (estahCheia()) {
            System.out.println("Lista está cheia!");
            return false;
        }

        TadCelulaDuplEnc nova = new TadCelulaDuplEnc();
        ultimo.prox = nova;
        nova.ant = ultimo;
        ultimo = nova;
        nova.valor = chave;
        tamanho++;

        return true;
    }

    public void exibir() {
        System.out.println("\nTAD Lista Duplamente Encadeada");
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Capacidade: " + capacidade);

        TadCelulaDuplEnc aux = primeiro.prox;
        while (aux != null) {
            System.out.print(" [ " + aux.valor + " ] <-> ");
            aux = aux.prox;
        }
        System.out.println("NULL");
    }

    public boolean pesquisar(int chave) {
        TadCelulaDuplEnc aux = primeiro.prox;
        // enquanto eu não chegar no final E o valor na celula for
        // diferente do valor de pesquisa
        while (aux != null && aux.valor != chave) {
            aux = aux.prox;
        }

        if (aux == null) {
            return false; // 1a condição, não achou
        } else {
            return true; // 2a condição, achou
        }
    }

    public void exibirInvertido() {
        System.out.println("\nTAD Lista Duplamente Encadeada");
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Capacidade: " + capacidade);

        // começando pelo último
        TadCelulaDuplEnc aux = ultimo;
        System.out.print(" Ultimo -> ");
        while (aux != this.primeiro) {
            System.out.print(" [ " + aux.valor + " ] <-> ");
            aux = aux.ant;
        }
        System.out.println(" Primeiro");
    }

    public boolean retirar(int chave) {
        if (estahVazia()) {
            System.out.println("Lista está vazia.");
            return false;
        }

        TadCelulaDuplEnc aux = primeiro.prox;
        // enquanto tiver celula e valor for
        // diferente do valor a ser retirado
        while (aux != null && aux.valor != chave) {
            aux = aux.prox;
        }

        // não achou
        if (aux == null) {
            return false;
        }

        TadCelulaDuplEnc ant = aux.ant;
        ant.prox = aux.prox;
        this.tamanho--;

        // se a celula a ser retirada for a ultima
        // é necessario atualizar a nova ultima célula
        if (aux == ultimo) {
            ultimo = aux.ant;
        }

        return true;
    }

    public void inverter() {
        TadListaDuplEnc temp = new TadListaDuplEnc(this.capacidade);

        TadCelulaDuplEnc aux = ultimo;
        while (aux != null) {
            temp.inserir(aux.valor);
            aux = aux.ant;
        }

        this.primeiro = temp.primeiro;
        this.ultimo = temp.ultimo;
    }

    public boolean inserirOrdenado(int chave) {
        if (estahCheia()) {
            System.out.println("Lista está cheia!");
            return false;
        }

        TadCelulaDuplEnc ant = primeiro;
        TadCelulaDuplEnc aux = primeiro.prox;
        // enquanto tiver celula e valor for
        // diferente do valor a ser retirado
        while (aux != null && aux.valor < chave) {
            ant = aux;
            aux = aux.prox;
        }

        // criar a nova célula com valor
        TadCelulaDuplEnc nova = new TadCelulaDuplEnc();
        nova.valor = chave;

        // nova célula inserida entre o aux e o aux.prox
        ant.prox = nova;
        nova.ant = ant;
        nova.prox = aux;

        if (aux == null) {
            ultimo = nova;
        } else {
            aux.ant = nova;
        }

        tamanho++;

        return true;
    }

    public void inserirVarios(int[] chaves) {
        for (int chave : chaves) {
            this.inserir(chave);
        }
    }

}