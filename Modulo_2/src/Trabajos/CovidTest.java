package Trabajos;


import java.util.Scanner;

public class CovidTest {
	// variables y teclado publicas
	public static int respuesta;
	public static Scanner teclado = new Scanner(System.in);
	
	
	//funciones
	public static void pcr() {
	
		
		System.out.println("¿cuál ha sido la respuesta del PCR? POSITIVO = 1 | NEGATIVO = 2");
		int respuestaPcr = teclado.nextInt();
		
		if (respuestaPcr == 1){
			System.out.println("Tendrás que hacer cuarentena de 14 días :C");
		}else if (respuesta == 2) {
			System.out.println("Eres libre de irte, no necesitas cuarentena :D");
		}
	}
	public static void main(String[] args) {
	
		
		
		
		System.out.println("Ingrese su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Bienvenido a nuestro sistema "+ nombre+ " responde las siguientes preguntas: ");
		
		System.out.println("¿Haz salido del país? (1=Si | 2=No");
		int respuesta = teclado.nextInt();
		if (respuesta == 1) {
			System.out.println("Haz salido del país, tendrás que hacerte un PCR");
			pcr();
			
		}else if(respuesta == 2) {
			System.out.println("¿Haz tenido contacto estrecho con una persona contagiada con el COVID? SI = 1 | NO = 2");
			int respuestaContacto = teclado.nextInt();
			if (respuestaContacto == 1) {
				System.out.println("Debes hacerte pcr preventino");
				pcr();
				
			}
		}
	}

}
