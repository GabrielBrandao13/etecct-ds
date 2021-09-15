
public class Moto extends Veiculo {
	
	public void calculaIpva() {
		this.setIpva(this.getValorTabela()*0.02);
	}
	
	public Moto(String modelo, double valorTabela, String cor, String combustivel) {
		super(modelo, valorTabela, cor, combustivel);
	}
	
	
}
