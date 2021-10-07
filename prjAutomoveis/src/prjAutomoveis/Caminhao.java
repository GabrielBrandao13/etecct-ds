package prjAutomoveis;

public class Caminhao {
	private String cor;
	private String modelo;
	private String placa;
	
	public Caminhao(String cor, String modelo, String placa) {
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getPlaca() {
		return this.placa;
	}
	
	public void apresentar() {
		System.out.println("---Caminhão---");
		System.out.println("Cor: "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Placa: "+this.placa);
	}
}
