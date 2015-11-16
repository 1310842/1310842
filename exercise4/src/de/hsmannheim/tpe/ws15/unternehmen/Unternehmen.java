package de.hsmannheim.tpe.ws15.unternehmen;

/**
 * Die Klasse Unternehmen ist die Oberklasse von Kapitalgesellschaft und
 * Personalgesellschaft. Dieser beinhaltet den Name des Unternehmens und den
 * Gewinn.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Unternehmen {

	/**
	 * Attribute.
	 */

	private String unternehmenName;
	private int gewinn;

	/**
	 * Konstruktor.
	 * 
	 * @param unternehmenName
	 * @param gewinn
	 */

	public Unternehmen(String unternehmenName, int gewinn) {
		this.unternehmenName = unternehmenName;
		this.gewinn = gewinn;

	}

	/**
	 * Die Methode toString
	 */

	@Override
	public String toString() {
		return (this.getClass().getSimpleName() +" " + this.getUnternehmenName() + ", Gewinn: "
				+ this.getGewinn());
	}

	/**
	 * Getmethoden.
	 * 
	 * @return
	 */

	public String getUnternehmenName() {
		return unternehmenName;
	}

	/**
	 * Setmethode
	 * 
	 * @param unternehmenName
	 */

	private void setUnternehmenName(String unternehmenName) {
		this.unternehmenName = unternehmenName;
	}

	/**
	 * Getmethode
	 * 
	 * @return
	 */

	public int getGewinn() {
		return gewinn;
	}

	/**
	 * Setmethode
	 * 
	 * @param gewinn
	 */

	private void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}

}
