package com.ucenfotec.patrones.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void stringVacio() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(0, numRomano.Convierte(""));
	}
	
	@Test
	public void StringI() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(1, numRomano.Convierte("I"));
	}
	
	@Test
	public void StringII() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(2, numRomano.Convierte("II"));
	}
	
	@Test
	public void StringIII() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(3, numRomano.Convierte("III"));
	}
	
	@Test
	public void StringV() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(5, numRomano.Convierte("V"));
	}
	
	@Test
	public void StringX() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(10, numRomano.Convierte("X"));
	}
	
	@Test
	public void StringL() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(50, numRomano.Convierte("L"));
	}
	
	@Test
	public void StringC() {
		ProcesadorRomano numRomano = new ProcesadorRomano();
		assertEquals(100, numRomano.Convierte("C"));
	}
	

}
