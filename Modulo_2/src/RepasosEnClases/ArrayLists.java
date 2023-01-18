package RepasosEnClases;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		lista.add("holii");
		lista.add(1);
		
		System.out.println(lista);
		System.out.println("Largo de la lista: "+lista.size());
		
		System.out.println("Suma: "+(Integer)lista.get(1)+3);
	}
}
