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
		System.out.println("NOMBRE");
		luis.setNombre(sc.nextLine());
		System.out.println("FECHA NACIMIENTO");
		luis.setFechaNac(sc.nextLine());
		System.out.println("RUN");
		luis.setRun(sc.nextLine());
		
		System.out.println(luis.toString());
		
		//CREAMOS UN OBJETO DE LA CLASE CAPACITACION
		Capacitacion bootcamp = new Capacitacion();
		// LE AGREGAMOS DATOS
		System.out.println("IDENTIFICADOR");
		bootcamp.setIdentificador(sc.nextLine());
		System.out.println("RUT");
		bootcamp.setRut(sc.nextLine());
		System.out.println("DIA");
		bootcamp.setDia(sc.nextLine());
		System.out.println("HORA");
		bootcamp.setHora(sc.nextLine());
		System.out.println("LUGAR");
		bootcamp.setLugar(sc.nextLine());
		System.out.println("DURACION");
		bootcamp.setDuracion(sc.nextLine());
		System.out.println("CANTIDAD ASISTENTES");
		bootcamp.setCantAsistentes(sc.nextInt());
		sc.nextLine();
		System.out.println("NUMERO INTERNO");
		bootcamp.setNumeroInterno(sc.nextInt());
		sc.nextLine();
		
	}

}
