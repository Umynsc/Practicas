//Paquete que contiene a la clase, por el momento se crea por default
//Clase que esta contenida dentro del paquete "entregable"
////Todo bloque de codigo dentro de la clase SalidaTerminal debe estar entre llaves '{' y '}'
public class SalidaTerminal {
	//Metodo main, el inicio y fin del programa
	//Es un metodo importante y debemos respetar la firma que contiene
	//Todo bloque de codigo dentro del metodo main debe estar entre llaves '{' y '}'
	public static void main(String a[]){
		//Para mostrar un mensaje por consola, debemos hacer uso del metodo println
		//Y para acceder a el debemos pasar por clases y atributos
		//Lo importante ahora es solo saber usarlo, con mas detalle se entendera a medida que avanzamos 
		System.out.println("Salida por consola sin anidar");
		System.out.println();
		//A la hora de unir varias cadenas de texto y/o variables utilizamos el operador '+'
		System.out.println("Salida "+ "por "+ "consola "+"anidado");
		
	}//fin main
}//fin de la clase
