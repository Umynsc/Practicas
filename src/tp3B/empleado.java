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
	
}
/*Solicitar al usuario que ingrese el nombre, el salario y el departamento del
empleado. Crear objetos de la clase "Empleado" utilizando un constructor
que tome como parámetros el nombre, el salario y el departamento
ingresados. Si no se proporciona el departamento, se debe establecer como
"Sin departamento".*/