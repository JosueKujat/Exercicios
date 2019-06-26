package orientacao_a_objetos;

import br.com.util.Teclado;

class TestaFuncionario2 {
	public static void main(String[] args) {

		String nome;
		String valorTela;
		Funcionario f = new Funcionario();

		nome = Teclado.lerTexto("Digie o nome do funcionário");
		
		f.nome = nome;

		int opc = 1;
		while (opc != 0) {
			System.out.println("\n\n");
			System.out.println(" Escolha a opção desejada :");
			System.out.println("0 - Sair ");
			System.out.println("1 - Aumentar salário ");
			System.out.println("2 - Corrigir nome do funcionário ");
			System.out.println("3 - Imprimir dados ");
			System.out.println("\n\n");

			
			valorTela = Teclado.lerTexto("Digite");
			opc = Integer.parseInt(valorTela);

			if (opc == 1) {
				System.out.println(" Digite o quanto você deseja aumentar : ");
				valorTela = Teclado.lerTexto(valorTela);
				int aumentar = Integer.parseInt(valorTela);

				if (aumentar < 0) {
					System.out.println(" ERRO ");
				} else {
					f.salario += aumentar;
					System.out.println(" Aumento efetuado com sucesso ");
				}
			} else if (opc == 2) {
				System.out.println(" Nome atual : " + f.nome);

				System.out.println(" Digite o novo nome .");
				valorTela = Teclado.lerTexto(valorTela);
				f.nome = valorTela;

				System.out.println(" Substituição feita com sucesso .");
			} else if (opc == 3) {
				System.out.println(" Dados atuais ");
				System.out.println(" Nome : " + f.nome);
				System.out.println(" Salário : " + f.salario);
			}

		}
	}

}