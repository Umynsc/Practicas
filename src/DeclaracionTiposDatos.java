
public class DeclaracionTiposDatos {
	public static void main(String[] args) {
		/*\
		 * Declaracion de variables de tipos de datos simple
		TIPO_DE_DATO NOMBRE_VARIABLE
		*/
		byte number_binario;			//Para representar numeros enteros de 8 bits, con signo. 
		short number_corto;				//Para representar numeros enteros de 16 bits, con signo.
		int number;						//Para representar numeros enteros de 32 bits, con signo .
		long number_grande;				//Para representar numeros enteros de 64 bits, con signo. 
		float number_Decimal;			//Para representar numeros reales de 32 bits, con signo.
		double number_grandeDecimal;	//Para representar numeros reales de 64 bits, mayor precision, con signo.
		char caracter;					//Para representar caracteres individuales Unicode de 16 bits.
		boolean logico;					//Para representar dos valores posibles, true o false.
		
		number_binario = 2;
		number_corto = 20;
		number = 2000;
		number_grande = 29999999;
		number_Decimal = 9999;
		number_grandeDecimal = 1551212.132121;
		caracter = 'A';
		logico = true;
		//La '\n' realiza una linea en blanco
		System.out.println("******El valor de cada variable******* "+ "\n"+
				"El tipo de dato byte: "+number_binario+"\n"+
				"El tipo de dato short: "+number_corto+ "\n"+
				"El tipo de dato int: "+number+"\n"+
				"El tipo de dato long: "+number_grande+"\n"+
				"El tipo de dato float: "+number_Decimal+"\n"+
				"El tipo de dato double: "+number_grandeDecimal+"\n"+
				"El tipo de dato char: "+ caracter+"\n"+
				"El tipo de dato byte: "+logico+"\n");
			
		}
}
