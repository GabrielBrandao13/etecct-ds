package prjFuncionario;

public class Funcionario {
	String nome;
	Double salarioBruto, imposto;
	
	Double salarioLiquido() {
		double salario = salarioBruto - (salarioBruto*imposto)/100;
		return salario;
	}
	
	void aumentaSalario(Double valor) {
		salarioBruto+=valor;
	}
}
