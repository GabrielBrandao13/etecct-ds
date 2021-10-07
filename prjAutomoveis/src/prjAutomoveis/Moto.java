package prjAutomoveis;

public class Moto {
	public String cor;
	public String modelo;
	public String placa;
	
	public Moto(String cor, String modelo, String placa) {
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public void apresentar() {
		System.out.println("---Moto---");
		System.out.println("Cor: "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Placa: "+this.placa);
	}
	//geters e seters não criados pois todos os atributos estão públicos.
}
