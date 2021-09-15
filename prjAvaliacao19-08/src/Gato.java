
public class Gato extends Animal {
	public double correr() {
		return 30;
	}
	public String alimentar() {
		return "Gatos se alimentam de peixe";
	}
	public String dormir() {
		return "Dormindo...";
	}
	public String emitirSom() {
		return "MIIAAAAUUUUU";
	}
	public void caracteristicas() {
		System.out.println("Gatos atingem a velocidade de "+correr()+" km por hora");
		System.out.println(alimentar());
		System.out.println("O som emitido pelo gato é: "+emitirSom());
	}
}
