package RepasosEnClases;

import java.util.Scanner;

public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Enter a number: ");

		while (true) {
		    try {
		        int number = Integer.parseInt(teclado.nextLine());
		        System.out.println("You entered: " + number);
		        break;
		    } catch (NumberFormatException e) {
		        System.out.print("Invalid input. Please enter a number: ");
		    }
		}

	}

}
