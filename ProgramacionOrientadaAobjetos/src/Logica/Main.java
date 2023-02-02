package Logica;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		Alumno barbara = new Alumno();
		Alumno mokita = new Alumno("Mokita", "Monsalves", 20067);
		
		System.out.println("La id del alumno 2 es: "+mokita.getId()+" su nombre es: "+mokita.getNombre()+" y su apellido es: "+mokita.getApellido());	
		
		barbara.setId(200672380);
		barbara.setNombre("Bárbara");
		barbara.setApellido("Carvajal");
	
		System.out.println("------------------------");
		
		
		System.out.println("El id del alumno 1 es: "+barbara.getId()+" su nombre es: "+barbara.getNombre()+" y su apellido: "+barbara.getApellido());
		
		System.out.println("------------------------");
		
		mokita.setId(35);
		
		
		System.out.println("La id del alumno 2 es: "+mokita.getId()+" su nombre es: "+mokita.getNombre()+" y su apellido es: "+mokita.getApellido());	

		
	}

		



}
