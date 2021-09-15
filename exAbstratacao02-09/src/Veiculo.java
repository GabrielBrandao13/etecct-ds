
public abstract class Veiculo {
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;
	
	public Veiculo(String modelo, double valorTabela, String cor, String combustivel) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.cor = cor;
		this.combustivel = combustivel;
		
		this.calculaIpva();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorTabela() {
		return valorTabela;
	}
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
		this.calculaIpva();
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public double getIpva() {
		return ipva;
	}
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	public void imprimirFicha() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Valor tabela: "+this.valorTabela);
		System.out.println("Cor: "+this.cor);
		System.out.println("Combust�vel: "+this.combustivel);
		System.out.println("ipva: "+this.ipva);
		System.out.println("------------------------------");
	}
	
	public abstract void calculaIpva();
	
	
}
