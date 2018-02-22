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
			
			case "C":
				valorARetornar = 100;
			break;
			
			case "D":
				valorARetornar = 500;
			break;
			
			case "M":
				valorARetornar = 1000;
			break;
			case "LX":
				Character[] charObjectArray = toCharacterArray("LX");
				charObjectArray[0] = 50;
				charObjectArray[1] = 10;
				valorARetornar = charObjectArray[0] + charObjectArray[1];
			break;
				
				
			
		}
		return valorARetornar;
	}
	
	public Character[] toCharacterArray( String numRomano ) {

	   if ( numRomano == null ) {
	     return null;
	   }

	   int len = numRomano.length();
	   Character[] array = new Character[len];
	   for (int i = 0; i < len ; i++) {
	      array[i] = new Character(numRomano.charAt(i));
	   }

	   return array;
	}


}
