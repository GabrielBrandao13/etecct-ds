package prjAutomoveis;

public class Principal {
	public static void main(String[]args) {
		Moto moto1 = new Moto("Vermelho", "2006", "fby-7651");
		moto1.apresentar();
		moto1.cor = "Azul";
		moto1.apresentar();
		
		Carro carro1 = new Carro("Preto", "2015", "fjs-1376");
		carro1.apresentar();
		carro1.setCor("Bege");
		carro1.apresentar();
		
		Caminhao caminhao1 = new Caminhao("Cinza", "2020", "xur-5324");
		caminhao1.apresentar();
		caminhao1.setCor("Ciano");
		caminhao1.apresentar();
	}
}
