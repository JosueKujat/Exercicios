package arrays;

import java.util.Arrays;

public class ImprimeArray {

	public static void main(String[] args) {
		String[] arg = new String[] { "Josue", "Kujat" };
		
		
		Arrays.sort(arg);
		
		for (String nome : arg) {
			System.out.println(nome);
		}
	}
}
