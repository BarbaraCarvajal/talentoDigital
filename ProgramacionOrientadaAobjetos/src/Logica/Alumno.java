package Logica;

public class Alumno {

	
	String nombre; String apellido; int id;
	
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido, int id) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void mostrarNombre() {
		System.out.println("Soy un alumno y sé decir mi nombre :D");
	}
	
	
	

}
