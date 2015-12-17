package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

import de.hsmannheim.tpe.ws15.gruppe11.impl.NodeListImpl;

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
	public Node(String name, T wert) {
		this.name = name;
		this.wert = wert;
		
	}

	/**
	 * Fügt einen Kindsknoten in die Liste
	 * 
	 * @param children
	 */
	public void addChild(Node<T> children) {
		this.children.add(children);
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
	 * Gibt die Kindsknoten der Liste Knoten zurück
	 * 
	 * @return Kindsknoten
	 */
	public NodeListImpl<T> getChildren() {
		return this.children;
	}

	/**
	 * Gibt den Wert des Knotens zurück
	 * 
	 * @return Wert des Knotens
	 */
	public T getWert() {
		return wert;
	}
	
	@Override
	public String toString(){
		return this.name;
	}

}