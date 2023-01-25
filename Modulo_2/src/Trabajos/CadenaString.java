package Trabajos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadenaString {

	public static void main(String[] args) {
		/*
		 * 
		 * Desarrolle un programa en lenguaje Java tal que, al ingresar una cadena de
		 * texto o String por teclado, tome dicha cadena y la lea carácter por carácter,
		 * y los despliegue por consola. Al finalizar el programa, debe ser indicar la
		 * cantidad de vocales y la cantidad de consonantes. Nota 1: Se debe validar que
		 * la cadena ingresada no esté vacía; si eso sucede, debe pedirlo nuevamente.
		 * Nota 2: Recuerde que para obtener un carácter de un String puede usar el
		 * método CharAt.
		 * 
		 */

		Scanner teclado = new Scanner(System.in);
		//String letraSola;
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		
		ArrayList<Object> lista = new ArrayList();
		ArrayList<Object> listaVocales = new ArrayList();
		ArrayList<Object> listaConsonantes = new ArrayList();
		
		while(true) {
			System.out.println("Ingrese su frase: ");
			String frase = teclado.nextLine().toLowerCase();
			if (frase.matches("[a-zA-Z\\s]+$")) {
				// iteramos la frase y la vamos
				for (int i = 0; i < frase.length(); i++) {
					char caracter = frase.charAt(i);
					lista.add(caracter);
					String letra = Character.toString(caracter);
					if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
						listaVocales.add(letra);
						contadorVocales = contadorVocales+1;
					}else {
						listaConsonantes.add(letra);
						contadorConsonantes = contadorConsonantes+1;
					}
				}
				//imprimir letra por letra 
				System.out.println("Imprimir letra por letra ");
				lista.forEach(elemento -> System.out.print(" "+elemento));
				
				
				System.out.println("\nVocales en la frase");
				listaVocales.forEach(elemento -> System.out.print(" "+elemento));
				System.out.println("\nTotal Vocales: "+contadorVocales+"\n");
				
				
				System.out.println("Consonantes en la frase");
				listaConsonantes.forEach(elemento -> System.out.print(" "+elemento));
				System.out.println("\nTotal Consonantes: "+contadorConsonantes+"\n");
				break;
			}else {
				System.out.println("Ingresar sólo letras... no números, no signos especiales ni tildes !!");
			}

		}
		

		
	
		
		
	
	}	
	}
	




