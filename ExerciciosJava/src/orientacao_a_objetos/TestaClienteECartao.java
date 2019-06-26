package orientacao_a_objetos;

class TestaClienteECartao {
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito(748320);

		
		c.nome = " Josue ";
		//cdc.numero = 748320;

		
		cdc.cliente = c;

		System.out.println("Numero do Cartao: " + cdc.numero);
		System.out.println("Cliente: " + cdc.cliente.nome);
	}
}