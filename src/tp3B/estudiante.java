package tp3B;
public class estudiante {
	private String nombre;
	private int edad;
	
	private estudiante() {
		this.nombre = " ";
		this.edad = 0;
	}
	private estudiante(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	private estudiante(int edad) {
		this.nombre = " ";
		this.edad = edad;
	}
	private estudiante(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
	private void mostrarEstado() {
		System.out.println("Nombre: "+this.nombre+"\nEdad: "+this.edad+"\n");
	}
	
	private boolean comparar(estudiante  otroItem) {
		if ((this.nombre.equals(otroItem.nombre)) && (this.edad == otroItem.edad)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		estudiante estudiante1 = new estudiante();
		estudiante estudiante2 = new estudiante("Julia");
		estudiante estudiante3 = new estudiante(45);
		estudiante estudiante4 = new estudiante("jose",24);
		
		estudiante1.mostrarEstado();
		estudiante2.mostrarEstado();
		estudiante3.mostrarEstado();
		estudiante4.mostrarEstado();
		
		if (estudiante2.comparar(estudiante3)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		
	}
}
/*Solicitar al usuario que ingrese el nombre y la edad del estudiante. Crear
objetos de la clase "Estudiante" utilizando un constructor que tome como
parámetros el nombre y la edad ingresados.Realice la sobrecarga de estos
constructores*/