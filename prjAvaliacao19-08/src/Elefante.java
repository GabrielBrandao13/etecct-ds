
public class Elefante extends Animal {
	public double correr() {
		return 5;
	}
	public String alimentar() {
		return "Elefantes se alimentam de frutas e folhas";
	}
	public String dormir() {
		return "Dormindo...";
	}
	public String emitirSom() {
		return "PRUUUUUU";
	}
	public void caracteristicas() {
		System.out.println("Elefantes atingem a velocidade de "+correr()+" km por hora");
		System.out.println(alimentar());
		System.out.println("O som emitido pelo elefante é: "+emitirSom());
	}
}
