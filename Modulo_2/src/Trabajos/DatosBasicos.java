/**
 * 
 */
package Trabajos;
import java.util.Scanner;
/**
 * @author barbaracarvajalsaez junto a Paloma Gonzalez 
 * 
 */
public class DatosBasicos {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("- - - - - - - - - - -");
		System.out.println("LLENAR EL SIGUIENTE FORMULARIO");
		System.out.println("- - - - - - - - - - -");
		//Creamos un scanner
		Scanner entrada = new Scanner(System.in);
		
		//creamos las variables que utilizaremos
		String nombres,apellidos, direccion, comuna,afp, telefono,salud, rut;
		int  edad, sistemaSalud;
		
		while(true) {
			System.out.println("Nombres: ");
			nombres = entrada.nextLine();
			int largo = nombres.length();
			if (largo !=0){
				break;
			}
		}
		
		while(true) {
			
			System.out.println("Apellidos: ");
			apellidos = entrada.nextLine();
			int largoAp = apellidos.length();
			if (largoAp !=0){
				break;
			}
		}
		
		while(true) {
			System.out.println("Dirección: ");
			direccion = entrada.nextLine();
			int largoDir = direccion.length();
			if (direccion.length() >=50) {
				System.out.println("No más de 50 caracteres porfavor");
			}else if(largoDir !=0){
				break;
			}
		}
		while(true) {
			System.out.println("Comuna: ");
			comuna = entrada.nextLine();
			int largoComuna = comuna.length();
			if (largoComuna != 0) {
				break;
			}
		}
		while(true) {
			System.out.println("Teléfono: ");
			telefono = entrada.nextLine();
			if (telefono.matches("[0-9]{8,15}")){	
				break;
			}else {
				System.out.println("Ingresar un numero telefonico entre 8 y 15 numeros");

			}
		}
		while(true) {
			System.out.println("AFP: ");
			afp = entrada.nextLine();
			int largoAfp = afp.length();
			if (largoAfp !=0) {
				break;
			}else {
				System.out.println("Ingrese un nombre valido de AFP");
			}
		}
		
		while(true) {
			System.out.println("Rut sin digito verificador: ");
			rut = entrada.nextLine();
			if (!rut.matches("[0-9]{7,8}")){	
				System.out.println("numero de un rut invalido en Chile");
			}else {
				break;
			}
		}
		
		while(true) {
			System.out.println("Edad: ");
			edad = entrada.nextInt();
			if (edad >=120 || edad <1) {
				System.out.println("Edad incorrecta");
			}else {
				break;
			}
		}
		
		
		while(true) {
			System.out.println("Ingrese 1 para Fonasa o 2 para Isapre ");
			sistemaSalud = entrada.nextInt();
			salud = "Opción invalida";
			if (sistemaSalud == 1) {
				salud = "FONASA";
				break;
			}
			else if(sistemaSalud == 2){
				salud = "ISAPRE";
				break;
			}
			else {
				System.out.println("Ingresar una opción valida");
			}
		}
		
		
		
		System.out.println("- - - - - - - - - - -");
		System.out.println("- - - - - - - - - - -");
		System.out.println("Datos rescatados:");
		System.out.println("Rut:              "+rut);
		System.out.println("Nombres:          "+nombres);
		System.out.println("Apellidos:        "+apellidos);
		System.out.println("Edad:             "+edad);
		System.out.println("Telefono:         "+telefono);
		System.out.println("Afp:       		  "+afp);
		System.out.println("Sistema de salud: "+salud);
		System.out.println("Dirección:        "+direccion);
		System.out.println("Comuna:           "+comuna);
		
		
	}

}
