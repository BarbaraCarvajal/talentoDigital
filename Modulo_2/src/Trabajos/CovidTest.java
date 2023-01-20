package Trabajos;


import java.util.Scanner;

public class CovidTest {
	// variables y teclado publicas
	public static int respuesta;
	public static Scanner teclado = new Scanner(System.in);
	
	
	//funciones
	public static void pcr() {
		while(true) {
			System.out.println("¿Cuál ha sido la respuesta del PCR? POSITIVO = 1 | NEGATIVO = 2");
			String respuestaPcr = teclado.nextLine();
			
			if (respuestaPcr.matches("[1]{1}")){
				System.out.println("Tendrás que hacer cuarentena de 14 días :C");
				break;
			}if (respuestaPcr.matches("[2]{1}")){
				System.out.println("Eres libre de irte, no necesitas cuarentena :D");
				break;
			}
			else {
				System.out.println("Ingrese una respuesta válida (1 o 2)");
			}
		}
	}
	public static void main(String[] args) {
	
		while(true) {
			System.out.println("Ingrese su nombre: ");
			String nombre = teclado.nextLine();
			if (nombre.matches("[a-z]{1,100}")) {
				System.out.println("Bienvenido a nuestro sistema "+ nombre+ " responde las siguientes preguntas: ");
				break;
			}else if(!nombre.matches("[a-z]")){
				System.out.println("¡Ingrese un nombre válido!"); 
			}
		}
		
		/////////////////////////////////////////////////////////
		
		
		while(true) {
			System.out.println("¿Haz salido del país? 1=Si | 2=No");
			String respuesta = teclado.nextLine();
			
			if (respuesta.matches("[1]{1}")) {
				System.out.println("Haz salido del país, tendrás que hacerte un PCR");
				pcr();
				break;
				
			}if(respuesta.matches("[2]{1}")) {
				System.out.println("¿Haz tenido contacto estrecho con una persona contagiada con el COVID? SI = 1 | NO = 2");
				String respuestaContacto = teclado.nextLine();
				if (respuestaContacto.matches("[1]{1}")) {
					System.out.println("Debes hacerte pcr preventino");
					pcr();
					break;
				}else if(respuestaContacto.matches("[2]{1}")) {
					System.out.println("Eres libre de irte :D felicidades");
					break;
				}
				
			}else {
				System.out.println("¡Ingresa una respuesta pls!");
			}
		}
	}
}
