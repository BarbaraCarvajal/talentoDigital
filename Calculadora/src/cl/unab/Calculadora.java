/**
 * 
 */
package cl.unab;

/**
 * @author barbaracarvajalsaez
 *
 */
public class Calculadora {

	/* ATRIBUTOS */
	
	private int numero1;
	private int numero2;
	
	/*CONSTRUCTOR VACÍO*/
	public Calculadora() {
		
	}
	/*CONSTRUCTOR NO VACÍO*/
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	
	/* METODOS */
	
	/**
	 * @return the numero1
	 */
	public int getNumero1() {
		return numero1;
	}
	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	/**
	 * @return the numero2
	 */
	public int getNumero2() {
		return numero2;
	}
	/**
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int sumar() {
		return this.numero1 + this.numero2;
	}
	
	public int restar() {
		return this.numero1 - this.numero2;
	}
	public int multiplicar() {
		return this.numero1 * this.numero2;
	}
	
	public float dividir() {
		return this.numero1 / this.numero2;
	}
	
	public static void main(String[] args) {

		/* INSTANCIAR */
		
		Calculadora calc = new Calculadora(12,13);
		System.out.println(calc.sumar());
		
		Calculadora calc2 = new Calculadora();
		calc2.setNumero1(33);
		calc2.setNumero2(31);
		System.out.println(calc2.sumar());
		System.out.println(calc2.restar());
		System.out.println(calc2.multiplicar());
		System.out.println(calc2.dividir());
		
	}

}
