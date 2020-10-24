package u2tadvetor;

public class Principal {

	public static void main(String[] args) {

		// criar um novo obj de TAD vetor
		var tadVetor = new TadVetor(10);

		// imprimir as informações de TAD vetor
		tadVetor.imprimir();

		System.out.println("\n\n");

		for (int i = 0; i < 12; i++) {
			tadVetor.inserir(i+1);
			tadVetor.imprimir();
			System.out.println("\n\n");
		}
	}

}
