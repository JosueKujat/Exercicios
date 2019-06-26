package orientacao_a_objetos;

class TestaCartaoDeCredito {
	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito(424288);
		CartaoDeCredito cdc2 = new CartaoDeCredito(1069335);
		
		
		//cdc1.numero = 424288;
		cdc1.dataDeValidade = " 10/11/2023 ";

		
		//cdc2.numero = 1069335;
		cdc2.dataDeValidade = " 01/01/2019 ";

		System.out.println("Numero do Cartao " + cdc1.numero);
		System.out.println("Data de Validade do Cartao " + cdc1.dataDeValidade);
		
		System.out.println("------------");

		System.out.println("Numero do cartao " + cdc2.numero);
		System.out.println("Data de Validade do Cartao " + cdc2.dataDeValidade);
	}
}