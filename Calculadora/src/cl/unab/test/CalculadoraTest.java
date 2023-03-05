package cl.unab.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cl.unab.Calculadora;

class CalculadoraTest {
	
	private Calculadora cal1= new Calculadora();
	private Calculadora cal2 = new Calculadora(2,2);
	
	@Test
	void getNumero1Test() {
		Assertions.assertEquals(2, cal2.getNumero1());
	}
	
	@Test
	void getNumero2Test() {
		Assertions.assertEquals(3, cal2.getNumero2());
	}
	
	@Test
	void getNumero2TestNotEquals() {
		Assertions.assertNotEquals(3, cal2.getNumero2());
	}
}
