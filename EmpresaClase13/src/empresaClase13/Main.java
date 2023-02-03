package empresaClase13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Por último, debe crear una clase adicional que contenga un método main(), 
		//a través del cual se cree una instancia de cada clase, y se desplieguen 
		//sus datos a través del método toString().
		
		Scanner sc = new Scanner(System.in);
		
		// CREAMOS UN OBJETO DE LA CLASE CLIENTE
		Cliente barbara = new Cliente();
		// LE AGREAMOS DATOS
		System.out.println("NOMBRES: ");
		barbara.setNombres(sc.nextLine());
		System.out.println("APELLIDOS");
		barbara.setApellidos(sc.nextLine());
		System.out.println("AFP");
		barbara.setRut(sc.nextLine());
		System.out.println("SISTEMA DE SALUD");
		barbara.setSistemaSalud(sc.nextLine());
		System.out.println("DIRECCION");
		barbara.setDireccion(sc.nextLine());
		System.out.println("COMUNA");
		barbara.setComuna(sc.nextLine());
		System.out.println("EDAD");
		barbara.setEdad(sc.nextLine());
		
		System.out.println(barbara.toString());
		
		// CREAMOS UN OBJETO DE LA CLASE USUARIO
		Usuario luis = new Usuario();
		// LE AGREGAMOS DATOS
		// Nombre, fechaNac, run;
		System.out.println("NOMBRE");
		luis.setNombre(sc.nextLine());
		System.out.println("FECHA NACIMIENTO");
		luis.setFechaNac(sc.nextLine());
		System.out.println("RUN");
		luis.setRun(sc.nextLine());
		
		System.out.println(luis.toString());
		
	}

}
