package de.hsmannheim.tpe.ws15.unternehmen;

/**
 * Die Klasse Unternehmen ist die Oberklasse von Kapitalgesellschaft und
 * Personalgesellschaft. Sie beinhaltet die grundsätzliche Eigenschaften eines
 * Unternehmens.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Unternehmen {

	/**
	 * Deklaration der Attribute.
	 */

	private String unternehmenName;
	private int gewinn;

	/**
	 * Instanziierung der Klasse Unternehmen als Konstruktor.
	 * 
	 * @param <b>unternehmenName</b>
	 *            wird übergeben.
	 * @param <b>gewinn</b>
	 *            wird übergeben.
	 */

	public Unternehmen(String unternehmenName, int gewinn) {
		this.unternehmenName = unternehmenName;
		this.gewinn = gewinn;

	}

	/**
	 * Die Methode <b>toString</b> gibt Information über die Klasse Unternehmen.
	 */

	@Override
	public String toString() {
		return (this.getClass().getSimpleName() + " " + this.getUnternehmenName() + ", Gewinn: " + this.getGewinn());
	}

	/**
	 * Die Methode <b>getUnternehmenName</b> gibt das Attribut
	 * <b>getUnternehmenName</b> zurück und macht es zugreifbar.
	 * 
	 * @return gibt <b>getUnternehmenName</b> zurück.
	 */

	public String getUnternehmenName() {
		return unternehmenName;
	}

	/**
	 * Die Methode <b>getGewinn</b> gibt das Attribut <b>gewinn</b> zurück und
	 * macht sie zugreifbar.
	 * 
	 * @return gibt <b>gewinn</b> zurück.
	 */

	public int getGewinn() {
		return gewinn;
	}
}
