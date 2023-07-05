package ProyectoCodoACodo;
import java.util.ArrayList;
import java.util.List;
public class GestionProfesor {
	static List<Profesor> misProfesores = new ArrayList<>();
	private static GestionArchivo Profesores = new GestionArchivo();
	public GestionProfesor(List<Profesor> misProfesors) {
		misProfesores = misProfesors;
	}
	public GestionProfesor() {		
		misProfesores = leerArchivo();
	}
	public void altaProfesor(int id, String nombre, String apellido, String email, int dni, String materia) {
		Profesor miProfesor = new Profesor(id, nombre, apellido, email, dni, materia);
		misProfesores.add(miProfesor);
		Profesores.AltaProfes(miProfesor);
	}
	public void modificarProfesor(int id, Profesor miProfe) {
		misProfesores = leerArchivo();
		misProfesores.set(id, miProfe);
		guardarArchivo(misProfesores);
	}
	public void borrarProfesor(int indice) {
		misProfesores = leerArchivo();
		misProfesores.remove(indice);
		guardarArchivo(misProfesores);
	}
	public void guardarArchivo(List<Profesor> profesores) {
		Profesores.guardarArchivo(profesores);
		misProfesores = leerArchivo();
	}
	public List<Profesor> leerArchivo(){
		misProfesores = Profesores.leerArchivo();
		return misProfesores;
	}
}
