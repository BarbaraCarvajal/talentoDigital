/**
 * 
 */
package com.unab;
import java.util.Scanner;
/**
 * @author Luis Zenteno
 *
 */
public class calcuLuis {
	
	static Scanner sr = new Scanner(System.in);
	static float n1, n2,suma,resta,mult,mod;
	static double div;
	static String operacion;

	// Funciones 
	static void numeros() {
		
		while(true) {
			
		try{
			
			System.out.print("\nIngrese el valor N° 1: ");
			n1 = Integer.parseInt(sr.nextLine());
			break;
		}
		
		catch (NumberFormatException e){
			System.out.println("Número no valido");
		}
	}
		while(true) {
			
			try{
				
				System.out.print("\nIngrese el valor N° 2: ");
				n2 = Integer.parseInt(sr.nextLine());
				break;
			}
			
			catch (NumberFormatException e){
				System.out.println("Número no valido");
			}
		}
		
		
}
	
	static void suma() {
		
		suma = n1 + n2;
		
		System.out.println("La suma es: " + suma);
	}
	
	static void resta() {
		
		resta = n1 - n2;
		
		System.out.println("La resta es: " + resta);
	}
	
	static void mult() {
		
		mult = n1 * n2;
		
		System.out.println("La multiplicación es: " + mult);
	}
	
	static void div() {
		
		while(true) {
			
			div = n1/n2;
			
			if(n2==0) {
				System.out.println("No es posible dividir por 0, ingresa un valor diferente.");
				numeros();
			}else {
				break;
			}
		}
		System.out.println("La división es: " + div);
	}
	
	
	static void mod() {
		
		
		while(true) {
			
			mod = n1%n2;
			
			if(n2==0) {
				System.out.println("No es posible sacar el modulo de un valor divisble por 0, ingresa un valor valido");
				numeros();
			}else {
				break;
			}
		}
		System.out.println("El modulo es: " + mod);
	}
	
	
	static void menu() {
		
		System.out.println("\nCALCULADORA BASICA");
		System.out.println("-----------------------------------------");
		System.out.println("1.- SUMA (+)\n2.- RESTA (-)\n3.- MULTIPLIACIÓN (*)\n4-. DIVISIÓN (/)\n5.- MÓDULO (%)");
	
	}
	
	static void operador() {
		
		while(true) {
		
		System.out.println("\nElige el simbolo de la operacion : ");
		operacion = sr.nextLine();
		
			if(operacion.equals("+")){
				suma();
				break;
			}
			if(operacion.equals("-")) {
				resta();
				break;
			}
			if(operacion.equals("*")) {
				mult();
				break;
			}
			if(operacion.equals("/")) {
				div();
				break;
			}
			if(operacion.equals("%")) {
				mod();
				break;
			}
			else {
				System.out.println("Opcion invalida, vuelva a ingresar un signo valido");
			}
	}
	}
		
	
	public static void main(String[] args) {
		
		numeros();
		menu();
		operador();
	}

}