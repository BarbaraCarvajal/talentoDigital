package empresaClase13;

public class Cliente {


	private String rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad;

	public Cliente() {
			
		}
	
	public Cliente(String rut, String nombres, String apellidos,String telefono, String afp, String sistemaSalud, String direccion,
						String comuna, String edad) {
	
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	
	

	@Override
	public String toString() {
		return "\nDATOS CLIENTE" + "\n\\\\\\\\\\\\\\\\" + "\n* NOMBRES --> " + nombres + "\n* APELLIDOS --> "
				+ apellidos + "\n* RUT  --> " + rut + "\n* EDAD --> " + edad + " años" + "\n* TELÉFONO --> " + " +56 9 "
				+ telefono + "\n* AFP -->  " + afp + "\n* SISTEMA SALUD --> " + sistemaSalud + "\n* DIRECCIÓN --> "
				+ direccion + "\n* COMUNA --> " + comuna;
				
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @return the sistemaSalud
	 */
	public String getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @return the direcion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direcion the direcion to set
	 */
	public void setDireccion(String direcion) {
		this.direccion = direcion;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	
	
	
	
	
}
