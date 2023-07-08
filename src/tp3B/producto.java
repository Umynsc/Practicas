package tp3B;

public class producto {
	String nombre;
	double precio;
	long cantidad;
	
	public producto(String nombre,double precio,long cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = 0;
	}
	
	
	
}
/*Solicitar al usuario que ingrese el nombre, el precio y la cantidad disponible
del producto. Crear objetos de la clase "Producto" utilizando un constructor
que tome como parámetros el nombre, el precio y la cantidad disponible
ingresados. Si no se proporciona la cantidad disponible, se debe establecer
como 0.*/