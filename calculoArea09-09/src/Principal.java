import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("De qual forma deseja calcular a área?");
		System.out.println("(1) Quadrado");
		System.out.println("(2) Retângulo");
		System.out.println("(3) Triângulo");
		System.out.println("(4) Trapézio");
		int choise = in.nextInt();
		
		if(choise == 1) {
			System.out.println("Digite a medida do lado do quadrado: ");
			double lado = in.nextDouble();
			Quadrado quadrado = new Quadrado(lado);
			System.out.println("A área do quadrado é de: "+quadrado.getArea());
		}else if(choise == 2) {
			System.out.println("Digite a medida da largura do retângulo: ");
			double largura = in.nextDouble();
			System.out.println("Digite a medida da altura do retângulo: ");
			double altura = in.nextDouble();
			Retangulo retangulo = new Retangulo(altura, largura);
			System.out.println("A área do retângulo é de: "+retangulo.getArea());
		} else if(choise == 3) {
			System.out.println("Digite a medida da largura do triângulo: ");
			double largura = in.nextDouble();
			System.out.println("Digite a medida da altura do triângulo: ");
			double altura = in.nextDouble();
			Triangulo triangulo = new Triangulo(altura, largura);
			System.out.println("A área do Triângulo é de: "+triangulo.getArea());
		} else if(choise == 4) {
			System.out.println("Digite a medida da base 1 do trapézio: ");
			double base1 = in.nextDouble();
			System.out.println("Digite a medida da base 2 do trapézio: ");
			double base2 = in.nextDouble();
			System.out.println("Digite a medida da altura do trapézio: ");
			double altura = in.nextDouble();
			Trapezio trapezio = new Trapezio(base1, base2, altura);
			System.out.println("A área do trapézio é de: "+trapezio.getArea());
		} else {
			System.out.println("Número inválido digitado");
		}
		
		in.close();
	}

}
