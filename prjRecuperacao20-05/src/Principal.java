import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa("Gabriel", 2004, 1.75);
		System.out.println("Digite o ano atual: ");
		pessoa1.calcularIdade(in.nextInt());
		
		pessoa1.apresentar();

	}

}
