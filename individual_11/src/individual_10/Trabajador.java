/**
 * 
 */
package individual_10;

import java.util.Scanner;

/**
 * @author Barbarita ♥
 *
 *
 *
 Una empresa corredora de propiedades necesita contar con un sistema de registro de sus trabajadores. 
 Dado que usted en el ejercicio anterior creó la clase Trabajador, se le solicita crear un 
 programa Java que haga lo siguiente:
- Cree tres instancias (objetos) de la clase Trabajador, usando el controlador respectivo para este caso.
- Despliegue por consola el contenido de cada objeto usando el método toString().
Considere que, a diferencia del caso anterior, esta clase sí debe llevar el método main(), 
ya que a través de ella se instanciarán y manipularán objetos o instancias de una clase.
Nota: En las referencias se agrega un ejemplo alusivo a la instanciación de clases en lenguaje Java.
*/
public class Trabajador {
	
	private String nombres, apellidos, run, telefono, edad;;
	
	
	Trabajador(){
		
	}
	
	
	
	/**
	 * @param nombres
	 * @param apellidos
	 * @param run
	 * @param telefono
	 * @param edad
	 */
	public Trabajador(String nombres, String apellidos, String run, String telefono, String edad) {
		
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
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
	
	//Validar letras

	public String validarLetras(String mensaje, Scanner sc) {

			boolean condicion = true;
			String entrada = "";

			while (condicion) {

				System.out.print("\n" + mensaje);
				entrada = sc.nextLine();

				if (entrada.matches("[a-zA-Z\\s]{1,}")) {

					condicion = false;
				} else {

					System.out.println("Dato ingresado no valido, intentelo nuevamente");
				}
			}
			return entrada;
		}
	
	// Validar run 

	public String validarRun(String mensaje, Scanner sc) {
	
			boolean condRun = true;
			String entrada = "";
	
			while (condRun) {
	
				System.out.print("\n" + mensaje);
				entrada = sc.nextLine();
	
				if (entrada.matches("\\d{2}.\\d{3}.\\d{3}")) {
	
					condRun = false;
				} else {
	
					System.out.println("Run ingresado no valido, intentelo nuevamente");
				}
			}
			return entrada;
		}
	// validar telefono
	public String validarTelefono(String mensaje, Scanner sc) {

		boolean condTel = true;
		String entrada = "";
	
		while (condTel) {
	
			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();
	
			if (entrada.matches("[0-9]{8}")) {
	
				condTel = false;
			} else {
	
				System.out.println("Número de telefono no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	// validar edad
	
	public String validarEdad(String mensaje, Scanner sc) {

		boolean condEdad = true;
		String entrada = "";

		while (condEdad) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[0-9]{1,2}")) {

				if (!entrada.equals("0")) {

					condEdad = false;
				} else {

					System.out.println("La edad no puede ser 0, intentalo nuevamente");
				}
			} else {
				System.out.println("Dato ingresado no valido, intentalo nuevamente");
			}

		}
		return entrada;
	}

	
}
	
