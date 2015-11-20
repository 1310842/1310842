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

	private String name;
	private int einkommen;

	/**
	 * Instanziierung der Klasse Einwohner als Konstruktor und definiert die
	 * Anfangswerte für die Objekte Mensch und Mutant.
	 * 
	 */

	public Einwohner(String name, int einkommen) {
		this.name = name;
		this.einkommen = einkommen;
	}

	/**
	 * Die Methode getName gibt <b>name</b> des Einwohners zurück.
	 * 
	 * @return <b>name</b> gibt den Namen zurück.
	 */

	public String getName() {
		return name;
	}

	/**
	 * Die Methode getEinkommen gibt <b>einkommen</b> des Einwohners zurück
	 * 
	 * @return <b>einkommen</b> gibt das Einkommen zurück.
	 */

	public int getEinkommen() {
		return einkommen;
	}

	/**
	 * Die Methode ändert Name des Einwohners um
	 * 
	 * @param <b>name</b> die mit dem alten ersetzt werden soll
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Die Methode ändert das Einkommen des Einwohners um
	 * 
	 * @param <b>einkommen</b> den der Einwohner nun haben soll
	 */

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}

}
