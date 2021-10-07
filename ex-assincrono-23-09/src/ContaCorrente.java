
public class ContaCorrente extends Conta implements Tributacao  {
	public double calculaImposto() {
		return this.getSaldo() * 0.02;
	}
	public void sacar(double valor) {
		this.setSaldo(this.getSaldo()-valor-5);
	}
	
	public ContaCorrente(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}
}
