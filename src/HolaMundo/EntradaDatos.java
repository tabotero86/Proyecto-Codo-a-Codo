package HolaMundo;

import java.util.Scanner;
public class EntradaDatos {

	public static void main(String[] args) {
		
		String nombre;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tu nombre, por favor");
		nombre = teclado.nextLine();
		
		System.out.println("Su nombre es: " + nombre);
	}

}
