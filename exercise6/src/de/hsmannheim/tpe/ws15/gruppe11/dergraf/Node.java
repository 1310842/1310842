package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

/**
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 *
 * @param <T>
 */
public class Node<T> {

	private String name;
	private T wert;
	private NodeListImpl<T> children = new NodeListImpl<>();

	/**
	 * Konstruktor der Klasse
	 * 
	 * @param name
	 * @param wert
	 * @param children
	 */
	public Node(String name, T wert, NodeListImpl<T> children) {
		this.name = name;
		this.wert = wert;
		this.children = new NodeListImpl<>();
	}

	/**
	 * Fügt einen Kindsknoten in die Liste
	 * 
	 * @param children
	 */
	void addChild(Node<T> children) {
		this.addChild(children);
	}

	/**
	 * Gibt den Namen zurück
	 * 
	 * @return name
	 */
	String getName() {
		return name;
	}

	/**
	 * setter Methode für Name
	 * 
	 * @param name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt die Kindsknoten der Liste Knoten zurück
	 * 
	 * @return Kindsknoten
	 */
	NodeListImpl<T> getChildren() {
		return this.children;
	}

	/**
	 * Gibt den Wert des Knotens zurück
	 * 
	 * @return Wert des Knotens
	 */
	private T getWert() {
		return wert;
	}

	/**
	 * setter-Methode für den Wert des Knotens
	 * 
	 * @param wert
	 *            des Knotens
	 */
	void setWert(T wert) {
		this.wert = wert;
	}

}
