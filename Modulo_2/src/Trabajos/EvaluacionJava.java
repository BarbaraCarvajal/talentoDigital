package Trabajos;

import java.util.Scanner;

public class EvaluacionJava {
	static Scanner teclado = new Scanner(System.in);
	static String nombre, fechaNac, run, direccion, telefono, cantEmpleados,
				  aniosExperiencia, departamento, funcion, nombreSuperior;
	static String [][] listaUsuarios = new String[100][10];
	//static String [][] listaClientes = new String[100][10];
	//static String [][] listaProfesionales = new String[100][10];
	//static String [][] listaAdministrativos = new String[100][10];

	
	
	
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
		listaUsuarios[0][0] = nombre;
		listaUsuarios[0][1] = fechaNac;
		listaUsuarios[0][2] = run;
	
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
		listaUsuarios[0][3] = direccion;
		listaUsuarios[0][4] = telefono;
		listaUsuarios[0][5] = cantEmpleados;
				
	}
	
	public static void datosProfesional() {
		System.out.println("  Datos Profesional");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		aniosExperiencia = detectarNum("Ingrese años de experiencia si es que corresponde: ", teclado);
		departamento = detectarLetras("Ingrese el departamento: ", teclado);
		
	}
	
	public static void datosAdministrativo() {
		System.out.println(" Datos Administrativo");
		System.out.println("★━━━━━━━━━━━━━━━━━━━━★");
		funcion = detectarLetras("Ingrese la función: ", teclado);
		nombreSuperior = detectarLetras("Ingrese nombre de superior si es que corresponde:", teclado);
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

	public static void MostrarDatosMatriz() {
		for (int fila = 0; fila < listaUsuarios.length; fila++) {
			  for (int columna = 0; columna < listaUsuarios[fila].length; columna++) {
			    System.out.print(listaUsuarios[fila][columna] + "  ");
			  }
			  System.out.println();
			}
		System.out.println(listaUsuarios);
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
		
		for (int fila = 0; fila < listaUsuarios.length; fila++) {
		      for (int columna = 0; columna < listaUsuarios[fila].length; columna++) {
		        System.out.print(listaUsuarios[fila][columna] + " ");
		      }
		      System.out.println();
		    }
		
		
	}

}

/*
 * for (int fila = 0; fila < listaUsuarios.length; fila++) {
  for (int columna = 0; columna < listaUsuarios[fila].length; columna++) {
    System.out.print(listaUsuarios[fila][columna] + "  ");
  }
  System.out.println();
}


WARD

public static void registrarUsuarios() {
	listaUsuarios = new String[100][10];

	for (int i = 0; i < 100; i++) {
		System.out.println("Registro de usuario " + (i + 1));
		System.out.println("★━━━━━━━━━━━━━━━━━━━★");

		nombre = detectarLetras("Ingrese el nombre: ", teclado);
		listaUsuarios[i][0] = nombre;

		fechaNac = detectarFecha("Ingrese la fecha de nacimiento (dd-mm-yyyy): ", teclado);
		listaUsuarios[i][1] = fechaNac;

		run = detectarLetras("Ingrese el RUN: ", teclado);
		listaUsuarios[i][2] = run;

		direccion = detectarDireccion("Ingrese la dirección: ", teclado);
		listaUsuarios[i][3] = direccion;

		telefono = detectarTelefono("Ingrese el teléfono: ", teclado);
		listaUsuarios[i][4] = telefono;

		cantEmpleados = detectarNum("Ingrese la cantidad de empleados: ", teclado);
		listaUsuarios[i][5] = cantEmpleados;

		aniosExperiencia = detectarNum("Ingrese los años de experiencia: ", teclado);
		listaUsuarios[i][6] = aniosExperiencia;

		departamento = detectarLetras("Ingrese el departamento: ", teclado);
		listaUsuarios[i][7] = departamento;

		funcion = detectarLetras("Ingrese la función: ", teclado);
		listaUsuarios[i][8] = funcion;

		nombreSuperior = detectarLetras("Ingrese el nombre del superior: ", teclado);
		listaUsuarios[i][9] = nombreSuperior;
	}
}


 * 
 * */
