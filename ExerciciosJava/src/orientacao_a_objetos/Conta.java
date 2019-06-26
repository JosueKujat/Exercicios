package orientacao_a_objetos;

public class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}

	void imprimeExtrato() {
		System.out.println(" SALDO : " + this.saldo);
	}

	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
}
