package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

import de.hsmannheim.tpe.ws15.gruppe11.interfaces.NodeList;
import de.hsmannheim.tpe.ws15.gruppe11.interfaces.SearchStrategy;

/**
 * 
 * 
 * @author Car, Isra
 * @author Celik, Kübra
 * 
 * @param <T>
 */

public class Graph<T> {

	private Node<T> rootNode;

	/**
	 * Konstruktor
	 * 
	 * @param root
	 */
	public Graph(Node<T> root) {
		this.rootNode = root;
	}

	/**
	 * getter Methode
	 */
	public Node<T> getRoot() {
		return rootNode;
	}

	/**
	 * 
	 * @return
	 */
	
	public NodeList<T> search(T value, SearchStrategy<T> suchverfahren) {
        return suchverfahren.search(this.rootNode, value);
    }


	/**
	 * 
	 * @return
	 */
	public NodeList<T> copyInto(NodeList<T> list) {
		list.addFirst(this.rootNode);
		copyIntoRecursive(rootNode, list);
		return list;
	}

	/**
	 * 
	 * @param root
	 * @param list
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