package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

/**
 * Die Klasse CrypterXOR ...
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterXOR implements Crypter {

	private final static char[] ABC = { '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_' };

	CrypterXOR() {
		super();

	}

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		char[] keyArray = key.toCharArray();
		char[] messageArray = message.toCharArray();
		char[] ergebnisArray = null;

		for () {
			
		}
		
		return encrypt;

	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		return cypherText;

		char[] keyArray = key.toCharArray();
		char[] messageArray = cypherText.toCharArray();
		char[] ergebnisArray = null;

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

}
