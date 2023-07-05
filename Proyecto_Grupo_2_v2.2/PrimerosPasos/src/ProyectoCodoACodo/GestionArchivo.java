package ProyectoCodoACodo;
import java.io.*;
import java.util.*;
public class GestionArchivo {
	private static final String FILE_PATH = "profes.txt";	
	List<Profesor> registros = leerArchivo();
	public static void AltaProfes(Profesor miProfe) {
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH, true))){
			buffer.write(miProfe.getId() + "," + miProfe.getNombre() + "," + miProfe.getApellido() + "," + miProfe.getEmail() + "," + miProfe.getDni() + "," + miProfe.getMateria());
			buffer.newLine();
		}catch(IOException e) {
			System.out.println("No se pudo crear el archivo" + e.getMessage());
		}
	}
	public static List<Profesor> leerArchivo(){	
		List<Profesor> registros = new ArrayList<>();		
		try(BufferedReader leer = new BufferedReader(new FileReader(FILE_PATH))){
			String[] partes;
			String linea = "";		
			while((linea=leer.readLine()) != null) {
				partes = linea.split(",");
				Profesor profesor = new Profesor(Integer.parseInt(partes[0].trim()), partes[1].trim(), partes[2].trim(), partes[3].trim(), Integer.parseInt(partes[4].trim()), partes[5].trim());
				registros.add(profesor);
				ultimoid = Integer.parseInt(partes[0].trim())+1;
			}			
		}catch(IOException e) {
			System.out.println("No se pudo leer el archivo" + e.getMessage());
		}
		return registros;
	}
	public static void guardarArchivo(List<Profesor> Profesores){
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH))){
			for( Profesor miProfe: Profesores) {
				buffer.write(miProfe.getId() + "," + miProfe.getNombre() + "," + miProfe.getApellido() + "," + miProfe.getEmail() + "," + miProfe.getDni() + "," + miProfe.getMateria());
				buffer.newLine();
			}
		}catch(IOException e) {
			System.out.println("No se pudo leer el archivo" + e.getMessage());
		}
	}	
	public static int getLastId() {	
		leerArchivo();
		return ultimoid;
	}
	public static int ultimoid;
}
