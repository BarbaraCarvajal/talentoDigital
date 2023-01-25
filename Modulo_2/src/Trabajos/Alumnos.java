package Trabajos;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa en Java que solicite el ingreso de nombres de varios 
		alumnos y la calificación en una prueba de cada uno por teclado. 
		No se sabe cuantos alumnos tiene el curso, por lo que el programa 
		debe terminar cuando se ingrese un alumno con nombre igual a “SALIR”.
		Al suceder lo anterior, se debe desplegar por consola el promedio 
		de curso obtenido, el nombre del alumno con la menor nota y el 
		nombre del alumno con la mayor nota.
		Es importante validar que se ingrese siempre más de un alumno.
		*/
		
		
		Scanner teclado = new Scanner(System.in);
		String nombre= "alumno";
		double nota = 1.0;
		
		while(true) {
			
		
			System.out.println("Ingrese el nombre del alumno: ");
			
			nombre = teclado.nextLine().toUpperCase();
			if (nombre.equals("SALIR")) {
				System.out.println("Ud ha seleccionado la opción de no continuar "
						+ "con el ingreso de más alumnos");
				
				break;
			}else {
				System.out.println("Ingrese la nota de "+nombre+": ");
			}
			
			nota = teclado.nextInt();
			teclado.nextLine();
			
		}
		
		
	
		}
	}

