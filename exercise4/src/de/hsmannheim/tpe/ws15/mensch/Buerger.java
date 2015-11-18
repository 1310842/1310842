package de.hsmannheim.tpe.ws15.mensch;

import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;

/**
 * Die Klasse Buerger ist eine Unterklasse von Mensch. Sie Präsentiert die
 * Eigenschaften eines Buergers, die in Metropolis leben.
 * 
 * @author Car, Isra.
 * @author Celik, Kuebra.
 */

public class Buerger extends Mensch implements EinkommenssteuerI {

	/**
	 * Instanziierung des Buergers. Die Parameter definieren die Anfangswerte
	 * für die Klasse Buerger.
	 * 
	 * @param name
	 *            des Buergers.
	 * @param einkommen
	 *            des Buergers.
	 * @param alter
	 *            des Buergers.
	 */

	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		Finanzamt.anmelden(this);
	}

	/**
	 * Die Methode berechneEinkommenssteuer berechnet vom Buerger die
	 * Einkommenssteuer und gibt diese zurück.
	 */

	@Override
	public int berechneEinkommenssteuer() {
		return (Einkommensteuer.berechneEinkommensSteuer(this.einkommen));

	}

	/**
	 * Die Methode toString gibt die Information Name und Alter über den Buerger
	 * aus.
	 */

	@Override
	public String toString() {
		return (this.getName() + "ist" + this.getAlter() + "Jahre alt.");
	}

}
