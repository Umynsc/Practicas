package tp3;
import java.util.Scanner;

public class Auto {
	String marca;
	String modelo;
	int año;
	
	public void setMarca(String aux) {
		this.marca = aux;
	}
	public void setModelo(String aux) {
		this.modelo = aux;
	}
	public void setAño(int aux) {
		this.año = aux;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAño() {
		return año ;
	}
	
	
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		Auto car1 = new Auto();
		Auto car2 = new Auto();
		Auto car3 = new Auto();
		
		car1.setMarca("Ford");
		car1.setModelo("Falcon");
		car1.setAño(1986);
		
		car2.setMarca("Chevrolet");
		car2.setModelo("Apache");
		car2.setAño(1972);
		
		car3.setMarca("volkswagen");
		car3.setModelo("Bora");
		car3.setAño(2005);
		
		System.out.println("Elige de 1 a 3 ...");
		int aux = ent.nextInt();
		
		
		switch (aux) {
		case 1:
			System.out.println("Marca: "+car1.getMarca()+"\nModelo: "+car1.getModelo()+"\nAño: "+car1.getAño());
			break;
		case 2:
			System.out.println("Marca: "+car2.getMarca()+"\nModelo: "+car2.getModelo()+"\nAño: "+car2.getAño());
			break;
		case 3:
			System.out.println("Marca: "+car3.getMarca()+"\nModelo: "+car3.getModelo()+"\nAño: "+car3.getAño());
			break;		
		}
		
		Auto car4 = new Auto();
		int menu = 1;
		String auxString; 
		
		while (menu != 0) {
			
			System.out.println("\n1) Modificar marca\n2) Modificar modelo \n3) modificar año \n0) Salir");
			menu = ent.nextInt();
			ent.nextLine();
			switch (menu) {
			case 1:
				auxString = ent.nextLine();
				car4.setMarca(auxString);
				break;
			case 2:
				auxString = ent.nextLine();
				car4.setModelo(auxString);
				break;
			case 3:
				aux = ent.nextInt();
				car4.setAño(aux);
				break;
			}

			
			String aux1 = car4.getMarca();
			String aux2 = car4.getModelo();
			int aux3 = car4.getAño();
			System.out.println("marca: "+aux1+"\nmodelo: "+aux2+"\naño: "+aux3);
		}
				
	}
	

}


/*Desarrollar una clase "Auto" con atributos como marca, modelo y año de
fabricación. Crea objetos de tipo "Auto" y utiliza métodos para establecer la
marca, el modelo y mostrar detalles sobre el coche, como su antigüedad.*/