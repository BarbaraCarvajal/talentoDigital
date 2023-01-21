package RepasosEnClases;

import java.util.Scanner;

public class Sobrecarga {
	
	
	static void menuConsola() {
		System.out.println("Seleccione opción: ");
		System.out.println("1. 10% recargo ");
		System.out.println("2. 5% recargo ");
		System.out.println("3. 20% recargo ");
		System.out.println("4.recargo por defecto");
	}
	
	static float recargar(int monto, float recargo) {
		return monto + (monto * recargo/100);
	}
	
	static float recargar(int monto) {
		return recargar(monto, 3);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		menuConsola();
		
		int opcion = teclado.nextInt();
		
		System.out.println("Ingrese monto de compra ");
		int monto = teclado.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println(recargar(monto,10));
			break;
		case 2:
			System.out.println(recargar(monto,5));
			break;
		case 3:
			System.out.println(recargar(monto,20));
			break;
		case 4:
			System.out.println(recargar(monto));
			break;
		
		}	
	}
}
