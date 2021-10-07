package prjAula0804;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	public void setEndereco(String newEndereco) {
		this.endereco = newEndereco;
	}
	public void setTelefone(String newTelefone) {
		this.telefone = newTelefone;
	}
	
	public void apresentar() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Endereço: "+this.getEndereco());
		System.out.println("Telefone: "+this.getTelefone());
	}
}


