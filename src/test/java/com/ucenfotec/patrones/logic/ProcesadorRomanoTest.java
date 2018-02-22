package com.ucenfotec.patrones.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void stringVacio() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(0, numRomano.Convierte(""));
	}
	
	

}
