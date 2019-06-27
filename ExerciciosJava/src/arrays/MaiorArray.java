package arrays;

public class MaiorArray {

	public static void main(String[] args) {
		int[] lista = { 7,9,7,1,2,5};

		int maior = lista[0];
		for (int i = 1; i < lista.length; i++) {
			if (lista[i] > maior)
				maior = lista[i];
		}

		System.out.println("Maior é " + maior);
	}
}