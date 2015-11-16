package de.hsmannheim.tpe.ws15.metropolis;

/**
 * Die Klasse Einwohner praesentiert ein Lebewesen, welches in der Stadt
 * Metroplis lebt. Das Lebewesen kann entweder ein Mensch oder Mutant sein.
 * Jedes Lebewesen verfuegt ueber ein Einkommen und hat einen Namen.
 * <p>
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */
public abstract class Einwohner {

	protected String name;
	protected int einkommen;

	/**
	 * Konstruktor
	 */
	public Einwohner(String name, int einkommen) {
		this.name = name;
		this.einkommen = einkommen;
	}

	/**
	 * Getmethode
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getmethode
	 */
	public int getEinkommen() {
		return einkommen;
	}

	/**
	 * Setmethode
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setmethode
	 */
	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}

}
