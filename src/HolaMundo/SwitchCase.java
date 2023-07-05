package HolaMundo;


import java.util.Scanner;

import javax.swing.JOptionPane;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

		int figura = teclado.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del lado"));
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado,2));
			
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del altura"));
			System.out.println("El area del rectangulo es: " + base*altura);
			
			break;
			
		case 3:
			
			int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del base"));
			int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del altura"));
			System.out.println("El area del rectangulo es: " + (baseT*alturaT)/2);
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del radio"));
			
			System.out.print("El area del circulo es: ");
			
			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));
			
			break;
			
			default:
			
			System.out.println("La opción no es correcta");
			

		}
	}

}
