package de.hsmannheim.tpe.ws15.steuer;

import de.hsmannheim.tpe.ws15.staat.Finanzamt;

/**
 * Die abstrakte Klasse Einkommensteuer stellt die Berechnung der
 * Einkommensteuer da.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public abstract class Einkommensteuer extends Finanzamt{

	/**
	 * Die Methode <b>berechneEinkommensSteuer</b> berechnet die Einkommensteuer.
	 * 
	 * 
	 * @param <b>einkommen</b> des Einwohners
	 * 
	 * @return gibt die <b>steuer</b> zurück die abgeführt werden muss
	 */

	public static int berechneEinkommensSteuer(int einkommen) {

		int steuer = 0;
		if (einkommen <= 20000) {
			steuer = einkommen * 8 / 100;
		}

		if (einkommen > 20000 && einkommen <= 60000) {
			steuer = 1600;
			einkommen -= 20000;
			steuer += einkommen * 15 / 100;
		}

		if (einkommen > 60000 && einkommen <= 120000) {
			steuer = 7600;
			einkommen -= 60000;
			steuer += einkommen * 25 / 100;
		}

		if (einkommen > 120000) {
			steuer = 22600;
			einkommen -= 120000;
			steuer += einkommen * 40 / 100;
		}

		return steuer;
	}

}
