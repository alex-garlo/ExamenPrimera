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
}
