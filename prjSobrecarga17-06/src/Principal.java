
public class Principal {
	public static void main(String[]args) {
		Numeros calc = new Numeros();
		
		int[] numeros = {1, 5, 3, 8, 9};
		
		System.out.println("Testando se o n�mero 2 � par: ");
		
		System.out.println(calc.par(2));
		
		System.out.println("Testando se o array de n�meros � par: ");
		
		boolean[] pares = calc.par(numeros);
		
		for(int i=0;i<pares.length;i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println("Testando se o n�mero 8 � primo: ");
		
		
		System.out.println(calc.primo(8));
		
		System.out.println("Testando se o array de n�meros � primo: ");
		
		boolean[] primos = calc.primo(numeros);
		
		for(int i =0;i<primos.length;i++) {
			System.out.println(primos[i]);
		}
	}
}
