package tp2;
import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int b = 1;
		while (b != 0) {
		
			System.out.println("Conversor de temperatura "
					+ "\n	1. Celsius a Fahrenheit "
					+ "\n	2. Fahrenheit a Celsius "
					+ "\n	3. Kelvin a Celsius "
					+ "\n	4. Celsius a Kelvin "
					+ "\n	5. Fahrenheit a Kelvin"
					+ "\n	6. Kelvin a Fahrenheit"
					+ "\n	0. Salir"
					+ "\nSeleccione una opcion: ");
			int a = entrada.nextInt();
			double num;
			
			switch (a) {
			case 1:
				System.out.println("Ingrese la temperatura: ");
				num = entrada.nextDouble();
				num = Celsius_Fahrenheit(num);
				System.out.println("La temperatura es: "+num+"\n");

				break;
			case 2:
				System.out.println("Ingrese la temperatura: ");
				num = entrada.nextDouble();
				num = Fahrenheit_Celsius(num);
				System.out.println("La temperatura es: "+num+"\n");
				
				break;
			case 3:
				System.out.println("Ingrese la temperatura: ");
				num = entrada.nextDouble();
				num = Kelvin_Celsius(num);
				System.out.println("La temperatura es: "+num+"\n");
				
				break;
			case 4:
				System.out.println("Ingrese la temperatura: ");
				num = entrada.nextDouble();
				num = Celsius_Kelvin(num);
				System.out.println("La temperatura es: "+num+"\n");
				
				break;
			case 5:
				System.out.println("Ingrese la temperatura: ");
				num = entrada.nextDouble();
				num = FahrenheitKelvin(num);
				System.out.println("La temperatura es: "+num+"\n");
				
				break;
			case 6:
				System.out.println("Ingrese la temperatura: ");
				num = entrada.nextDouble();
				num = KelvinFahrenheit(num);
				System.out.println("La temperatura es: "+num+"\n");
				
				break;
			default:
				b = 0;
				break;
			} //cierra switch	
			
		}//cierra while
		
	}	//cierra main

	public static double Celsius_Fahrenheit(double C) {
		double F = ((9*C)/5)+32;
		return F;
	} //cierra Celsius a Fahrenheit
	
	public static double Fahrenheit_Celsius(double F) {
		double C = (5*(F-32))/9;
		return C;
	} //cierra Fahrenheit a Celsius

	
	public static double  Kelvin_Celsius(double K) {
		double C = K - 273.15;
		return C;
		
	} //cierra  Kelvin a Celsius
	
	public static double Celsius_Kelvin(double C) {
		
		double K = C + 273.15;
		return K;
	} //cierra Celsius a Kelvin
	
	public static double FahrenheitKelvin(double F) {
		
		double K = ((5*(F-32))/9)+273.15;
		return K;
	} //cierra Fahrenheit a Kelvin
	
	public static double KelvinFahrenheit(double K) {
		
		double F = ((9*(K-273.15))/5)+32;
		return F;
	} //cierra Kelvin a Fahrenheit
	



} //cierra class
