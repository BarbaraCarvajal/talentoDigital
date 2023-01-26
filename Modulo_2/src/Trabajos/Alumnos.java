package Trabajos;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumnos {
	// variables, condiciones, listas y scanner
	static Scanner teclado = new Scanner(System.in);
	static String nombre = "alumno", alumno1, alumno2;
	static boolean condicion = true, condicion2 = true;
	static int num = 1, nota = 10, contador=0, sumaNotas=0, notaMasAlta=10, notaMasBaja = 70;


	static ArrayList<Object> listaNombreYnotas = new ArrayList<>();
	// static ArrayList<Object> listaNotas = new ArrayList<>();

	public static void nombreAlumnoNotaAlumno() {

		while (true) {

			System.out.println("Ingrese el nombre del alumno n° " + num + ": ");
			nombre = teclado.nextLine().toUpperCase();
		
			if (!nombre.matches("[a-z A-Z]{2,}")) {
				System.out.println("Tiene que ingresar por lo menos 1 alumno...");
			} else {
				if (nombre.equals("SALIR") && contador>=2) {
					System.out.println("Ud ha seleccionado escrito SALIR por ende, adios! :D");
					float promedio = sumaNotas/contador;
					System.out.println("Promedio del curso: "+promedio);
					System.out.println("Nota más alta: "+notaMasAlta+" del alumno "+alumno1);
					System.out.println("Nota más baja: "+notaMasBaja+" del alumno "+alumno2);
					
					break;
				}else if( nombre.equals("SALIR") && contador<2){
					System.out.println("Tiene que ingresar un minimo de 2 alumnos...");
				}
				else {
					listaNombreYnotas.add(nombre);
					num += 1;
					while (true) {
						try {
							while(true) {
								System.out.println("Ingrese la nota de "+nombre+": ");
								nota = Integer.parseInt(teclado.nextLine());
								if(nota >=10 && nota <=70) {
									listaNombreYnotas.add(nota);
									contador = contador +1;
									sumaNotas = sumaNotas +nota;
									if ( nota > notaMasAlta) {
										notaMasAlta = nota;
										alumno1 = nombre;
										break;
									}else if (nota < notaMasBaja){
										notaMasBaja = nota;
										alumno2 = nombre;
										break;
									}
									
									
									break;
								}else {
									System.out.println("Ingrese una nota dentro de los rangos de 10 y 70");
								}
							}
							break;
						} catch (NumberFormatException e) {
							System.out.println("Ingresar un numero válido...");
						}
					}
				}
			}
		}
		System.out.println(listaNombreYnotas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa en Java que solicite el ingreso de nombres de varios
		 * alumnos y la calificación en una prueba de cada uno por teclado. No se sabe
		 * cuantos alumnos tiene el curso, por lo que el programa debe terminar cuando
		 * se ingrese un alumno con nombre igual a “SALIR”. 
		 * Al suceder lo anterior, se
		 * debe desplegar por consola el promedio de curso obtenido, 
		 * el nombre del alumno con la menor nota y el nombre del alumno con la mayor nota. Es
		 * importante validar que se ingrese siempre más de un alumno.
		 */

		System.out.println("holi");
		nombreAlumnoNotaAlumno();
	}
}
