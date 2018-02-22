package com.ucenfotec.patrones.logic;

public class ProcesadorRomano {

	public int Convierte(String numRomano) {
		int valorARetornar = -1;
		switch(numRomano) {
			case "":
				valorARetornar = 0;
			break;
			
			case "I":
				valorARetornar = 1;
			break;
			
			case "II":
				valorARetornar = 2;
			break;
			
			case "III":
				valorARetornar = 3;
			break;
			
			case "V":
				valorARetornar = 5;
			break;
			
			case "X":
				valorARetornar = 10;
			break;
			
			case "L":
				valorARetornar = 50;
			break;
		}
		return valorARetornar;
	}
	

}
