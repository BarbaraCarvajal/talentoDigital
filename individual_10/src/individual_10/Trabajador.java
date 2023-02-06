/**
 * 
 */
package individual_10;

/**
 * @author Barbarita ♥
 *
 *
 *
 *Planteamiento del Problema:
	Una empresa corredora de propiedades necesita contar con un sistema de registro de sus
	trabajadores. Por cada uno de ellos se necesita saber:
	- Nombres
	- Apellidos
	- RUN (se debe almacenar con guion)
	- Teléfono
	- Edad
    Se solicita crear una clase que represente a un trabajador de la empresa, usando atributos con tipos
	de datos adecuados a la situación. Además, debe considerar lo siguiente:
	- Debe agregar un método toString().
	- Debe tener dos métodos constructores: uno que cree un objeto vacío, y otro que solicite
	todos los atributos pertenecientes a la clase.
	- Debe agregar el método nombreCompleto(), el cual debe retornar la concatenación de los
	nombres y apellidos del usuario.
	- Desarrolle el método descomponerRun(), el cual debe retornar un número entero
	correspondiente a todo lo que está en el RUN antes del guion y del dígito verificador.
	Nota 1: Considere que Eclipse permite crear rápidamente muchos métodos de manera fácil y rápida.
	Nota 2: Recuerde que esta clase, a diferencia de las anteriores desarrolladas, no debe llevar un
	método main(), ya que desde ella no se ejecutarán acciones. 
*/
public class Trabajador {
	
	private String nombres, apellidos, run;
	private int telefono, edad;
	
	Trabajador(){
		
	}
	
	
	
	/**
	 * @param nombres
	 * @param apellidos
	 * @param run
	 * @param telefono
	 * @param edad
	 */
	public Trabajador(String nombres, String apellidos, String run, int telefono, int edad) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = run;
		this.telefono = telefono;
		this.edad = edad;
	}



	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", telefono=" + telefono
				+ ", edad=" + edad + "]";
	}
	
	//Debe agregar el método nombreCompleto(), el cual debe retornar la concatenación de los
	//nombres y apellidos del usuario.
	
	public String nombreCompleto() {
		String nomCompleto = this.nombres +" "+ this.apellidos;
		
		return nomCompleto;
	}
	
	//Desarrolle el método descomponerRun(), el cual debe retornar un número entero
	//correspondiente a todo lo que está en el RUN antes del guion y del dígito verificador.
	
	public int descomponerRun() {
		
		int runEntero = 0;
		
		for (int x = 0; x < run.length()-2; x++) {
			
			char c = run.charAt (x); System.out.print(c);
			
			 runEntero = Character.getNumericValue(c);
		}
		return runEntero;
		
	}
	
	
}
	
