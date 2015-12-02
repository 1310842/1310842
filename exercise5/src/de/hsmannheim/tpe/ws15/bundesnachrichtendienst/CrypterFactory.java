package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

import de.hsmannheim.tpe.ws15.bundesnachrichtendienst.Crypter;

/**
 * Die Factory-Klasse CrypterFactory stellt verschiedene durch die Methode
 * <b>createCrypter</b> Implementierungsmöglichkeiten zur Verschlüsselung dar.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class CrypterFactory {

	public static enum CrypterVerfahren {
		CAESAR, NULL, SUBSTITUTION, XOR
	};

	public CrypterFactory() {

	}

	public static Crypter createCrypter(final CrypterVerfahren crypterVerfahren) {
		switch (crypterVerfahren)

		{

		case CAESAR:
			return new CrypterCaesar();
		case NULL:
			return new CrypterNull();
		case SUBSTITUTION:
			return new CrypterSubstitution();
		case XOR:
			return new CrypterXOR();
		default:
			throw new IllegalArgumentException("Existiert  nicht.");
		}

	}

}