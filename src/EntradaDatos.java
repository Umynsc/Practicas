import java.util.Scanner;


public class EntradaDatos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero por teclado");
		int numero = entrada.nextInt();
		System.out.println("El numero ingresado fue: "+ numero);
		
		System.out.println("Ingrese un caracter por teclado");
		String caracter = entrada.next();
		System.out.println("El caracter ingresado fue: "+ caracter);
		
		
	}
}
