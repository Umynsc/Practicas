package tp1;
import java.util.Scanner;
public class cuartoPunto {
	public static void main(String[] args) {
		/*
		 * Realice un programa en Java que lea una serie de nombres de estudiantes con sus respectivas notas,
provenientes de un examen. El programa debe informar el nombre del alumno con la nota más baja y el
nombre del alumno con la nota más alta. Y debe informar la nota promedio de los estudiantes.
Precondiciones: No existen notas iguales. La lectura finaliza cuando se ingresa la nota negativa -1
		 */
		Scanner entrada = new Scanner(System.in);
		
		String nomMin = "";
		float notaMin = 999;
		String nomMax = "";
		float notaMax = -1;
		int notaCant = 0;
		float total = 0;
		
		String nomActual = "";

		System.out.println("Ingrese la nota ");
		float notaActual = entrada.nextFloat();
	
		while(notaActual != -1){
			System.out.println("Ingrese el nombre ");
			entrada.nextLine();	 //esta linea consume el salto de linea de nextFloat	
			nomActual = entrada.nextLine();
			
			if(notaActual<notaMin){
				nomMin=nomActual;
				notaMin=notaActual;				
			}
			if(notaActual>notaMax) {
				nomMax=nomActual;
				notaMax=notaActual;
			}
			notaCant++;
			total+=notaActual;
			
			
			System.out.println("Ingrese la nota ");
			notaActual = entrada.nextFloat();
		}
		System.out.println("El alumno de nota mas alta es: "+nomMax);
		System.out.println("El alumno de menor nota es: "+nomMin);
		System.out.println("El promedio de notas es: "+(total/notaCant));
	}
}
