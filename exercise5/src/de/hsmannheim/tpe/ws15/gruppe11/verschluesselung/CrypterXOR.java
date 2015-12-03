package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.Crypter;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalMessageException;

/**
 * Die Klasse CrypterXOR stellt eine Verschluesselungsmethode dar. In dieser
 * werden die einzelnen Buchstaben einer Nachricht mit einem Buchstaben des
 * <b>ALPHABET</b> verknuepft.
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

	/**
	 * Verschluesselt eine als Parameter uebergebene Nachricht mit dem
	 * dazugehoerende Schluessel
	 * 
	 * @param key
	 *            Schluessel für die Verschluesselung
	 * @param message
	 *            Nachricht die verschluesselt werden soll
	 * @return gibt die verschlüsellte Nachricht zurück
	 */

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

	/**
	 * Entschluesselt die uebergebene Nachricht mit dem dazugehoerende
	 * Schluessel
	 * 
	 * @param key
	 *            Schluessel der für die richtige Entschluesselung notwendig ist
	 * @param cypherText
	 *            Verschluesselte Nachricht, die entschluesselt werden soll
	 * 
	 * @return gibt die entschluesselte Nachricht zurück
	 */

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

	/**
	 * Die Methode ueberpruefeLaenge kontrolliert die ob die Nachricht dieselbe
	 * Laenge wie der Schluessel hat. Sollte es nicht der Fall sein, so wird es
	 * solange lange wiederholt, bis die Nachricht die Laenge des Schluessels
	 * hat.
	 * 
	 * @param keyArray
	 *            Schluessel der angepasst werden soll
	 * @param messageArray
	 *            angepasste Nachricht
	 * @return anpassen gibt Laenge zurück.
	 */

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

	/**
	 * Die Methode getIndex gibt den gesuchten Buchstaben zurueck
	 * 
	 * @param gesuchterChar
	 * @return i gibt den Buchstabe zurueck.
	 */

	private int getIndex(char gesuchterChar) {
		for (int i = 0; i < ALPHABET.length; i++) {
			if (ALPHABET[i] == gesuchterChar) {
				return i;
			}

		}
		return 0;
	}

}
