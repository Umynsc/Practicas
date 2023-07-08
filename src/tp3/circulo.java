package tp3;
import java.util.Scanner;
public class circulo {
		
	double radio;
	String color;
	public circulo(double radio, String color) {
		this.radio = radio;
		this.color = color;		
	}
	
	
	public void imprimirRadio() {
		System.out.println("Radio: "+radio);		
	}
	
	public void imprimirColor() {
		System.out.println("Color: "+color);
	}
	
	public double area() {
		return radio * 2;
	}
	
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//primer objeto
		System.out.println("Ingresa el radio y el color");
		double num = entrada.nextDouble();
		entrada.nextLine();
		String aux = entrada.nextLine();
		circulo c1 = new circulo(num,aux);
		

		double areaC1 = c1.area();
		double perC1 = c1.perimetro();
		System.out.println("El area del primero es: "+areaC1+"\n y el perimetro es: "+perC1);
		c1.imprimirRadio();
		c1.imprimirColor();
		System.out.println();

		
		//segundo objeto
		System.out.println("Ingresa el radio y el color");
		num = entrada.nextDouble();entrada.nextLine();
		aux = entrada.nextLine();
		circulo c2 =new circulo (num,aux);
		
		System.out.println("El area del primero es: "+Math.round(c2.area())+"\n y el perimetro es: "+Math.round(c2.perimetro()));
		c2.imprimirRadio();
		c2.imprimirColor();
		System.out.println();
		
		
		
		
		
	}
}

/*Implementar una clase "Círculo" con atributos como radio y color. Crear varios
objetos de tipo "Círculo" y utilizar métodos para establecer y obtener el radio y
el color de cada círculo. Añade métodos para realizar el cálculo de área y
perímetro respectivamente.*/