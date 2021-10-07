package prjRetangulos;

public class Main {
	public static void main(String[]args) {
		Retangulo retangulo1 = new Retangulo();
		retangulo1.largura= 20;
		retangulo1.altura = 15.5;
		
		Retangulo retangulo2 = new Retangulo();
		retangulo2.largura= 5;
		retangulo2.altura = 60;
		
		System.out.println("O retângulo 1 tem "+retangulo1.altura+" de altura, e sua largura vale: "+retangulo1.largura);
		System.out.println("O retângulo 2 tem "+retangulo2.altura+" de altura, e sua largura vale: "+retangulo2.largura);
		System.out.println("A área do retângulo 1 vale: "+retangulo1.area()+" e a área do retângulo 2 vale: "+retangulo2.area());
	}
}
