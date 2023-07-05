package Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
public class MainBody {
	public static void main(String[] args) {		
		Integer numeroComision, añoComision, semestreComision;
		String nombreProfesor, adminpass,passprofe, menuadmin, adminpass1, adminpass2;
		int i, numeroprofes, opcion, idprof=4000;
		boolean pasook;
		ArrayList<Integer> acomision = new ArrayList<Integer>();
		ArrayList<String> aprofesor = new ArrayList<String>();
		ArrayList<Integer> aaño = new ArrayList<Integer>();
		ArrayList<Integer> acuatrimestre = new ArrayList<Integer>();
		ArrayList<Integer> aid = new ArrayList<Integer>();
		ArrayList<String> apassprofesor = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println();
			System.out.println("///////////Ingrese la opcion deseada////////////");
			System.out.println("1.- Ingreso como Admin");
			System.out.println("2.- Ingreso como Profesor");
			System.out.println("3.- Ingreso como Alumno");
			System.out.println("4.- Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion){
			case 1: 
			{
				System.out.println("Usted esta ingresando al Usuario Admin, por favor ingrese la contraseña:" + "\n");
				adminpass = teclado.nextLine();
				Contraseñas passadmin = new Contraseñas(adminpass);
				pasook = passadmin.getpassok();
				if(pasook){
					do {
						System.out.println();
						System.out.println("///////////Ingrese la opcion deseada////////////");
						System.out.println("p.- Ingreso de profesores");
						System.out.println("a.- Ingreso de alumnos");
						System.out.println("cp.- consulta de profesores");
						System.out.println("ca.- consulta de alumnos");
						System.out.println("cc.- cambiar contraseña Admin");
						System.out.println("v.- volver menu principal");
						menuadmin = teclado.nextLine();					
						switch(menuadmin){
						case "p":
						{
							System.out.println("Por favor ingrese la cantidad de profesores: ");
							numeroprofes = teclado.nextInt();						
							for(i=0;i<(numeroprofes);i++) {
								System.out.println("Ingrese el numero de comision del profesor " + (i+1) + ":");
								numeroComision = teclado.nextInt();
								System.out.println("Ingrese el nombre del profesor " + (i+1) + ":");
								nombreProfesor = teclado.next();
								System.out.println("Ingrese el agno de la comision correspondiente a este profesor:");
								añoComision = teclado.nextInt();
								System.out.println("Ingrese el cuatrimestre de la comision correspondiente a este profesor:");
								semestreComision = teclado.nextInt();
								System.out.println("Defina una contraseña para este profesor:");
								passprofe = teclado.next();
								teclado.nextLine();
								acomision.add(numeroComision);														
								aprofesor.add(nombreProfesor);							
								aaño.add(añoComision);		
								acuatrimestre.add(semestreComision);							
								aid.add(idprof);							
								apassprofesor.add(passprofe);							
								idprof++;			
							}						
							break;	
						}
						case "a":
						{

							break;
						}
						case "cp":
						{
							if (idprof==4000){							
								System.out.println("No se han ingresado profesores");
								break;
							}else {
								int argprofes=idprof-4000;	
								for(int j=0;j<argprofes;j++)
								{
									System.out.println("Datos del ingreso");
									System.out.println("La comision es: " + acomision.get(j));
									System.out.println("El nombre del profesor es: " + aprofesor.get(j));
									System.out.println("El agno de la comision es: " + aaño.get(j));
									System.out.println("El cuatrimestre de la comision es: " + acuatrimestre.get(j));
									System.out.println("El ID del profesor es: " + aid.get(j));
									System.out.println("La contraseña del profesor es: " + apassprofesor.get(j));
									System.out.println();	
								}								
							}															
							break;
						}
						case "ca":
						{

							break;
						}
						case "cc":
						{
							System.out.println("Ingrese la nueva contraseña: ");
							adminpass1 = teclado.nextLine();
							System.out.println("Reingrese la nueva contraseña: ");
							adminpass2 = teclado.nextLine();
							if(adminpass1.equals(adminpass2)) {						
							Contraseñas newpassAdmin = new Contraseñas(adminpass1);		
							System.out.println("Se ha establecido la contraseña, Muchas Gracias ");
							}else {
								System.out.println("No se cambió la contraseña: ");
								System.out.println("Vuelva a ingresar la nueva contraseña: ");
								adminpass1 = teclado.nextLine();
								System.out.println("Reingrese la nueva contraseña: ");
								adminpass2 = teclado.nextLine();
								if(adminpass1.equals(adminpass2)) {						
								Contraseñas newpassAdmin = new Contraseñas(adminpass1);												
								System.out.println("Se ha establecido la contraseña, Muchas Gracias ");
							}else {
								System.out.println("No se pudo cambiar la contraseña");	
							}							
							}
							break;
						}
						case "v":
						{						
							break;
						}
						default:
							System.out.println("Opción Invalida");	
						}
						break;
					}while(menuadmin !="v");


				}else {
					System.out.println("Contraseña Incorrecta, Lo sentimos");
					break;
				}
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {
				System.out.println("Muchas gracias por elegirnos, Hasta la Próxima");
				break;
			}
			default:
				System.out.println("Opción Invalida");
			}
		}while(opcion !=4);		
	}
}