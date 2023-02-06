package com.unab.clases;

public class Juego {
	
	
	protected String nombre;
	protected int cantJugadores;
	
	// panel
	protected int filas;
	protected int columnas;
	protected char tablero [][];

	public Juego(String nombre, int cantJugadores, int filas, int columnas) {
		
		this.nombre = nombre;
		this.cantJugadores = cantJugadores;
		this.filas = filas;
		this.columnas = columnas;
		tablero = new char [filas][columnas];
	}

	
	public String Saludar() {
		return "Bienvenidos a Juegos de mesa";
	}
	
	/**
	 * 
	 * 
	 * @return the tablero
	 */
	public char[][] getTablero() {
		return tablero;
	}
	
	
	
	
	
	
}
