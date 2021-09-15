
public class Pessoa {
	private String nome;
	private int anoNascimento;
	private double altura;
	private int idade;
	
	public Pessoa(String nome, int anoNascimento, double altura) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAnoNascimento(int ano) {
		this.anoNascimento = ano;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void calcularIdade(int anoAtual) {
		this.idade = anoAtual - this.anoNascimento;
	}
	
	public void apresentar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Ano de nascimento: "+this.anoNascimento);
		System.out.println("Altura: "+this.altura);
		System.out.println("Idade: "+this.idade);
	}
}
