package HolaMundo;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
	int i;
	int IntArray[] = new int[10];
	Scanner teclado = new Scanner(System.in); 
	
	System.out.println("Este programa captura 10 datos y los almacena en un vector");
	
	for(i=0;i<10;i++){
		System.out.println("Ingrese el elemento correspondiente a la posicion " + i);
		IntArray[i] =  teclado.nextInt();
	}
	
	System.out.println("Muchas gracias por ingresar los datos");
	
	for(i=0;i<10;i++){
		System.out.println("El elemento ingresado correspondiente a la posicion " + i + " es: " + IntArray[i]);
	}
	System.out.println("***Muchas gracias por utilizar este programa***");
	}

}
