package EjerciciosBucles;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
	
		//Hacer un programa pida dos números por teclado, los ordene de menor a mayor e imprima los números pares entre dos números.

		int num1, num2, i, mayor, menor, par;
		
		System.out.println("Hola!!! Este programa muestra los números pares contenidos entre dos números ingresados, de menor a mayor");
		System.out.println("Ingrese el primer número");
		
		Scanner teclado = new Scanner(System.in);
		
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo número");
		
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			
			mayor = num1;
			menor = num2;
			
			for(i = menor; i <= mayor; i++){
				par = i % 2;
				
				if(par == 0) {
					
					System.out.println(i);	
				}
			}
			
		}else {
			mayor = num2;
			menor = num1;
			
			for(i = menor; i <= mayor; i++){
				par = i % 2;
				
				if(par == 0) {
					
					System.out.println(i);	
				}
			}
			
		}
		System.out.println("Muchas gracias por utilizar este algoritmo");
	}

}
