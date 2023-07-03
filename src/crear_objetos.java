import java.util.Scanner;
public class crear_objetos {
	
	//atributos
	String atributo1;
	

	//constructores
	public crear_objetos() {
		//esto es un contructor vacio, si no se pasa valor por parametro se usa este 
	}
	
	
	public crear_objetos(String atributo1) {
		//esto es un constructor que da valor al atributo si se le pasa parametro 
		this.atributo1 = atributo1;
	}
	
	
	
	
	//metodos
	public void imprimir(String aux) { //el uso de void significa que no retornara ningun valor
		System.out.println("al invocar <crear_objeto>.imprimir se ejecuta el metodo y "+aux);
	}
	
	public void imprimir() { 
		System.out.println("java busca el metodo correcto si hay mutiples \nen caso de que se pase parametro o no");
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner readln = new Scanner(System.in);
		String aux = readln.nextLine();
		
		crear_objetos primerObjeto = new crear_objetos(aux);
		primerObjeto.imprimir(primerObjeto.atributo1);
		crear_objetos segundoObjeto = new crear_objetos();
		segundoObjeto.imprimir();
	}
	
}
