package tp2;
import java.util.Scanner;
public class notas {
	
	public static void main (String[] args) {
	Scanner entrada = new Scanner(System.in);
	int eleccion = entrada.nextInt();
	
	
	switch (eleccion) {
	case 1:
		System.out.println("1");
		break;
	case 2:
		System.out.println("2");
		break;
	case 3:
		System.out.println("3");
		break;
	case 4:
		System.out.println("4");
		break;
	}

	}
}