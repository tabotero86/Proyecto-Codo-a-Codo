package HolaMundo;

import java.util.Scanner;

public class IngresoAlumnos {

	public static void main(String[] args) {

	int i;
	String nombreAlumno;
	Scanner teclado = new Scanner(System.in);
	
	for(i=0;i<5;i++) {
		System.out.println("Ingrese el nombre del alumno");
		nombreAlumno = teclado.next();
		CrearClase nuevo = new CrearClase(nombreAlumno);
		System.out.println(nuevo.getNombre());
	}

	}

}
