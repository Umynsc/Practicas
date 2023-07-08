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
	
	public void mostrarEstado() {
		System.out.println("Nombre: "+this.nombre+"\nPrecio: $"+this.precio+"\nCantidad: "+this.cantidad+"\n");
	}
	
	public boolean comparar(producto x,producto  y) {
		boolean ok = false;
		if (x.nombre == y.nombre) & (x.precio == x.precio) {
			ok=true;
		}
		
		return ok; 
	}
	
	public static void main(String[] args) {
		producto x1 = new producto("azucar",10);
		x1.mostrarEstado();

		producto x2 = new producto("Yerba",23,2000);
		x2.mostrarEstado();
	}
}
/*Solicitar al usuario que ingrese el nombre, el precio y la cantidad disponible
del producto. Crear objetos de la clase "Producto" utilizando un constructor
que tome como parámetros el nombre, el precio y la cantidad disponible
ingresados. Si no se proporciona la cantidad disponible, se debe establecer
como 0.*/