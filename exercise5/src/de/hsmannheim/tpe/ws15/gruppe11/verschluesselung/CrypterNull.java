package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalMessageException;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.Crypter;

/**
 * Die Klasse CrypterNull verschluesselt den Text nicht. Die Ausgabe entspricht
 * der Eingabe.
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
	 * Die Methode encrypt ueberschreibt den key und message
	 * 
	 * @param key
	 *            Schluessel fuer die Verschluesselung
	 * @param message
	 *            Verschluesselug der Nachricht
	 * @return gibt message unverschluesselt zurueck
	 */

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {
		return message;
	}

	/**
	 * Die Methode decrypt ueberschreibt den key und cypherText
	 * 
	 * @param key
	 *            Schluessel fuer die Verschluesselung
	 * @param cypherText
	 *            Entschluesselung der verschluesselte Nachricht
	 * @return gibt cypherText zurueck
	 */

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {
		return cypherText;
	}
}