package de.hsmannheim.tpe.ws15.mensch;

import de.hsmannheim.tpe.ws15.metropolis.Einwohner;

/**
 * Die abstrakte Klasse <b>Mensch</b> ist die Unterklasse von <b>Einwohner</b>
 * und die Oberklasse von <b>Buerger</b> und <b>Richter</b>.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public abstract class Mensch extends Einwohner {

	/**
	 * Deklaration des Attributs <b>alter</b>.
	 */

	private int alter;

	/**
	 * Instanziierung der Klasse Mensch als Konstruktor.
	 * 
	 * @param <b>name</b>
	 *            übergibt den Namen des Objekts.
	 * @param <b>name</b>
	 *            übergibt das Einkommen des Objekts.
	 * @param <b>name</b>
	 *            übergibt das Alter des Objekts.
	 */

	public Mensch(String name, int einkommen, int alter) {
		super(name, einkommen);
		this.alter = alter;
	}

	/**
	 * Die Methode <b>getAlter</b> gibt <b>alter</b> zurück
	 * 
	 * @return gibt <b>alter</b> zurück.
	 */

	public int getAlter() {
		return alter;
	}

}
