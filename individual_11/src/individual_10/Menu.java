package individual_10;

import java.util.Scanner;

public class Menu extends Trabajador{

	
	public void menuPrincipal() {
		
		
		Scanner entrada = new Scanner (System.in);
		
		
		
			System.out.println("Ingrese 3 trabajadores, ni más ni menos: ");
			
		
			/////////////////////////////////////////////
			
			Trabajador trabajador1 = new Trabajador();
			System.out.println("");
			System.out.println("Trabajador 1");
			
			
			trabajador1.setNombres(trabajador1.validarLetras("\nNOMBRES: ", entrada).toLowerCase());
			trabajador1.setApellidos(trabajador1.validarLetras("APELLIDOS: ", entrada).toLowerCase());
			trabajador1.setRun(trabajador1.validarRun("RUN sin digito verificador (xx.xxx.xxx): ", entrada));
			trabajador1.setTelefono(trabajador1.validarTelefono("TELEFONO: ", entrada));
			trabajador1.setEdad(trabajador1.validarEdad("EDAD: ", entrada));
			
			/////////////////////////////////////////////
			
			Trabajador trabajador2 = new Trabajador();
			
			System.out.println("");
			System.out.println("Trabajador 2");
			
			trabajador2.setNombres(trabajador2.validarLetras("\nNOMBRES: ", entrada).toLowerCase());
			trabajador2.setApellidos(trabajador2.validarLetras("APELLIDOS: ", entrada).toLowerCase());
			trabajador2.setRun(trabajador2.validarRun("RUN sin digito verificador (xx.xxx.xxx): ", entrada));
			trabajador2.setTelefono(trabajador2.validarTelefono("TELEFONO: ", entrada));
			trabajador2.setEdad(trabajador2.validarEdad("EDAD: ", entrada));
			
			/////////////////////////////////////////////
			
			Trabajador trabajador3 = new Trabajador();
			
			System.out.println("");
			System.out.println("Trabajador 3");
			
			trabajador3.setNombres(trabajador3.validarLetras("\nNOMBRES: ", entrada).toLowerCase());
			trabajador3.setApellidos(trabajador3.validarLetras("APELLIDOS: ", entrada).toLowerCase());
			trabajador3.setRun(trabajador3.validarRun("RUN sin digito verificador (xx.xxx.xxx): ", entrada));
			trabajador3.setTelefono(trabajador3.validarTelefono("TELEFONO: ", entrada));
			trabajador3.setEdad(trabajador3.validarEdad("EDAD: ", entrada));
			
			/////////////////////////////////////////////
			
			System.out.println("\nTrabajadores:");
			System.out.println("Trabajador 1");
			System.out.println(trabajador1.toString()); 
			System.out.println("Trabajador 2");
			System.out.println(trabajador2.toString()); 
			System.out.println("Trabajador 3");
			System.out.println(trabajador3.toString()); 
			
	}
	
	
	
}
