package de.hsmannheim.tpe.ws15.gruppe11.simulation;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hsmannheim.tpe.ws15.gruppe11.enumeration.CrypterVerfahren;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalKeyException;
import de.hsmannheim.tpe.ws15.gruppe11.exception.IllegalMessageException;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.Crypter;
import de.hsmannheim.tpe.ws15.gruppe11.verschluesselung.CrypterFactory;

/**
 * Die Klasse JUnit ueberprueft das Programm.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class JUnit {
	@Test
	public void testNull() throws IllegalKeyException, IllegalMessageException {

		Crypter cnull = CrypterFactory.createCrypter(CrypterVerfahren.NULL);

		assertEquals("CAESAR", cnull.encrypt("A", "CAESAR"));
		assertEquals("CAESAR", cnull.decrypt("AA", "CAESAR"));

	}

	@Test
	public void testCaesar() throws IllegalKeyException, IllegalMessageException {
		Crypter caesar = CrypterFactory.createCrypter(CrypterVerfahren.CAESAR);
		assertEquals("FDHVDU", caesar.encrypt("C", "CAESAR"));
		assertEquals("FDHVDU", caesar.encrypt("C", "caesAr"));
		assertEquals("CAESAR", caesar.decrypt("C", "FDHVDU"));
	}

	@Test
	public void testCaesarKeyException() throws IllegalKeyException, IllegalMessageException {

		Crypter caesar = CrypterFactory.createCrypter(CrypterVerfahren.CAESAR);
		try {
			caesar.encrypt("c", "CAESAR");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.encrypt("CC", "CAESAR");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.encrypt("1", "CAESAR");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.decrypt("1", "FDHVDU");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			caesar.decrypt("CC", "FDHVDU");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

	}

	@Test
	public void testSubstitution() throws IllegalKeyException, IllegalMessageException {
		Crypter substitution = CrypterFactory.createCrypter(CrypterVerfahren.SUBSTITUTION);

		assertEquals("ZSMSYWPSUSTESNDQVOUESH",
				substitution.encrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "WIkipEDIAISTINFORMATIV"));

		assertEquals("ZSMSYWPSUSTESNDQVOUESH",
				substitution.encrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "WIKIPEDIAISTINFORMATIV"));

		assertEquals("WIKIPEDIAISTINFORMATIV",
				substitution.decrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "ZSMSYWPSUSTESNDQVOUESH"));
	}

	@Test
	public void testSubstitutionException() throws IllegalMessageException, IllegalKeyException {
		Crypter substitution = CrypterFactory.createCrypter(CrypterVerfahren.SUBSTITUTION);

		try {
			substitution.encrypt("UfLPWDRASJMCONQYBVTEXHZKGI", "WIKIPEDIAISTINFORMATIV");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			substitution.encrypt("FLPWDRASNQYBVTEXHZKGI", "WIKIPEDIAISTINFORMATIV");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			substitution.encrypt("UfLPWDRASJMCONQYBVTEXHZKGHJHJGHJKGHJI", "WIKIPEDIAISTINFORMATIV");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}
	}

	@Test
	public void testXOR() throws IllegalKeyException, IllegalMessageException {
		Crypter xor = CrypterFactory.createCrypter(CrypterVerfahren.XOR);

		assertEquals("URFVPJB[]ZN^XBJCEBVF@ZRKMJ", xor.encrypt("TPERULES", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("URFVPJB[]ZN^XBJCEBVF@ZRKMJ", xor.encrypt("TPERULESTPERULES", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));

		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", xor.decrypt("TPERULESTPERULES", "URFVPJB[]ZN^XBJCEBVF@ZRKMJ"));
	}

	@Test
	public void testXORExceptions() throws IllegalMessageException {
		Crypter xor = CrypterFactory.createCrypter(CrypterVerfahren.XOR);

		try {
			xor.encrypt("T1ERULES", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			xor.encrypt("TpERULES", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			xor.decrypt("T1ERULES", "URFVPJB[]ZN^XBJCEBVF@ZRKMJ");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

		try {
			xor.decrypt("TpERULES", "URFVPJB[]ZN^XBJCEBVF@ZRKMJ");
			fail();
		} catch (IllegalKeyException ikex) {
			assertTrue(true);
		}

	}

	@Test
	public void testReverse() throws IllegalKeyException, IllegalMessageException {
		Crypter reverse = CrypterFactory.createCrypter(CrypterVerfahren.REVERSE);
		assertEquals("CBA", reverse.encrypt("", "ABC"));
	}
}