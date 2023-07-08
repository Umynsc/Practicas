package tp3B;

public class estudiante {
	String nombre;
	int edad;
	
	public estudiante() {
		this.nombre = " ";
		this.edad = 0;
	}
	public estudiante(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	public estudiante(int edad) {
		this.nombre = " ";
		this.edad = edad;
	}
	public estudiante(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
	public void mostrarEstado() {
		System.out.println("Nombre: "+this.nombre+"\nEdad: "+this.edad+"\n");
	}
	
	public boolean comparar(estudiante  otroItem) {
		if ((this.nombre.equals(otroItem.nombre)) && (this.edad == otroItem.edad)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		estudiante e1 = new estudiante();
		estudiante e2 = new estudiante("Julia");
		estudiante e3 = new estudiante(45);
		estudiante e4 = new estudiante("jose",24);
		
		e1.mostrarEstado();
		e2.mostrarEstado();
		e3.mostrarEstado();
		e4.mostrarEstado();
		
		if (e2.comparar(e3)) {
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