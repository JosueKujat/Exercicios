package orientacao_a_objetos;

class TestaConta {
	public static void main(String[] args) {
		Agencia a = new Agencia (1234) ;
		Agencia b = new Agencia (1578) ;
		Conta c1 = new Conta(a);
		Conta c2 = new Conta(b);
		c1.numero = 1544;
		c1.saldo = 1000;
		c1.limite = 500;

		c2.numero = 10639997;
		c2.saldo = 4125;
		c2.limite = 327;

		System.out.println("Conta Numero: " + c1.numero);
		System.out.println(a.numero);
		System.out.println("Saldo: " + c1.saldo);
		System.out.println("Limite: " + c1.limite);
		
		System.out.println("------");
		
		System.out.println("Conta Numero: " + c2.numero);
		System.out.println(b.numero);
		System.out.println("Saldo: " + c2.saldo);
		System.out.println("Limite: " + c2.limite);
	}
}
