package prjRetangulos;

public class Main {
	public static void main(String[]args) {
		Retangulo retangulo1 = new Retangulo();
		retangulo1.largura= 20;
		retangulo1.altura = 15.5;
		
		Retangulo retangulo2 = new Retangulo();
		retangulo2.largura= 5;
		retangulo2.altura = 60;
		
		System.out.println("O ret�ngulo 1 tem "+retangulo1.altura+" de altura, e sua largura vale: "+retangulo1.largura);
		System.out.println("O ret�ngulo 2 tem "+retangulo2.altura+" de altura, e sua largura vale: "+retangulo2.largura);
		System.out.println("A �rea do ret�ngulo 1 vale: "+retangulo1.area()+" e a �rea do ret�ngulo 2 vale: "+retangulo2.area());
	}
}
