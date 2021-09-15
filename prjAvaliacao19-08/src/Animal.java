
public class Animal {
	private String cor;
	private String tamanho;
	private String nome;
	public double correr() {
		return 0;
	}
	public String alimentar() {
		return "Animais precisam se alimentar ao longo do dia";
	}
	public String dormir() {
		return "Dormindo...";
	}
	public String emitirSom() {
		return "...";
	}
	public void caracteristicas() {
		System.out.println("Animais podem variar muito em velocidade");
		System.out.println(alimentar());
		System.out.println("Cada animal emite um som diferente");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
