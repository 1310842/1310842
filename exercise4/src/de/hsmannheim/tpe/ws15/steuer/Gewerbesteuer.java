package de.hsmannheim.tpe.ws15.steuer;

/**
 * Die Klasse Gewerbesteuer stellt die Gewerbesteuer da.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 */

public class Gewerbesteuer {

	/**
	 * Deklaration der Gewerbesteuern und Ermaeßigung.
	 */

	private static final int GEWERBESTEUER = 15;
	private static final int ERMAEßIGUNG = 800;

	/**
	 * Die Methode <b>getGewerbeSteuer</b> gibt <b>GEWERBESTEUER</b> zurück und
	 * macht sie zugreifbar.
	 * 
	 * @return <b>GEWERBESTEUER</b> gibt die Gewerbesteuer zurück.
	 */

	public static int getGewerbesteuer() {
		return GEWERBESTEUER;
	}

	/**
	 * Die Methode <b>getGewerbeSteuer</b> gibt <b>GEWERBESTEUER</b> zurück und
	 * macht sie zugreifbar.
	 * 
	 * @return <b>GEWERBESTEUER</b> gibt die Gewerbesteuer zurück.
	 */

	public static int getErmaeßigung() {
		return ERMAEßIGUNG;
	}

}
