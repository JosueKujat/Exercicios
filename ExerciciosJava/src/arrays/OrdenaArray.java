package arrays;

import java.util.Arrays;

class OrdenaArray {
	public static void main(String[] args) {
		Arrays.sort(args);
		String[] nomes = new String[] { "Josue", "Kujat" };

		Arrays.sort(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}