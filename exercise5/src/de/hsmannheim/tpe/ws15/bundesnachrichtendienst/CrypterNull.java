package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

/**
 * Die Klasse CrypterNull
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class CrypterNull implements Crypter {

	CrypterNull(){
		super();
	}
	
	@Override
	public String encrypt(String key, String message) throws IllegalKeyException, IllegalMessageException{
		return message;
	}
	@Override
	public String decrypt(String key,String cypherText) throws IllegalKeyException, IllegalMessageException{
		return cypherText;
	}
}