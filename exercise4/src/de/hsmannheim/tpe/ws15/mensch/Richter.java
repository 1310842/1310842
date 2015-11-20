package de.hsmannheim.tpe.ws15.mensch;

/**
 * Die Klasse Richter ist eine Unterklasse von Mensch. Richter haben die Aufgabe
 * Schurken zu verurteilen. Desweiteren können Richter korrupt sein.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Richter extends Mensch {

	/**
	 * Deklaration des Attributs <b>korrupt</b>.
	 */

	private boolean korrupt;

	/**
	 * Instanziierung Richter als Konstruktor zur Definition der Anfangswerte
	 * des Objekts.
	 * 
	 * @param übergibt
	 *            <b>name</b> zum Benennen des Objekts
	 * @param übergibt
	 *            <b>einkommen</b> zur Festlegung des Einkommens.
	 * @param übergibt
	 *            <b>alter</b> zur Festlegung des Alters.
	 * @param übergibt
	 *            <b>korrupt</b> und gibt an, ob die Korruption des Objekts
	 *            <b>true</b>(für korrupt) oder <b>false</b>(nicht korrupt) ist.
	 * 
	 */

	public Richter(String name, int einkommen, int alter, boolean korrupt) {
		super(name, einkommen, alter);
		this.korrupt = korrupt;

	}

	/**
	 * Die Methode verurteilen überprüft die Korruption des Objekts und gibt
	 * entweder den Wert <b>true</b>(Schurke wird freigesprochen) oder <b>false</b>(Schurke wird zur Haft verurteilt) zurück.
	 * 
	 * @return gibt <b>true</b> oder <b>false</b> zurück.
	 */

	public boolean verurteilen() {
		if (this.korrupt) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Die Methode <b>isKorrupt</b> gibt <b>korrupt</b> zurück, wenn sie
	 * <b>true</b> sein sollte.
	 * 
	 * @return gibt <b>korrupt</b> zurück.
	 */

	public boolean isKorrupt() {
		return korrupt;
	}

}
