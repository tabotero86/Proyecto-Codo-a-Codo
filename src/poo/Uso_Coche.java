package poo;

import java.util.Scanner;
public class Uso_Coche {

	public static void main(String[] args) {
		String color, asientos, climatizador;		
		Scanner teclado = new Scanner(System.in);		
		Coche Renault=new Coche(); //INSTANCIA UNA CLASE. EJEMPLAR DE CLASE
		System.out.println("Ingrese color");
		color = teclado.nextLine();
		Renault.establece_color(color);		
		System.out.println(Renault.dime_datos_generales());		
		System.out.println(Renault.dime_color());
		System.out.println("Tiene asientos de cuero? si o no como respuesta");
		asientos = teclado.nextLine();
		Renault.configura_asientos(asientos);		
		System.out.println(Renault.dime_asientos());
		System.out.println("Tiene climatizador? si o no como respuesta");
		climatizador = teclado.nextLine();
		Renault.configura_climatizador(climatizador);		
		System.out.println(Renault.dime_climatizador());		
		System.out.println(Renault.dime_peso_coche());		
		System.out.println("El precio final del coche es: " + Renault.precio_coche());		
	}

}
