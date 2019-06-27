package arrays;

import java.util.Arrays;

public class ImprimeArray {

	public static void main(String[] args) {
		String[] nomes = new String[] { "Josue", "Kujat" };

		Arrays.sort(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}


