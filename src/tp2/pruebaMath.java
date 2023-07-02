package tp2;
import java.lang.Math;
public class pruebaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = Math.random()*10; //genera aleatorio de 0 a 1 y lo multiplique por 10 para dar valores de 1 cifra
		long num2 = Math.round(num);  //de un REAL calcula su ENTERO mas cercano
		System.out.println("el entero mas cercano de "+num+" es "+num2);
		
		long arg = Math.round(Math.random()*100);
		long arg2 = Math.round(Math.random()*100);
		double max1 = Math.max(arg, arg2);
		double min1 = Math.min(arg,arg2);
		System.out.println("El minimo es "+min1+" y el maximo "+max1);	
		
	}

}
