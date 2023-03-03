package matematicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.rlopezga.mates.matematicas.Calculadora;

public class CalculadoraTest {
	private Calculadora c1;
	
	
	

	@BeforeEach
	void setUp() throws Exception {
		c1 =new Calculadora();
		

	}

	@AfterEach
	void tearDown() throws Exception {
		c1 = null;
		
	}

	@Test
	void testSolucion1Correcta() {
		Assertions.assertEquals(c1.solucion1(1, -5, 6), 3);
		Assertions.assertEquals(c1.solucion1(2, -7, 3), 3);
		Assertions.assertEquals(c1.solucion1(-1, -7, -10), -5);
	
	}
	
	@Test
	void testSolucion2Correcta() {
		Assertions.assertEquals(c1.solucion2(1, -5, 6), 2);
		Assertions.assertEquals(c1.solucion2(2, -7, 3), 0,5);
		Assertions.assertEquals(c1.solucion2(-1, -7, -10), -2);

	}
	
	@Test
	void testPrimo() {
		Assertions.assertEquals(c1.esPrimo(2), true);
		Assertions.assertEquals(c1.esPrimo(7), true);
		Assertions.assertEquals(c1.esPrimo(19), true);
		
	}
	
	@Test
	void testNoPrimo() {
		Assertions.assertEquals(c1.esPrimo(15), false);
		Assertions.assertEquals(c1.esPrimo(16), false);
		Assertions.assertEquals(c1.esPrimo(20), false);
		
		
	}
	
	@Test
	void testSolucion1Incorrecta() {
		Throwable excepcion =
		Assertions.assertThrows(ArithmeticException.class,
				() -> c1.solucion1(1, 1, 1));
	}
	
	@Test
	void testSolucion2Incorrecta() {
		Throwable excepcion =
		Assertions.assertThrows(ArithmeticException.class,
				() -> c1.solucion2(1, 1, 1));
	
	
	}


}
