package orientacao_a_objetos;

class TestaValoresPadrao {
	public static void main(String[] args) {
		Agencia a = new Agencia(1455);
		Conta c = new Conta(a); 

		System.out.println(c.numero);
		System.out.println(c.saldo);
		System.out.println(c.limite);
	}
}