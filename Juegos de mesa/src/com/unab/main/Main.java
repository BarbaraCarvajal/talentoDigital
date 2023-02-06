package com.unab.main;
import com.unab.clases.Gato;

public class Main {

	public static void mostrarTablero(char[][] tablero) {
		System.out.println(tablero.length);
		for (int i = 0; i < tablero.length; i++) { //filas 
			for (int j=0; j < tablero.length; j++) { // columnas
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void jugada(Gato jugada) {
		System.out.println(partida.jugada(0,0));
	}
	
	public static void main(String[] args) {
		
		//instancia de juego
		
		Gato partida = new Gato(); // debemos importarlo
		partida.Saludar();
		for(int i = 0; i <9; i++ ) {
			
		}
		mostrarTablero(tablero.getTablero());
		jugada();
	}

}
