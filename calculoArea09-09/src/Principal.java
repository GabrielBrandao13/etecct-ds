import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("De qual forma deseja calcular a �rea?");
		System.out.println("(1) Quadrado");
		System.out.println("(2) Ret�ngulo");
		System.out.println("(3) Tri�ngulo");
		System.out.println("(4) Trap�zio");
		int choise = in.nextInt();
		
		if(choise == 1) {
			System.out.println("Digite a medida do lado do quadrado: ");
			double lado = in.nextDouble();
			Quadrado quadrado = new Quadrado(lado);
			System.out.println("A �rea do quadrado � de: "+quadrado.getArea());
		}else if(choise == 2) {
			System.out.println("Digite a medida da largura do ret�ngulo: ");
			double largura = in.nextDouble();
			System.out.println("Digite a medida da altura do ret�ngulo: ");
			double altura = in.nextDouble();
			Retangulo retangulo = new Retangulo(altura, largura);
			System.out.println("A �rea do ret�ngulo � de: "+retangulo.getArea());
		} else if(choise == 3) {
			System.out.println("Digite a medida da largura do tri�ngulo: ");
			double largura = in.nextDouble();
			System.out.println("Digite a medida da altura do tri�ngulo: ");
			double altura = in.nextDouble();
			Triangulo triangulo = new Triangulo(altura, largura);
			System.out.println("A �rea do Tri�ngulo � de: "+triangulo.getArea());
		} else if(choise == 4) {
			System.out.println("Digite a medida da base 1 do trap�zio: ");
			double base1 = in.nextDouble();
			System.out.println("Digite a medida da base 2 do trap�zio: ");
			double base2 = in.nextDouble();
			System.out.println("Digite a medida da altura do trap�zio: ");
			double altura = in.nextDouble();
			Trapezio trapezio = new Trapezio(base1, base2, altura);
			System.out.println("A �rea do trap�zio � de: "+trapezio.getArea());
		} else {
			System.out.println("N�mero inv�lido digitado");
		}
		
		in.close();
	}

}
