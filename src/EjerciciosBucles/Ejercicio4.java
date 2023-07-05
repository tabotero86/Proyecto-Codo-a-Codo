package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
	// Hacer un programa pida dos números por teclado, los ordene menor y mayor e imprima los números impares que hay entre ambos y cuantos impares hay.

int num1, num2, i, mayor, menor, impar, nimpar;
		
		System.out.println("Hola!!! Este programa muestra los números pares contenidos entre dos números ingresados, de menor a mayor");
		System.out.println("Ingrese el primer número");
		
		Scanner teclado = new Scanner(System.in);
		
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo número");
		
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			
			mayor = num1;
			menor = num2;
			nimpar = 0;
			for(i = menor; i <= mayor; i++){
				impar = i % 2;
				
				if(impar == 1) {
					
					System.out.println(i);	
					nimpar++;
				}
			}
			System.out.println("La cantidad de números impares entre los dos números ingresados es: " + nimpar);
			
		}else {
			mayor = num2;
			menor = num1;
			nimpar = 0;
			for(i = menor; i <= mayor; i++){
				impar = i % 2;
				
				if(impar == 1) {
					
					System.out.println(i);	
					nimpar++;
				}
			}
			System.out.println("La cantidad de números impares entre los dos números ingresados es: " + nimpar);
		}

		System.out.println("Muchas gracias por utilizar este algoritmo");
	}

}
