
public abstract class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	private String titularConta;
	
	public Conta(int numero, int agencia, double saldo, String titularConta) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titularConta = titularConta;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void infoConta() {
		 System.out.println("Número: "+this.numero);
		 System.out.println("Agência: "+this.agencia);
		 System.out.println("Saldo: "+this.saldo);
		 System.out.println("Titular: "+this.titularConta);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitularConta() {
		return titularConta;
	}
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
}
