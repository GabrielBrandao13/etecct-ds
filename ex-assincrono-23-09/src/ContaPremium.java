
public class ContaPremium extends Conta implements Tributacao {
	private double credito;
	public double calculaImposto() {
		return this.getSaldo()* .01;
	}
	public void infoConta() {
		super.infoConta();
		System.out.println("Crédito: "+this.credito);
	}
	public ContaPremium(int numero, int agencia, double saldo, String titularConta, double credito) {
		super(numero, agencia, saldo, titularConta);
		this.credito = credito;
	}
}
