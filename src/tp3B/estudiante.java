package tp3B;

public class estudiante {
	String nombre;
	int edad;
	
	public estudiante() {
		
	}
	public estudiante(String nombre) {
		this.nombre = nombre;
	}
	public estudiante(int edad) {
		this.edad = edad;
	}
	public estudiante(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
	
	public static void main(String[] args) {
	
		estudiante e1 = new estudiante();
		estudiante e2 = new estudiante("Julia");
		estudiante e3 = new estudiante(45);
		estudiante e4 = new estudiante("jose",24);
		
	}

}
/*Solicitar al usuario que ingrese el nombre y la edad del estudiante. Crear
objetos de la clase "Estudiante" utilizando un constructor que tome como
parámetros el nombre y la edad ingresados.Realice la sobrecarga de estos
constructores*/