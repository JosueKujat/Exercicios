package orientacao_a_objetos;

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = " Aurelio ";
		f1.salario = 1.987;
		f1.aumentaSalario(547);

		f2.nome = " Gertrudez ";
		f2.salario = 2.147;
		f2.aumentaSalario(745);

		System.out.println("Nome: " + f1.nome);
		System.out.println("Salario: " + f1.salario);
		System.out.println(f1.consultaDados());

		System.out.println("-----");
		System.out.println("Nome: " + f2.nome);
		System.out.println("Salario: " + f2.salario);
		System.out.println(f2.consultaDados());
	}
}