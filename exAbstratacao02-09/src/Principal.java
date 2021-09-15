
public class Principal {
	public static void main(String[]args) {
		Carro c1 = new Carro("Gol", 200, "Preto", "Etanol");
		Carro c2 = new Carro("Palio", 180, "Prata", "Gasolina");
		Moto m1 = new Moto("NXR", 210, "Vermelho", "Etanol");
		Moto m2 = new Moto("XRE", 150, "Prata", "Etanol");
		
		c1.imprimirFicha();
		c2.imprimirFicha();
		m1.imprimirFicha();
		m2.imprimirFicha();
		
	}
}
