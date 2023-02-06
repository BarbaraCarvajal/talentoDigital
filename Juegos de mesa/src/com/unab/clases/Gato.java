package com.unab.clases;

public class Gato extends Juego{

	
	private char[] simbolos = new char [cantJugadores];
	private int flag;
	
	public Gato() {
		super("Gato",2,3,3);
		simbolos[0] = 'x';
		simbolos[1] = 'o';
		flag = 0;
		for (int i = 0; i < filas; i++) { //filas 
			for (int j=0; j<columnas; j++) { // columnas
				tablero[i][j] = '*';
			}
		}
	}
	public void jugada(int fila, int columna) {
	
			tablero[fila][columna] = simbolos[flag];
		if(flag%2 == 0){
			flag = 1;
		}else {
			flag = 0;
		}
	}
	
	public String Saludar() {
		return "Bienvenidos a Juegos de mesa";
	}
}
