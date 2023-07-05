package EjerciciosBucles;
import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
	
	//	Hacer un programa que imprima los números entre dos números a ingresar por teclado.

		
		int num1, num2, mayor, menor, i;
		
		System.out.println("Hola!!! Este programa muestra los números contenidos entre dos números ingresados");
		System.out.println("Ingrese el primer número");
		
		Scanner teclado = new Scanner(System.in);
		
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo número");
		
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			
			mayor = num1;
			menor = num2;
			
			for(i = menor; i <= mayor; i++){
				System.out.println(i);
			}
		}else {
			mayor = num2;
			menor = num1;
			
			for(i = menor; i <= mayor; i++){
				System.out.println(i);
			}
		}
		System.out.println("Muchas gracias por utilizar este algoritmo");
	}

}
