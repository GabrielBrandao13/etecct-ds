
public class ClientePremium extends Cliente {
	public double calculaDesconto(double preco) {
		return (preco/100)*15;
	}
}
