package de.hsmannheim.tpe.ws15.mutant;

import de.hsmannheim.tpe.ws15.metropolis.Einwohner;

/**
 * Die abstrakte Klasse <b>Mutant</b> ist die Unterklasse von <b>Einwohner</b>
 * und die Oberklasse von den Klassen <b>Schurke</b> und <b>Superheld</b>. Die
 * definiert zusätzliche Eigenschaften für all ihre Unterklassen.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public abstract class Mutant extends Einwohner {

	/**
	 * Deklaration des Attributs <b>mutation</b>
	 */

	protected String mutation;

	/**
	 * Instanziierung der Klasse Mutant als Konstruktor.
	 * 
	 * @param <b>name</b>
	 *            übergibt den Namen des Objekts.
	 * @param <b>einkommen</b>
	 *            übergibt den Namen des Objekts.
	 * @param <b>mutation</b>
	 *            übergibt die Mutation des Objekts.
	 */
	public Mutant(String name, int einkommen, String mutation) {
		super(name, einkommen);
		this.mutation = mutation;

	}

	/**
	 * Die Methode <b>getMutation</b> gibt <b>mutation</b> zurück und macht es
	 * zugreifbar.
	 * 
	 * @return gibt <b>mutation</b> zurück.
	 */

	public String getMutation() {
		return mutation;
	}

	/**
	 * Die Methode <b>setMutation</b>
	 * 
	 * @param <b>mutation</b>
	 *            übergibt die Mutation des Objekts.
	 */
	public void setMutation(String mutation) {
		this.mutation = mutation;
	}

}
