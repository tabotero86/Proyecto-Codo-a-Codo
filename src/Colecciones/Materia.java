package Colecciones;

import java.util.ArrayList;

public class Materia {
	
	private int comision; 
	private String profesor;
	private int año;
	private int cuatrimestre;
	private int id;
	private String passprofesor;
	
	
	
	public Materia(int comision, String profesor, int año, int cuatrimestre, int id, String passprofesor) {
		
		this.comision = comision;
		this.profesor = profesor;
		this.año = año;
		this.cuatrimestre = cuatrimestre;	
		this.id = id;
		this.passprofesor = passprofesor;
		
		ArrayList<Integer> acomision = new ArrayList<Integer>();
		acomision.add(comision);
		
		ArrayList<String> aprofesor = new ArrayList<String>();
		aprofesor.add(profesor);
		
		ArrayList<Integer> aaño = new ArrayList<Integer>();
		aaño.add(año);
		
		ArrayList<Integer> acuatrimestre = new ArrayList<Integer>();
		acuatrimestre.add(cuatrimestre);
		
		ArrayList<Integer> aid = new ArrayList<Integer>();
		aid.add(id);
		
		ArrayList<String> apassprofesor = new ArrayList<String>();
		apassprofesor.add(passprofesor);
		
		int i = acomision.size();
				
	}

	public int getComision() {
		
		return comision;				
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassprofesor() {
		return passprofesor;
	}

	public void setPassprofesor(String passprofesor) {
		this.passprofesor = passprofesor;
	}
	
	
}
