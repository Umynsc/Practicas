package tp2;
import java.util.Scanner;
public class practica2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Ingresa el primer numero");
		double num1 = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		double num2 = entrada.nextInt();
		
		double resSuma = suma(num1,num2); 
		System.out.println(resSuma);
		
		double resResta = resta(num1,num2);
		System.out.println(resResta);		
		
		double resMultiplicacion = multiplicacion(num1,num2);
		System.out.println(resMultiplicacion);
		
		double resDivision = division(num1,num2);
		System.out.println(resDivision);
	}
	
	public static double suma(double num1, double num2){
		return num1 + num2;
	}
	public static double resta(double num1, double num2){
		return num1 - num2;
	}
	public static double division(double num1, double num2){
		return num1 * num2;
	}
	public static double multiplicacion(double num1, double num2){
		return num1 / num2;
	}
}
