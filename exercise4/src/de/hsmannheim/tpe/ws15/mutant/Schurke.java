package de.hsmannheim.tpe.ws15.mutant;

import de.hsmannheim.tpe.ws15.staat.Finanzamt;
import de.hsmannheim.tpe.ws15.steuer.EinkommenssteuerI;
import de.hsmannheim.tpe.ws15.steuer.Einkommensteuer;

/**
 * Die Klasse <b>Schurke</b> ist eine Unterklasse von <b>Mutant</b>. Sie
 * praesentiert die Eigenschaften des Schurken.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public class Schurke extends Mutant implements EinkommenssteuerI {

	/**
	 * Deklaration des Attributs <b>schwaeche</b>.
	 */

	private String schwaeche;

	public Schurke(String name, int einkommen, String schwaeche) {
		super(name, einkommen, name);
		this.schwaeche = schwaeche;
		Finanzamt.anmelden(this);
	}

	/**
	 * Die Methode simuliert einen Kamp zwischen Schurke und Superheld.
	 * 
	 * @param <b>superheld</b> mit dem der Schurke kämpfen soll
	 * 
	 * @return <b>name</b> verliert/gewinnt den Kampf gegen <b>name des Gegners</b>
	 */

	public String kaempfen(Superheld superheld) {
		if (superheld.getList().contains(this.schwaeche)) {
			return this.getName() + " verliert den Kampf gegen " + superheld.getName();
		} else {
			return this.getName() + " gewinnt den Kampf gegen " + superheld.getName();
		}

	}

	/**
	 * Die Methode <b>getSchwaeche</b> gibt die <b>schwaeche</b> des Schurkens zurück
	 * 
	 * @return gibt <b>schwäche</b> zurück.
	 */

	public String getSchwaeche() {
		return schwaeche;
	}

	/**
	 * Die Methode <b>berechneEinkommenssteuer</b> holt sich das Einkommen vom
	 * Objekt des Typs Schurke, berechnet die Einkommensteuer auf das Einkommen
	 * und gibt die Steuer zurück die abgeführt werden muss.
	 */

	@Override
	public int berechneEinkommenssteuer() {
		return Einkommensteuer.berechneEinkommensSteuer(this.getEinkommen());
	}
}
