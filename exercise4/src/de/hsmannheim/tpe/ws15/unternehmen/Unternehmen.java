package de.hsmannheim.tpe.ws15.unternehmen;

import de.hsmannheim.tpe.ws15.steuer.GewerbesteuerI;

/**
 * Die Klasse Unternehmen ist die Oberklasse von Kapitalgesellschaft und
 * Personalgesellschaft. Sie beinhaltet die grundsätzliche Eigenschaften eines
 * Unternehmens.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Unternehmen implements GewerbesteuerI {

	/**
	 * Deklaration der Attribute.
	 */

	private String unternehmenName;
	private int gewinn;

	/**
	 * Instanziierung der Klasse Unternehmen mit den übergebenen parametern
	 * 
	 * @param <b>unternehmenName</b> des Unternehmens
	 * @param <b>gewinn</b> des Unternehmens
	 */

	public Unternehmen(String unternehmenName, int gewinn) {
		this.unternehmenName = unternehmenName;
		this.gewinn = gewinn;

	}

	/**
	 * Die Methode <b>toString</b> gibt Information über das aktuelle Unternehmen.
	 * 
	 * @return "(Unternehmen) Unternehmensname, Gewinn: <b>Gewinn der Unternehmen</b>
	 */

	@Override
	public String toString() {
		return (this.getClass().getSimpleName() + " " + this.getUnternehmenName() + ", Gewinn: " + this.getGewinn());
	}

	/**
	 * Die Methode <b>getUnternehmenName</b> gibt das Unternehmensname zurück
	 * 
	 * @return gibt <b>getUnternehmenName</b> zurück.
	 */

	public String getUnternehmenName() {
		return unternehmenName;
	}

	/**
	 * Die Methode <b>getGewinn</b> gibt das Gewinn der Unternehmen zurück
	 * 
	 * @return gibt <b>gewinn</b> zurück.
	 */

	public int getGewinn() {
		return gewinn;
	}

	/**
	 * Die Methode <b>berechneGewerbesteuer</b> berechnet die Gewerbesteuer auf
	 * den Gewinn der Klasse Kapitalgesellschaft.
	 * 
	 * @return <b>steuer</b> gibt den Nettogewinn zurück.
	 */
    @Override
	public int berechneGewerbesteuer() {
		int steuer = this.getGewinn() * GEWERBESTEUER / 100;
		return steuer;
	}
}
