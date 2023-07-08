package tp3B;

public class producto {
	private String nombre;
	private double precio;
	private long cantidad;
	
	private  producto(String nombre,double precio,long cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	private  producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = 0;
	}
	
	private  void mostrarEstado() {
		System.out.println("Nombre: "+this.nombre+"\nPrecio: $"+this.precio+"\nCantidad: "+this.cantidad+"\n");
	}
	
	private  boolean comparar(producto  otroItem) {
		return (this.nombre.equals(otroItem.nombre)) && (this.precio == otroItem.precio) && (this.cantidad == otroItem.cantidad);
		}
	
	public static void main(String[] args) {
		producto producto01 = new producto("azucar",10);
		producto01.mostrarEstado();

		producto producto02 = new producto("Yerba",23,2000);
		producto02.mostrarEstado();

		if (producto01.comparar(producto02)) {
		System.out.println("iguales");
		} else {
		System.out.println("diferentes");
		}
		
	}
}
/*Solicitar al usuario que ingrese el nombre, el precio y la cantidad disponible
del producto. Crear objetos de la clase "Producto" utilizando un constructor
que tome como parámetros el nombre, el precio y la cantidad disponible
ingresados. Si no se proporciona la cantidad disponible, se debe establecer
como 0.

*Nota: Para todos los enunciados, realice dos métodos adicionales, uno que le
permita mostrar el estado del objeto, y otro que le permita comparar si dos
objetos son iguales en estado.

*/