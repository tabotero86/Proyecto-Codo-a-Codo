package poo;

public class ConstanteFinal {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Gus");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		trabajador1.cambiaSeccion("RRHH");
		
		//trabajador1.cambiaNombre("Raul");
		
		/*System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		*/
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	
	private final String nombre;		//SE HACE CONSTANTE ESA VARIABLE CON FINAL
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;	//HACE UNA VARIABLE EN COMUN PARA TODOS LOS OBJETOS
	
	
	
	public Empleados(String nom) {
		
		nombre = nom;
		
		seccion = "Administracion";		
		
		Id = IdSiguiente;
		
		IdSiguiente++;
				
	}
	//METODO ESTATICO, NO ACTUAN SOBRE OBJETOS, SOLO ACCEDEN A VARIABLES STATIC Y SE LLAMAN POR NOMBRE_CLASE.NOMBRE_METODO
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	
	public void cambiaSeccion(String seccion) {		//SETTER
		this.seccion = seccion;
	}
	
	/*public void cambiaNombre(String nombre) {		//SETTER
		this.nombre = nombre;
	}
	*/
	
	public String devuelveDatos() {		//GETTER
		return "El nombre es: " + nombre + " la seccion es: " + seccion + " y el ID es: " + Id;
	}
	
}
