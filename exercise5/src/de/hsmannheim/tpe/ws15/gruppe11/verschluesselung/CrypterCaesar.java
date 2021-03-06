package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalMessageException;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.Crypter;

/**
 * Die Klasse CrypterCaeser stellt die Caeser-Verschluesselung dar. Hier werden
 * den Buchstaben Zahlen zugeordnet. Durch die Angabe von Schluesselbuchstaben
 * erhaehlt man die Verschiebung der Zeichen des Alphabets.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterCaesar implements Crypter {

	CrypterCaesar() {
		super();
	}

	public static int getIndex(String buchstabe) {
		return (buchstabe.charAt(0) - '@');
	}

	/**
	 * Verschluesselt eine Nachricht mit dem Parameter.
	 * 
	 * @param key
	 *            Schluessel der für die Verschluesselung verwendet werden soll
	 * @param message
	 *            Nachricht die Verschluesselt werden soll
	 * @return verschluesselte Nachricht in Datentyp String
	 */

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		if (key.length() != 1) {
			throw new IllegalKeyException("Schluessellaenge ungueltig");
		}

		if (!Tool.obGrossbuchstabe(key)) {
			throw new IllegalKeyException("Schluessel enthaelt ungueltige Buchstabe");
		}

		char[] messageArray = message.toUpperCase().toCharArray();

		int index = getIndex(key);
		int index2;

		for (int i = 0; i < messageArray.length; i++) {
			index2 = messageArray[i] + index;

			if (index2 > Tool.getMax()) {
				index2 -= Tool.getLaenge();
			}
			messageArray[i] = (char) index2;
		}
		return String.valueOf(messageArray);
	}

	/**
	 * Entschluesselt einen als Parameter uebergebenen Nachricht mit dem
	 * dazugehoerenden Schluessel
	 * 
	 * @param key
	 *            Schluessel der fuer die Entschluesselung verwendet werden soll
	 * @param cypherText
	 *            Nachricht der entschluesselt werden soll
	 * 
	 * @return gibt die entschluesselte Nachricht als Datentyp String zurueck
	 */

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		char[] messageArray = cypherText.toCharArray();

		if (key.length() != 1) {
			throw new IllegalKeyException("Schluessellaenge ungueltig");
		}

		if (!Tool.obGrossbuchstabe(key)) {
			throw new IllegalKeyException("Schluessel enthaelt ungueltige Buchstabe");
		}

		int index = getIndex(key);
		int i2;

		for (int i = 0; i < messageArray.length; i++) {
			i2 = messageArray[i] - index;

			if (i2 < Tool.getMin()) {
				i2 += Tool.getLaenge();
			}
			messageArray[i] = (char) i2;
		}
		return String.valueOf(messageArray);
	}

}