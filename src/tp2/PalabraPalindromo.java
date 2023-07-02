package tp2;
import java.util.Scanner;
public class PalabraPalindromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra = entrada.nextLine();
		
		palabra = esPalindromo(palabra) ? " Es palindromo " : " No es Palindromo ";
		System.out.println(palabra);
	}
	
	public static boolean esPalindromo(String P) {
		String R = "";
		for(int i = P.length()-1; i >= 0; i-- ) {
			R += P.charAt(i);	
		}	
		System.out.println(P+" = "+R);
		return R.equals(P) ;
	}
}