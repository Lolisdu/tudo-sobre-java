package cozinha;

import atendimento.Atendente;

public class Cozinheiro {
	public  void adicionarLancheBalcao() {
		System.out.println("Adicionar Lanche Natural Hamburger no Balcão");
	}
	
	public  void adicionarSucoBalcao() {
		System.out.println("Adicionar Suco no Balcão");
	}
	
	public  void adicionarComboBalcao() {
		adicionarLancheBalcao();
		adicionarSucoBalcao();
	}
	private  void prepararLanche() {
		System.out.println("Preparando Lanche Tipo Hamburger");
	}
	
	private  void prepararVitamina() {
		System.out.println("Preparar Suco");
	}
	
	private  void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private  void selecionarIngredienteLanche(){
		System.out.println("Selecionar o pão, salada, ovo e carne");
	}
	
	private  void selecionarIngredienteVitamina(){
		System.out.println("Selecionar fruta, leite ou água");
	}
	
	private void lavarIngredientes(){
		System.out.println("Lavando Ingredientes");
	}
	
	private void baterVitaminaLiquidificador(){
		System.out.println("Batendo vitamina no Liquidificador");
	}
	
	private void fritarIngradientesLanche() {
		System.out.println("Fritando a carne e ovo para o Hamburger");
	}
	
	private  void pedirparaTrocarGas(Atendente meuAmigo){
		meuAmigo.trocarGas();
	}
	
	private  void pedirparaTrocarGas(Almoxarife meuAmigo){
		meuAmigo.trocarGas();
	}
	
}
