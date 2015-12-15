package de.hsmannheim.tpe.ws15.gruppe11.dergraf;

public class RootNode<T> extends Node<T> {

	/**
	 * Konstruktor
	 * @param name
	 * @param wert
	 * @param children
	 */
	RootNode(String name, T wert, NodeListImpl children) {
		super(name, wert, children);

	}
}
