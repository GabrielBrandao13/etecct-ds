
public class Principal {
	public static void main(String[]args) {
		Cliente clienteComum = new Cliente();
		ClientePremium clienteEspecial = new ClientePremium();
		
		System.out.println(clienteComum.calculaDesconto(200));
		System.out.println(clienteEspecial.calculaDesconto(200));
	}
}
