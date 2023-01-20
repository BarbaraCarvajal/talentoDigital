package Trabajos;
import java.util.Scanner;

class PrevencionRiesgos {
	
	public static Scanner sr = new Scanner(System.in);
	
	public static int opc;
	public static String names="No ingresado",run="No ingresado",fechaNacimiento="No ingresado",nomSup="No ingresado",funcion="No ingresado",telefono="No ingresado",
			direccion="No ingresado",depto="No ingresado",exp="No ingresado",empleados;
	
	// Funcion menu
	
	public static void menu() {
		System.out.println("\nMENU");
		System.out.println("-------------------------------");
		System.out.println("1.- CLIENTE");
		System.out.println("2.- PROFESIONAL");
		System.out.println("3.- ADMINISTRATIVO");
		System.out.println("\nElige una opcion: ");
		opc = sr.nextInt();	
	}
	
	// funcion de datos generales
	public static void datosBasicos() {
		while(true) {
			
			System.out.println("Ingresar el nombre: ");
			names = sr.nextLine();
			// Si el nombre es igual a "No ingresado" o el largo del texto es igual a 0, se pide ingresar nuevamente.
			if (names=="No ingresado" || names.length()==0) {
				System.out.println("Ingrese un nombre al usuario...");
			}
			else {
				break;
			}
		}
		while(true) {
			System.out.println("Ingresar la fecha de nacimiento: ");
			fechaNacimiento = sr.nextLine();
			if (fechaNacimiento.length()==0) {
				System.out.println("Ingresar una fecha de nacimiento válida");
			}else {
				break;
			}
		}
		while(true) {
			System.out.println("Ingresar el RUN sin digito verificador: ");
			run = sr.nextLine();
			if (!run.matches("[0-9]{7,8}")) {
				System.out.println("numero de un run invalido en Chile");
			}else {
				break;
			}
		}
	}
	
	// -----Ingreso y validación de datos del usuario Cliente, Profesional y Administrador-----
	public static void datosClientes() {
		while(true) {
			
		System.out.print("Ingresar la direccion de "+names+": ");
			direccion = sr.nextLine();
			if (direccion == "No ingresado" || direccion.length()==0 ) {
				System.out.println("Ingresar dirección válida");
			}else {
				break;
			}
		}
		
		while(true) {
			
			System.out.println("Ingresar el telefono de  "+names+":");
			telefono = sr.nextLine();
			if (telefono.matches("[0-9]{8,15}")) {
				break;
			}else {
				System.out.println("Ingresar un numero telefonico entre 8 y 15");
			}
		}
		
		while(true) {	
			System.out.print("Ingresa la cantidad de empleados de "+names+": ");
			empleados = sr.nextLine();
			if (!empleados.matches("[0-9]")) {
			System.out.println("Ingresar una cantidad de empleados mayor a 0");
			}
			else {
			break;
		}
	}
		System.out.println("\nDATOS CLIENTE");
		System.out.println("-----------------------");
		System.out.println("NOMBRE: " + names + "\nRUT: " + run + "\nFECHA NACIMIENTO: " + fechaNacimiento + "\nDIRECCION: " + direccion + "\nTELEFONO: " + telefono + 
				"\nCANTIDAD DE EMPLEADOS: " + empleados);
	}
	
	public static void datosPro() {
		while(true) {
			System.out.print("Ingresa el nombre del departamento: ");
			depto = sr.nextLine();
			if(depto=="No ingresado" || depto.length()==0) {
				System.out.println("Ingresa un nombre de departamento valido ");
			}
			else {
				break;
			}
		}
			while(true) {
				System.out.print("Ingresa tus años de experiencia: ");
				exp = sr.nextLine();
				if(!exp.matches("[0-9]")) {
					System.out.println("Ingresa un dato valido porfavor");
				}
				else {
					break;
				}
		}
			System.out.println("\nDATOS PROFESIONAL");
			System.out.println("--------------------------"); 
			System.out.println("NOMBRE: " + names + "\nRUT: " + run + "\nFECHA NACIMIENTO: " + fechaNacimiento + "\nAÑOS DE EXPERIENCIA: " + exp + 
					"\nNOMBRE DEL DPTO: " + depto);
		
	}
	
	public static void datosAdmin() {
		
		datosBasicos();
		
		while(true) {
			
		System.out.print("Ingresa tu funcion: ");
		funcion = sr.nextLine();
		if(funcion=="No ingresado" || funcion.length()==0) {
			System.out.println("Ingresa un dato valido porfavor");
		}
		else {
			break;
		}
	}
		
		while(true) {
			
		System.out.print("Ingresa tu nombre superior: ");
		nomSup = sr.nextLine();
		
		if(nomSup=="No ingresado" || nomSup.length()==0) {
			System.out.println("Ingresa un dato valido porfavor");
		}
		else {
			break;
		}
		
		
		System.out.println("\nDATOS  ADMINISTRADOR");
		System.out.println("-------------");
		System.out.println("NOMBRE: " + names + "\nRUT: " + run  + "\nFECHA NACIMIENTO: " + fechaNacimiento + "\nFUNCIÓN: " + funcion +
				"\nNOMBRE SUPERIOR: " + nomSup);
	}
}		
	
	// Funcion que almacena los datos generales y los datos especificos de Cliente, Profesional y Administrador
	public static void cliente() {
			datosBasicos();
			datosClientes();
}
	
	public static void profesional() {
		
		datosBasicos();
		datosPro();
	}
	
	public static void admin() {
			datosBasicos();
			datosAdmin();
	}
	
	

	public static void main() {

		menu();
		
		sr.nextLine();
		
		if(opc == 1) {
			cliente();
		}
		else if(opc == 2) {
			profesional();
		}
			
		else if(opc == 3) {
			admin();
			
		}else {
				System.out.println("Opcion invalida");
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String usuarios;
			
			while(true) {
				System.out.print("\nIngresar cantidad de usuarios: ");
				usuarios = sr.nextLine();
				if(!usuarios.matches("[0-9]{1,100}")) {
					System.out.println("Ingrese una cantidad de usuarios correcta");
				}
				else if (usuarios.equals("0")){
					System.out.println("Ingrese una cantidad distinta a cero por favor");
				}
				else {
					break;
				}
			}
			int number = Integer.parseInt(usuarios);
			
			for(int i = 1; i<=number;i++) {
				main();
			}
		}
		
		}