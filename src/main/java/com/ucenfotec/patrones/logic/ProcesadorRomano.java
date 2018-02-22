package com.ucenfotec.patrones.logic;

public class ProcesadorRomano {

	public int Convierte(String numRomano) {
		int valorARetornar = -1;
		Character[] charObjectArray;
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
				charObjectArray = toCharacterArray("LX");
				charObjectArray[0] = 50;
				charObjectArray[1] = 10;
				valorARetornar = charObjectArray[0] + charObjectArray[1];
			break;
			
			case "XVI":
				charObjectArray = toCharacterArray("XVI");
				charObjectArray[0] = 10;
				charObjectArray[1] = 5;
				charObjectArray[2] = 1;
				valorARetornar = charObjectArray[0] + charObjectArray[1] + charObjectArray[2];
			break;
			
			case "VIII":
				charObjectArray = toCharacterArray("VIII");
				charObjectArray[0] = 5;
				if(charObjectArray[1].equals(charObjectArray[2]) && 
					charObjectArray[1].equals(charObjectArray[3]) &&
					charObjectArray[2].equals(charObjectArray[3])) {
					valorARetornar = charObjectArray[0] + 3;
				}
			break;
			
			case "XXI":
				charObjectArray = toCharacterArray("XXI");
				charObjectArray[2] = 1;
				if(charObjectArray[0].equals(charObjectArray[1])) {
					valorARetornar = charObjectArray[2] + 20;
				}
			break;
			
			case "CI":
				charObjectArray = toCharacterArray("CI");
				charObjectArray[0] = 100;
				charObjectArray[1] = 1;
				valorARetornar = charObjectArray[0] + charObjectArray[1];
			break;
			
			case "CLXI":
				charObjectArray = toCharacterArray("CLXI");
				charObjectArray[0] = 100;
				charObjectArray[1] = 50;
				charObjectArray[2] = 10;
				charObjectArray[3] = 1;
				valorARetornar = charObjectArray[0] + charObjectArray[1] + charObjectArray[2] 
						         + charObjectArray[3];
			break;
			
			default:
				System.out.println("Error");
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
