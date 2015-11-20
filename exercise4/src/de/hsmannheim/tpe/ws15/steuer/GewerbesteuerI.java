package de.hsmannheim.tpe.ws15.steuer;

/**
 * 
 * Interface Gewerbesteuer
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */

public interface GewerbesteuerI {
	
	/**
	 * Vordefinierte Gewerbesteuer und Ermäßigung(für Personengesellschaft)
	 */
	
	public static final int GEWERBESTEUER = 15;
	public static final int ERMAEßIGUNG = 800;
	
	public int berechneGewerbesteuer();

}
