package orientacao_a_objetos;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		
		a1.nome = " Ivan ";
		a1.rg = " 557485-6 ";
		a1.dataNascimento = " 16/10/1997";

		
		a2.nome = " Terezinha ";
		a2.rg = "748597 -2 ";
		a2.dataNascimento = " 30/10/1999 ";

		System.out.println("Nome: " + a1.nome);
		System.out.println("RG: " + a1.rg);
		System.out.println("Nascimento: " + a1.dataNascimento);

		System.out.println("Nome: " + a2.nome);
		System.out.println("RG: " + a2.rg);
		System.out.println("Nascimento: " + a2.dataNascimento);

	}
}