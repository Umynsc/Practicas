package tp3;
public class Persona {

	String nombre;
	String apellido;
	int edad;
	String direccion;
	long dni;
			
	public Persona() {
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	public void ponerDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void ponerEdad(int edad) {
		this.edad = edad;
	}
	public void ponerDni(long dni) {
		this.dni = dni;
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
	}

	public static void main(String[] args) {
		Persona npc = new Persona();
				
		String auxNom = "Lorena";
		npc.ponerNombre(auxNom);
		
		String auxApe = "Diaz";
		npc.ponerApellido(auxApe);
		
		int auxEdad = 24;
		npc.ponerEdad(auxEdad);
		
		String auxDir = "calle 3 n°5";
		npc.ponerDireccion(auxDir);
				
		long auxDni = 457852;
		npc.ponerDni(auxDni);
				
		
		String aux = npc.darNombre();
		System.out.println(aux);

		aux = npc.darApellido();
		System.out.println(aux);
		
		aux = npc.darDireccion();
		System.out.println(aux);
		
		int auxInt = npc.darEdad();
		System.out.println(auxInt);

		long auxLo = npc.darDni();
		System.out.println(auxLo);
	}
}
