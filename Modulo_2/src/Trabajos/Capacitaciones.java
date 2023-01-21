/**
 * 
 */
package Trabajos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 *
 */
public class Capacitaciones {
	
	// Variables globales
	
	public static String lugar,hora,dia,duracion,asistentes;
	public static int asist2;
	public static String nombre,rut, direccion, comuna, telefono, nombreAsistente, edadAsistente;
	public static Scanner teclado = new Scanner(System.in);
	
	// FUNCION DATOS 
	public static void datosCapacitacion() {

		// Ingreso y validacion del campo DIA
		
		System.out.println("\nDATOS CAPACITACION");
		System.out.println("-------------------------------------------");
		
		while(true) {
		
		System.out.print("\n1.- Ingresa el día (Ejemplo Lunes): ");
		dia = teclado.nextLine();
		if(dia.matches("[a-zA-Z]{5,9}")) {  // Permite que solo se ingresen caracteres en un rango de 5 a 9 que corresponden al largo minimo y maximo de los dias.
			break;
			}else {
				System.out.println("Ingrese un dato valido porfavor");
				}
		}
	
		// Ingreso y validación del campo HORA

			while(true) {
				
				System.out.print("\n2.- Ingresa la hora (Ejemplo (20:30): ");
				hora = teclado.nextLine();
				if(hora.matches("^([01][0-9]|2[0-3]):[0-5][0-9]$")) {
					break;
				}else {
					System.out.println("Ingrese un dato valido porfavor");
				}
			}
			
		// Ingreso y validacion del campo LUGAR
			
			while(true) {
				System.out.print("\n3.- Ingresa el lugar de la capacitación (No incluir acentos ni Ñ):  ");
				lugar = teclado.nextLine();
				if(!lugar.matches("[a-zA-Z]{2,50}")) {
						System.out.println("Ingrese un dato valido porfavor");
					}
				else {
						break;
					}
			}

		// Ingreso y validacion del campo HORAS
			
			while(true) {
			System.out.print("\n4.- Ingresa cantidad de horas (Ejemplo  3): ");
			duracion = teclado.nextLine();
			
			if(duracion.matches("[0-9]{1,3}")) {
				break;
			}else {
				System.out.println("Ingrese un dato valido porfavor");
			}
	}
			
			// Ingreso y validacion del campo ASISTENTES
			
			while(true) {
			
				System.out.print("\n5.- Ingresa la cantidad de asistentes: ");
				asistentes = teclado.nextLine();
				
				if(asistentes.matches("[0-9]{1,3}")){
					if(!asistentes.equals("0")) {
						asist2 = Integer.parseInt(asistentes);
						break;
					}else {
						System.out.println("Ingrese un dato valido porfavor");
					}
				}else {
					System.out.println("Ingrese un dato valido porfavor");
			}
		
	}
}
	
	public static void datosGenerales() {
		
		System.out.println("\n DATOS DE CAPACITACIÓN");
		System.out.println("--------------------------------------------------");
		System.out.println("\n1.- LUGAR: " + lugar.toUpperCase());
		System.out.println("2.- DIA: " + dia.toUpperCase());
		System.out.println("3.- HORA: " + hora);
		System.out.println("4.- DURACION: " + duracion + " HORAS");
		System.out.println("5.- N° ASISTENTES: " + asistentes);
		
		System.out.println("\n DATOS DE CLIENTE");
		System.out.println("--------------------------------------------------");
		System.out.println("\n1.- NOMBRE: " + nombre.toUpperCase());
		System.out.println("2.- RUT: " + rut);
		System.out.println("3.- DIRECCIÓN: " + direccion.toUpperCase());
		System.out.println("4.- COMUNA: " + comuna.toUpperCase());
		System.out.println("5.- N° TELEFONO: " + telefono);
		
		
	}
	
	public static void DatosClientes() {
		
		System.out.println("\nDATOS CLIENTE (EMPRESA)");
		System.out.println("----------------------------------------");
		System.out.println("NO INGRESAR ACENTOS NI CARACTERES ESPECIALES");
		
		while(true) {
			
			System.out.print("\n1.- Ingrese nombre el nombre del cliente: ");
			nombre = teclado.nextLine();
			if (nombre.matches("[a-z A-Z]{2,50}")){
				break;
			}else {
				System.out.print("¡Ingrese un nombre válido!");
			}
		}
		while(true) {
			
			System.out.print("2.- Ingrese el RUT del cliente (7 a 8 digitos): ");
			rut = teclado.nextLine();
			if (rut.matches("[0-9]{7,8}")){
				break;
			}else {
				System.out.print("Ingrese un rut válido");
			}
		}
		while(true) {
			
			System.out.print("3.- Ingrese su dirección: ");
			direccion = teclado.nextLine();
			if (direccion.matches("[a-z A-Z 0-9]{2,50}")) {
				break;
			}else {
				System.out.print("Ingresar una dirección válida");
			}
		}
		while(true) {
			System.out.print("4.- Ingrese su comuna: ");
			comuna = teclado.nextLine();
			if (comuna.matches("[a-z A-Z]{2,50}")) {
				break;
			}else {
				System.out.print("Ingresar una comuna válida");
			}
		}
		while(true) {
			System.out.print("5.- Ingrese el número telefonico: ");
			telefono = teclado.nextLine();
			if (telefono.matches("[0-9]{8}")) {
				break;
			}else {
				System.out.print("Ingrese un número telefonico válido (8 digitos)");
			}
		}
	
	////////////////////////////////////////////////////////////////////////////////
	
}
	
	public static void DatosAsistentes() {
		int cont = 1;
		ArrayList<Object> listaAsistentes = new ArrayList<>();

		while(cont <= asist2) {
			while(true) {
				
				System.out.print("\nIngrese nombre del asistente N°" + cont + ": " );
				nombreAsistente = teclado.nextLine();
				if (nombreAsistente.matches("[a-z A-Z]{2,50}")){
					listaAsistentes.add(nombreAsistente);
					break;
				}else {
					System.out.print("¡Ingrese un nombre válido!");
				}
			}
			
			while(true) {
				System.out.print("Ingrese la edad del asistente  N°" + cont + ": " );
				edadAsistente = teclado.nextLine();
				if(edadAsistente.matches("[0-9]{2}") ) {
					int edadNumerica = Integer.parseInt(edadAsistente);
					if (edadNumerica >= 18 && edadNumerica <=85) {
						
						listaAsistentes.add(edadNumerica);
						break;
					}
				}else {
					System.out.println("Ingresar una edad valida...(+18)");
				}
			}
			cont = cont +1;
		}
		
		//cantidad de personas menores a 25 años, entre 26 y 35 años y mayores a 35 años.
		System.out.println("\n TODOS LOS ASISTENTES");
		for(int x = 0; x < listaAsistentes.size(); x +=2) {
			System.out.println("Nombre: "+listaAsistentes.get(x) + " Edad: " + listaAsistentes.get(x+1));
			}
		
		/*
		for(int x = 0; x < listaAsistentes.size(); x +=2) {
			if (listaAsistentes.get(x+1) >=18 && listaAsistentes.get(+1) <25) {
				System.out.println("Nombre: "+listaAsistentes.get(x) + " Edad: " + listaAsistentes.get(x+1));
			}
			
			}*/
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		datosCapacitacion();
		DatosClientes();
		datosGenerales();
		DatosAsistentes();
		

	}

}