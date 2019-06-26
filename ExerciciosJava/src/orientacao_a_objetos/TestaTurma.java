package orientacao_a_objetos;

class TestaTurma {
	public static void main(String[] aseries) {
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		t1.periodo = " Tarde ";
		t1.serie = 8;
		t1.sigla = "nc1";
		t1.tipoDeEnsino = " Fundamental ";

		t2.periodo = " Manha ";
		t2.serie = 3;
		t2.sigla = "nc9";
		t2.tipoDeEnsino = " Medio ";

		System.out.println("Turno: " + t1.periodo);
		System.out.println("Serie: " + t1.serie + t1.sigla);
		System.out.println("Grau: " + t1.tipoDeEnsino);

		System.out.println("-------");
		System.out.println("Turno: " + t2.periodo);
		System.out.println("Serie: " + t2.serie + t2.sigla);
		System.out.println("Grau: " + t2.tipoDeEnsino);
	}
}