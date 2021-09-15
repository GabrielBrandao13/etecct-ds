
public class Carro extends Veiculo {
	
	public void calculaIpva() {
		this.setIpva(this.getValorTabela()*0.04);
	}
	
	public Carro(String modelo, double valorTabela, String cor, String combustivel) {
		super(modelo, valorTabela, cor, combustivel);
	}

}
