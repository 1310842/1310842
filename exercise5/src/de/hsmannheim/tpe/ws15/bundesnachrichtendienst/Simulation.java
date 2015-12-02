package de.hsmannheim.tpe.ws15.bundesnachrichtendienst;

import de.hsmannheim.tpe.ws15.bundesnachrichtendienst.CrypterFactory.CrypterVerfahren;

public class Simulation {

	public static void main(String[] args) throws IllegalKeyException, IllegalMessageException {

		Crypter cnull = CrypterFactory.createCrypter(CrypterVerfahren.NULL);
		Crypter caesar = CrypterFactory.createCrypter(CrypterVerfahren.CAESAR);
		Crypter substitution = CrypterFactory.createCrypter(CrypterVerfahren.SUBSTITUTION);
		Crypter xor = CrypterFactory.createCrypter(CrypterVerfahren.XOR);

		try {
			System.out.println(cnull.encrypt("C", "CAESAR"));
		} catch (IllegalMessageException imex) {
			System.out.println(imex.toString());
		}

		try {
			System.out.println(cnull.decrypt("C", "FDHVDU"));
		} catch (IllegalMessageException imex) {
			System.out.println(imex.toString());
		}

		try {
			System.out.println(caesar.encrypt("C", "ZCAESAR"));
		} catch (IllegalKeyException ikex) {
			System.out.println(ikex.toString());
		}

		try {
			System.out.println(caesar.decrypt("C", "FDHVDU"));
		} catch (IllegalKeyException ikex) {
			System.out.println(ikex.toString());
		}

		try {
			System.out.println(substitution.encrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "WIKIPEDIAISTINFORMATIV"));
		} catch (IllegalKeyException ikex) {
			System.out.println(ikex.toString());
		}

		try {
			System.out.println(substitution.decrypt("UFLPWDRASJMCONQYBVTEXHZKGI", "ZSMSYWPSUSTESNDQVOUESH"));
		} catch (IllegalKeyException ikex) {
			System.out.println(ikex.toString());
		}

		System.out.println(xor.encrypt("TPERULES", "ABCDEFGHIJKLMNOPQRSTUVXYZ"));

		System.out.println(xor.decrypt("TPERULES", "URFVPJB[]ZN^XBJCEBVF@ZRKMJ"));

		System.out.println("---- Vorgabe ----");

		try {
			String resultXor = xor.decrypt("MOCKINGJAY",
					"J^TYEYJRVI_^HYFY@ECV__IQ@\\P[QN]]O\\XAPGVI_UNOAAPGSQ@EWFKEL[VTZ_Q@GY@MVI");
			String resultCaesar = caesar.decrypt("P", resultXor);
			String resultSub = substitution.decrypt("LKJHGFDSAPOIUZTREWQYXCVBNM", resultCaesar);

			System.out.println(resultSub);

		} catch (IllegalKeyException ikex) {
			System.out.println(ikex.toString());

		} catch (IllegalMessageException imex) {
			System.out.println(imex.toString());
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
