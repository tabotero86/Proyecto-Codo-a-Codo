package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
	
	//Hacer un programa que imprima los números en orden decreciente, desde el mayor introducido por teclado al 0.

		int num1, num2, i;
		
		System.out.println("Hola!!! Este programa muestra los números contenidos entre el número mayor ingresado de dos números hasta cero");
		System.out.println("Ingrese el primer número");
		
		Scanner teclado = new Scanner(System.in);
		
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo número");
		
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
									
			for(i = num1; i >= 0; i--){
				System.out.println(i);
			}
		}else {
									
			for(i = num2; i >= 0; i--){
				System.out.println(i);
			}
		}
		System.out.println("Muchas gracias por utilizar este algoritmo");
	}

}
