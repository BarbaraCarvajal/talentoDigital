package com.unab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Evaluacion prueba = new Evaluacion("¿Está nublado?", "SI");
		
		System.out.println(prueba.getPregunta());
		Scanner teclado = new Scanner(System.in);
		String valor = teclado.nextLine();
		
		prueba.setRespuesta(valor);
		System.out.println(prueba.getRespuesta());
		System.out.println(prueba.validar());
		
	}
}
