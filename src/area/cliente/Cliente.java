package area.cliente;

public class Cliente {

	public void escolherLanche() {
		System.out.println("Escolhendo o Lanche");
	}
	
	public void fazerPedido() {
		System.out.println("Fazendo Pedido");
	}
	
	public void pagarConta() {
		System.out.println("Pagando Conta");
		consultarSaldoAplicativo();
	}

	private void consultarSaldoAplicativo() {
		System.out.println("Consultar saldo Aplicativo");
	}

}
