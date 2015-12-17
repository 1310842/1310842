package de.hsmannheim.tpe.ws15.gruppe11.search;

import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;

/**
 * Interface SearchStrategy ist gerisch angelegt.
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 */

public class SearchFactory {

	/**
	 * Die Methode ermöglicht das Erstellen von einer neuen Suche.
	 * 
	 * @param searchStrategy
	 *            hier wird die Suchmethode erstellt
	 * @return hier wird die erstellte Suchmethode zurückgegeben
	 */
	public static <T> SearchStrategy<T> createSearch(Suchverfahren searchStrategy) {
		switch (searchStrategy) {
		case TIEFENSUCHE:
			return new Tiefensuche<>();
		case BREITENSUCHE:
			return new Breitensuche<>();
		default:
			throw new IllegalArgumentException("Suchverfahren ungültig");
		}
	}

}
