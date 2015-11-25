package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

/**
 * Die Klasse CrypterXOR ...
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterXOR implements Crypter {

	CrypterXOR() {
		super();

	}

	@Override
	public String encrypt(final String key, final String message)
			throws IllegalKeyException, IllegalMessageException {
		return message;
	}

	@Override
	public String decrypt(final String key, final String cypherText)
			throws IllegalKeyException, IllegalMessageException {
		return cypherText;

	}
}
