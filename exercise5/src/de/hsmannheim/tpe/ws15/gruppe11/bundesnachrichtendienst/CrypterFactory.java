package de.hsmannheim.tpe.ws15.gruppe11.bundesnachrichtendienst;

import de.hsmannheim.tpe.ws15.gruppe11.enumeration.CrypterVerfahren;
import de.hsmannheim.tpe.ws15.gruppe11.verschluesselung.CrypterCaesar;
import de.hsmannheim.tpe.ws15.gruppe11.verschluesselung.CrypterNull;
import de.hsmannheim.tpe.ws15.gruppe11.verschluesselung.CrypterSubstitution;
import de.hsmannheim.tpe.ws15.gruppe11.verschluesselung.CrypterXOR;

/**
 * Die Klasse CrypterFactory stellt durch die Methode <b>createCrypter</b>
 * Implementierungsmoeglichkeiten zur Verschluesselung dar.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class CrypterFactory {

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