package Trabajos;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluacionJava {
	static Scanner teclado = new Scanner(System.in);
	static String nombre, fechaNac, run, direccion, telefono, cantEmpleados,
				  aniosExperiencia, departamento, funcion, nombreSuperior;
	static int contadorClientes = 0;
	static int contadorProfesionales = 0;
	static int contadorAdministrativos = 0;
	static int contadorUsuarios = 0;
	static ArrayList <ArrayList<String>>   listaGeneral = new ArrayList <ArrayList<String>>();
	static ArrayList <String>  listaUsuarios = new ArrayList <String>();
	static ArrayList <String>  listaClientes = new ArrayList <String>();
	static ArrayList <String>  listaProfesionales = new ArrayList <String>();
	static ArrayList <String>  listaAdministrativos = new ArrayList <String>();
	
	
	
	public static String detectarLetras(String mensaje, Scanner teclado) {
		boolean bandera = true;
		String entrada = "";
		while (bandera) {
			System.out.println(mensaje);
			entrada = teclado.nextLine();
			if (entrada.matches("[a-z A-Z\\s]+${1,}")) {
				bandera = false;
			}else {
				System.out.println("Ingrese sólo letras...");
			}
		}
		return entrada;
	}
	
	public static String detectarTelefono(String mensaje, Scanner teclado) {
		boolean bandera2 = true;
		String entrada = "";

		while (bandera2) {

			System.out.println(mensaje);
			entrada = teclado.nextLine();

			if (entrada.matches("[0-9]{8}")) {

				bandera2 = false;
			} else {
				System.out.println("Escriba sólo números (8 digitos) ");
			}
		}
		return entrada;
	}
	
	public static String detectarNum(String mensaje, Scanner teclado) {
		boolean bandera3 = true;
		String entrada = "";
		while (bandera3) {

			System.out.println(mensaje);
			entrada = teclado.nextLine();

			if (entrada.matches("[0-9]{1,}")) {

				bandera3 = false;
			} else {
				System.out.println("Escribir un número válido");
			}
		}
		return entrada;
	}
	
	public static String detectarFecha(String mensaje, Scanner teclado) {
		boolean bandera4 = true;
		String entrada = "";
		while (bandera4) {
			System.out.println(mensaje);
			entrada = teclado.nextLine();
			
			if (entrada.matches("\\d{2}-\\d{2}-\\d{4}")) {
				bandera4 = false;
			}else {
				System.out.println("Ingrese una fecha valida porfavor");
			}
		}
		return entrada;
	}
	
	public static String detectarDireccion(String mensaje, Scanner teclado) {
		boolean bandera5 = true;
		String entrada = "";
		while(bandera5) {
			System.out.println(mensaje);
			entrada = teclado.nextLine();
			
			if (entrada.matches("[a-z A-Z 0-9]{2,50}")) {
				bandera5 = false;
			}else {
				System.out.println("Ingrese una dirección válida...");
			}
		}
		return entrada;
	}
	
	public static String detectarRun(String mensaje, Scanner teclado) {
		boolean bandera6 = true;
		String entrada = "";
		while(bandera6) {
			System.out.println(mensaje);
			entrada = teclado.nextLine();
			if (entrada.matches("[0-9]{7,8}")) {
				bandera6 = false;
			}else {
				System.out.println("Ingrese un RUN válido en chile por favor");
			}
		}
		return entrada;
	}
	
	public static void registrarUsuario() {
		System.out.println("   Datos básicos");
		System.out.println("★━━━━━━━━━━━━━━━━━━━★");
		
		
		
		nombre = detectarLetras("Ingrese el nombre: ", teclado);
		fechaNac = detectarFecha("Ingrese la fecha de nacimiento", teclado);
		run = detectarRun("Ingrese el run del usuario, sin digito verificador (7-8 digitos):",teclado);
		

	
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
		direccion = detectarDireccion("Ingrese la dirección: ", teclado);
		telefono = detectarTelefono("Ingrese telefono: ", teclado);
		cantEmpleados = detectarNum("Cantidad empleados si es que corresponde:", teclado);
		listaClientes.add(nombre);
		listaClientes.add(fechaNac); 
		listaClientes.add(run);
		listaClientes.add(direccion);
		listaClientes.add(telefono);
		listaClientes.add(cantEmpleados);
		contadorClientes = contadorClientes +1;
		contadorUsuarios = contadorUsuarios +1;
		
				
	}
	
	public static void datosProfesional() {
		System.out.println("  Datos Profesional");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		aniosExperiencia = detectarNum("Ingrese años de experiencia si es que corresponde: ", teclado);
		departamento = detectarLetras("Ingrese el departamento: ", teclado);
		listaProfesionales.add(nombre);
		listaProfesionales.add(fechaNac); 
		listaProfesionales.add(run);
		listaProfesionales.add(aniosExperiencia);
		listaProfesionales.add(departamento);
		contadorProfesionales= contadorProfesionales +1;
		contadorUsuarios = contadorUsuarios +1;
		
		
	}
	
	public static void datosAdministrativo() {
		System.out.println(" Datos Administrativo");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		funcion = detectarLetras("Ingrese la función: ", teclado);
		nombreSuperior = detectarLetras("Ingrese nombre de superior si es que corresponde:", teclado);
		listaAdministrativos.add(nombre);
		listaAdministrativos.add(fechaNac); 
		listaAdministrativos.add(run);
		listaAdministrativos.add(funcion);
		listaAdministrativos.add(nombreSuperior);
		contadorAdministrativos = contadorAdministrativos +1;
		contadorUsuarios = contadorUsuarios +1;
		
	}
	
	public static void listaGeneral() {
		listaGeneral.add(listaClientes);
		listaGeneral.add(listaAdministrativos);
		listaGeneral.add(listaProfesionales);
		
	}
	
	public static void verMenu() {
		
		System.out.println("    Menu principal");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		System.out.println(
				"\n" + "▪ 1- Registrar usuario\n" 
					 + "▪ 2- Mostrar usuarios\n" 
					 + "▪ 3- Contar usuarios por categoría \n"
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
				listaGeneral();
			case "2":
				System.out.println("Opcion elegida: 2 Mostrar usuarios");
				System.out.println("Total usuarios: "+listaGeneral);

				break;
			case "3":
				System.out.println("Opcion elegida: 3 Contar usuarios por categoría");
				System.out.println("Total usuarios: "+listaGeneral.size());
				System.out.println("Total Clientes: "+contadorClientes);
				System.out.println("Total Profesionales: "+contadorProfesionales);
				System.out.println("Total Administrativos: "+contadorAdministrativos);
				
				System.out.println("\nTodos los clientes: ");
				for (int x = 0; x <= listaClientes.size(); x++) {
					System.out.println("\nNOMBRE: " + listaClientes.get(x) + " FECHA NACIMIENTO: " + listaClientes.get(x + 1) +
					"RUN: "+ listaClientes.get(x + 2) + " DIRECCION: "+listaClientes.get(x + 3)+" TELEFONO: " +listaClientes.get(x + 4)+
					" CANTIDAD EMPLEADOS: "+ listaClientes.get(x + 5));
				}
				
				
				
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
