package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

/**
 * Die Klasse CrypterCaeser ...
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

	private boolean pruefeLaenge(String key) throws IllegalKeyException {
		if (key.length() != 1) {
			throw new IllegalKeyException("Schlüssel ungültig");
		} else {
			return true;
		}

	}

	private void obGrossbuchstabe(String key) throws IllegalKeyException {
		int nummer = key.charAt(0);
		if (nummer >= MIN && nummer <= MAX) {
			return;

		} else {
			throw new IllegalKeyException("Geht net");
		}
	}
}