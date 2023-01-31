package cl.unab;

public class Persona {

	private String nombre;
	private int edad;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String saludar() {
		return "hola terricolas";
	}
	
	
	
}
