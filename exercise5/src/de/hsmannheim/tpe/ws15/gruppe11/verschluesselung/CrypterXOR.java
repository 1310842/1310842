package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.Crypter;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalMessageException;

/**
 * Die Klasse CrypterXOR ...
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterXOR implements Crypter {

	private final static char[] ALPHABET = { '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_' };

	public CrypterXOR() {
		super();

	}

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		char[] messageArray = message.toCharArray();
		char[] keyArray = key.toCharArray();
		char[] tempArray = null;
		int bit;
		
		tempArray = ueberpruefeLaenge(keyArray, messageArray).toCharArray();
		

		String encrypt = "";

		for (int i = 0; i < key.length(); i++) {
			bit = (i + 1) ^ getIndex(tempArray[i]);
			encrypt += ALPHABET[bit];

		}
		return encrypt;

	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		char[] keyArray = key.toCharArray();
		char[] cypherArray = cypherText.toCharArray();
		char[] tempArray = null;
		int bit;
		
		String decrypt = "";
		
		tempArray = ueberpruefeLaenge(keyArray, cypherArray).toCharArray();
		
		for (int i = 0; i < cypherText.length(); i++) {
			bit = (getIndex(tempArray[i])) ^ getIndex(cypherArray[i]);
			decrypt += ALPHABET[bit];

		}
		return decrypt;

	}

	private String ueberpruefeLaenge(char[] keyArray, char[] messageArray) {

		String anpassen = String.valueOf(keyArray);

		if (keyArray.length < messageArray.length) {

			int rest = messageArray.length - keyArray.length + 1;

			for (int i = 0; i < rest; i++) {
				if (i == keyArray.length) {

					i = 0;
					rest -= keyArray.length;
				}

				anpassen += keyArray[i];
			}
		} else {
			return String.valueOf(keyArray);
		}

		return anpassen;

	}

	private int getIndex(char gesuchterChar) {
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == gesuchterChar) {
				return i;
			}

		}
		return 0;
	}

}
