package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

import java.lang.reflect.Array;

/**
 * Die Klasse CrypterSubstitution ...
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterSubstitution implements Crypter {

	public static final int MAXLENGTH = 26;

	CrypterSubstitution() {
		super();
	}

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		char[] messageArray = message.toCharArray();
		char[] keyArray = key.toCharArray();

		ueberpruefeLaenge(keyArray);
		differentLetter(keyArray);
		String encrypt = "";

		for (int i = 0; i <= messageArray.length; i++) {
			char buchstabe = messageArray[i];
			int index = buchstabe - 'A';
			encrypt += keyArray[index];
		}

		return encrypt;

	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {

		char[] cypherArray = cypherText.toCharArray();
		char[] keyArray = key.toCharArray();

		ueberpruefeLaenge(keyArray);
		differentLetter(keyArray);
		String decrypt = "";

		for (int i = 0; i <= cypherArray.length; i++) {
			char buchstabe = cypherArray[i];
			int index = buchstabe - 'A';
			decrypt += keyArray[index];

		}

		return decrypt;

	}

	public void ueberpruefeLaenge(char[] text) throws IllegalKeyException {
		if (text.length != MAXLENGTH) {
			throw new IllegalKeyException("Länge ungültig");
		}
	}

	public void differentLetter(char[] letter) throws IllegalMessageException {
		boolean[] letterExist = new boolean[MAXLENGTH];

		for (int i = 0; i <= letterExist.length; i++) {
			int index = letter[i] - 'A';
			if (letterExist[index] == true) {
				throw new IllegalMessageException("Buchstabe existiert bereits");
			} else {

				letterExist[index] = true;
			}

		}

	}

}
