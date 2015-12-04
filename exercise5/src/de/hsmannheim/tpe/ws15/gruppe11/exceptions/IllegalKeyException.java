package de.hsmannheim.tpe.ws15.gruppe11.exceptions;

/**
 * Die Klasse IllegalKeyExeption stellt eine Ausnahme dar. Wenn der eingegebene
 * Schluessel ungültig ist, dann tretet diese in Kraft.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class IllegalKeyException extends Exception {

	public IllegalKeyException() {
		super();
	}

	public IllegalKeyException(String message) {
		super(message);
	}

}