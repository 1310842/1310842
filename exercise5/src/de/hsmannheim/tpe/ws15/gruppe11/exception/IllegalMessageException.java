package de.hsmannheim.tpe.ws15.gruppe11.exception;

/**
 * Die Klasse IllegalMessageExeption ist fuer die Nachricht Exception, die von
 * der Basisklasse Exeption vererbt wird. Diese tritt erst dann ein, wenn der
 * eingegebene Schluessel ungueltig ist.
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