package de.hsmannheim.tpe.ws15.metropolis;

/**
 * Die abstrakte Klasse Einwohner ist die Oberste Klasse der Unterklassen Mensch
 * und Mutant. Sie definiert die grundsätzlichen Eigenschaften für die
 * Unterklassen Mensch und Mutant.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public abstract class Einwohner {

	/**
	 * Deklaration der Attribute name und einkommen.
	 */

	protected String name;
	protected int einkommen;

	/**
	 * Instanziierung der Klasse Einwohner als Konstruktor und definiert die
	 * Anfangswerte für die Objekte Mensch und Mutant.
	 * 
	 */

	protected Einwohner(String name, int einkommen) {
		this.name = name;
		this.einkommen = einkommen;
	}

	/**
	 * Die Methode getName gibt <b>name</b> zurück und macht es zugreifbar.
	 * 
	 * @return <b>name</b> gibt den Namen zurück.
	 */

	public String getName() {
		return name;
	}

	/**
	 * Die Methode getEinkommen gibt <b>einkommen</b> zurück und macht es
	 * zugreifbar.
	 * 
	 * @return <b>einkommen</b> gibt das Einkommen zurück.
	 */

	public int getEinkommen() {
		return einkommen;
	}

	/**
	 * Die Methode setName überschreibt das Attribute <b>name</b>.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Die Methode setEinkommen überschreibt das Attribute <b>einkommen</b>.
	 */

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}

}
