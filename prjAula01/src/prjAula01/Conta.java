package prjAula01;

public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;
	
	void depositar(double valor) {
		saldo+= valor;
	}
	double extrato() {
		return saldo;
	}
	String sacar(double valor) {
		if(saldo>=valor) {
			saldo -=valor;
			return "Saque efetuado com sucesso!";
		}
		return "Saldo insulficiente";
	}
 
}
