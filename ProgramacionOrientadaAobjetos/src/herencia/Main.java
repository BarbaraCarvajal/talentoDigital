package herencia;

public class Main {

	public static void main(String[] args) {
		
		Persona vector [] = new Persona [5];
		vector[0] = new Persona();
		vector[1] = new Empleado();
		vector[2] = new Consultor();
		vector[3] = new Jefe();
		
		
		Persona persona1 = new Persona();
		Consultor consultor1 = new Consultor();
		
		persona1 = consultor1;
		
		System.out.println("🥸");
		
	}

}
