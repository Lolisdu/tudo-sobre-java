package lanchonete;

import area.cliente.Cliente;
import atendimento.Atendente;
import cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		cozinheiro.adicionarSucoBalcao();
		cozinheiro.adicionarLancheBalcao();
		cozinheiro.adicionarComboBalcao();
		
		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		
	}

}
