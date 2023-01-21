package RepasosEnClases;

import java.util.Scanner;

public class Funciones {
	
	
	static int sumar(int a, int b) {
		return a+b;
	}
	
	int expresiones() {
		return sumar(2,3);
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(sumar(15,21));
		
		int valor1, valor2;
		
		System.out.println("Ingrese valor 1: ");;
		valor1= entrada.nextInt();
		System.out.println("Ingrese valor 2: ");;
		valor2= entrada.nextInt();
		
		
		System.out.println(sumar(valor1,valor2));
	}

}
