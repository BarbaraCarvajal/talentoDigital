package Trabajos;

import java.util.Scanner;

public class EvaluacionJava {
	static Scanner teclado = new Scanner(System.in);
	static String nombre, fechaNac, run, direccion, telefono, cantEmpleados,
				  aniosExperiencia, departamento, funcion, nombreSuperior;
	static String [][] listaUsuarios;
	

	public static void registrarUsuario() {
		System.out.println("   Datos básicos");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		
		while(true) {
			System.out.println("Ingrese el nombre del usuario: ");
			nombre = teclado.nextLine();
			if (nombre.matches("[a-z A-Z]{2,50}")) {
				break;
			} else {
				System.out.println("¡Ingrese un nombre válido!");
			}
		}
		 while(true){
			 System.out.println("Ingrese la fecha de nacimiento: (formato: dd-mm-aaaa)");
			 fechaNac = teclado.nextLine();
	            if (fechaNac.matches("\\d{2}-\\d{2}-\\d{4}")){
	            	break;
	            }
	            else{
	                System.out.println("Ingrese una fecha valida porfavor");
	            }
		 }
		while(true) {
			System.out.println("Ingrese el run del usuario, sin digito verificador (6-7 digitos): " + nombre + ":");
			run = teclado.nextLine();
			if (run.matches("[0-9]{6,7}")) {
				break;
			}else {
				System.out.println("Ingrese un RUN válido en chile por favor");
			}
			
		}
		
	
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		System.out.println("¿Qué tipo de usuario es "+nombre+"? ");
		System.out.println("Opciones: \n"
				+ "▪ 1- Cliente"
				+ "\n▪ 2- Profesional"
				+ "\n▪ 3- Administrativo"
				+ "\n▪ 4- Volver al menú anterior  ");
	
		while(true) {
			System.out.println("Ingrese su opción: ");
			String opcion = teclado.nextLine();
			if (opcion.equals("1")){
				datosCliente();
				break;
			}else if (opcion.equals("2")){
				datosProfesional();
				break;
			}else if (opcion.equals("3")) {
				datosAdministrativo();
				break;
			}else if(opcion.equals("4")){
				menu();
			}else {
				System.out.println("Ingrese una opción correcta...(1,2 o 3");
			}
		}
	}

	public static void datosCliente() {
		System.out.println("    Datos Cliente");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		System.out.println("Ingrese dirección: ");
		direccion = teclado.nextLine();
		System.out.println("Ingrese telefono: ");
		telefono = teclado.nextLine();
		System.out.println("Cantidad empleados si es que corresponde:: ");
		cantEmpleados = teclado.nextLine();
	}
	
	public static void datosProfesional() {
		System.out.println("  Datos Profesional");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		System.out.println("Ingrese años de experiencia si es que corresponde:: ");
		aniosExperiencia = teclado.nextLine();
		System.out.println("Ingrese el departamento: ");
		departamento = teclado.nextLine();
		
	}
	
	public static void datosAdministrativo() {
		System.out.println(" Datos Administrativo");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		System.out.println("Ingrese la función: ");
		funcion = teclado.nextLine();
		System.out.println("Ingrese nombre de superior si es que corresponde: ");
		nombreSuperior = teclado.nextLine();
	}
	
	
	public static void verMenu() {
		
		System.out.println("    Menu principal");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		System.out.println(
				"\n" + "▪ 1- Registrar usuario\n" 
					 + "▪ 2- Mostrar usuarios\n" 
					 + "▪ 3- Contar usuarios por categoría "
					 + "▪ 4- Modificar usuarios\n"
					 + "▪ 5- Eliminar usuario\n" 
					 + "▪ 6- Salir. ");
	}

	public static void menu() {
		
		boolean condicion = true;
		while (condicion) {
			verMenu();

			System.out.println("Ingrese su opción: (1,2,3,4,5 o 6)");
			String opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Opción elegida: 1 Registrar usuario");
				registrarUsuario();

				break;
			case "2":
				System.out.println("Opcion elegida: 2 Mostrar usuarios");

				break;
			case "3":
				System.out.println("Opcion elegida: 3 Contar usuarios por categoría");

				break;
			case "4":
				System.out.println("Opcion elegida: 4 Modificar usuarios");

				break;
			case "5":
				System.out.println("Opcion elegida: 5 Eliminar usuario");

				break;
			case "6":
				System.out.println("Opcion elegida: 6 Salir");
				condicion = false;
				break;
			default:

				System.out.println("Opcion incorrecta, vuelva a intentarlo...");

			}
		}
	}

	public static void main(String[] args) {
		menu();
	}

}
