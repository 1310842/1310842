package de.hsmannheim.tpe.ws15.gruppe11.interfaces;

import de.hsmannheim.tpe.ws15.gruppe11.dergraf.Node;

public interface SearchStrategy<T> {

	public NodeList<T> search(Node<T> node, T value);

	public NodeList<T> getPath();

}
