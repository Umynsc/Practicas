package tp3;

import java.util.Scanner;

public class CuentaBancaria {
	long numCuenta;
	String titular;
	double saldo;

	public CuentaBancaria() {
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double aux) {
		this.saldo = aux;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public long getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(long numCuenta) {
		this.numCuenta = numCuenta;
	}

	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombreTitular;	double saldoActual;  long numCuentaActual;
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
	
		System.out.println("Ingresa el nombre del titular ");
		nombreTitular = entrada.nextLine();
		cuenta1.setTitular(nombreTitular);
		
		System.out.println("Ingresa el saldo ");
		saldoActual = entrada.nextDouble();
		cuenta1.setSaldo(saldoActual);
		
		numCuentaActual = Math.round(Math.random() * 100000000);
		cuenta1.setNumCuenta(numCuentaActual);
		System.out.println("Cuenta generada con el numero: "+numCuentaActual);
		
		
		int menu; double aux; double aux2;
		
		do{
			System.out.println("\n	NOMBRE: "+cuenta1.getTitular()+"\n	NUMERO: "+cuenta1.getNumCuenta());
			System.out.println("\n1) ver saldo \n2) retirar saldo \n3) depositar saldo\n");
			menu = entrada.nextInt();
			
			switch (menu) {
			case 1: 
				aux = cuenta1.getSaldo();
				System.out.println("Saldo: $" +aux);
				break;
			case 2:
				System.out.println("Cuanto vas a retirar? ");
				aux = entrada.nextDouble();
				aux2 = cuenta1.getSaldo();
				if(aux <= aux2) {
					aux = aux2 - aux;
					cuenta1.setSaldo(aux);
				}
				else {System.out.println("No tienes saldo suficiente ");
				}//if
				
			case 3: 
				System.out.println("Cuanto va a depositar");
				aux = entrada.nextDouble() + cuenta1.getSaldo();
				cuenta1.setSaldo(aux);
			}//switch
		}//do
		while(menu !=0);
		
	}
}