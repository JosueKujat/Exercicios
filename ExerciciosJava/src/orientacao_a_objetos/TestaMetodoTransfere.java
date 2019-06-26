package orientacao_a_objetos;

class TestaMetodoTransfere {
	public static void main(String[] args) {
		Agencia a = new Agencia(1234);
		Conta origem = new Conta(a);
		Conta destino = new Conta(a);

		origem.saldo = 1000;

		destino.saldo = 500;

		origem.transfere(destino, 500);

		System.out.println(origem.saldo);
		System.out.println(destino.saldo);
	}
}
