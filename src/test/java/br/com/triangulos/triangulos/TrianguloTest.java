package br.com.triangulos.triangulos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TrianguloTest {
	
	@Test
	void valido() {
		final Triangulo triangulo = new Triangulo(10, 10, 1);
		
		final boolean caso1  = triangulo.valida();
		assertTrue(caso1, "");
	}
}
