package tp3;
public class CuentaBancaria {
	long numCuenta;
	String titular;
	double saldo;
	
	public CuentaBancaria(long numCuenta,String titular,double saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	
	public static void main(String[] args) {

	}
}


/*Diseñar una clase "CuentaBancaria" con atributos como número de cuenta,
titular y saldo. Crear objetos de tipo "CuentaBancaria" y utilizar métodos para
establecer el número de cuenta, el titular y realizar operaciones como
depósitos, retiros de saldo, y consultas de saldo.
¿ El atributo titular puede ser de tipo clase ? ¿ Como ? Pensé en cómo podría ser.
*/
