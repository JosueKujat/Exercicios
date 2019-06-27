package arrays;

public class MediaArray {

	public static void main(String[] args) {

		int nota[] = { 4, 5, 7, 4 };
		int aluno = 0;
		int soma = 0;

		while (aluno < 4) {
			System.out.println("Aluno: " + aluno + " Nota: " + nota[aluno]);
			aluno++;
		}
		for (int i = 0; i < nota.length; i++) {
			soma = soma + nota[i];

			System.out.println("A media é: " + (soma / nota.length));

		}
	}

}
