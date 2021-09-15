import java.util.Scanner;
public class Principal2 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nomeProduto = in.next();
		System.out.println("Digite o valor do custo do produto: ");
		double precoCusto = in.nextDouble();
		System.out.println("Digite o valor da venda do produto: ");
		double precoVenda = in.nextDouble();


		Produto produto1 = new Produto(nomeProduto, precoCusto, precoVenda);
		
		produto1.imprimir();
		
		
		in.close();
	}
}
