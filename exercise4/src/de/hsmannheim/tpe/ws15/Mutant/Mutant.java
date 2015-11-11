package de.hsmannheim.tpe.ws15.Mutant;

import de.hsmannheim.tpe.ws15.Metropolis.Einwohner;

/**
 * Die Klasse Mutant praesentiert Einwohner der Stadt Metropolis. Mutanten haben
 * eine Mutation. Sie k�nnen Superhelden oder Schurken sein. Superhelden und
 * Schurken k�nnen kaempfen.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public abstract class Mutant extends Einwohner {

	protected String mutation;

	/**
	 * Konstruktor
	 */
	public Mutant(String name, int einkommen, String mutation) {
		super(name, einkommen);
		this.mutation = mutation;

	}

	/**
	 * Getmethode
	 * 
	 * @return
	 */

	public String getMutation() {
		return mutation;
	}

	/**
	 * Setmethode
	 * 
	 * @param mutation
	 */
	public void setMutation(String mutation) {
		this.mutation = mutation;
	}

}
