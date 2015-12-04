package de.hsmannheim.tpe.ws15.gruppe11.exception;

/**
 * Die Klasse IllegalKeyExeption ist fuer den Schluessel Exception, die von der
 * Basisklasse Exception vererbt wird. Diese tritt erst dann ein, wenn der
 * eingegebene Schluessel ungueltig ist.
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