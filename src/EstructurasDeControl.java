public class EstructurasDeControl {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Las estructuras de control que tenemos en Java son:
		//Estructura IF, permite evaluar una/s condicion/es
		int x;
		x = 10;
		x = 8;
		System.out.println("Estructura IF-ELSE");
		if(x == 10){
			System.out.println("El numero es diez");
		}
		else{
			System.out.println("El numero es "+x);
		}
		
		System.out.println();
		
		//Estructura FOR: Repetir una cantidad fija de veces
		int i;
		System.out.println("Estructura FOR");
		for(i=1;i<=5;i++){
			System.out.println("Esta es la iteracion "+i);
		}
		
		System.out.println();
		
		//Estructura WHILE: Repetir por medio de una/s condicion/es
		int y = 1;
		System.out.println("Estructura WHILE");
		while(y<=5){
			System.out.println("Esta es la iteracion "+y);
			y = y + 1;	//y++
		}
		
		System.out.println();
		
		//Estructura DO-WHILE: Repite al menos una vez. Despues seguira repetiendo sujeto a la condicion
		System.out.println("Estructura REPEAT UNTIL");
		int z = 1;
		do {
			System.out.println("Esta es la iteracion "+z);
			z = z + 1;
		}
		while(z<=5); 
		
		System.out.println();
		
		
		System.out.println("Estructura SWITCH");
		//Estructura SWITCH
		int a = 10;
		switch (a){
			case 10: 
				System.out.println("El numero es diez");
				break;
			case 5:
				System.out.println("El numero es cinco");
				break;
			//Pueden haber mas casos
			default:
				System.out.println("No es ni el cinco ni el diez");
		}
		
	}//fin de clase main 
}//fin de clase
