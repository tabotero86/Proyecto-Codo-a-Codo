package Colecciones;
public class Contraseñas {
	
	String adminPassword;
	String alumnoPassword;
	String profesorpassword;
	boolean passok;
	int i=0;
	String adminpas="123";
		
	public Contraseñas(String adminPassword) {
		
		this.adminPassword = adminPassword;
		adminpas=adminPassword;
		}
	
	public String getAdminPassword() {
		return adminPassword;
	}
	
	public boolean getpassok() { //GETTER PASSOK, ENVIA UN VALOR BOOLEANO SI LA CONTRASEÑA ES CORRECTA
		
		if (adminPassword.equals(adminpas)){			
			passok = true;
		}
		else {
			passok = false;
		}
		return passok;
	}
	
	}
