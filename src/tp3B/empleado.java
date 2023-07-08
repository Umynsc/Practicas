package tp3B;

public class empleado {
	String nombre;
	double salario;
	String departamento;
	
	public empleado(String nombre,double salario,String departamento) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}
	public empleado(String nombre,double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = "Sin departamento";
	}
	public void mostrarEstado() {
		System.out.println("Nombre: "+this.nombre+"\nSalario: $"+this.salario+"\nDepartamento: "+this.departamento+"\n");
	}
	
	public boolean comparar(empleado  otroItem) {
		if ((this.nombre.equals(otroItem.nombre)) && (this.salario == otroItem.salario) && (this.departamento.equals(otroItem.departamento))) {
			return true;
		}
		else 
			{return false;
			}
	}
	
	
	public static void main(String[] args) {
		empleado e1 = new empleado("Noelia",100,"ciencias");
		empleado e2 = new empleado("Sus",50);
	
		e1.mostrarEstado();
		e2.mostrarEstado();
		if (e1.comparar(e2)) {System.out.println("Iguales");
		}else {System.out.println("diferentes");
		}
	}
	
	
}
/*Solicitar al usuario que ingrese el nombre, el salario y el departamento del
empleado. Crear objetos de la clase "Empleado" utilizando un constructor
que tome como parámetros el nombre, el salario y el departamento
ingresados. Si no se proporciona el departamento, se debe establecer como
"Sin departamento".*/