package de.hsmannheim.tpe.ws15.gruppe11.search;

import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Node;
import de.hsmannheim.tpe.ws15.gruppe11.impl.NodeListImpl;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.NodeList;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;

public class Tiefensuche<T> implements SearchStrategy<T> {

	/**
	 * Implementierung für die Breitensuche.
	 * 
	 * @author Car, Isra
	 * @author Celik, Kübra
	 */
	private NodeList<T> path = new NodeListImpl<>();

	/**
	 * Konstruktor der Klasse Tiefensuche.
	 */
	Tiefensuche() {
		super();
	}

	/**
	 * Suche Methode, die eine Rekursive Suchvorgang ausführt
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
		this.path.clear();
		searchRecursive(value, rootNode, result);
		return result;
	}

	/**
	 * Hier gibt die Methode den Pfad der letzten Suche zurück.
	 * 
	 * @return durchgelaufene Pfad der Suche als Datentyp NodeList
	 */
	@Override
	public NodeList<T> getPath() {
		return this.path;
	}

	/**
	 * Methode, mit der eine Rekursive Suche nach einem bestimmten Wert geführt
	 * wird.
	 * 
	 * @param value
	 *            Wert der gesucht werden soll
	 * @param startNode
	 *            hier wird die Suche gestartet (Startknoten)
	 * @param result
	 *            hier werden die die gefundenen Knoten in die Knotenliste
	 *            gespeichert
	 */
	private void searchRecursive(T value, Node<T> startNode, NodeList<T> result) {

		this.getPath().add(startNode);

		if (startNode.getWert() == value) {
			result.add(startNode);
		}

		for (Node<T> child : startNode.getChildren()) {
			if (!path.contains(child)) {
				searchRecursive(value, child, result);
			}
		}
	}

}