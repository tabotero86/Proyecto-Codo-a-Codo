package ProyectoCodoACodo;

import java.util.Objects;

public class Profesor {
	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private int dni;
	private String materia;
	////////////////////////////////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////////////////////////////////////
	public Profesor(int id, String nombre, String apellido, String email, int dni, String materia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.materia = materia;
	}
	////////////////////////////////////////////////////////////////////GETTERS AND SETTERS///////////////////////////////////////////////////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	//////////////////////////////////////////////////////////////////TO STRING////////////////////////////////////////////////////////////////////////////////
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", dni="
				+ dni + ", materia=" + materia + "]\n";
	}
}
