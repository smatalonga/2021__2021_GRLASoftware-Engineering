package com.uws.glaSE.week5.cesarcypher;

public class CesarCypher {
	public static String Cypher(String message, int offset) {
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
		    if (character != ' ') {
		        int originalAlphabetPosition = character - 'a';
		        int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
		        char newCharacter = (char) ('a' + newAlphabetPosition);
		        result.append(newCharacter);
		    } else {
		        result.append(character);
		    }
		}
		return result.toString();
	}
	
	public static String DeCypher(String message, int offset) {
		offset = 26 - (offset % 26);
		return CesarCypher.Cypher(message, offset);
	}
	
}
