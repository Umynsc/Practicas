import java.util.Scanner;

public class EntradaPorTeclado {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** Programa que muestra por teclado *****");
		
		/* 
		 * En java, no tenemos instrucci�n 'Leer nombre_variable'
		 * Para leer datos introducidos por teclado, podemos utilizar la clase Scanner
		 * La clase Scanner, como otras clases mas para ingresar datos de entrada, es una clase
		 * que se encuentra en el paquete de librerias de Java.
		 * De esta forma, no debemos crear un metodo que implemente el como lo hace
		 * Simplemente, usamos la clase Scanner para nuestros fines importando la libreria/paquete
		 * y creando objetos de esa clase.
		 */
		
		//Por ejemplo, declaro un objeto o una variable, de tipo Scanner
		Scanner entrada;
		//Instancio un objeto de tipo Scanner
		entrada = new Scanner(System.in);
		/*
		 * Al ser ahora una instancia de clase Scanner puedo acceder a sus metodos/comportamiento.
		 * Y entre muchos de ellos, los mas utiles son para leer por teclado.
		 */
		
		
		//Se muestra por consola el siguiente mensaje
		System.out.println("Ingresar un numero entero");
		/*
		 * Veamos, el objeto 'entrada'utiliza el metodo 'nextInt'. Sabemos por la teoria que asi funcionan 
		 * los objetos cuando se los quiere usar. 
		 *Como el metodo retorna un valor, debemos almacenarlo en otra variable del mismo tipo de dato
		*/
		int numero = entrada.nextInt();
		System.out.println("El numero ingresado fue: "+ numero);
		System.out.println("Y su valor negado es: -"+ numero);
		
		/*
		 * Asi, para leer otros datos de otros tipos simples, tenemos las siguientes invocaciones
		 * que devuelven un tipo de dato, por lo que hay que almacenarlo en algun lugar
		 */
		
		System.out.println("Ingrese un valor booleano: ");
		boolean estado = entrada.nextBoolean();
		System.out.println("El valor booleano ingresado fue: "+ estado);
		System.out.println("Y su valor negado es: "+  !estado);
		
		System.out.println("Ingrese un numero real: ");
		double numeroReal = entrada.nextDouble();
		System.out.println("El numero real ingresado fue: "+ numeroReal);
		System.out.println("Y su valor negado es: -"+  numeroReal);
		
		/*
		 * Algo a considerar es que, la clase Scanner permite leer String, para estos casos. 
		 * Sabemos que un objeto de tipo String no es mas que una cadena de caracteres. 
		 * Por lo tanto podemos tratarlo como tal. Para esto, debemos crear otra instancia de 
		 * la clase String. Pruebe que paso si usamos el mismo objeto
		 */
		
		
		
		String caracter = new String();
		System.out.println("Ingrese un caracter o una cadena de caracteres: ");
		/*
		 * Existe una diferencia entre el metodo next() y nextLine()
		 * next(), lee cualquier palabra, porque el delimitador es el espacio en blanco. Por 
		 * mas que pongamos muchas palabras solo tomara la primera que introducimos.
		 * nextLine() es todo lo contrario y todo lo que se espera. Tomara todo lo introducido despues
		 * de teclear 'enter'
		 */
		Scanner teclado = new Scanner(System.in);
		caracter = teclado.nextLine();
		System.out.println("El texto ingresado fue: "+caracter);
		
		
		
		Scanner aux = new Scanner(System.in);

		System.out.print("Ingresa un caracter: ");
		char car = aux.next().charAt(0);

		System.out.println("El caracter ingresado es: " + car);
		
		
		//Pueden chequear la introduccion de los otros tipos de datos
		
	}

}
