package de.hsmannheim.tpe.ws15.mensch;

import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;

/**
 * Die Klasse Buerger ist eine Unterklasse von der Klasse Mensch. Sie
 * praesentiert die Eigenschaften des Buergers.
 * 
 * @author Car, Isra.
 * @author Celik, Kuebra.
 */

public class Buerger extends Mensch implements EinkommenssteuerI {

	/**
	 * Instanziierung des Buergers als Konstruktor. Die Übergabeparameter
	 * definieren die Anfangswerte für das Objekt Buerger. Bei jedem Aufruf des
	 * Konstruktors wird automatisch die Methode anmelden in der Klasse
	 * Finanzamt aufgerufen. Die Methode anmelden verwendet das Objekt weiter.
	 * 
	 * @param <b>name</b>
	 *            übergibt den Namen zur Benennung des Objekts.
	 * @param <b>einkommen</b>
	 *            übergibt das Einkommen des Objekts.
	 * @param <b>alter</b>
	 *            übergibt das Alter des Objekts.
	 */

	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		Finanzamt.anmelden(this);
	}

	/**
	 * Die Methode berechneEinkommenssteuer holt das Einkommen des Objekts
	 * Buerger und verwendet die Methode <b>berechneEinkommensSteuer</b> der
	 * Klasse Einkommensteuer und gibt das Nettoeinkommen des Objekts Buerger
	 * zurück.
	 */

	@Override
	public int berechneEinkommenssteuer() {
		return (Einkommensteuer.berechneEinkommensSteuer(this.einkommen));

	}

	/**
	 * Die Methode toString gibt Information über die Identität und Alter des
	 * Objekts Buerger.
	 */

	@Override
	public String toString() {
		return (this.getName() + "ist" + this.getAlter() + "Jahre alt.");
	}

}
