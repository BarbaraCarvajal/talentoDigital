package Trabajos;

import java.util.Scanner;

public class Calculadora {
	/*
	 * CONTEXTO
	 * 
	 * Desarrolle una aplicación que simule una calculadora. Esta nos pedirá 2
	 * operandos, ambos de tipo entero (int) y un signo aritmético a modo de texto
	 * (String); según este último valor se realizará la operación correspondiente.
	 * Finalmente, el programa mostrará por consola el resultado. Los signos
	 * aritméticos disponibles son los siguientes: • Suma (+) • Resta (-) •
	 * Multiplicación (x) • División (:) • Módulo (/) Tema: El Entorno Java para la
	 * Programación Intención del aprendizaje o aprendizaje esperado: Planteamiento
	 * del Problema: Nota 1: Los signos indicados en las operaciones anteriores no
	 * son los mismos que los utilizados en el lenguaje de programación Java Nota 2:
	 * Para ingresar valores a través de teclado, use la clase Scanner (vea el
	 * enlace en las referencias)
	 * 
	 */
	// variables globales
	public static String simbolo, suma, resta, multiplicacion, division;
	public static Scanner teclado = new Scanner(System.in);
	public static int num1, num2;
	
	// FUNCIONES DE LAS OPERATORIAS PRINCIPALES

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;

	}

	public static float modulo(float a, float b) {
		return a%b;
	}

	public static float dividir(float a, float b) {
		return a/ b;
	}

	public static void pedirNumeros() {

		// pedir numeros:

		while (true) {
			try {
				System.out.println("Primer número: ");
				num1 = Integer.parseInt(teclado.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Ingresar un numero válido...");
			}
		}
		while (true) {
			try {
				System.out.println("Segundo número: ");
				num2 = Integer.parseInt(teclado.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Ingresar un numero válido...");
			}
		}
	}

	public static void mostrarOpciones() {
		System.out.println("Operaciones disponibles: ");
		System.out.println("" + " • Suma (+)\n" + "	• Resta (-)\n" + "	• Multiplicación (x)\n" + "	• División (:)\n"
				+ "	• Módulo (/)");
	}

	public static void verificacion0() {
		while(true) {
			if (num2 != 0) {
				break;
			}else {
				System.out.println("El segundo numero no puede ser 0, intentelo otra vez...");
				pedirNumeros();
			}
		}
	}
	
	public static void pedirSimbolo() {
		boolean condicion = true;
		while (condicion) {
			System.out.println("Ingrese el simbolo de la operación que desea realizar");
			simbolo = teclado.nextLine();

			switch (simbolo) {
				case "+": 
					System.out.println("Operación seleccionada: SUMA");
					System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
					condicion = false;
					break;
				
				case "-": 
					System.out.println("Operación seleccionada: RESTA");
					System.out.println("La resta de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
					condicion = false;
					break;
				
				case "x": 
					System.out.println("Operación seleccionada: MULTIPLICACIÓN");
					System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
					condicion = false;
					break;
					
					
				
				case ":": 
					System.out.println("Operación seleccionada: DIVISIÓN");
					verificacion0();
					System.out.println("La division de " + num1 + " y " + num2 + " es: "+dividir(num1,num2));
					condicion = false;
					break;
				
				case "/": 
					System.out.println("Operación seleccionada: MODULO");
					verificacion0();
					System.out.println("El modulo entre " + num1 + " y " + num2 + " es: "+modulo(num1,num2));
					condicion = false;
					break;
				
				default: 
	
					System.out.println("Opcion incorrecta");
			

			}
			
			
		}
	}

	public static void main(String[] args) {

		pedirNumeros();
		mostrarOpciones();
		pedirSimbolo();
		System.out.println("Fin de la calculadora");
	}
}
