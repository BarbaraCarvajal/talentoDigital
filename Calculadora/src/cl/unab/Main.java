package cl.unab;
import cl.unab.Persona;
import cl.unab.Estudiante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona pers = new Persona("Bárbara", 29);
		Estudiante est = new Estudiante("Pablito", 21, "Android");
		
		
		System.out.println(pers.saludar());
		System.out.println(est.saludar());
		System.out.println(est.bostezar());
	}
}
