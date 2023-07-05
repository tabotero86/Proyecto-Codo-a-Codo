package HolaMundo;

public class ManejoString {

	public static void main(String[] args) {
		
		//asigno una variable con la cadena de caracteres que describen mi nombre, o sea, Gustavo
		String nombre = "Gustavo";
		
		//asigno otra variable con la cadena de caracteres que describen mi nombre pero sin poner la primera letra en mayuscula
		String otro_nombre = "gustavo";
		
		//imprimo mi nombre
		System.out.println("Mi nombre es " + nombre);
		
		//calculo cuantas letras tiene la cadena de caracteres correspondiente a la variable nombre
		System.out.println("Mi nombre tiene " + nombre.length() + " Letras.");
		
		//Consulto cual es la letra que corresponde a la posicion cero de la cadena de caracteres de la variable nombre
		System.out.println("La primera letra de mi nombre es la " + nombre.charAt(0));
		
		//comparo las cadenas de caracteres para ver si son iguales
		System.out.println(nombre.equals(otro_nombre));
		
		//comparo las cadenas de caracteres para ver si son iguales, discriminando si haya diferencias entre mayusculas y minusculas
		System.out.println(nombre.equalsIgnoreCase(otro_nombre));

	}

}
