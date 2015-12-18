package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

import de.hsmannheim.tpe.ws15.gruppe11.impl.NodeListImpl;

/**
 * Die Klasse Node instanziiert die Knoten.
 * 
 * @author Car, Isra
 * @author Celik, Kuebra
 */
public class Node<T> {

	private String name;
	private T wert;
	private NodeListImpl<T> children = new NodeListImpl<>();

	/**
	 * Konstruktor der Klasse Node.
	 * 
	 * @param name
	 *            die Bezeichnung der einzelnen Knoten
	 * @param wert
	 *            der Wert der einzelnen Knoten
	 */
	public Node(String name, T wert) {
		this.name = name;
		this.wert = wert;
	}

	/**
	 * Methode addChild der Klasse Node.
	 * 
	 * @param children
	 *            fügt einen Koten als Kindknoten in die Liste hinzu
	 */
	public void addChild(Node<T> children) {
		this.children.add(children);
	}

	/**
	 * Methode getName der Klasse Node.
	 * 
	 * @return name gibt den Namen eines Konten zurück
	 */
	String getName() {
		return name;
	}

	/**
	 * Methode getChildren gibt Kindsnoten zurück.
	 * 
	 * @return Kindsknoten gibt die Kindsknoten der Liste Knoten zurück
	 */
	public NodeListImpl<T> getChildren() {
		return this.children;
	}

	/**
	 * Gibt den Wert des Knotens zurück.
	 * 
	 * @return Wert des Knotens
	 */
	public T getWert() {
		return wert;
	}

	/**
	 * Umfassende Information über den Knoten, Ausgabe Kinder falls vorhanden.
	 * 
	 * @return gibt umfassende Information über den Knoten
	 */

	@Override
	public String toString() {
		return this.name;
	}

}