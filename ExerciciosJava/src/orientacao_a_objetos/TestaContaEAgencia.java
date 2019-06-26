package orientacao_a_objetos;

class TestaContaEAgencia {
	public static void main(String[] args) {

		Agencia a = new Agencia(1544);
		Conta c = new Conta(a);

		//a.numero = 1544;
		c.saldo = 775.0;

		c.agencia = a;

		System.out.println("Agencia Numero: " + c.agencia.numero);
		System.out.println("Saldo: " + c.saldo);
	}
}