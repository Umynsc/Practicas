package tp1;

import java.util.Scanner;

public class primerPunto {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el anio Actual ");
		int anioActual = entrada.nextInt();
		
		System.out.println("Ingrese su anio de Nacimiento ");
		int anioNac = entrada.nextInt();
		
		System.out.println("La edad es: "+(anioActual - anioNac));
	}
}