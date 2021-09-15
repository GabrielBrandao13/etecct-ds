package prjFuncionario;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.nome = "Vagner";
		funcionario1.salarioBruto = 4500.0;
		funcionario1.imposto = 17.5;
		
		funcionario2.nome = "Pedro";
		funcionario2.salarioBruto = 8000.0;
		funcionario2.imposto = 0.5;
		
		
		System.out.println("O salário bruto de Vagner é de "+funcionario1.salarioBruto);
		System.out.println("Já o salário líquido é de "+funcionario1.salarioLiquido());
		System.out.println("O salário bruto de Pedro é de "+funcionario2.salarioBruto);
		System.out.println("Já o salário líquido é de "+funcionario2.salarioLiquido());
		
		System.out.println("Digite o valor que deseja que o salário de Vagner seja aumentado:");
		double aumento = in.nextDouble();
		funcionario1.aumentaSalario(aumento);
		System.out.println("Digite o valor que deseja que o salário de Pedro seja aumentado:");
		aumento = in.nextDouble();
		funcionario2.aumentaSalario(aumento);
		
		System.out.println("Agora o salário bruto de Vagner é de "+funcionario1.salarioBruto);
		System.out.println("Já o salário líquido é de "+funcionario1.salarioLiquido());
		System.out.println("Agora o salário bruto de Pedro é de "+funcionario2.salarioBruto);
		System.out.println("Já o salário líquido é de "+funcionario2.salarioLiquido());
		
		funcionario1.aumentaSalario(200.0);
		funcionario2.aumentaSalario(700.0);
		
	}
}
