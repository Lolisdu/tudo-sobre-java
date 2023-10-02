package atendimento;

public class Atendente {

	public void servindoMesa() {
		System.out.println("Servindo Mesa");
	}

	private void pegarLancheCozinha() {
		System.out.println("Pegando Lanche na cozinha");
		pegarLancheCozinha();
	}
	
	public void receberPagamento() {
		System.out.println("Recebendo pagamento");
	}
	public void trocarGas() {
		System.out.println("Atendente trocando Gas");
	}
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcão");
	}
}
