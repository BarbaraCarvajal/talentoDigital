package herencia;

public class Jefe extends Persona {

	
int idJefe;
String departamentoJefe;
	
public Jefe() {
	
}

public Jefe(int id, String nombre, String apellido, String domicilio, String telefono, String dni, int idJefe, String departamentoJefe) {
	super(id, nombre, apellido, domicilio, telefono, dni);
	this.idJefe = idJefe;
	this.departamentoJefe = departamentoJefe;
}

/**
 * @return the idJefe
 */
public int getIdJefe() {
	return idJefe;
}

/**
 * @param idJefe the idJefe to set
 */
public void setIdJefe(int idJefe) {
	this.idJefe = idJefe;
}

/**
 * @return the departamentoJefe
 */
public String getDepartamentoJefe() {
	return departamentoJefe;
}

/**
 * @param departamentoJefe the departamentoJefe to set
 */
public void setDepartamentoJefe(String departamentoJefe) {
	this.departamentoJefe = departamentoJefe;
}




	
	
}
