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
		String respuesta1, respuesta2;
		//boolean condicion1, condicion2;
		
		while(true) {
			System.out.println("El trabajador cuida los procedimientos de seguridad? (SI = 1 | NO = 2)");
			respuesta1 = teclado.nextLine();
			
			if (respuesta1.matches("[1]{1}")) {
				respuesta1 = "1";
				System.out.println("RESPUESTA: SI");
				break;
			}else if (respuesta1.matches("[2]{1}")) {
				respuesta1 = "2";
				System.out.println("RESPUESTA: NO");
				break;
			}else {
				System.out.println("Ingresar una respuesta válida! (SI = 1 | NO = 2)");
			}
		}
		
		while(true) {
			System.out.println("El trabajador lee el manual de seguridad interno? (SI = 1 | NO = 2)");
			respuesta2 = teclado.nextLine();
			
			if (respuesta2.matches("[1]{1}")) {
				respuesta2 = "1";
				System.out.println("RESPUESTA: SI");
				break;
			}else if (respuesta2.matches("[2]{1}")) {
				respuesta2 = "2";
				System.out.println("RESPUESTA: NO");
				break;
			}else {
				System.out.println("Ingresar una respuesta válida! (SI = 1 | NO = 2)");
			}
		}
		
		if (respuesta1 == "1" && respuesta2 == "1") {
			System.out.println("Es muy probabeble que este trabajador no sufra un accidente laboral");
		}else if (respuesta1 == "2" && respuesta2 == "2"){
			System.out.println("Trabajador con ALTO riesgo de accidente laboral");
		}else if(respuesta1 == "1" || respuesta2 == "2") {
			System.out.println("Trabajador con riesgo de accidente laboral, se aconseja leer el manual interno porfavor");
		}else if (respuesta1 == "2" || respuesta2 == "1") {
			System.out.println("Trabajador con riesgo de accidente laboral, se aconseja seguir los procedimientos de seguridad porfavor");
		}
	}
}
