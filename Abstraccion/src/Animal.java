

public abstract class Animal {

	protected String nombre;
	
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public abstract void comer();
	public abstract void caminar();
	public abstract void comunicarse();
	
	
	
}
