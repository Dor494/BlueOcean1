package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio1Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
				"5, 1",
				"6, 1",
				"14, 7"})
	
	void testTransformar(int input, int expected) {
		Ejercicio1 e1 = new Ejercicio1();
		assertEquals(expected, e1.transformar(input));
		// assertTrue(c.transformar(input)==expected);
	}

}
