package Trabajos;

import java.util.ArrayList;
//import java.util.Scanner;

public class RecorrerArraysList {
    public static void main(String[] args) {
    	
    	//Para mostrar el contenido de un ArrayList en Java, puede utilizar el método 
    	//toString() o el método forEach().

    	//El método toString() se puede utilizar para imprimir el contenido completo 
    	//del ArrayList en una sola línea. Por ejemplo:
    	
    	System.out.println("Pimer metodo: ");
    	ArrayList<String> miLista = new ArrayList<String>();
    	miLista.add("elemento1");
    	miLista.add("elemento2");
    	miLista.add("elemento3");
    	System.out.println(miLista);

    	//El método forEach() se puede utilizar para recorrer cada elemento del ArrayList 
    	//y realizar alguna acción con cada uno. Por ejemplo:
    	System.out.println("\nSegundo metodo: ");
    	ArrayList<String> miLista2 = new ArrayList<String>();
    	miLista2.add("elemento1");
    	miLista2.add("elemento2");
    	miLista2.add("elemento3");
    	miLista2.forEach(elemento -> System.out.println(elemento));

    	
    	//También se puede utilizar un ciclo for tradicional para recorrer el ArrayList 
    	//y mostrar cada elemento.
    	System.out.println("\nTercer metodo: ");
    	ArrayList<String> miLista3 = new ArrayList<String>();
    	miLista3.add("elemento1");
    	miLista3.add("elemento2");
    	miLista3.add("elemento3");
    	for (int i = 0; i < miLista3.size(); i++) {
    	    System.out.println(miLista3.get(i));
    	}
    	
    	//o un for each
    	System.out.println("\nCuarto metodo: ");
    	ArrayList<String> miLista4 = new ArrayList<String>();
    	miLista4.add("elemento1");
    	miLista4.add("elemento2");
    	miLista4.add("elemento3");
    	for (String elemento : miLista4) {
    	    System.out.println(elemento);
    	}
    	
    	//Cualquiera de estos tres métodos te permitirá imprimir los elementos 
    	//del ArrayList en Java.

    }
}