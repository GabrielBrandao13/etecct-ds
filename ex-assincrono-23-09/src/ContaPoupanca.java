
public class ContaPoupanca extends Conta  {
	public void rendimentoPoupanca() {
		this.setSaldo(this.getSaldo()+ this.getSaldo()*.05);
	}
	public ContaPoupanca(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}
}
