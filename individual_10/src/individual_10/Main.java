package individual_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		Trabajador barbara = new Trabajador();
		System.out.println("NOMBRES: ");
		barbara.setNombres(teclado.nextLine());
		System.out.println("APELLIDOS: ");
		barbara.setApellidos(teclado.nextLine());
		System.out.println("RUN: ");
		barbara.setRun(teclado.nextLine());
		System.out.println("TELEFONO: ");
		barbara.setTelefono(teclado.nextInt());
		System.out.println("EDAD: ");
		barbara.setEdad(teclado.nextInt());

		
		
		//Trabajador barbara = new Trabajador(nombre, "Carvajal", "200672380", 934387785, 29 );
		
		System.out.println(barbara.toString());
		System.out.println(barbara.nombreCompleto());
		
	}

}


/*
 * barbara.setNombres("Barbara");
		barbara.setApellidos("Pérez");
		barbara.setRun("123456789-0");
		barbara.setTelefono(912345678);
		barbara.setEdad(30);
 * 
 * */
 