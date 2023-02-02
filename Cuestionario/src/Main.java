import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("¿Cuántas preguntas quiere realizar?");
		int cantidad = teclado.nextInt();
		teclado.nextLine();
		
		Pregunta cuestionario [] = new Pregunta [cantidad];
		
		String preg;
		boolean resp;
		for (int i = 0; i < cantidad; i++) {
			
			System.out.println("Pregunta "+(i+1));
			preg= teclado.nextLine();
			
			System.out.println("Respuesta "+(i+1));
			resp = teclado.nextBoolean();
			teclado.nextLine();
			
			cuestionario[i] = new Pregunta(preg,resp);
			
		}
		int puntaje = 0;
		System.out.println("Iniciar Cuestionario");
		for (int i = 0; i < cantidad; i++) {
			System.out.println(cuestionario[i].getPregunta());
			resp = teclado.nextBoolean();
			puntaje += cuestionario[i].validar(resp);
			
		}
		
		System.out.println("Tu resultado es: "+puntaje);
	}
}
















