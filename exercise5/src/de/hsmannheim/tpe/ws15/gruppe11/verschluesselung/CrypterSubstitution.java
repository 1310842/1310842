package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.Crypter;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst.IllegalMessageException;

/**
 * Die Klasse CrypterSubstitution stellt eine Verschluesselungsmethode dar. In
 * dieser werden die einzelnen Buchstaben einer Nachricht mit anderen Buchstaben
 * ersetzt.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class CrypterSubstitution implements Crypter {

	public static final int MAXLENGTH = 26;

	public CrypterSubstitution() {
		super();
	}

	/**
	 * Verschluesselt eine Nachricht mit einem als Parameter übergegebene
	 * Schluessel.
	 * 
	 * @param key
	 *            Schluessel für die Verschluesselung
	 * @param message
	 *            Nachricht die verschluesselt werden soll
	 * @return gibt die verschluesselte Nachricht zurück
	 */

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		char[] messageArray = message.toCharArray();
		char[] keyArray = key.toCharArray();

		ueberpruefeLaenge(keyArray);
		differentLetter(key);
		String encrypt = "";

		for (int i = 0; i < messageArray.length; i++) {
			char buchstabe = messageArray[i];
			int index = buchstabe - 'A';
			encrypt += keyArray[index];
		}

		return encrypt;

	}

	/**
	 * Enthschluesselt die als Parameter uebergegebene Verschluesselte Nachricht
	 * mit dem dazugehoerenden Schluessel
	 * 
	 * @param key
	 *            Schluessel die für die Entschluesselung notwendig ist
	 * @param cyperText
	 *            Verschluesselte Nachricht
	 * 
	 * @return gibt die entschluesselte Nachricht zurück
	 */

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {

		char[] cypherArray = cypherText.toCharArray();
		char[] keyArray = key.toCharArray();

		ueberpruefeLaenge(keyArray);
		differentLetter(key);
		String decrypt = "";

		for (int i = 0; i < cypherArray.length; i++) {

			decrypt += (char) (getIndex(cypherArray[i], keyArray) + 'A');
		}

		return decrypt;

	}

	/**
	 * Ueberprüft ob die Laenge des Textes genau 26 ist
	 * 
	 * @param <b>key</b>
	 *            Text der ueberprueft werden soll
	 * @throws wirft
	 *             eine <b>IllegalKeyException</b> wenn die Laenge nicht genau
	 *             26 ist
	 */

	public void ueberpruefeLaenge(char[] text) throws IllegalKeyException {
		if (text.length != MAXLENGTH) {
			throw new IllegalKeyException("Länge ungültig");
		}
	}

	/**
	 * Die Methode ueberprüft, ob die Buchstaben die innerhalb des Textes
	 * maximal ein mal vorkommen
	 * 
	 * @param key
	 *            Text der ueberprueft werden soll
	 * @throws wirft
	 *             eine <b>IllegalKeyException</b> wenn eine Buchstabe mehr als
	 *             ein mal existiert
	 */

	public void differentLetter(String key) throws IllegalMessageException {
		boolean[] letterExist = new boolean[MAXLENGTH];

		for (int i = 0; i < letterExist.length; i++) {
			int index = key.charAt(i) - 'A';
			if (letterExist[index]) {
				throw new IllegalMessageException("Buchstabe existiert bereits");
			} else {

				letterExist[index] = true;
			}

		}

	}

	/**
	 * Die Methode getIndex sucht den Index für den als Parameter uebergegebenen
	 * Buchstabe in der Schluesselliste und gibt es zurueck.
	 * 
	 * @param gesuchteChar
	 *            Buchstabe der gesucht wird
	 * @param key
	 *            Schluesselliste
	 * @return index der gesuchten Buchstabe innerhalb der Schluesselliste
	 */

	public int getIndex(char gesuchteChar, char[] key) {
		for (int i = 0; i < key.length; i++) {
			if (key[i] == gesuchteChar) {
				return i;
			}
		}

		return 0;
	}

}
