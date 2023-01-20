package Trabajos;

import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		/*
		Una compañía de seguros ha elaborado una sesión de lluvia de ideas, en las que se han planteado ciertas 
		observaciones que se desea analizar prontamente. A fin de ordenar las ideas, se ha solicitado:
		1.- Formalizar la frase.
		2.- ¿Es posible representar el resultado anterior como un algoritmo? De ser posible, transfórmelo a 
		código Java atomizando las frases y asignando un valor de verdad; en caso contrario, justifique por qué no se puede hacer.
			
		La frase en cuestión es:
		“Si un trabajador no cuida los procedimientos de seguridad, ocurrirá un accidente. Si el trabajador 
		no lee el manual de seguridad interno sucedería lo mismo. El trabajador no ha sufrido incidentes. 
		De ahí concluimos que ha seguido todos los procedimientos de seguridad, y ha leído el manual de seguridad interno”.
		*/
		
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		
		System.out.println("El trabajador cuida los procedimientos de seguridad? (SI = 1 | NO = 2)");
		respuesta = teclado.nextLine();
		
		if (respuesta.matches("[1]{1}"))
		
		System.out.println("El trabajador lee el manual de seguridad interno?");
		
		
		
		
		
		//System.out.println("El trabajador ha sufrido ");
		
	}

}
