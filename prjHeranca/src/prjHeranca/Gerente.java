package prjHeranca;

public class Gerente extends Funcionario {
	private String senha;
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentica(String senha) {
		return this.senha == senha;
	}
}
