package herencia;

public class Empleado extends Persona {

	
	public Empleado() {
		
	}
	
	
	int numLegajo;
	String cargo;
	double sueldo;
	

	public Empleado(int id, String nombre, String apellido, String domicilio, String telefono, String dni, int numLegajo, String cargo, double sueldo) {
		super(id, nombre, apellido, domicilio, telefono, dni);
		this.numLegajo = numLegajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	/**
	 * @return the numLegajo
	 */
	public int getNumLegajo() {
		return numLegajo;
	}

	/**
	 * @param numLegajo the numLegajo to set
	 */
	public void setNumLegajo(int numLegajo) {
		this.numLegajo = numLegajo;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	
	
}
