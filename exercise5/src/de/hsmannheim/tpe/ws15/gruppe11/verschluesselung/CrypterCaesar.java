package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.Crypter;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalMessageException;

/**
 * Die Klasse CrypterCaeser stellt die Caeser-Verschluesselung dar.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterCaesar implements Crypter {

	private final static int MIN = 65;
	private final static int MAX = 90;
	private final static int LAENGE = 26;

	public CrypterCaesar() {
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
		char[] messageArray = message.toCharArray();

		pruefeLaenge(key);
		obGrossbuchstabe(key);

		int index = getIndex(key);
		int i2;

		for (int i = 0; i < messageArray.length; i++) {
			i2 = messageArray[i] + index;

			if (i2 > MAX) {
				i2 -= LAENGE;
			}
			messageArray[i] = (char) i2;
		}
		return String.valueOf(messageArray);
	}

	/**
	 * Entschlüsselt einen als Parameter übergebenen Nachricht mit dem
	 * dazugehörenden Schlüssel
	 * 
	 * @param key
	 *            Schluessel der für die Entschluesselung verwendet werden soll
	 * @param cypherText
	 *            Nachricht der entschluesselt werden soll
	 * 
	 * @return gibt die entschluesselte Nachricht als Datentyp String zurück.
	 */

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		char[] messageArray = cypherText.toCharArray();

		pruefeLaenge(key);
		obGrossbuchstabe(key);

		int index = getIndex(key);
		int i2;

		for (int i = 0; i < messageArray.length; i++) {
			i2 = messageArray[i] - index;

			if (i2 < MIN) {
				i2 += LAENGE;
			}
			messageArray[i] = (char) i2;
		}
		return String.valueOf(messageArray);
	}

	/**
	 * Die Methode pruefeLaenge prueft die Laenge des Schluessels.
	 * 
	 * @param key
	 *            übergibt den Schluessel.
	 * @return gibt true zurueck.
	 * @throws IllegalKeyException
	 *             wirft die Ausnahme.
	 */

	private boolean pruefeLaenge(String key) throws IllegalKeyException {
		if (key.length() != 1) {
			throw new IllegalKeyException("Schlüssel ungültig");
		} else {
			return true;
		}

	}

	/**
	 * Die Methode obGrossbuchstabe ueberprueft, ob der Schluessel
	 * großgeschrieben ist.
	 * 
	 * @param key
	 *            uebergibt den Schluessel.
	 * @throws IllegalKeyException
	 *             wirft die Ausnahme.
	 */

	private void obGrossbuchstabe(String key) throws IllegalKeyException {
		int nummer = key.charAt(0);
		if (nummer >= MIN && nummer <= MAX) {
			return;

		} else {
			throw new IllegalKeyException("Geht net");
		}
	}
}