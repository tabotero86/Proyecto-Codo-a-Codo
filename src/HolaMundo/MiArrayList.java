package HolaMundo;
import java.util.ArrayList;
public class MiArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> mercaderias;
		
		mercaderias = new ArrayList<String>();
		
		//cargo e datos en el arraylist
		
		mercaderias.add("1k pan");
		mercaderias.add("1k papas");
		mercaderias.add("6 huevos");
		
		//Imprimo los elementos contenidos dentro del arraylist
		
		System.out.println(mercaderias);
		
		//consulto la longitud del arraylist
		
		System.out.println(mercaderias.size());
		
		//añadir elementos al arraylist
		
		mercaderias.add("6 limones");
		System.out.println(mercaderias);
		
		// obtener el valor de un elemento
		
		System.out.println(mercaderias.get(3));
		
		//cambiar un elemento del arraylist
		
		mercaderias.set(2, "1 mermelada");
		System.out.println(mercaderias);
		
		//borrar un elemento del arraylist
		
		mercaderias.remove(0);
		System.out.println(mercaderias);
		
	}

}
