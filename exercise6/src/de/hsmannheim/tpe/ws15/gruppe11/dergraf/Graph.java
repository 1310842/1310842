package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

import de.hsmannheim.tpe.ws15.gruppe11.interfaces.NodeList;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;

/**
 * Die Klasse Graph instanziiert die Graphen.
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 */

public class Graph<T> {

	private Node<T> rootNode;

	/**
	 * Instanziierung von Graph mit mindestens einem Knoten.
	 * 
	 * @param Wurzelknoten
	 *            die bereits bei der Instanziierung bekannt ist
	 */
	public Graph(Node<T> root) {
		this.rootNode = root;
	}

	/**
	 * Anfangsknoten wird zurückgegeben.
	 */
	public Node<T> getRoot() {
		return rootNode;
	}

	/**
	 * Suchmethode (Tiefensuche/ Breitensuche) für den Graph.
	 * 
	 * @param suchverfahren
	 *            hier startet die Suche
	 * @param value
	 *            Wert der gesucht werden soll
	 * @return der gefundene Knoten in Datentyp NodeList
	 */

	public NodeList<T> search(T value, SearchStrategy<T> suchverfahren) {
		return suchverfahren.search(this.rootNode, value);
	}

	/**
	 * Die Methode kopiert alle Knoten in die übergebene Liste.
	 * 
	 * @param list
	 *            hier werden die Werte in die Liste kopiert
	 * @return die Liste mit den kopierten Werten
	 */
	public NodeList<T> copyInto(NodeList<T> list) {
		list.addFirst(this.rootNode);
		copyIntoRecursive(rootNode, list);
		return list;
	}

	/**
	 * Die Methode copyInto ist die rekursive Kopiermethode.
	 * 
	 * @param root
	 *            hier fängt der Startknoten an von dem aus der Kopiervorgang
	 *            beginnen soll
	 * @param list
	 *            die Liste in dem die Knoten kopiert werden soll
	 */
	private void copyIntoRecursive(Node<T> root, NodeList<T> list) {
		for (Node<T> child : root.getChildren()) {
			if (!list.contains(child)) {
				list.add(child);
				copyIntoRecursive(child, list);
			}
		}
	}
}