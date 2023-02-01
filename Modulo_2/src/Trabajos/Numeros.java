package Trabajos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numeros {

	public static Scanner teclado = new Scanner(System.in);
	public static String numero;
	public static int contador = 0, numEntero=0;
	public static boolean condicion = true;
	public static double promedio = 0;
	public static ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
	
	
	public static void principal() {
		while(condicion) {
			System.out.println("Ingrese un numero...");
			numero = teclado.nextLine();
			
			if(!numero.equals("0")){
				numEntero = Integer.parseInt(numero);
				listaNumeros.add(numEntero);
				contador = contador +1;
			}else if(numero.equals("0") && contador >= 3) {
					System.out.println("Numeros ingresados en la lista: "+listaNumeros);
					
					condicion = false;
			}else {
				System.err.println("No puede agregar el número 0 a la lista...");
			}
		}
	}
	
	public static void promedio() {
		int suma = 0;
		for (int num =0; num < listaNumeros.size(); num++) {
			int numerito = listaNumeros.get(num);
			suma = suma + numerito;
			promedio = suma/listaNumeros.size();
		}
		System.out.println("El promedio es: "+promedio);
	}

	public static void menorNum() {
		int menorNumero = Collections.min(listaNumeros);
		System.out.println("El numero más pequeño de la lista es: "+menorNumero);
	}
	
	public static void mayorNum() {
		int mayorNumero = Collections.max(listaNumeros);
		System.out.println("El numero más grande de la lista es: "+mayorNumero);
	
	}

	public static void eliminarPares() {
		for (int x = 0; x <listaNumeros.size(); x++) {
			if (listaNumeros.get(x) % 2 == 0) {
				listaNumeros.remove(x);
				x--;
			}
		}
		System.out.println("Lista sin números pares: "+listaNumeros);
	}
	
	

	public static void main(String[] args) {
		/*
		Escribe un programa que administre almacene una cantidad indeterminada de números enteros 
		en un ArrayList. El programa debe solicitar números hasta que se ingrese el valor 0; una vez 
		que esto pase, se debe desplegar el promedio simple de los números, el menor valor y el mayor de ellos.
		Una vez realizado lo anterior, debe eliminar de la colección aquellos números que sean pares, y 
		calcular y desplegar nuevamente el promedio, menor y mayor de los valores restantes.
		Considere que el valor 0 final no debe ser tomado en cuenta en el ArrayList. 
		Además, se debe validar que, al momento de hacer los cálculos, existan al menos tres valores ingresados.
		*/
		
		principal();
		promedio();
		menorNum();
		mayorNum();
		System.out.println("---------------------");
		eliminarPares();
		promedio();
		menorNum();
		mayorNum();
		
	}

}
