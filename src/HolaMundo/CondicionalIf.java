package HolaMundo;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		edad = teclado.nextInt();
		
		if(edad>=18){
			
			System.out.println("Eres mayor de edad!!!");
		
		}
		else{
				
				System.out.println("Eres menor de edad!!!");
		}
	}

}
