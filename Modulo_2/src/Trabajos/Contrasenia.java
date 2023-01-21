package Trabajos;

import java.util.Scanner;

public class Contrasenia {

	public static void main(String[] args) {
		/*
		 * 
		 * Escribe un programa en Java, en el que una cadena de texto (String) contiene una contraseña 
		   cualquiera. Después se pedirá al usuario que introduzca la contraseña, en no más de 3 intentos. 
		   Cuando el usuario acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “La clave 
		   ingresada es correcta”. 
		   Es necesario considerar correctamente la condición de salida, ya que siempre se tiene 3 intentos, y 
		   en caso de que acierte se termina el programa, aunque le queden intentos.
		 *
		 * */
		
		Scanner teclado = new Scanner(System.in);
		String clave = "clave123";
		int num = 0;
		
		while(num <=2) {
			System.out.println("Ingrese su contraseña");
			String respuesta = teclado.nextLine();
			if (respuesta.equals(clave)) {
				System.out.println("¡Contraseña correcta!");
				break;
			}else if (respuesta != clave) {
				num = num + 1;
				if (num == 3) {
					System.out.println("Se acabaron las oportunidades... :C");
				}
			}
		}
	}
}



