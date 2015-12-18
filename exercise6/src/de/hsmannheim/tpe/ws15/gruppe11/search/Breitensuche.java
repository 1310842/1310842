package de.hsmannheim.tpe.ws15.gruppe11.search;

import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Node;
import de.hsmannheim.tpe.ws15.gruppe11.impl.NodeListImpl;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.NodeList;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;

/**
 * Die Klasse Breitensuche.
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 */

public class Breitensuche<T> implements SearchStrategy<T> {

	private NodeList<T> path = new NodeListImpl<>();

	/**
	 * Konstruktor der Klasse Breitensuche.
	 */
	Breitensuche() {
		super();
	}

	/**
	 * Suchmethode, die rekursive Suchvorgang ausführt
	 * 
	 * @param rootNode
	 *            hier wird die Suche gestartet (Startknoten)
	 * @param value
	 *            Wert nach dem die Methode suchen soll
	 * @return result hier werden die gefundenen Knoten in Liste zurückgegeben
	 */
	@Override
	public NodeList<T> search(Node<T> rootNode, T value) {
		NodeList<T> result = new NodeListImpl<T>();
		NodeList<T> tempList = new NodeListImpl<T>();
		this.path.clear();
		searchRecursive(value, rootNode, result, tempList);
		return result;
	}

	/**
	 * Diese Methode gibt den Pfad der letzten Suchen zurück.
	 * 
	 * @return durchgelaufene Pfad der Suche als Datentyp NodeList
	 */
	@Override
	public NodeList<T> getPath() {
		return this.path;
	}

	/**
	 * Die Methode mit der eine rekursive Suche (Breitensuche) nach einem
	 * bestimmten Wert ausgeführt wird.
	 *
	 * @param value
	 *            Wert nach dem die Methode suchen soll
	 * @param startNode
	 *            hier wird die Suche gestartet (Startknoten)
	 * @param result
	 *            Knotenliste, in dem die gefundenen Knoten gespeichert werden
	 * @param tempList
	 *            Temporäre Liste, die für die rekursive Suche notwendig ist
	 */
	private void searchRecursive(T value, Node<T> startNode, NodeList<T> result, NodeList<T> tempList) {

		this.getPath().add(startNode);

		if (startNode.getWert() == value) {
			result.add(startNode);
		}

		for (Node<T> child : startNode.getChildren()) {
			if (!path.contains(child)) {
				tempList.add(child);
			}
		}

		if (!tempList.isEmpty()) {
			searchRecursive(value, tempList.pollFirst(), result, tempList);
		}
	}
}