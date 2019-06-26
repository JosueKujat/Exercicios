package orientacao_a_objetos;

class TestaMetodosConta {
	public static void main(String[] args) {
		Agencia a = new Agencia (1234) ;
		Conta c = new Conta(a);

		c.deposita(1000);
		c.imprimeExtrato();

		c.saca(100);
		c.imprimeExtrato();

		double saldoDisponivel = c.consultaSaldoDisponivel();
		System.out.println(" SALDO DISPONÍVEL : " + saldoDisponivel);
	}
}
