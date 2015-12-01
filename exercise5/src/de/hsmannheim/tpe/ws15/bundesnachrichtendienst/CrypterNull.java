package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

/**
 * Die Klasse CrypterNull
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class CrypterNull implements Crypter {

	CrypterNull() {
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