package orientacao_a_objetos;

class TestaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		c1.nome = " Josue Kujat ";
		c1.codigo = 1;

		c2.nome = " Alessandra Camargo ";
		c2.codigo = 2;

		System.out.println("Codigo " + c1.codigo);
		System.out.println("Nome " + c1.nome);

		System.out.println("Codigo " + c2.codigo);
		System.out.println("Nome " + c2.nome);

	}
}