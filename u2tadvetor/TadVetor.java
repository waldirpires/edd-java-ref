package u2tadvetor;

import java.util.Arrays;

public class TadVetor {

	private static final int MAX = 100;

	private int [] v;

	private int tamanho;

	private int capacidade;

	// construtor para criar a TAD Vetor
	public TadVetor(int capacidade) {
		// alocação dinâmica
		this.v = new int[capacidade];
		this.tamanho = 0;
		this.capacidade = capacidade;

		// homework
		// implementar a inicialização do vetor v
		// todas posições com -1 (vazio)
	}

	// imprime o estado da TAD vetor
	public void imprimir() {
		System.out.println("TAD Vetor");
		System.out.println("Tamanho/Capacidade: " +
		tamanho + "/" + capacidade);
		System.out.println(Arrays.toString(v));
	}

	// insere um novo valor na TAD vetor
	public int inserir(int valor) {
		// verificar se há espaço disponivel
		if (tamanho == capacidade) {
//			System.out.println(
//					"O vetor já está cheio." +
//					" Não foi possível inserir o valor " +
//							valor);
			System.out.println(
					"O vetor já está cheio.");
			//return -1; // não inseriu
			System.out.println("Ampliando o vetor . . .");
			// crescer o vetor para permitir a insercao
			crescer();
		}

		// armazeno o valor
		v[tamanho] = valor;
		// atualizo o tamanho
		tamanho++;
		// retorno o índice onde o valor foi inserido
		return tamanho - 1;
	}

	private void crescer() {
		// criar um vetor temporário maior
		int [] temp = new int[capacidade * 2];
		// copiar os valores do vetor atual para o temporario
		for (int i = 0; i < v.length; i++) {
			temp[i] = v[i];
		}
		// atualizar o vetor para a nova alocacao
		v = temp;
		capacidade = capacidade*2;

		System.out.println("Vetor ampliado para " + capacidade);
	}

}
