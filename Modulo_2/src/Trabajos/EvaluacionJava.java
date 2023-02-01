package Trabajos;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluacionJava {
	
	static Scanner teclado = new Scanner(System.in);
	static String nombre = "nombre", fechaNac ="00-00-0000", run = "00000000", direccion ="calle", telefono="12345678", cantEmpleados="0",
				  aniosExperiencia = "0", departamento = "dep", funcion = "ninguna", nombreSuperior = "jefa";
	static int contadorClientes = 0, contadorProfesionales = 0, contadorAdministrativos = 0, contListaGeneral = 0;
	
	static ArrayList <ArrayList<String>>listaGeneral = new ArrayList <ArrayList<String>>();
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
				System.err.println("Ingrese sólo letras...");
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
				System.err.println("Escriba sólo números (8 digitos) ");
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
				System.err.println("Escribir un número válido");
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
				System.err.println("Ingrese una fecha valida porfavor");
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
				System.err.println("Ingrese una dirección válida...");
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
				System.err.println("Ingrese un RUN válido en chile por favor");
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
			System.out.println("\nIngrese su opción: ");
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
				System.err.println("\nIngrese una opción correcta...(1,2 o 3");
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
		listaGeneral.add(listaClientes);
				
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
		listaGeneral.add(listaProfesionales);
	
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
		listaGeneral.add(listaAdministrativos);
	}
	/*
	public static void listaGeneralAtive() {
		listaGeneral.add(listaClientes);
		listaGeneral.add(listaAdministrativos);
		listaGeneral.add(listaProfesionales);
		
	}*/
	
	public static void impresionContadores() {
		
		System.out.println("Total usuarios: "+contListaGeneral);
		System.out.println("Total Clientes: "+contadorClientes);
		System.out.println("Total Profesionales: "+contadorProfesionales);
		System.out.println("Total Administrativos: "+contadorAdministrativos);
	}
	
	public static void impresionListaClientes() {
		
		
		System.out.println("\nCLIENTES");
		for (int posicion = 0; posicion < listaClientes.size(); posicion = posicion +6) {
			System.out.println("NONMBRE: " + listaClientes.get(posicion) + " FECHA NACIMIENTO: " + listaClientes.get(posicion + 1)
			+" RUN: " +listaClientes.get(posicion+ 2) + " DIRECCION:  "+ listaClientes.get(posicion+3) + " TELEFONO: "+ listaClientes.get(posicion+4) + " CANTIDAD EMPLEADOS: "+listaClientes.get(posicion+ 5)  );
		}
	}
	public static void impresionListaProfesionales() {
		
		System.out.println("\nPROFESIONALES");
		for (int posicion = 0; posicion < listaProfesionales.size(); posicion = posicion +5) {
			System.out.println("NONMBRE: " + listaProfesionales.get(posicion) + " FECHA NACIMIENTO: " + listaProfesionales.get(posicion + 1)
			+" RUN: " +listaProfesionales.get(posicion+ 2) + " AÑOS DE EXPERIENCIA:  "+ listaProfesionales.get(posicion+3) + " DEPARTAMENTO: "+ listaProfesionales.get(posicion+4) );
		}
	}
	public static void impresionListaAdministrativos() {
		
	
		System.out.println("\nADMINISTRATIVOS\n");
		for (int posicion = 0; posicion < listaAdministrativos.size(); posicion = posicion +5) {
			System.out.println("NONMBRE: " + listaAdministrativos.get(posicion) + " FECHA NACIMIENTO: " + listaAdministrativos.get(posicion + 1)
			+" RUN: " +listaAdministrativos.get(posicion+ 2) + " FUNCIÓN:  "+ listaAdministrativos.get(posicion+3) + " NOMBRE SUPERIOR: "+ listaAdministrativos.get(posicion+4) );
		}
	}
	
	public static void listas() {
		boolean cond = true;
		while(cond) {
			System.out.println("Qué lista quiere ver? "
					+ "\n1) Lista Clientes"
					+ "\n2) Lista Profesionales"
					+ "\n3) Lista Administrativos"
					+ "\n4) Lista de todos los usuarios");
			String ver = teclado.nextLine();
			if (ver.equals("1")){
				impresionListaClientes();
				cond = false;
			}else if (ver.equals("2")){
				impresionListaProfesionales();
				cond = false;
			}else if (ver.equals("3")) {
				impresionListaAdministrativos();
				cond = false;
			}else if (ver.equals("4")) {
				System.out.println("Todos los usuarios ingresados al sistema");
				impresionListaClientes();
				impresionListaProfesionales();
				impresionListaAdministrativos();
				cond = false;
			}else {
				System.err.println("Opción incorrecta... intente otra vez...");
			}
		}
	}
	
	public static void modificarUsuario() {
		System.out.println("Ingrese el RUT del usuario que desea modificar:");
		String rut = teclado.nextLine();
		boolean usuarioEncontrado = false;

		for (int i = 0; i < listaGeneral.size(); i++) {
			for (int x = 0; x < listaGeneral.get(i).size(); x++) {
				if (listaGeneral.get(i).get(2).equals(rut)) {
					System.out.println("Ingrese los nuevos datos del cliente:");
					// pedir nuevos datos y reemplazar los antiguos

					listaGeneral.get(i).set(0, detectarLetras("Ingrese el nombre: ", teclado));
					listaGeneral.get(i).set(1, detectarFecha("Ingrese la fecha de nacimiento", teclado));
					listaGeneral.get(i).set(2, detectarRun("Ingrese el run del usuario, sin digito verificador (7-8 digitos):", teclado));
					listaGeneral.get(i).set(3, detectarDireccion("Ingrese la dirección: ", teclado));
					listaGeneral.get(i).set(4, detectarTelefono("Ingrese telefono: ", teclado));
					listaGeneral.get(i).set(5, detectarNum("Cantidad empleados si es que corresponde:", teclado));

					usuarioEncontrado = true;
					System.out.println("Usuario actualizado con exito!");
					break;
				}
			}
		}
		    if (!usuarioEncontrado) {
		        for (int i = 0; i < listaGeneral.size(); i++) {
		        	for (int x = 0; x < listaGeneral.get(i).size(); x++)
		            if (listaGeneral.get(i).get(2).equals(rut)) {
		                System.out.println("Ingrese los nuevos datos del profesional:");
		                // pedir nuevos datos y reemplazar los antiguos
		                
		                listaGeneral.get(i).set(0,detectarLetras("Ingrese el nombre: ", teclado));
		                listaGeneral.get(i).set(1,detectarFecha("Ingrese la fecha de nacimiento", teclado));
		                listaGeneral.get(i).set(2,detectarRun("Ingrese el run del usuario, sin digito verificador (7-8 digitos):",teclado));
		                listaGeneral.get(i).set(3,detectarNum("Ingrese años de experiencia si es que corresponde: ", teclado));
		                listaGeneral.get(i).set(4,detectarLetras("Ingrese el departamento: ", teclado));
			    		
		                usuarioEncontrado = true;
		                System.out.println("Usuario actualizado con exito!");
		                break;
		            }
		        }
		    }
		    if (!usuarioEncontrado) {
		    	for (int i = 0; i < listaGeneral.size(); i++) {
		        	for (int x = 0; x < listaGeneral.get(i).size(); x++)
		            if (listaGeneral.get(i).get(2).equals(rut)) {
		                System.out.println("Ingrese los nuevos datos del administrativo:");
		                // pedir nuevos datos y reemplazar los antiguos
		                
		                listaGeneral.get(i).set(0,detectarLetras("Ingrese el nombre: ", teclado));
		                listaGeneral.get(i).set(1,detectarFecha("Ingrese la fecha de nacimiento", teclado));
		                listaGeneral.get(i).set(2,detectarRun("Ingrese el run del usuario, sin digito verificador (7-8 digitos):",teclado));
		                listaGeneral.get(i).set(3,detectarLetras("Ingrese la función: ", teclado));
		                listaGeneral.get(i).set(4,detectarLetras("Ingrese nombre de superior si es que corresponde:", teclado));
		                
			    		usuarioEncontrado = true;
		                System.out.println("Usuario actualizado con exito!");
		                break;
		            }
		        }
		    }
		    if (!usuarioEncontrado) {
		        System.out.println("El usuario con RUT " + rut + " no se encuentra en la lista.");
		    }
		}


	public static void eliminarUsuario() {
		System.out.println("Ingrese el run del usuario que desea eliminar");
		
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
				//listaGeneral();
				contListaGeneral = contListaGeneral +1;
				break;
			case "2":
				System.out.println("Opcion elegida: 2 Mostrar usuarios");
				System.out.println("Total usuarios: ");
				listas();
				System.out.println(listaGeneral);
				break;
			case "3":
				System.out.println("Opcion elegida: 3 Contar usuarios por categoría ");
				impresionContadores();
				
				
				break;
			case "4":
				System.out.println("Opcion elegida: 4 Modificar usuarios");
				modificarUsuario();
				break;
			case "5":
				System.out.println("Opcion elegida: 5 Eliminar usuario");
				eliminarUsuario();
				break;
			case "6":
				System.out.println("Opcion elegida: 6 Salir");
				if (contadorClientes >= 1 && contadorAdministrativos >=1 && contadorProfesionales >=1){
					condicion = false;
					
				}else {
					System.err.println("Minimo 1 usuario por categoria!");
				}
				break;
			default:

				System.err.println("Opcion incorrecta, vuelva a intentarlo...");

			}
		}
	}

	public static void main(String[] args) {
			menu();
	}
}
