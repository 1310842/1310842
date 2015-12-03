package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.Crypter;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalMessageException;

/**
 * Die Klasse CrypterNull
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class CrypterNull implements Crypter {

	public CrypterNull() {
		super();
	}

	/**
	 * Die Methode encrypt überschreibt den key und message.
	 * 
	 * @return gibt message zurück.
	 */

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {
		return message;
	}

	/**
	 * Die Methode decrypt überschreibt den key und cypherText
	 * 
	 * @return gibt cypherText zurück.
	 */

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		return cypherText;
	}
}