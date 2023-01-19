package RepasosEnClases;

import java.util.Scanner;

public class Covid {

	public static void main(String[] args) {
		/*
		 * 
		 * Considere el siguiente enunciado. Determine las unidades al mínimo nivel de detalle, y 
         * expréselas como un conjunto de expresiones lógicas.
		 * 
		 * “Una persona debe permanecer 14 días en observación únicamente si ha salido del país. 
		 *  La persona se hará el PCR si quiere volver a la normalidad. 
		 *  Dado que ni la persona ha 
		 *  salido del país ni presenta contagios cercanos, no tendrá que hacer cuarentena ni se 
		 *  le hará el PCR.”
		 * 
		 *  Recuerde asociar cada frase atómica como una variable, y asignarle un valor de verdad cualquiera,
		 *  siempre que aplique al caso. Una vez realizado, evalúe la situación con al menos dos combinaciones 
		 *  de valores de verdad iniciales, y verifique los cambios en el resultado final.
		 * 
		 * */
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Bienvenido a nuestro sistema "+ nombre+ " responde las siguientes preguntas: ");
		
		System.out.println("¿Haz salido del país? (1=Si | 2=No");
		int respuesta = teclado.nextInt();
		if (respuesta == 1) {
			System.out.println("Como haz salido del país, tendrás que hacerte un PCR");
		}
	}

}
