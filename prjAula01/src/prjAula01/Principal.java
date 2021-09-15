package prjAula01;

public class Principal {
	public static void main(String[]args) {
		Conta primeiro = new Conta();
		
		primeiro.saldo = 200;
		System.out.println("Saldo na conta: "+primeiro.saldo);
		primeiro.depositar(200);
		System.out.println("Saldo na conta: "+primeiro.extrato());
		System.out.println(primeiro.sacar(100));
		System.out.println("Saldo na conta: "+primeiro.saldo);
		System.out.println(primeiro.extrato());
	}
}
