package de.hsmannheim.tpe.ws15.mensch;

import de.hsmannheim.tpe.ws15.metropolis.Einwohner;

/**
 * Die abstrakte Klasse Mensch ist die Unterklasse von Einwohner und Oberklasse
 * von Buerger. Sie enthält die Eigenschaften die ein Mensch hat.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public abstract class Mensch extends Einwohner {

	private int alter;

	/**
	 * Instanziierung des Menschen. Die Parameter können von Unterklassen der
	 * Klasse Mensch benutzt werden.
	 * 
	 * @param name
	 *            des Menschen.
	 * @param einkommen
	 *            des Menschen.
	 * @param alter
	 *            des Menschen.
	 */

	public Mensch(String name, int einkommen, int alter) {
		super(name, einkommen);
		this.alter = alter;
	}

	/**
	 * Die Methode getAlter gibt den Alter des Menschen zurück.
	 * 
	 * @return Alter.
	 */

	public int getAlter() {
		return alter;
	}

}
