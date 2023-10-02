package cozinha;



public class Almoxarife {

	private void controlarEntrada() {
		System.out.println("Controlando a Entrada dos Itens");
	}
	
	private void controlarSaida() {
		System.out.println("Controlando a Saida dos Itens");
	}
	
	void entregarIngrediente() {
		System.out.println("Entregando ingradientes");
		controlarSaida();
	}
	
	 void trocarGas() {
		System.out.println("Almoxarife trocando o Gas");
	}
}
