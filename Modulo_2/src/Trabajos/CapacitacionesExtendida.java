package Trabajos;

import java.util.Scanner;

/*
 * 
 * 
	Calificar capacitación
	Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de 
	información que le permita administrar los principales procesos que se llevan a cabo 
	en ella día a día.
	Dentro de las actividades que realiza, están las capacitaciones. 
	Estas son instancias que se desarrollan para todos los clientes que posee 
	(que corresponden generalmente a otras empresas). En cada una de ellas se 
	presentan diferentes asistentes, de los cuales se requiere saber su nombre y la 
	calificación que entrega a un determinado evento.
	Requerimiento:
	Desarrolle un programa en Java que solicite el día, hora, lugar, duración y cantidad de 
	asistentes de una capacitación. Con la cantidad anterior, debe crear un arreglo que tenga 
	dicha cantidad de filas y dos columnas. En cada fila debe ir en la primera columna el nombre 
	del asistente a la capacitación, y en la segunda columna la calificación que el usuario entrega.
	Para efectos de este problema almacene en la matriz la calificación como un String que 
	representa una nota entre 1 y 7, las calificaciones solo pueden corresponder a valores enteros.
	Una vez ingresada la última calificación, debe mostrar por consola los datos de la capacitación, 
	el promedio de notas asignada, la calificación mayor y la calificación menor.
	Nota 1: Para este ejercicio considere que el arreglo no almacenará las calificaciones de todas 
	las capacitaciones, ya que los arreglos son estructuras volátiles
	Nota 2: Si bien se solicita la creación de una matriz, se permite el uso de dos arreglos, 
	un arreglo de String para el nombre y un arreglo de enteros para la calificación. 
	Considere que ambos arreglos deben tener el mismo tamaño.
	Nota 3: El uso de matrices bidimensionales en Java sigue las mismas reglas que en el pseudocódigo. 
	En el caso de Java solo cambia la declaración. Revise el enlace adjunto para mayor referencia.
 * 
 * */

public class CapacitacionesExtendida {

	static Scanner teclado = new Scanner(System.in);
	static String nombreEmpresa, fecha, hora, duracion;
	static int cantidadAsistentes;
	static String[][] datos;

	public static void datosCapacitacion() {

		System.out.println("Ingrese el nombre de la empresa: ");
		nombreEmpresa = teclado.nextLine();
		System.out.println("Ingrese la fecha en la cual se realizará la capacitación: ");
		fecha = teclado.nextLine();
		System.out.println("Ingrese la hora de la capacitación");
		hora = teclado.nextLine();
		System.out.println("Ingrese la duración de la capacitación (ejemplo: 2)");
		duracion = teclado.nextLine();
		System.out.println("Ingrese la cantidad de asistentes");
		cantidadAsistentes = teclado.nextInt();
		teclado.nextLine();
		
		datos = new String[cantidadAsistentes][2];

	}

	public static void ingresoNombreYnotas() {
		 
		for (int i = 0; i < cantidadAsistentes; i++) {
			System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
			datos[i][0] = teclado.nextLine();
			System.out.print("Ingrese la calificación (1-7) del asistente " + (i + 1) + ": ");
			datos[i][1] = teclado.nextLine();
		}

	}
	
	 public static void impresionDatos() {
	        for (int x = 0; x < cantidadAsistentes; x++) {
	            System.out.println("Nombre: " + datos[x][0] + "\nNota: " + datos[x][1]);
	        }
	    }

	public static void main(String[] args) {
		datosCapacitacion();
		ingresoNombreYnotas();
		impresionDatos();
	}
}
