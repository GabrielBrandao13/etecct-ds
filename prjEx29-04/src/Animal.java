
public class Animal {
	private int qntPatas;
	private String especie;
	private double peso;
	
	public Animal(int qntPatas, String especie, double peso) {
		this.qntPatas = qntPatas;
		this.especie = especie;
		this.peso = peso;
	}
	
	public int getQntPatas(){
		return this.qntPatas;
	}
	public String getEspecie() {
		return this.especie;
	}
	public double getPeso() {
		return this.peso;
	}
	
	
	public void setQntPatas(int n) {
		this.qntPatas = n;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void imprimir() {
		System.out.println("Quantidade de patas: "+this.getQntPatas());
		System.out.println("Especie: "+this.getEspecie());
		System.out.println("Peso: "+this.getPeso());
	}
}
