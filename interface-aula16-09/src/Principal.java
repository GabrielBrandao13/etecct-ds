
public class Principal {
	public static void main(String[]args) {
		Aluno aluno = new Aluno("Gabriel", "Rua 10", "(11) 98989-9898", "1234");
		aluno.apresentar();
		
		Professor professor = new Professor("Thayani", "Rua 3", "(11) 98989-2222", "DS");
		professor.apresentar();
		
		Pessoa pessoa = new Professor("Thayani", "Rua 3", "(11) 98989-2222", "DS");
		pessoa.apresentar();
		
		pessoa = new Aluno("Gabriel", "Rua 10", "(11) 98989-9898", "1234");
		pessoa.apresentar();
	}
}
