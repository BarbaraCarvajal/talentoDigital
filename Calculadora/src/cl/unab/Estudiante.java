package cl.unab;




public class Estudiante extends Persona{
	
	private String curso;
	
	public Estudiante(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
		
	}
	public String bostezar() {
		return "aaaaah";
	}
		
	
	
}
