package de.hsmannheim.tpe.ws15.gruppe11.verschluesselung;

import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalMessageException;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.*;

public class ReversCrypter implements Crypter {

	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException {

		return reverse(message);
	}

	@Override
	public String decrypt(String key, String cypherText) throws IllegalKeyException, IllegalMessageException {

		return reverse(cypherText);
	}

	public String reverse(String message) {
		String result = "";
		for (int i = message.length() - 1; i >= 0; i--) {
			result += message.charAt(i);
		}
		return result;

	}
}
