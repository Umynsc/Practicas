package tp1;
import java.util.Scanner;
public class segundoPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingrese los numeros.  ingrese negativo para detener ");
	int num = entrada.nextInt();
	while( num >= 0) num = entrada.nextInt();
	
	
	}
}
