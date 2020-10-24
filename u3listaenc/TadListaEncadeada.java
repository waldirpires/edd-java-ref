package u3listaenc;

import common.TadConstants;
import common.TadCelula;

public class TadListaEncadeada {
  TadCelula primeiro;
  TadCelula ultimo;
  int tamanho;
  int capacidade;

  // construtor da classe TAD Lista Encadeada
  public TadListaEncadeada(int capacidade) {
    // celula cabeca criada
    this.primeiro = new TadCelula();
    // ultimo aponta para primeiro
    this.ultimo = this.primeiro;
    // lista inicialmente vazia
    this.tamanho = 0;
    // lista com capacidade informada
    this.capacidade = capacidade;
  }

  // exibe as informações da lista encadeada na tela
  public void exibir() {
    System.out.println("TAD Lista Encadeada");
    System.out.println("Tamanho/Capacidade: " + tamanho + "/" + capacidade);
    System.out.print("Primeiro -> ");
    TadCelula aux = primeiro.prox;
    while (aux != null) {
      System.out.print(aux);
      aux = aux.prox;
    }
    System.out.println(" ÚLTIMO\n");
  }

  // informa se a lista está vazia ou não
  public boolean estahVazia() {
    return primeiro == ultimo;
  }

  // informa se a lista está cheia ou não
  public boolean estahCheia() {
    return tamanho == capacidade;
  }

  public void inserir(int valor) {
    // estah cheia?
    if (estahCheia()) {
      System.out.println("Lista está CHEIA!\n\n");
    } else {
      // criar nova célula
      TadCelula nova = new TadCelula();
      // ultimo aponta para a nova célula
      ultimo.prox = nova;
      // ultimo agora fica sendo a nove célula
      ultimo = nova;
      // coloca a chave na nova célula
      nova.valor = valor;
      // atualiza o tamanho
      tamanho++;
    }
  }

  // retira uma chave informada
  // retorna true se retirar, false o contrário
  public boolean retirar(int chave) {
    return false;
  }

  // insere  uma chave informada de forma ordenada
  // retorna true se inserir, false o contrário
  public boolean inserirOrdenado(int chave) {
    if (estahCheia()) {
      System.out.println("Lista está cheia!");
      return false;
    }

    System.out.println("Inserindo de forma ordenada a chave: " + chave);

    TadCelula aux = this.primeiro.prox;
    TadCelula ant = this.primeiro;

    while (aux != null) {
      if (aux.valor > chave) {
        break;
      }
      ant = aux;
      aux = aux.prox;
    }

    TadCelula nova = new TadCelula();
    nova.valor = chave;
    ant.prox = nova;
    nova.prox = aux;

    this.tamanho++;

    return true;

  }

  public boolean removerUltima() {
    System.out.println("Pesquisando pela última célula para remoção");

    if (estahVazia()) {
      System.out.println("Lista está vazia.");
      return false;
    }

    TadCelula aux = this.primeiro.prox;
    TadCelula ant = this.primeiro;

    while (aux.prox != null) {
      ant = aux;
      aux = aux.prox;
    }

    this.ultimo = ant;
    ant.prox = null;

    this.tamanho--;

    return true;
  }

  public int removerPrimeira() {
    System.out.println("Removendo a 1a célula da lista");

    if (estahVazia()) {
      System.out.println("Lista está vazia.");
      return TadConstants.VAZIO;
    }

    var aux = this.primeiro.prox;
    this.primeiro.prox = this.primeiro.prox.prox;
    this.tamanho--;

    return aux.valor;
  }

  public boolean remover(int chave) {
    System.out.println("Pesquisando pela chave: " + chave + " para remoção");

    TadCelula aux = this.primeiro.prox;
    TadCelula ant = this.primeiro;

    while (aux != null) {
      if (aux.valor == chave) {
        break;
      }
      ant = aux;
      aux = aux.prox;
    }

    if (aux == null) {
      return false;// nao encontrada
    }

    ant.prox = aux.prox;
    this.tamanho--;

    return true;
  }

  public int obterIndice(int chave) {
    System.out.println("Pesquisando pela chave: " + chave);

    TadCelula aux = this.primeiro.prox;

    int pos = -1;
    while (aux != null) {
      pos++;
      if (aux.valor == chave) {
        return pos;
      }
      aux = aux.prox;
    }

    return TadConstants.VAZIO;
  }

  public boolean pesquisa(int chave) {
    return obterIndice(chave) != TadConstants.VAZIO;
  }

  public boolean alterar(int valor, int novoValor) {
    return false;
  }

}
