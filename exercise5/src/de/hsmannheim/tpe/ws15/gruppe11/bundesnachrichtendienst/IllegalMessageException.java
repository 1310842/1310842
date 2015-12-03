package de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst;

/**
 * Die Klasse IllegalMessageException stellt eine Ausnahme dar.
 * Diese treten in Kraft, wenn die eingegebene Nachricht ungültig ist.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class IllegalMessageException extends Exception {

	public IllegalMessageException() {
		super();
	}

	public IllegalMessageException(String message) {
		super(message);
	}

}