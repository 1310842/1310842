package de.hsmannheim.tpe.ws15.gruppe11.interfaces;

import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Node;

/**
 * Interface SearchStrategy ist generisch.
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 */

public interface SearchStrategy<T> {
	/**
	 * Methode mir der nach Knoten mit einem bestimmten Wert gesucht werden
	 * kann.
	 * 
	 * @param node
	 *            Knoten, von dem die Suche gestartet werden soll
	 * @param value
	 *            Wert nach dem gesucht werden soll
	 * @return gefundene Knoten als Datentyp NodeList
	 */
	public NodeList<T> search(Node<T> node, T value);

	/**
	 * Gibt den Suchpfad der letzten durchgeführten Suche zurückgibt.
	 * 
	 * @return Pfad von der letzten Suche als Datentyp NodeList
	 */
	public NodeList<T> getPath();

}
