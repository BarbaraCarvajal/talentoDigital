package empresaClase13;

public class Usuario {

	private String Nombre, fechaNac, run;

	/**
	 * 
	 */
	public Usuario() {
		
	}
	/** 
	 * 
	 * @param nombre
	 * @param fechaNac
	 * @param run
	 */
	public Usuario(String nombre, String fechaNac, String run) {
		
		Nombre = nombre;
		this.fechaNac = fechaNac;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return "Usuario "
				+"\nNombre --> " + Nombre + 
				"\nfechaNac --> " + fechaNac + 
				"\nrun --> " + run ;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * @param run the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}
	
	
	
	
	
	
}
