package tp1;
import java.util.Scanner;
public class tercerPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Un cine tiene diferentes tipos de precios para los clientes. 
 * La gente menor de edad compra un ticket a 400$. 
 * La gente adulta, compra un ticket a 700$. 
 * Una familia de 6 personas se dirige al cine a ver una
 * película. Junto con los dos padres, 
 * los acompañan sus cuatro hijos menores de edad.
 * Realice un programa en Java que muestre el total 
 * en gastos que realiza la familia.
 */
	Scanner entrada = new Scanner(System.in);
		
	double precioNiño = 400.0;
	double precioAdulto = 700.0;
	
	System.out.println("cuantos niños? ");
	int cantNiño = entrada.nextInt();
	System.out.println("cuantos adultos? ");
	int cantAdulto = entrada.nextInt();
		
	System.out.println(" Los gaston son: $"+((precioNiño * cantNiño) + (precioAdulto * cantAdulto)));
	
	
	}

}
