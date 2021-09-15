
public class Cachorro extends Animal {
	public double correr() {
		return 30;
	}
	public String alimentar() {
		return "Cachorros se alimentam de ração";
	}
	public String dormir() {
		return "Dormindo...";
	}
	public String emitirSom() {
		return "-au -au -au";
	}
	public void caracteristicas() {
		System.out.println("Cachorros atingem a velocidade de "+correr()+" km por hora");
		System.out.println(alimentar());
		System.out.println("O som emitido pelo cachorro é: "+emitirSom());
	}
}
