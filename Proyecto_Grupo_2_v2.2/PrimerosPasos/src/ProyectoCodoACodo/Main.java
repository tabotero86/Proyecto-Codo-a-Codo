package ProyectoCodoACodo;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
public class Main {	
	public static void main(String[] args) {
		MarcoProyecto mimarco = new MarcoProyecto();		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		mimarco.setVisible(true);
	}
}
///////////////////////////////////////////////////////////////HERENCIA CLASE JFRAME//////////////////////////////////////////////////////////////////////////
class MarcoProyecto extends JFrame{
	public MarcoProyecto() {
		Toolkit mipantallaProJect = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantallaProJect.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		setSize(1100, 400);
		setLocation(anchoPantalla/10, alturaPantalla/4);
		setTitle("Datos Profesores");
		setResizable(false);
		Image miIcono = mipantallaProJect.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);
		LaminaProyecto milamina = new LaminaProyecto();
		milamina.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 300));
		add(milamina);
	}
}
///////////////////////////////////////////////////////////////HERENCIA CLASE JPANEL//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////INTERFACE ACTION LISTENER///////////////////////////////////////////////////////////////////////
class LaminaProyecto extends JPanel implements ActionListener{	
	public GestionProfesor misProfesores = new GestionProfesor();
	public List<Profesor> miListaProfesores;
	private static JTextField cuadro1 = new JTextField();
	private static JTextField cuadro2 = new JTextField();
	private static JTextField cuadro3 = new JTextField();
	private static JTextField cuadro4 = new JTextField();
	private static JTextField cuadro5 = new JTextField();
	private static JButton botonAgregar = new JButton("Agregar");
	private static JButton botonMostrar = new JButton("Mostrar");
	private static JButton botonActualizar = new JButton("Actualizar");
	private static JButton botonEliminar = new JButton("Eliminar");
	private static JButton botonBuscar = new JButton("Buscar");
	private static JTextArea areaTexto = new JTextArea(8,20);
	private static JScrollPane scrollPane = new JScrollPane(areaTexto);
	private static char enterText1;
	private static char enterText2;
	private static char enterText3;
	private static char enterText4;
	private static char enterText5;
	private static char enterBotonAgregar;
	private static char enterBotonMostrar;
	private static char enterBotonBuscar;
	private static char enterBotonActualizar;
	private static char enterBotonEliminar;
	private static int id;
	public static String nombre;
	public static String apellido;
	public static String email;
	public static int dni;
	public static String materia;
	public static int indice;
	public static int indiceUpdate=0;
	private int contadorok = 0;
	////////////////////////////////////////////////////////////////////CONSTRUCTOR DE LA LAMINA//////////////////////////////////////////////////////////////////
	public LaminaProyecto() {
		add(botonAgregar);
		botonAgregar.addActionListener(this);		
		add(botonMostrar);
		botonMostrar.addActionListener(this);
		add(botonBuscar);
		botonBuscar.addActionListener(this);
		add(botonActualizar);
		botonActualizar.addActionListener(this);
		add(botonEliminar);
		botonEliminar.addActionListener(this);		
		botonMostrar.setEnabled(false);
		botonActualizar.setEnabled(false);
		botonEliminar.setEnabled(false);
		botonBuscar.setEnabled(false);
		miListaProfesores=misProfesores.leerArchivo();
		GestionArchivo ultimoid = new GestionArchivo();
		id = ultimoid.getLastId();
		if(id >0) {
			botonMostrar.setEnabled(true);
		}
	}
	/////////////////////////////////////////////////////////////////////////METODO PAINTCOMPONENT////////////////////////////////////////////////////////////////
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		g.drawString("Nombre del Profesor:", 25, 50);
		g.drawString("Apellido del Profesor:", 27, 100);
		g.drawString("Email del Profesor:", 40, 150);
		g.drawString("DNI del Profesor:", 50, 200);
		g.drawString("Materia del Profesor:", 31, 250);
		cuadro1.setBounds(150, 30, 200, 30);
		cuadro2.setBounds(150, 80, 200, 30);
		cuadro3.setBounds(150, 130, 200, 30);
		cuadro4.setBounds(150, 180, 200, 30);
		cuadro5.setBounds(150, 230, 200, 30);			
		scrollPane.setBounds(360, 30, 710, 230);
		areaTexto.setLineWrap(true);
		areaTexto.setEnabled(false);
		add(cuadro1);
		add(cuadro2);
		add(cuadro3);
		add(cuadro4);
		add(cuadro5);
		add(scrollPane);
		EnterText1 tecla1 = new EnterText1();
		cuadro1.addKeyListener(tecla1);
		EnterText2 tecla2 = new EnterText2();
		cuadro2.addKeyListener(tecla2);
		EnterText3 tecla3 = new EnterText3();
		cuadro3.addKeyListener(tecla3);
		EnterText4 tecla4 = new EnterText4();
		cuadro4.addKeyListener(tecla4);
		EnterText5 tecla5 = new EnterText5();
		cuadro5.addKeyListener(tecla5);
		EnterBotonAgregar EnterAgregar = new EnterBotonAgregar();
		botonAgregar.addKeyListener(EnterAgregar);
		EnterBotonMostrar EnterMostrar = new EnterBotonMostrar();
		botonMostrar.addKeyListener(EnterMostrar);
		EnterBotonBuscar EnterBuscar = new EnterBotonBuscar();
		botonBuscar.addKeyListener(EnterBuscar);
		EnterBotonActualizar EnterActualizar = new EnterBotonActualizar();
		botonActualizar.addKeyListener(EnterActualizar);
		EnterBotonEliminar EnterEliminar = new EnterBotonEliminar();
		botonEliminar.addKeyListener(EnterEliminar);
		cuadro1.requestFocus();		
	}
	/////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER CAJA NOMBRE ////////////////////////////////////////////////
	private class EnterText1 implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterText1 = e.getKeyChar();
			if(enterText1==KeyEvent.VK_ENTER) {
				cuadro2.requestFocus();
			}
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	///////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER CAJA APELIIDO ////////////////////////////////////////////////
	private class EnterText2 implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterText2 = e.getKeyChar();
			if(enterText2==KeyEvent.VK_ENTER) {
				cuadro3.requestFocus();
			}
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	//////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER CAJA EMAIL ////////////////////////////////////////////////
	private class EnterText3 implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterText3 = e.getKeyChar();
			if(enterText3==KeyEvent.VK_ENTER) {
				cuadro4.requestFocus();
			}
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	////////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER CAJA DNI ////////////////////////////////////////////////
	private class EnterText4 implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterText4 = e.getKeyChar();
			if(enterText4==KeyEvent.VK_ENTER) {
				cuadro5.requestFocus();
			}
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER CAJA MATERIA ////////////////////////////////////////////////
	private class EnterText5 implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterText5 = e.getKeyChar();
			if(enterText5==KeyEvent.VK_ENTER) {
				botonAgregar.requestFocus();
			}
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER BOTON AGREGAR////////////////////////////////////////////////
	private class EnterBotonAgregar implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterBotonAgregar = e.getKeyChar();
			if(enterBotonAgregar==KeyEvent.VK_ENTER) {				
				botonAgregar.doClick();
			}
		}
		public void keyPressed(KeyEvent e) {			
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER BOTON MOSTRAR////////////////////////////////////////////////
	private class EnterBotonMostrar implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterBotonMostrar = e.getKeyChar();
			if(enterBotonMostrar==KeyEvent.VK_ENTER) {				
				botonMostrar.doClick();
			}
		}
		public void keyPressed(KeyEvent e) {			
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	/////////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER BOTON BUSCAR////////////////////////////////////////////////
	private class EnterBotonBuscar implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterBotonBuscar = e.getKeyChar();
			if(enterBotonBuscar==KeyEvent.VK_ENTER) {				
				botonBuscar.doClick();
			}
		}
		public void keyPressed(KeyEvent e) {			
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	/////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER BOTON ACTUALIZAR////////////////////////////////////////////////
	private class EnterBotonActualizar implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterBotonActualizar = e.getKeyChar();
			if(enterBotonActualizar==KeyEvent.VK_ENTER) {				
				botonActualizar.doClick();
			}
		}
		public void keyPressed(KeyEvent e) {			
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	///////////////////////////////////////////////////////////OBJETO OYENTE CUANDO SE TECLEA ENTER BOTON ELIMINAR////////////////////////////////////////////////
	private class EnterBotonEliminar implements KeyListener{
		public void keyTyped(KeyEvent e) {			
			enterBotonEliminar = e.getKeyChar();
			if(enterBotonEliminar==KeyEvent.VK_ENTER) {				
				botonEliminar.doClick();
			}			
		}
		public void keyPressed(KeyEvent e) {			
		}
		public void keyReleased(KeyEvent e) {
		}
	}
	//////////////////////////////////////////////////////////////////////////OBJETO OYENTE CLICK DE LOS BOTONES//////////////////////////////////////////////////
	public void actionPerformed(ActionEvent e) {		
		Object botonPulsado = e.getSource();
		////////////////////////////////////////////////////////////////////////////CLICK AGREGAR/////////////////////////////////////////////////////////////////////
		if (botonPulsado == botonAgregar ) {
			if (validarDatos()==0){
				misProfesores.altaProfesor(id, nombre, apellido, email, dni, materia);
				JOptionPane.showInternalMessageDialog(null , "REGISTRO EXITOSO", "", JOptionPane.INFORMATION_MESSAGE);
				reiniciarGUI();		
				id++;
			}			
			/////////////////////////////////////////////////////////////////////////////CLICK MOSTRAR////////////////////////////////////////////////////////////////////
		}else if(botonPulsado == botonMostrar) {
			miListaProfesores=misProfesores.leerArchivo();
			areaTexto.setText(miListaProfesores.toString());
			areaTexto.setBackground(Color.BLACK);
			if(miListaProfesores.size()>0) {botonBuscar.setEnabled(true);
			}else {botonBuscar.setEnabled(false);}
			/////////////////////////////////////////////////////////////////////////////CLICK BUSCAR/////////////////////////////////////////////////////////////////////
		}else if(botonPulsado == botonBuscar) {
			miListaProfesores=misProfesores.leerArchivo();
			try {
				indice = Integer.parseInt(JOptionPane.showInputDialog(this, "INGRESE EL ID A CONSULTAR","", JOptionPane.INFORMATION_MESSAGE));
				indiceUpdate = indice;
				if(indice<id) {
					int i = 0;
					boolean hay = false;
					for(Profesor ele: miListaProfesores) {
						if(ele.getId() == indice) {
							indice = i;							
							hay = true;
						}else {
							i++;
						}						
					}
					if(hay) {													
						cuadro1.setText(miListaProfesores.get(indice).getNombre());
						cuadro2.setText(miListaProfesores.get(indice).getApellido());
						cuadro3.setText(miListaProfesores.get(indice).getEmail());
						cuadro4.setText(Integer.toString(miListaProfesores.get(indice).getDni())) ;
						cuadro5.setText(miListaProfesores.get(indice).getMateria());
						areaTexto.setText("");
						areaTexto.setBackground(Color.WHITE);
						botonAgregar.setEnabled(false);
						botonMostrar.setEnabled(true);
						botonBuscar.setEnabled(true);
						botonActualizar.setEnabled(true);
						botonEliminar.setEnabled(true);
						cuadro1.requestFocus();
					}else {
						JOptionPane.showMessageDialog(null, "No existe ese ID", "", JOptionPane.ERROR_MESSAGE);
						reiniciarGUI();
					}						
				}else {
					JOptionPane.showMessageDialog(null, "No existe ese ID", "", JOptionPane.ERROR_MESSAGE);
					reiniciarGUI();	
				}					
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "No es un ID valido", "", JOptionPane.ERROR_MESSAGE);
				reiniciarGUI();
			}			
			/////////////////////////////////////////////////////////////////////////////CLICK ACTUALIZAR/////////////////////////////////////////////////////////////////
		}else if(botonPulsado == botonActualizar) {
			miListaProfesores=misProfesores.leerArchivo();
			if (validarDatos()==0){
				try{
					int i= JOptionPane.showConfirmDialog(null, "Se Actualizará el profesor", "", JOptionPane.OK_CANCEL_OPTION);
					if(i==0) {
						misProfesores.modificarProfesor(indice, new Profesor(indiceUpdate, nombre, apellido, email, dni, materia));
						reiniciarGUI();
					}
				}catch(NumberFormatException exe) {
					reiniciarGUI();
				}
			}
			///////////////////////////////////////////////////////////////////////////////////CLICK ELIMINAR/////////////////////////////////////////////////////////////
		}else if(botonPulsado == botonEliminar) {
			miListaProfesores=misProfesores.leerArchivo();
			try{
				int i = JOptionPane.showConfirmDialog(null, "Se eliminará el profesor", "", JOptionPane.OK_CANCEL_OPTION);			
				if(i==0) {
					misProfesores.borrarProfesor(indice);
					reiniciarGUI();
				}
			}catch(NumberFormatException exep) {
				reiniciarGUI();
			}
		}
	}	
	public static void reiniciarGUI() {
		botonAgregar.setEnabled(true);
		botonMostrar.setEnabled(true);
		botonBuscar.setEnabled(false);
		botonActualizar.setEnabled(false);
		botonEliminar.setEnabled(false);
		areaTexto.setText("");
		areaTexto.setBackground(Color.WHITE);
		cuadro1.setText("");
		cuadro2.setText("");
		cuadro3.setText("");
		cuadro4.setText("");
		cuadro5.setText("");			
		cuadro1.requestFocus();
	}
	public int validarDatos() {
		nombre = cuadro1.getText().trim();
		apellido = cuadro2.getText().trim();
		email = cuadro3.getText().trim();
		materia = cuadro5.getText().trim();
		int correctoarroba = 0;
		int correctopunto = 0;
		int correcto = 0;
		for(int i=0;i<email.length();i++){
			if(email.charAt(i) == '@'){
				correctoarroba++;								
			}else if(email.charAt(i) == '.'){
				correctopunto++;				
			}
		}
		if(correctoarroba ==1 && correctopunto >= 1 && correctopunto < 4) {
			correcto = 1;
		}else {
			correcto=0;
		}
		try {
			dni = Integer.parseInt(cuadro4.getText().trim());
			if(nombre.length() < 2 || nombre.length() > 40 || nombre.equals("")){
				JOptionPane.showMessageDialog(this, "Nombre incorrecto", "", JOptionPane.ERROR_MESSAGE);
				cuadro1.requestFocus();
				contadorok++;
			}else if(apellido.length() < 2 || apellido.length() > 40 || apellido.equals("")){
				JOptionPane.showMessageDialog(this, "Apellido incorrecto", "", JOptionPane.ERROR_MESSAGE);
				cuadro2.requestFocus();		
				contadorok++;
			}else if(correcto != 1 ) {
				JOptionPane.showMessageDialog(this, "Email incorrecto", "", JOptionPane.ERROR_MESSAGE);
				cuadro3.requestFocus();	
				contadorok++;
			}else if(dni<1000000 || dni>99999999) {
				JOptionPane.showMessageDialog(this, "DNI incorrecto", "", JOptionPane.ERROR_MESSAGE);
				cuadro4.requestFocus();	
				contadorok++;				
			}else if(materia.length() < 3 || materia.length() > 20 || materia == null) {
				JOptionPane.showMessageDialog(this, "Materia incorrecta", "", JOptionPane.ERROR_MESSAGE);
				cuadro5.requestFocus();
				contadorok++;
			}else {
				contadorok=0;
			}
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "El DNI debe ser numerico sin puntos", "", JOptionPane.ERROR_MESSAGE);
			cuadro4.requestFocus();	
			cuadro4.setText("");
			contadorok++;
		}		
		return contadorok;
	}
}


