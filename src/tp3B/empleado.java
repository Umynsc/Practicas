package tp3B;
public class empleado {
	private String nombre;
	private double salario;
	private String departamento;
	
	private  empleado(String nombre,double salario,String departamento) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}
	private  empleado(String nombre,double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = "Sin departamento";
	}
	private  void mostrarEstado() {
		System.out.println("Nombre: "+this.nombre+"\nSalario: $"+this.salario+"\nDepartamento: "+this.departamento+"\n");
	}
	
	private  boolean comparar(empleado  otroItem) {
		if ((this.nombre.equals(otroItem.nombre)) && (this.salario == otroItem.salario) && (this.departamento.equals(otroItem.departamento))) {
			return true;
		}
		else 
			{return false;
			}
	}
	
	public static void main(String[] args) {
		empleado empleado1 = new empleado("Noelia",100,"ciencias");
		empleado empleado2 = new empleado("Sus",50);
	
		empleado1.mostrarEstado();
		empleado2.mostrarEstado();
		if (empleado1.comparar(empleado2)) {System.out.println("Iguales");
		} else {System.out.println("diferentes");
		}
	}
	
	
}
/*Solicitar al usuario que ingrese el nombre, el salario y el departamento del
empleado. Crear objetos de la clase "Empleado" utilizando un constructor
que tome como parámetros el nombre, el salario y el departamento
ingresados. Si no se proporciona el departamento, se debe establecer como
"Sin departamento".*/