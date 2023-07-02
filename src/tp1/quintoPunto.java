package tp1;

public class quintoPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realice un programa que determine la cantidad de vocales que existen en la siguiente cadena de
caracteres.
“Al ejecutar cualquier programa en JAVA se invoca al método estático que no devuelve nada, especial
llamado main.”
		 */
		
		String frase = "Al ejecutar cualquier programa en JAVA se invoca al método estático que no devuelve nada, especial llamado main.";
		int cant=0;
		
		for(int i=0;i<frase.length();i++) {
			char car = frase.charAt(i);
			if((car=='a')||(car=='e')||(car=='i')||(car=='o')||(car=='u')||(car=='A')||(car=='E')||(car=='I')||(car=='O')||(car=='U')) {
				cant++;
			}
		}
		
		System.out.println("La frase '"+frase+"' tiene "+cant+" vocales.");		
		
	}

}
