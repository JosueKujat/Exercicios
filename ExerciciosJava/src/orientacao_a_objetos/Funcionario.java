package orientacao_a_objetos;

public class Funcionario {
	String nome;
	double salario = 1000.0;

	void aumentaSalario(double valor) {
		this.salario += valor;
	}

	String consultaDados (){
		 return " Nome : " + this . nome + "Salário : " + this . salario ;
	}
}
