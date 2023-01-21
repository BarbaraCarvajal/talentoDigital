
package Trabajos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CONTEXTO Crear capacitación Una empresa de asesorías en prevención de riesgos
 * necesita contar con un sistema de información que le permita administrar los
 * principales procesos que se llevan a cabo en ella día a día. Dentro de las
 * actividades que realiza, están las capacitaciones. Estas son instancias que
 * se desarrollan para todos los clientes que posee (que corresponden
 * generalmente a otras empresas). Por cada capacitación se desea tener registro
 * del RUT del cliente, su nombre, dirección, comuna y número de teléfono. En
 * cuanto a la capacitación misma, se necesita saber el día, hora, lugar,
 * duración y cantidad de asistentes. De acuerdo con la cantidad de asistentes
 * anteriormente ingresada, se debe solicitar y el nombre y edad de los
 * asistentes. Finalizado este proceso, debe mostrar por pantalla los datos de
 * la empresa que pidió la capacitación, los datos de la capacitación misma, y
 * la cantidad de personas menores a 25 años, entre 26 y 35 años y mayores a 35
 * años. Nota: Todos los datos son obligatorios. Por tanto, debe validar que el
 * ingreso haya sido correcto en todos los casos. Además, debe validar que la
 * cantidad de asistentes registrada sea mayor que cero
 *
 */

public class Capacitaciones {

	// Variables globales

		public static String lugar, hora, dia, duracion, asistentes;
		public static int asist2;
		public static String nombre, rut, direccion, comuna, telefono, nombreAsistente, edadAsistente, nonmbreCapacitacion;
		public static Scanner teclado = new Scanner(System.in);

	// FUNCION DATOS
	public static void datosCapacitacion() {

		// Ingreso y validacion del campo DIA

		System.out.println("\nFORMULARIO CAPACITACION");
		System.out.println("\n----------------------------------------------------------");

		while (true) {
			System.out.print("\nIngrese el nombre de la capacitación: ");
			nonmbreCapacitacion = teclado.nextLine();
			if (nonmbreCapacitacion.matches("[a-z A-Z 0-9]{1,}")) {
				break;
			} else {
				System.out.println("Ingrese un nonmbre valido porfavor");
			}

		}

		while (true) {

			System.out.print("\n1.- Ingresa el día (Ejemplo Lunes): ");
			dia = teclado.nextLine();
			if (dia.matches("[a-zA-Z]{5,9}")) { // Permite que solo se ingresen caracteres en un rango de 5 a 9 que
												// corresponden al largo minimo y maximo de los dias.
				break;
			} else {
				System.out.println("Ingrese un dato valido porfavor");
			}
		}

		// Ingreso y validación del campo HORA

		while (true) {

			System.out.print("\n2.- Ingresa la hora (Ejemplo (20:30): ");
			hora = teclado.nextLine();
			if (hora.matches("^([01][0-9]|2[0-3]):[0-5][0-9]$")) {
				break;
			} else {
				System.out.println("Ingrese un dato valido porfavor");
			}
		}

		// Ingreso y validacion del campo LUGAR

		while (true) {
			System.out.print("\n3.- Ingresa el lugar de la capacitación (No incluir acentos ni Ñ):  ");
			lugar = teclado.nextLine();
			if (!lugar.matches("[a-z A-Z 0-9]{2,50}")) {
				System.out.println("Ingrese un dato valido porfavor");
			} else {
				break;
			}
		}

		// Ingreso y validacion del campo HORAS

		while (true) {
			System.out.print("\n4.- Ingresa cantidad de horas (Ejemplo  3): ");
			duracion = teclado.nextLine();

			if (duracion.matches("[0-9]{1,3}")) {
				break;
			} else {
				System.out.println("Ingrese un dato valido porfavor");
			}
		}

		// Ingreso y validacion del campo ASISTENTES

		while (true) {

			System.out.print("\n5.- Ingresa la cantidad de asistentes: ");
			asistentes = teclado.nextLine();

			if (asistentes.matches("[0-9]{1,3}")) {
				if (!asistentes.equals("0")) {
					asist2 = Integer.parseInt(asistentes);
					break;
				} else {
					System.out.println("Ingrese un dato valido porfavor");
				}
			} else {
				System.out.println("Ingrese un dato valido porfavor");
			}

		}
	}

	public static void datosGenerales() {

		System.out.println("\nDATOS DE CAPACITACIÓN");
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\n1.- LUGAR: " + lugar.toUpperCase());
		System.out.println("2.- DIA: " + dia.toUpperCase());
		System.out.println("3.- HORA: " + hora);
		System.out.println("4.- DURACION: " + duracion + " HORAS");
		System.out.println("5.- N° ASISTENTES: " + asistentes);

		System.out.println("\nDATOS DE CLIENTE");
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\n1.- NOMBRE: " + nombre.toUpperCase());
		System.out.println("2.- RUT: " + rut);
		System.out.println("3.- DIRECCIÓN: " + direccion.toUpperCase());
		System.out.println("4.- COMUNA: " + comuna.toUpperCase());
		System.out.println("5.- N° TELEFONO: " + telefono);

	}

	public static void DatosClientes() {
		
		System.out.println("");

		System.out.println("\nFORMULARIO CLIENTE (EMPRESA)");
		System.out.println("\n----------------------------------------------------------");
		System.out.println("NO INGRESAR ACENTOS NI CARACTERES ESPECIALES");

		while (true) {

			System.out.print("\n1.- Ingrese nombre el nombre del cliente: ");
			nombre = teclado.nextLine();
			if (nombre.matches("[a-z A-Z]{2,50}")) {
				break;
			} else {
				System.out.print("¡Ingrese un nombre válido!");
			}
		}
		while (true) {

			System.out.print("2.- Ingrese el RUT del cliente (7 a 8 digitos): ");
			rut = teclado.nextLine();
			if (rut.matches("[0-9]{7,8}")) {
				break;
			} else {
				System.out.print("Ingrese un rut válido");
			}
		}
		while (true) {

			System.out.print("3.- Ingrese su dirección: ");
			direccion = teclado.nextLine();
			if (direccion.matches("[a-z A-Z 0-9]{2,50}")) {
				break;
			} else {
				System.out.print("Ingresar una dirección válida");
			}
		}
		while (true) {
			System.out.print("4.- Ingrese su comuna: ");
			comuna = teclado.nextLine();
			if (comuna.matches("[a-z A-Z]{2,50}")) {
				break;
			} else {
				System.out.print("Ingresar una comuna válida");
			}
		}
		while (true) {
			System.out.print("5.- Ingrese el número telefonico: ");
			telefono = teclado.nextLine();
			if (telefono.matches("[0-9]{8}")) {
				break;
			} else {
				System.out.print("Ingrese un número telefonico válido (8 digitos)");
			}
		}

		////////////////////////////////////////////////////////////////////////////////

	}

	public static void DatosAsistentes() {
		
		int cont = 1;
		
		ArrayList<Object> lista25 = new ArrayList<>();
		ArrayList<Object> lista35 = new ArrayList<>();
		ArrayList<Object> lista85 = new ArrayList<>();
		
		System.out.println("");
		
		System.out.println("\nFORMULARIO DE ASISTENTES");
		System.out.println("\n----------------------------------------------------------");

		while (cont <= asist2) {

			while (true) {
				System.out.print("\nIngrese la edad del asistente  N°" + cont + ": ");
				edadAsistente = teclado.nextLine();
				if (edadAsistente.matches("[0-9]{2}")) {
					int edadNumerica = Integer.parseInt(edadAsistente);
					if (edadNumerica >= 18 && edadNumerica <= 85) {
						if (edadNumerica >=18 && edadNumerica <= 25) {
							lista25.add(edadNumerica);
							while (true) {
								System.out.print("Ingrese nombre del asistente N°" + cont + ": ");
								nombreAsistente = teclado.nextLine();
								
								if (nombreAsistente.matches("[a-z A-Z]{2,50}")) {
									lista25.add(nombreAsistente.toUpperCase());
									cont = cont + 1;
									break;
								} else {
									System.out.print("¡Ingrese un nombre válido!");
								}
							}

						} else if (edadNumerica > 25 && edadNumerica < 36) {
							lista35.add(edadNumerica);
							while (true) {

								System.out.print("Ingrese nombre del asistente N°" + cont + ": ");
								nombreAsistente = teclado.nextLine();
								if (nombreAsistente.matches("[a-z A-Z]{2,50}")) {
									lista35.add(nombreAsistente.toUpperCase());
									cont = cont + 1;
									break;
								} else {
									System.out.print("¡Ingrese un nombre válido!");
								}
							}
							break;

						} else if (edadNumerica > 35 && edadNumerica <= 85) {
							lista85.add(edadNumerica);
							while (true) {

								System.out.print("Ingrese nombre del asistente N°" + cont + ": ");
								nombreAsistente = teclado.nextLine();
								if (nombreAsistente.matches("[a-z A-Z]{2,50}")) {
									lista85.add(nombreAsistente.toUpperCase());
									cont = cont + 1;
									break;
								} else {
									System.out.print("¡Ingrese un nombre válido!");
								}
							}
							break;
						}
					}
				} else {
					System.out.println("Ingresar una edad valida...(+18)");
				}
			}

		}
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\nINSCRITOS ORDENADOS SEGÚN EDAD");
		System.out.println("\n----------------------------------------------------------");
		
		// menores de 25 años:
		System.out.println("\nHASTA 25 AÑOS");
		for (int x = 0; x < lista25.size(); x += 2) {
			System.out.println("\nEDAD: " + lista25.get(x) + " NOMBRE: " + lista25.get(x + 1));
		}

		// entre 26 y 35 años:
		System.out.println("");
		System.out.println("\nENTRE 26 Y 35 AÑOS");
		for (int x = 0; x < lista35.size(); x += 2) {
			System.out.println("\nEDAD: " + lista35.get(x) + " NOMBRE: " + lista35.get(x + 1));
		}

		// entre 26 y 35 años:
		System.out.println("\nMAYORES A 35 AÑOS");
		for (int x = 0; x < lista85.size(); x += 2) {
			System.out.println("\nEDAD: " + lista85.get(x) + " NOMBRE: " + lista85.get(x + 1));
		}

	}

	public static void main(String[] args) {

		datosCapacitacion();
		DatosClientes();
		DatosAsistentes();
		datosGenerales();

	}

}