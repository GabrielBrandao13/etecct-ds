
public class Principal {
	public static void main(String[]args) {
		ContaCorrente contaCorrente = new ContaCorrente(20, 2, 0, "Gabriel");
		ContaPoupanca contaPoupanca = new ContaPoupanca(21, 3, 200, "José");
		ContaPremium contaPremium = new ContaPremium(22, 4, 20000, "Lucas", 20);
		
		contaCorrente.infoConta();
		contaPoupanca.infoConta();
		contaPremium.infoConta();
		System.out.println("----------------------");
		
		contaCorrente.sacar(20);
		contaPoupanca.sacar(20);
		contaPremium.sacar(20);
		
		contaCorrente.infoConta();
		contaPoupanca.infoConta();
		contaPremium.infoConta();
		System.out.println("----------------------");
		
		contaCorrente.depositar(150);
		contaPoupanca.depositar(55);
		contaPremium.depositar(37.4);
		
		contaCorrente.infoConta();
		contaPoupanca.infoConta();
		contaPremium.infoConta();
		System.out.println("----------------------");
	}
}
