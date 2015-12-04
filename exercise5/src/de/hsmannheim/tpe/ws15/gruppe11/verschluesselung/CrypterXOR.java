package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalMessageException;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.Crypter;

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

	CrypterXOR() {
		super();

	}

	/**
	 * Verschluesselt eine als Parameter uebergebene Nachricht mit dem
	 * dazugehoerende Schluessel
	 * 
	 * @param key
	 *            Schluessel fuer die Verschluesselung
	 * @param message
	 *            Verschluesselung der Nachricht
	 * @return gibt die verschluesellte Nachricht zurueck
	 */

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		if (!Tool.obGrossbuchstabe(key)) {
			throw new IllegalKeyException("Schluessel enthaelt ungueltige Buchstaben");
		}

		String temp = null;
		int bit;

		temp = ueberpruefeLaenge(key, message);

		String encrypt = "";

		for (int i = 0; i < temp.length(); i++) {
			bit = (i + 1) ^ Tool.getIndex(temp.charAt(i), ALPHABET);
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
		if (!Tool.obGrossbuchstabe(key)) {
			throw new IllegalKeyException("Schluessel enthaelt ungueltige Buchstaben");
		}

		String temp = null;
		int bit;
		String decrypt = "";

		temp = ueberpruefeLaenge(key, cypherText);

		for (int i = 0; i < cypherText.length(); i++) {
			bit = (Tool.getIndex(temp.charAt(i), ALPHABET)) ^ Tool.getIndex(cypherText.charAt(i), ALPHABET);
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

	private String ueberpruefeLaenge(String key, String message) {

		String anpassen = key;

		if (key.length() < message.length()) {

			int rest = message.length() - key.length();

			for (int i = 0; i < rest; i++) {
				if (i == key.length()) {
					i = 0;
					rest -= key.length();
				}

				anpassen += key.charAt(i);
			}
		} else {
			return key;
		}

		return anpassen;

	}

}
