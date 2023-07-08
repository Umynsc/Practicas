public class PruebaString {
	public static void main(String[] args){
		int cantJotas=0;
		
		String palabra = "James Gosling creo java";
		//A continuacion se haran pruebas de los metodos de la clase String
		//La longitud del String
		System.out.println(palabra.length());
		//Mostrar letra por letra
		for(int i=0; i<palabra.length();i++) {
			System.out.print("-"+palabra.charAt(i));
		}
		System.out.println("");
		//Mostrar un subString de "palabra"
		System.out.println("La subcadena seria: "+palabra.substring(4, 13));
		//"palabra" en minuscula  y mayuscula
		System.out.println("En minuscula: "+palabra.toLowerCase());
		System.out.println("En mayuscula: "+palabra.toUpperCase());
		//Cambiar java por python
		palabra = palabra.replaceAll("java", "Jjajj");
		System.out.println("Modificado: "+palabra);
		//Calcular cuantas veces aparece la letra "j", despues de la modificacion
		int A = 0;int E = 0;int I = 0;int O = 0;int U = 0;
		for(int i=0;i<palabra.length();i++){
			char c = palabra.charAt(i);
			char X = palabra.charAt(i);
			if((c == 'j') || (c == 'J')) {
				cantJotas++;
			}
			switch (X){
			case 'a':
				A++;
				break;
			case 'A': 
				A++;
				break;
			case 'e':
				E++;
				break;
			case 'E':
				E++;
				break;
			case 'i':
				I++;
				break;
			case 'I':
				I++;
				break;
			case 'o':
				O++;
				break;
			case 'O':
				O++;
				break;
			case 'u':
				U++;
				break;
			case 'U':
				U++;
				break;
				
			}
			
			if((X == 'a') || (X == 'A')) {
				
			}
		}
		System.out.println("La cantidad de 'j': "+cantJotas);
		System.out.println("Letra A: "+A);
		System.out.println("Letra E: "+E);
		System.out.println("Letra I: "+I);
		System.out.println("Letra O: "+O);
		System.out.println("Letra U: "+U);
	}
}