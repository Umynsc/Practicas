package tp3;
public class Persona {

	String nombre;
	String apellido;
	int edad;
	String direccion;
	long dni;
			
	public Persona(String nombre, String apellido, int edad, String direccion, long dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.dni = dni;
	}
	
	public Persona(String auxNom) {
		this.nombre = auxNom;
		this.apellido = ""; // Valor predeterminado para apellido
		this.edad = 0; // Valor predeterminado para edad
		this.direccion = ""; // Valor predeterminado para dirección
		this.dni = 0; // Valor predeterminado para dni
	}


	public String darNombre() {
		return nombre;
	}
	public String darApellido() {
		return apellido;
	}
	public String darDireccion() {
		return direccion;
	}
	public int darEdad() {
		return edad;
	}
	public long darDni() {
		return dni;
	}// Resto de los métodos...

	public static void main(String[] args) {
		String auxNom = "Lorena";
		String auxApe = "Diaz";
		int auxEdad = 24;
		String auxDir = "calle 3 n°5";
		long auxDni = 457852;
	
		Persona npc2 = new Persona(auxNom);
		
		String aux = npc2.darNombre();
		System.out.println(aux);
		String aux2 = npc2.darApellido();
		System.out.println(aux2);
		String aux3 = npc2.darDireccion();
		System.out.println(aux3);
		int aux4 = npc2.darEdad();
		System.out.println(aux4);
		long aux5 = npc2.darDni();
		System.out.println(aux5);
	}
}
